
package com.itson.bdavanzadas.bancopersistencia.daos;

import com.itson.bdavanzadas.bancodominio.Transferencia;
import com.itson.bdavanzadas.bancopersistencia.dtos.TransferenciaNuevaDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;

public interface ITransferenciasDAO {
    Transferencia registrarTransferencia(TransferenciaNuevaDTO transferenciaNueva) throws PersistenciaException;
}
