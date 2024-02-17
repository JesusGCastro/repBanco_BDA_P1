package com.itson.bdavanzadas.bancopersistencia.dtos;

import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class CuentaNuevaDTO {
    
    private long codigo;
    private Date fecha_apertura;
    private float saldo;
    private long codigo_cliente;
    private boolean estado = true;

    public CuentaNuevaDTO() {
        this.fecha_apertura = new Date(new java.util.Date().getTime());
    }

    public String getFechaAperturaFormateada() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        return formatoFecha.format(fecha_apertura);
    }

//    public void setFecha_apertura() {
//        this.fecha_apertura = fecha_apertura;
//    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public long getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(long codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
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
