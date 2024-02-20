
package com.itson.bdavanzadas.bancopersistencia.daos;

import com.itson.bdavanzadas.bancodominio.Cuenta;
import com.itson.bdavanzadas.bancodominio.Transaccion;
import com.itson.bdavanzadas.bancopersistencia.conexion.IConexion;
import com.itson.bdavanzadas.bancopersistencia.dtos.TransaccionNuevaDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase TransaccionesDAO
 * @author Equipo
 */
public class TransaccionesDAO implements ITransaccionesDAO{
    
    final IConexion conexionBD;
    static final Logger logger = Logger.getLogger(CuentasDAO.class.getName());
    
    /**
     * Constructor
     * @param conexionBD conexion a la base de datos
     */
    public TransaccionesDAO(IConexion conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    /**
     * Registra una transaccion nueva
     * @param transaccionNueva El DTO que contiene la información de la nueva transaccion a registrar.
     * @return El objeto Transaccion registrado.
     * @throws PersistenciaException Si ocurre un error durante el proceso de registro.
     */
    @Override
    public Transaccion registrarTransaccion(TransaccionNuevaDTO transaccionNueva) throws PersistenciaException {
        /*
        String sentenciaSQL = """
            INSERT INTO transferencias(fecha, monto, codigo_cuenta_proporciona) 
            VALUES (?, ?, ?)
        """;
        try (
            Connection conexion = this.conexionBD.obtenerConexion();
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);
        ){
            comando.setDate(1, Date.valueOf(transaccionNueva.getFecha()));
            comando.setFloat(2, transaccionNueva.getMonto());
            comando.setLong(3, transaccionNueva.getCodigo_cuenta_proporciona());
            int numRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agregó {0} cuentas", numRegistrosInsertados);
            
            ResultSet idsGenerados = comando.getGeneratedKeys();
            idsGenerados.next();
            Transaccion transaccion = new Transaccion(
                    idsGenerados.getLong(1),  
                    transaccionNueva.getSaldo(), 
                    transaccionNueva.getCodigo_cliente());
            return transaccion;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudo registrar la transaccion", e);
            throw new PersistenciaException("No se pudo registrar la transaccion", e);
        }*/
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * Consulta una lista de transacciones
     * @param cuenta La cuenta de la que se buscan las transacciones
     * @return La lista de transacciones registradas.
     * @throws PersistenciaException Si ocurre un error durante el proceso de registro.
     */
    @Override
    public List<Transaccion> consultarTransacciones(Cuenta cuenta) throws PersistenciaException {
        String sentenciaSQL = """
            SELECT * FROM transacciones WHERE codigo_cuenta_proporciona = ?
        """;
        List<Transaccion> listaTransacciones = new LinkedList<>();
        try (
            Connection conexion = this.conexionBD.obtenerConexion(); 
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);
        ){
            comando.setLong(1, cuenta.getCodigo());
            ResultSet resultado = comando.executeQuery();
            while (resultado.next()) {
                Long codigo = resultado.getLong("codigo");
                Date fecha = resultado.getDate("fecha");
                Float monto = resultado.getFloat("monto");
                Long codigo_cuenta_proporciona = resultado.getLong("codigo_cuenta_proporciona");
                
                Transaccion transaccion = new Transaccion(codigo, fecha, monto, codigo_cuenta_proporciona);
                listaTransacciones.add(transaccion);
            }
            logger.log(Level.INFO, "Se consultaron {0} transacciones", listaTransacciones.size());
            return listaTransacciones;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudieron consultar transacciones", e);
            throw new PersistenciaException("No se pudieron consultar transacciones", e);
        }
    }
    
    /**
     * Consulta una lista de transferencias
     * @param cuenta La cuenta de la que se buscan las transferencias
     * @return La lista de transferencias registradas.
     * @throws PersistenciaException Si ocurre un error durante el proceso de registro.
     */
    @Override
    public List<Transaccion> consultarTransferencias(Cuenta cuenta) throws PersistenciaException {
        String sentenciaSQL = """
            SELECT codigo, fecha,monto, codigo_cuenta_proporciona FROM transacciones, transferencias WHERE codigo = codigo_transaccion AND codigo_cuenta_proporciona = ?
        """;
        List<Transaccion> listaTransacciones = new LinkedList<>();
        try (
            Connection conexion = this.conexionBD.obtenerConexion(); 
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);
        ){
            comando.setLong(1, cuenta.getCodigo());
            ResultSet resultado = comando.executeQuery();
            while (resultado.next()) {
                Long codigo = resultado.getLong("codigo");
                Date fecha = resultado.getDate("fecha");
                Float monto = resultado.getFloat("monto");
                Long codigo_cuenta_proporciona = resultado.getLong("codigo_cuenta_proporciona");
                
                Transaccion transaccion = new Transaccion(codigo, fecha, monto, codigo_cuenta_proporciona);
                listaTransacciones.add(transaccion);
            }
            logger.log(Level.INFO, "Se consultaron {0} transferencias", listaTransacciones.size());
            return listaTransacciones;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudieron consultar transferencias", e);
            throw new PersistenciaException("No se pudieron consultar transferencias", e);
        }
    }
    
    /**
     * Consulta una lista de retiros
     * @param cuenta La cuenta de la que se buscan los retiros
     * @return La lista de retiros registrados.
     * @throws PersistenciaException Si ocurre un error durante el proceso de registro.
     */
    @Override
    public List<Transaccion> consultarRetiros(Cuenta cuenta) throws PersistenciaException {
        String sentenciaSQL = """
            SELECT codigo, fecha,monto, codigo_cuenta_proporciona FROM transacciones, retiros WHERE codigo = codigo_transaccion AND codigo_cuenta_proporciona = ?
        """;
        List<Transaccion> listaTransacciones = new LinkedList<>();
        try (
            Connection conexion = this.conexionBD.obtenerConexion(); 
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);
        ){
            comando.setLong(1, cuenta.getCodigo());
            ResultSet resultado = comando.executeQuery();
            while (resultado.next()) {
                Long codigo = resultado.getLong("codigo");
                Date fecha = resultado.getDate("fecha");
                Float monto = resultado.getFloat("monto");
                Long codigo_cuenta_proporciona = resultado.getLong("codigo_cuenta_proporciona");
                
                Transaccion transaccion = new Transaccion(codigo, fecha, monto, codigo_cuenta_proporciona);
                listaTransacciones.add(transaccion);
            }
            logger.log(Level.INFO, "Se consultaron {0} retiros", listaTransacciones.size());
            return listaTransacciones;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudieron consultar retiros", e);
            throw new PersistenciaException("No se pudieron consultar retiros", e);
        }
    }
    
}
