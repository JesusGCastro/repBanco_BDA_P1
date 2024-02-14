package com.itson.bdavanzadas.bancopersistencia.conexion;

import java.sql.Connection;
import java.sql.SQLException;

public interface IConexion {
    Connection obtenerConexion() throws SQLException;
}
