package com.itson.bdavanzadas.bancopersistencia.daos;

import com.itson.bdavanzadas.bancodominio.Cuenta;
import com.itson.bdavanzadas.bancopersistencia.dtos.CuentaNuevaDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;

public interface ICuentasDAO {
    Cuenta registrarCuenta(CuentaNuevaDTO cuentaNueva) throws PersistenciaException;
}
