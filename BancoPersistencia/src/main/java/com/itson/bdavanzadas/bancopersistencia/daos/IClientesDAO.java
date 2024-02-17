package com.itson.bdavanzadas.bancopersistencia.daos;

import com.itson.bdavanzadas.bancodominio.Cliente;
import com.itson.bdavanzadas.bancopersistencia.dtos.ClienteNuevoDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;

/**
 * Interface de ClientesDAO
 * @author Equipo
 */
public interface IClientesDAO {

    /**
     * Registra un nuevo cliente en la base de datos.
     * 
     * @param clienteNuevo El DTO (Data Transfer Object) que contiene la información del nuevo cliente.
     * @return El objeto Cliente registrado.
     * @throws PersistenciaException Si ocurre algún error durante el proceso de registro.
     */
    Cliente registrarCliente(ClienteNuevoDTO clienteNuevo) throws PersistenciaException;
    
    /**
     *Inicia sesión para un cliente existente en la base de datos.
     * 
     * @param cliente El DTO que contiene la información del cliente para iniciar sesión.
     * @return El objeto Cliente que representa al cliente que ha iniciado sesión.
     * @throws PersistenciaException Si ocurre algún error durante el proceso de inicio de sesión.
     */
    Cliente iniciarSesion(ClienteNuevoDTO cliente) throws PersistenciaException;
}
