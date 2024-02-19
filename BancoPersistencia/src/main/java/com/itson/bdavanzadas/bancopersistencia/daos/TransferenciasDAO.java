
package com.itson.bdavanzadas.bancopersistencia.daos;

import com.itson.bdavanzadas.bancodominio.Transferencia;
import com.itson.bdavanzadas.bancopersistencia.conexion.IConexion;
import com.itson.bdavanzadas.bancopersistencia.dtos.TransferenciaNuevaDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import static java.lang.Float.parseFloat;
import static java.lang.Long.parseLong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransferenciasDAO implements ITransferenciasDAO{
    
    final IConexion conexionBD;
    static final Logger logger = Logger.getLogger(CuentasDAO.class.getName());
    
    public TransferenciasDAO(IConexion conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    @Override
    public Transferencia registrarTransferencia(TransferenciaNuevaDTO transferenciaNueva) throws PersistenciaException {
        String sentenciaSQL = """
            START TRANSACTION;          
            UPDATE cuenta
            SET saldo = saldo - ?
            WHERE codigo = ?;
            UPDATE cuenta
            SET saldo = saldo + ?
            WHERE codigo = ?;
            INSERT INTO transacciones(fecha, monto, codigo_cuenta_proporciona) 
            VALUES (?, ?, ?);
            INSERT INTO transferencias(codigo_transaccion, codigo_cuenta_recibe) 
            VALUES (?,?);
            COMMIT;
        """;
        try (
            Connection conexion = this.conexionBD.obtenerConexion();
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);
        ){
            
            comando.setFloat(1, parseFloat(transferenciaNueva.getMonto()));
            comando.setLong(2, transferenciaNueva.getCodigo_cuenta_proporciona());
            comando.setFloat(3, parseFloat(transferenciaNueva.getMonto()));
            comando.setLong(4, transferenciaNueva.getCodigo_cuenta_recibe());
            comando.setDate(5, transferenciaNueva.getFecha());
            comando.setFloat(6, parseFloat(transferenciaNueva.getMonto()));
            comando.setLong(7, transferenciaNueva.getCodigo_cuenta_proporciona());
            comando.setLong(8, transferenciaNueva.getCodigo_transaccion());
            comando.setLong(9, transferenciaNueva.getCodigo_cuenta_recibe());
            int numRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agregó {0} clientes", numRegistrosInsertados);
            
            ResultSet idsGenerados = comando.getGeneratedKeys();
            idsGenerados.next();
            Transferencia transferencia = new Transferencia(
                    idsGenerados.getLong(1), 
                    transferenciaNueva.getFecha(),
                    parseFloat(transferenciaNueva.getMonto()),
                    transferenciaNueva.getCodigo_transaccion(),
                    transferenciaNueva.getCodigo_cuenta_recibe());
            return transferencia;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudo registrar la transferencia", e);
            throw new PersistenciaException("No se pudo registrar la transferencia", e);
        }
    }
    
}
