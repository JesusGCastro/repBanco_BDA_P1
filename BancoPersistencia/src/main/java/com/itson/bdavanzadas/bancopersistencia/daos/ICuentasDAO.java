package com.itson.bdavanzadas.bancopersistencia.daos;

import com.itson.bdavanzadas.bancodominio.Cliente;
import com.itson.bdavanzadas.bancodominio.Cuenta;
import com.itson.bdavanzadas.bancopersistencia.dtos.CuentaNuevaDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import java.util.List;

public interface ICuentasDAO {
    Cuenta registrarCuenta(CuentaNuevaDTO cuentaNueva) throws PersistenciaException;
    
    List<Cuenta> consultarCuentas(Cliente cliente) throws PersistenciaException;
}
