package com.itson.bdavanzadas.bancopersistencia.dtos;

import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * Clase DTO para una cuenta nueva
 * @author Equipo
 */
public class CuentaNuevaDTO {
    
    private long codigo;
    private Date fecha_apertura;
    private float saldo;
    private long codigo_cliente;
    private boolean estado = true;

    /**
     * Constructor por defecto que inicializa la fecha de apertura con la fecha actual.
     */
    public CuentaNuevaDTO() {
        this.fecha_apertura = new Date(new java.util.Date().getTime());
    }

    /**
     * Obtiene la fecha de apertura formateada como una cadena de texto en el formato "yyyy-MM-dd".
     * 
     * @return la fecha de apertura formateada como una cadena de texto.
     */
    public String getFechaAperturaFormateada() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        return formatoFecha.format(fecha_apertura);
    }

//    public void setFecha_apertura() {
//        this.fecha_apertura = fecha_apertura;
//    }

    /**
     * Obtiene el saldo de la cuenta.
     * 
     * @return el saldo de la cuenta.
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo el saldo de la cuenta a establecer.
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el código del cliente asociado a la cuenta.
     * 
     * @return el código del cliente asociado a la cuenta.
     */
    public long getCodigo_cliente() {
        return codigo_cliente;
    }

    /**
     * Establece el código del cliente asociado a la cuenta.
     * 
     * @param codigo_cliente el código del cliente asociado a la cuenta a establecer.
     */
    public void setCodigo_cliente(long codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    /**
     * Obtiene el estado de la cuenta.
     * 
     * @return true si la cuenta está activa, false si está inactiva.
     */
    public boolean getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la cuenta.
     * 
     * @param estado true para activar la cuenta, false para desactivarla.
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    /**
     * Valida los campos de la cuenta.
     * 
     * @return true si los campos son válidos, de lo contrario lanza una excepción.
     * @throws ValidacionDTOException si alguno de los campos no cumple con las validaciones.
     */
    public boolean esValido() throws ValidacionDTOException{
        if (this.codigo < 0) {
            throw new ValidacionDTOException("Numero de cuenta invalido");
        }
        if (this.fecha_apertura == null) {
            throw new ValidacionDTOException("Fecha invalida");
        }
        if (this.saldo < 0) {
            throw new ValidacionDTOException("Saldo invalido");
        }
        if (this.codigo_cliente < 0) {
            throw new ValidacionDTOException("Codigo de cliente invalido");
        }
        
        return true;
    }
    
}
