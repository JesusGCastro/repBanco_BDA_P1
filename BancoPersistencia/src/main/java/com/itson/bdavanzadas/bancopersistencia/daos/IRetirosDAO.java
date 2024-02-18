
package com.itson.bdavanzadas.bancopersistencia.daos;

import com.itson.bdavanzadas.bancodominio.Retiro;
import com.itson.bdavanzadas.bancopersistencia.dtos.RetiroNuevoDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;

public interface IRetirosDAO {
    Retiro registrarRetiro(RetiroNuevoDTO RetiroNuevo) throws PersistenciaException;
}
