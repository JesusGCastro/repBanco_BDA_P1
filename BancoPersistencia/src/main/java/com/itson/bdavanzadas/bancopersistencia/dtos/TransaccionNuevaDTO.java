
package com.itson.bdavanzadas.bancopersistencia.dtos;

import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;
import static java.lang.Float.parseFloat;
import static java.lang.Long.parseLong;
import java.sql.Date;

public class TransaccionNuevaDTO {
    
    private Date fecha;
    private float monto;
    private long codigo_cuenta_proporciona;
    
    public TransaccionNuevaDTO() {
        this.fecha = new Date(new java.util.Date().getTime());
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
        if (this.fecha == null) {
            throw new ValidacionDTOException("Fecha invalida");
        }
        if (this.monto<0) {
            throw new ValidacionDTOException("Monto invalido");
        }
        if (this.codigo_cuenta_proporciona <0) {
            throw new ValidacionDTOException("Codigo de cuenta que proporciona invalido");
        }
        return true;
    }
    
}
