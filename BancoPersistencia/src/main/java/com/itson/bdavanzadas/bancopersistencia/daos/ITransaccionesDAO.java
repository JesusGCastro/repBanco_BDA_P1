
package com.itson.bdavanzadas.bancopersistencia.daos;

import com.itson.bdavanzadas.bancodominio.Cuenta;
import com.itson.bdavanzadas.bancodominio.Transaccion;
import com.itson.bdavanzadas.bancopersistencia.dtos.TransaccionNuevaDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import java.util.List;

public interface ITransaccionesDAO {
    Transaccion registrarTransaccion(TransaccionNuevaDTO transaccionNueva) throws PersistenciaException;
    List<Transaccion> consultarTransacciones(Cuenta cuenta) throws PersistenciaException;
}
