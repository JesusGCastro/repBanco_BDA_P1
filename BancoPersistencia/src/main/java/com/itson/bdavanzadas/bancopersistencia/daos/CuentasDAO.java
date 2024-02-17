package com.itson.bdavanzadas.bancopersistencia.daos;

import com.itson.bdavanzadas.bancodominio.Cuenta;
import com.itson.bdavanzadas.bancopersistencia.conexion.IConexion;
import com.itson.bdavanzadas.bancopersistencia.dtos.CuentaNuevaDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CuentasDAO implements ICuentasDAO{
    
    final IConexion conexionBD;
    static final Logger logger = Logger.getLogger(ClientesDAO.class.getName());

    public CuentasDAO(IConexion conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    @Override
    public Cuenta registrarCuenta(CuentaNuevaDTO cuentaNueva) throws PersistenciaException {
        String sentenciaSQL = """
            INSERT INTO cuentas(codigo,fecha_apertura, saldo, codigo_cliente, estado) 
            VALUES (?, ?, ?, ?, ?)
        """;
        try (
            Connection conexion = this.conexionBD.obtenerConexion();
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);
        ){
            comando.setLong(1, cuentaNueva.getCodigo());
            comando.setDate(2, cuentaNueva.getFecha_apertura());
            comando.setFloat(3, cuentaNueva.getSaldo());
            comando.setLong(4, cuentaNueva.getCodigo_cliente());
            comando.setString(5, cuentaNueva.getEstado());
            int numRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agregó {0} cuentas", numRegistrosInsertados);
            
            ResultSet idsGenerados = comando.getGeneratedKeys();
            idsGenerados.next();
            Cuenta cuenta = new Cuenta(
                    idsGenerados.getLong(1), 
                    cuentaNueva.getFecha_apertura(), 
                    cuentaNueva.getSaldo(), 
                    cuentaNueva.getCodigo_cliente(),
                    cuentaNueva.getEstado());
            return cuenta;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudo registrar la cuenta", e);
            throw new PersistenciaException("No se pudo registrar la cuenta", e);
        }
    }
    
}
