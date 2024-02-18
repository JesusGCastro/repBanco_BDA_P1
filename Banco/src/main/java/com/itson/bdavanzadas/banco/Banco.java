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
        MenuForm principal = new MenuForm(clienteDAO);
        principal.setVisible(true);
    }
}
/*

CREATE DATABASE banco;
USE banco;

CREATE TABLE clientes (
  codigo bigint NOT NULL AUTO_INCREMENT,
  nombre_pila varchar(100) NOT NULL,
  apellido_paterno varchar(100) NOT NULL,
  apellido_materno varchar(100) NOT NULL,
  fecha_nacimiento date NOT NULL,
  calle varchar(100) NOT NULL,
  numero varchar(50) NOT NULL,
  colonia varchar(100) NOT NULL,
  codigo_postal varchar(10) NOT NULL,
  correo varchar(100) NOT NULL,
  contrasenia varchar(50) NOT NULL,
  PRIMARY KEY (codigo),
  UNIQUE KEY correo_UNIQUE (correo)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE cuenta (
  codigo bigint NOT NULL AUTO_INCREMENT,
  fecha_apertura date NOT NULL,
  saldo float NOT NULL,
  codigo_cliente bigint NOT NULL,
  estado ENUM('activada', 'cancelada') NOT NULL,
  PRIMARY KEY (codigo),
  KEY codigo_cliente (codigo_cliente),
  CONSTRAINT cuenta_ibfk_1 FOREIGN KEY (codigo_cliente) REFERENCES clientes (codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE transacciones (
  codigo bigint NOT NULL AUTO_INCREMENT,
  fecha date NOT NULL,
  monto float NOT NULL,
  codigo_cuenta_proporciona bigint NOT NULL,
  PRIMARY KEY (codigo),
  KEY codigo_cuenta_proporciona (codigo_cuenta_proporciona),
  CONSTRAINT transacciones_ibfk_1 FOREIGN KEY (codigo_cuenta_proporciona) REFERENCES cuenta (codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE transferencias (
  codigo_transaccion bigint NOT NULL AUTO_INCREMENT,
  codigo_cuenta_recibe bigint NOT NULL,
  PRIMARY KEY (codigo_transaccion),
  KEY codigo_cuenta_recibe (codigo_cuenta_recibe),
  CONSTRAINT transferencias_ibfk_1 FOREIGN KEY (codigo_transaccion) REFERENCES transacciones (codigo),
  CONSTRAINT transferencias_ibfk_2 FOREIGN KEY (codigo_cuenta_recibe) REFERENCES cuenta (codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE retiros (
  codigo_transaccion bigint NOT NULL AUTO_INCREMENT,
  folio bigint NOT NULL,
  contrasena int NOT NULL,
  estado ENUM('cobrado', 'no cobrado', 'por cobrar') NOT NULL,
  PRIMARY KEY (codigo_transaccion),
  CONSTRAINT retiros_ibfk_1 FOREIGN KEY (codigo_transaccion) REFERENCES transacciones (codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

*/