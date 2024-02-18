
package com.itson.bdavanzadas.bancopersistencia.daos;

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
    
}
