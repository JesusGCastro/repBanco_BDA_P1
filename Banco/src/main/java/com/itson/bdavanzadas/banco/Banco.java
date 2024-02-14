package com.itson.bdavanzadas.banco;

import com.itson.bdavanzadas.bancopersistencia.conexion.Conexion;
import com.itson.bdavanzadas.bancopersistencia.conexion.IConexion;
import com.itson.bdavanzadas.bancopersistencia.daos.ClientesDAO;
import java.util.logging.Logger;
import com.itson.bdavanzadas.bancopersistencia.daos.IClientesDAO;

public class Banco {

    static final Logger logger = Logger.getLogger(Banco.class.getName());
    
    public static void main(String[] args) {
        String cadenaConexion = "jdbc:mysql://localhost/banco";
        String usuario = "root";
        String password = "123456789";
        IConexion conexion = new Conexion(cadenaConexion, usuario, password);
        IClientesDAO clienteDAO = new ClientesDAO(conexion);
        
    }
}
