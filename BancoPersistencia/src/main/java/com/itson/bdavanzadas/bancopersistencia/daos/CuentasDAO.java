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
            INSERT INTO cuentas(numero_cuenta, contrasenia, fecha_apertura, saldo, codigo_cliente) 
            VALUES (?, ?, ?, ?, ?)
        """;
        try (
            Connection conexion = this.conexionBD.obtenerConexion();
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);
        ){
            comando.setLong(1, cuentaNueva.getNumero_cuenta());
            comando.setString(2, cuentaNueva.getContrasenia());
            comando.setDate(3, cuentaNueva.getFecha_apertura());
            comando.setFloat(4, cuentaNueva.getSaldo());
            comando.setLong(5, cuentaNueva.getCodigo_cliente());
            int numRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agregó {0} cuentas", numRegistrosInsertados);
            
            ResultSet idsGenerados = comando.getGeneratedKeys();
            idsGenerados.next();
            Cuenta cuenta = new Cuenta(
                    idsGenerados.getLong(1), 
                    cuentaNueva.getNumero_cuenta(), 
                    cuentaNueva.getContrasenia(), 
                    cuentaNueva.getFecha_apertura(), 
                    cuentaNueva.getSaldo(), 
                    cuentaNueva.getCodigo_cliente());
            return cuenta;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudo registrar la cuenta", e);
            throw new PersistenciaException("No se pudo registrar la cuenta", e);
        }
    }
    
}
