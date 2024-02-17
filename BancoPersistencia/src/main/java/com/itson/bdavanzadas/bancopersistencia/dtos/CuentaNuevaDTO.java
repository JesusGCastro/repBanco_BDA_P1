package com.itson.bdavanzadas.bancopersistencia.dtos;

import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;
import java.sql.Date;

public class CuentaNuevaDTO {
    
    private long codigo;
    private Date fecha_apertura;
    private float saldo;
    private long codigo_cliente;
    private String estado;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(Date fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
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
        if (!(this.estado.equals("activada") || this.estado.equals("cancelada"))) {
            throw new ValidacionDTOException("Estado invalido");
        }
        return true;
    }
    
}
