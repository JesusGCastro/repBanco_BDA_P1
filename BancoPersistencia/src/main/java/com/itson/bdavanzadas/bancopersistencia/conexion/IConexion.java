package com.itson.bdavanzadas.bancopersistencia.conexion;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Interface de Conexion
 * @author Equipo
 */
public interface IConexion {

    /**
     * Obtiene una conexión a la base de datos.
     * 
     * @return Una conexión a la base de datos.
     * @throws SQLException Si ocurre algún error al obtener la conexión.
     */
    Connection obtenerConexion() throws SQLException;
}
