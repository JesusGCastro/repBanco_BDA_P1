package com.itson.bdavanzadas.bancopersistencia.daos;

import com.itson.bdavanzadas.bancodominio.Cliente;
import com.itson.bdavanzadas.bancodominio.Cuenta;
import com.itson.bdavanzadas.bancopersistencia.conexion.IConexion;
import com.itson.bdavanzadas.bancopersistencia.dtos.CuentaNuevaDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
    
    @Override
    public void realizarTransferencia(Cuenta cuenta, Long codigoCuentaDestino, float monto) throws PersistenciaException{
        String sentenciaSQL = """
            call banco.RealizarTransferencia(?, ?, ?);                      
        """;
        String mensaje = "";
        try (
            Connection conexion = this.conexionBD.obtenerConexion();
            CallableStatement comando = conexion.prepareCall(sentenciaSQL);
        ){
            comando.setLong(1, cuenta.getCodigo());
            comando.setLong(2,codigoCuentaDestino);
            comando.setFloat(3, monto);
            ResultSet resultado = comando.executeQuery();
            
            while (resultado.next()) {
                mensaje = resultado.getString("mensaje");
            }
            logger.log(Level.INFO, mensaje);
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudo realizar la tranferencia", e);
            throw new PersistenciaException("No se pudo realizar la tranferencia", e);
        }
    }
    
    @Override
    public void realizarRetiro(int folio, int contrasenia) throws PersistenciaException {
        String sentenciaSQL = """
            call banco.RealizarRetiro(?, ?, ?);         
        """;
        try (
            Connection conexion = this.conexionBD.obtenerConexion();
            CallableStatement comando = conexion.prepareCall(sentenciaSQL);  
        ){
            comando.setInt(1, folio);
            comando.setInt(2, contrasenia);
            comando.registerOutParameter(3, Types.VARCHAR);
            
            comando.execute(); //Solo se ocupa verificar si se realizo o no
            
            String mensaje = comando.getString(3);
            JOptionPane.showMessageDialog(null, mensaje, "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            if ("45000".equals(e.getSQLState())) {
                // Capturar el error de fondos insuficientes
                String mensajeError = e.getMessage();
                JOptionPane.showMessageDialog(null, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                logger.log(Level.SEVERE, "No se pudo realizar la tranferencia", e);
                throw new PersistenciaException("No se pudo realizar la tranferencia", e);
            }
        }
    }
    
    @Override
    public void registarRetiro(Cuenta cuenta, float monto) throws PersistenciaException {
        String sentenciaSQL = """
            call banco.RegistrarRetiro(?, ?, ?, ?);
        """;
        try (
            Connection conexion = this.conexionBD.obtenerConexion();
            CallableStatement comando = conexion.prepareCall(sentenciaSQL);      
        ){
            comando.setLong(1, cuenta.getCodigo());
            comando.registerOutParameter(2, Types.INTEGER); //Indica el parametro que regresara
            comando.registerOutParameter(3, Types.INTEGER);
            comando.setFloat(4, monto);
            
            comando.execute();
            
            int folio = comando.getInt(2);
            int contrasenia = comando.getInt(3);
            
            JOptionPane.showMessageDialog(null, "El folio es : " + folio + "\nLa contraseña es: " + contrasenia, "Se registro el retiro", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            if ("45000".equals(e.getSQLState())) {
                // Capturar el error de fondos insuficientes
                String mensajeError = e.getMessage();
                JOptionPane.showMessageDialog(null, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                logger.log(Level.SEVERE, "No se pudo realizar la tranferencia", e);
                throw new PersistenciaException("No se pudo realizar la tranferencia", e);
            }        
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
