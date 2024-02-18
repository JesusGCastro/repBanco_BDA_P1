/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itson.bdavanzadas.bancopersistencia.dtos;

import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;
import java.sql.Date;

/**
 *
 * @author Gui26
 */
public class TransaccionNuevaDTO {
    
    private long codigo;
    private Date fecha;
    private float monto;
    private long codigo_cuenta_proporciona;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public long getCodigo_cuenta_proporciona() {
        return codigo_cuenta_proporciona;
    }

    public void setCodigo_cuenta_proporciona(long codigo_cuenta_proporciona) {
        this.codigo_cuenta_proporciona = codigo_cuenta_proporciona;
    }
    
    public boolean esValido() throws ValidacionDTOException{
        if (this.codigo < 0) {
            throw new ValidacionDTOException("Codigo invalido");
        }
        if (this.fecha == null) {
            throw new ValidacionDTOException("Fecha invalida");
        }
        if (this.monto < 0) {
            throw new ValidacionDTOException("Monto invalido");
        }
        if (this.codigo_cuenta_proporciona < 0) {
            throw new ValidacionDTOException("Codigo de cliente invalido");
        }
        return true;
    }
    
}
