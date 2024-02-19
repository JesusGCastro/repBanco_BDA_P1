package com.itson.bdavanzadas.bancopersistencia.daos;

import com.itson.bdavanzadas.bancodominio.Cliente;
import com.itson.bdavanzadas.bancodominio.Cuenta;
import com.itson.bdavanzadas.bancopersistencia.dtos.CuentaNuevaDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import java.util.List;

/**
 * Interface de CuentasDAO
 * @author Equipo
 */
public interface ICuentasDAO {

    /**
     * Registra una nueva cuenta en la base de datos.
     * 
     * @param cuentaNueva El DTO que contiene la información de la nueva cuenta a registrar.
     * @return La cuenta registrada.
     * @throws PersistenciaException Si ocurre un error durante el proceso de registro.
     */
    Cuenta registrarCuenta(CuentaNuevaDTO cuentaNueva) throws PersistenciaException;
    
    void realizarTransferencia(Cuenta cuenta, Long codigoCuentaDestino, float monto) throws PersistenciaException;
    
    /**
     * Consulta las cuentas asociadas a un cliente en la base de datos.
     * 
     * @param cliente El cliente del cual se desean consultar las cuentas.
     * @return Una lista de cuentas asociadas al cliente especificado.
     * @throws PersistenciaException Si ocurre un error durante el proceso de consulta.
     */
    List<Cuenta> consultarCuentas(Cliente cliente) throws PersistenciaException;
}
