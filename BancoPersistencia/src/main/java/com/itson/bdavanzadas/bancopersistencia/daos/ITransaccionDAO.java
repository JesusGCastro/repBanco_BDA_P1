
package com.itson.bdavanzadas.bancopersistencia.daos;

import com.itson.bdavanzadas.bancodominio.Transaccion;
import com.itson.bdavanzadas.bancopersistencia.dtos.TransaccionNuevaDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;

public interface ITransaccionDAO {
    Transaccion registrarTransaccion(TransaccionNuevaDTO transaccionNueva) throws PersistenciaException;
}
