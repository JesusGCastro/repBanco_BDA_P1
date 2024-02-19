package com.itson.bdavanzadas.bancopersistencia.daos;

import com.itson.bdavanzadas.bancodominio.Cliente;
import com.itson.bdavanzadas.bancodominio.Cuenta;
import com.itson.bdavanzadas.bancopersistencia.conexion.IConexion;
import com.itson.bdavanzadas.bancopersistencia.dtos.CuentaNuevaDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase de CuentasDAO
 * @author Equipo
 */
public class CuentasDAO implements ICuentasDAO{
    
    final IConexion conexionBD;
    static final Logger logger = Logger.getLogger(CuentasDAO.class.getName());

    /**
     * Constructor de la clase CuentasDAO.
     * 
     * @param conexionBD La instancia de conexión a la base de datos.
     */
    public CuentasDAO(IConexion conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    /**
     * Registra una nueva cuenta en la base de datos.
     * 
     * @param cuentaNueva El DTO que contiene la información de la nueva cuenta a registrar.
     * @return La cuenta registrada.
     * @throws PersistenciaException Si ocurre un error durante el proceso de registro.
     */
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
            comando.setDate(1, cuentaNueva.getFecha_apertura());
            comando.setFloat(2, cuentaNueva.getSaldo());
            comando.setLong(3, cuentaNueva.getCodigo_cliente());
            comando.setBoolean(4, cuentaNueva.getEstado());
            int numRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agregó {0} cuentas", numRegistrosInsertados);
            
            ResultSet idsGenerados = comando.getGeneratedKeys();
            idsGenerados.next();
            Cuenta cuenta = new Cuenta(
                    idsGenerados.getLong(1),
                    cuentaNueva.getFecha_apertura(),
                    cuentaNueva.getSaldo(), 
                    cuentaNueva.getCodigo_cliente());
            return cuenta;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudo registrar la cuenta", e);
            throw new PersistenciaException("No se pudo registrar la cuenta", e);
        }
    }

    /**
     * Consulta las cuentas asociadas a un cliente en la base de datos.
     * 
     * @param cliente El cliente del cual se desean consultar las cuentas.
     * @return Una lista de cuentas asociadas al cliente especificado.
     * @throws PersistenciaException Si ocurre un error durante el proceso de consulta.
     */
    @Override
    public List<Cuenta> consultarCuentas(Cliente cliente) throws PersistenciaException {
        String sentenciaSQL = """
            SELECT * FROM cuentas WHERE codigo_cliente = ?
        """;
        List<Cuenta> listaCuentas = new LinkedList<>();
        try (
            Connection conexion = this.conexionBD.obtenerConexion(); 
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);
        ){
            comando.setLong(1, cliente.getCodigo());
            ResultSet resultado = comando.executeQuery();
            while (resultado.next()) {
                Long codigo = resultado.getLong("codigo");
//                Date fecha_apertura = resultado.getDate("fecha_apertura");
                Float saldo = resultado.getFloat("saldo");
//                Long codigo_cliete = resultado.getLong("codigo_cliente");
//                Boolean estado = resultado.getBoolean("estado");
                
                Cuenta cuenta = new Cuenta(codigo, saldo);
                listaCuentas.add(cuenta);
            }
            logger.log(Level.INFO, "Se consultaron {0} cuentas", listaCuentas.size());
            return listaCuentas;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudieron consultar cuentas", e);
            throw new PersistenciaException("No se pudieron consultar cuentas", e);
        }
    }
    
}
