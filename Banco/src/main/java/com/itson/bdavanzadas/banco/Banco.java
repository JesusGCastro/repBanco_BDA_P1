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
  codigo int NOT NULL AUTO_INCREMENT,
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

CREATE TABLE cuentas (
  codigo int NOT NULL AUTO_INCREMENT,
  fecha_apertura date NOT NULL,
  saldo float NOT NULL,
  codigo_cliente int NOT NULL,
  estado tinyint(1) NOT NULL,
  PRIMARY KEY (codigo),
  KEY codigo_cliente (codigo_cliente),
  CONSTRAINT cuenta_ibfk_1 FOREIGN KEY (codigo_cliente) REFERENCES clientes (codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE transacciones (
  codigo int NOT NULL AUTO_INCREMENT,
  fecha date NOT NULL,
  monto decimal(10,2) NOT NULL,
  codigo_cuenta_proporciona int NOT NULL,
  PRIMARY KEY (codigo),
  KEY codigo_cuenta_proporciona (codigo_cuenta_proporciona),
  CONSTRAINT transacciones_ibfk_1 FOREIGN KEY (codigo_cuenta_proporciona) REFERENCES cuentas (codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE transferencias (
  codigo_transaccion int NOT NULL AUTO_INCREMENT,
  codigo_cuenta_recibe int NOT NULL,
  PRIMARY KEY (codigo_transaccion),
  KEY codigo_cuenta_recibe (codigo_cuenta_recibe),
  CONSTRAINT transferencias_ibfk_1 FOREIGN KEY (codigo_transaccion) REFERENCES transacciones (codigo),
  CONSTRAINT transferencias_ibfk_2 FOREIGN KEY (codigo_cuenta_recibe) REFERENCES cuentas (codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE retiros (
  codigo_transaccion int NOT NULL AUTO_INCREMENT,
  folio int NOT NULL,
  contrasena int NOT NULL,
  estado bit(1) NOT NULL,
  PRIMARY KEY (codigo_transaccion),
  CONSTRAINT retiros_ibfk_1 FOREIGN KEY (codigo_transaccion) REFERENCES transacciones (codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

#################################### 

DELIMITER $$
CREATE DEFINER=root@localhost PROCEDURE RealizarTransferencia(
    IN p_codigo_cuenta_proporciona INT,
    IN p_codigo_cuenta_recibe INT,
    IN p_monto FLOAT -- Cambiado a FLOAT
)
BEGIN
    DECLARE saldo_proporciona FLOAT; -- Cambiado a FLOAT

    -- Iniciar la transacción
    START TRANSACTION;

    -- Verificar fondos suficientes
    SELECT saldo INTO saldo_proporciona FROM cuentas WHERE codigo = p_codigo_cuenta_proporciona FOR UPDATE;

    IF saldo_proporciona >= p_monto THEN
        -- Registrar la transacción
        INSERT INTO transacciones (fecha, monto, codigo_cuenta_proporciona) VALUES (CURDATE(), p_monto, p_codigo_cuenta_proporciona);

        -- Actualizar saldo de la cuenta que proporciona los fondos
        UPDATE cuentas SET saldo = saldo - p_monto WHERE codigo = p_codigo_cuenta_proporciona;

        -- Actualizar saldo de la cuenta que recibe los fondos
        UPDATE cuentas SET saldo = saldo + p_monto WHERE codigo = p_codigo_cuenta_recibe;

        -- Registrar la transferencia
        INSERT INTO transferencias (codigo_transaccion, codigo_cuenta_recibe) VALUES (LAST_INSERT_ID(), p_codigo_cuenta_recibe);

        -- Confirmar la transacción
        COMMIT;
        -- La transferencia se realizó con éxito
        SELECT 'Transferencia exitosa' AS mensaje;
    ELSE
        -- Fondos insuficientes para realizar la transferencia
        -- Cancelar la transacción
        -- Fondos insuficientes para realizar la transferencia
        SELECT 'Fondos insuficientes' AS mensaje;
        ROLLBACK;
    END IF;
END$$
DELIMITER ;

*/