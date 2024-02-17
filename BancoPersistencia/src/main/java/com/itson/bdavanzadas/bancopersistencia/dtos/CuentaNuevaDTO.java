package com.itson.bdavanzadas.bancopersistencia.dtos;

import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;
import java.sql.Date;

public class CuentaNuevaDTO {
    
    private Long numero_cuenta;
    private String contrasenia;
    private Date fecha_apertura;
    private float saldo;
    private Long codigo_cliente;

    public Long getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(Long numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
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

    public Long getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setcodigo_cliente(Long codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }
    
    public boolean esValido() throws ValidacionDTOException{
        if (this.numero_cuenta == null
                || this.numero_cuenta < 0) {
            throw new ValidacionDTOException("Numero de cuenta invalido");
        }
        if (this.contrasenia == null 
                || this.contrasenia.isBlank()
                || this.contrasenia.trim().length() > 100) {
            throw new ValidacionDTOException("Contraseña invalida");
        }
        if (this.fecha_apertura == null) {
            throw new ValidacionDTOException("Fecha invalida");
        }
        if (this.saldo < 0) {
            throw new ValidacionDTOException("Saldo invalido");
        }
        if (this.codigo_cliente == null
                || this.codigo_cliente < 0) {
            throw new ValidacionDTOException("Codigo de cliente invalido");
        }
        return true;
    }
    
}
