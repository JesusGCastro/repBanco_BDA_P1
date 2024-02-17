package com.itson.bdavanzadas.bancopersistencia.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase de Conexion que implementa la interface IConexion
 * @author Equipo
 */
public class Conexion implements IConexion{
    final String cadenaConexion;
    final String usuario;
    final String password;
    static final Logger logger = Logger.getLogger(Conexion.class.getName());

    /**
     * Constructor para la clase Conexion.
     * 
     * @param cadenaConexion La cadena de conexión a la base de datos.
     * @param usuario El nombre de usuario para la conexión.
     * @param password La contraseña para la conexión.
     */
    public Conexion(String cadenaConexion, String usuario, String password) {
        this.cadenaConexion = cadenaConexion;
        this.usuario = usuario;
        this.password = password;
    }

    /**
     * Método para obtener una conexión a la base de datos.
     * 
     * @return Una conexión a la base de datos.
     * @throws SQLException Si ocurre algún error al establecer la conexión.
     */
    @Override
    public Connection obtenerConexion() throws SQLException {
        Connection conexion = DriverManager.getConnection(
                cadenaConexion,
                usuario,
                password
        );
        logger.log(Level.INFO, "Conexion establecida {0}", cadenaConexion);
        return conexion;
    }
    
    
}
