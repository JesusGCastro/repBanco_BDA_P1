package com.itson.bdavanzadas.bancopersistencia.daos;

import com.itson.bdavanzadas.bancodominio.Cuenta;
import com.itson.bdavanzadas.bancopersistencia.conexion.IConexion;
import com.itson.bdavanzadas.bancopersistencia.dtos.CuentaNuevaDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CuentasDAO implements ICuentasDAO{
    
    final IConexion conexionBD;
    static final Logger logger = Logger.getLogger(CuentasDAO.class.getName());

    public CuentasDAO(IConexion conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    @Override
    public Cuenta registrarCuenta(CuentaNuevaDTO cuentaNueva) throws PersistenciaException {
        String sentenciaSQL = """
            INSERT INTO cuentas(fecha_apertura, saldo, codigo_cliente, estado) 
            VALUES (?, ?, ?, ?)
        """;
        try (
            Connection conexion = this.conexionBD.obtenerConexion();
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);
        ){
            comando.setDate(1, Date.valueOf(cuentaNueva.getFechaAperturaFormateada()));
            comando.setFloat(2, cuentaNueva.getSaldo());
            comando.setLong(3, cuentaNueva.getCodigo_cliente());
            comando.setBoolean(4, cuentaNueva.getEstado());
            int numRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agregó {0} cuentas", numRegistrosInsertados);
            
            ResultSet idsGenerados = comando.getGeneratedKeys();
            idsGenerados.next();
            Cuenta cuenta = new Cuenta(
                    idsGenerados.getLong(1),  
                    cuentaNueva.getSaldo(), 
                    cuentaNueva.getCodigo_cliente());
            return cuenta;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudo registrar la cuenta", e);
            throw new PersistenciaException("No se pudo registrar la cuenta", e);
        }
    }
    
}
