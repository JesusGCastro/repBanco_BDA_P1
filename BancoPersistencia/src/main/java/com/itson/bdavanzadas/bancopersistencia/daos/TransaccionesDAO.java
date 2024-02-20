
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
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransaccionesDAO implements ITransaccionesDAO{
    
    final IConexion conexionBD;
    static final Logger logger = Logger.getLogger(CuentasDAO.class.getName());
    
    public TransaccionesDAO(IConexion conexionBD) {
        this.conexionBD = conexionBD;
    }
    
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
    
}
