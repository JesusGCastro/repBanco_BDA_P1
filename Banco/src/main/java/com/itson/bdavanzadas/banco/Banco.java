package com.itson.bdavanzadas.banco;

import java.util.logging.Logger;

public class Banco {

    static final Logger logger = Logger.getLogger(Banco.class.getName());
    
    public static void main(String[] args) {
        String cadenaConexion = "jdbc:mysql://localhost/banco";
        String usuario = "root";
        String password = "123456789";
    }
}
