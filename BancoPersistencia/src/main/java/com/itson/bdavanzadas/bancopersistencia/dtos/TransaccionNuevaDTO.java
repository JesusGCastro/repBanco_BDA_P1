
package com.itson.bdavanzadas.bancopersistencia.dtos;

import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;
import java.sql.Date;

/**
 * Clase DTO para transaccion nueva
 * @author Equipo
 */
public class TransaccionNuevaDTO {
    
    private Date fecha;
    private float monto;
    private long codigo_cuenta_proporciona;
    
    /**
     * Constructor
     */
    public TransaccionNuevaDTO() {
        this.fecha = new Date(new java.util.Date().getTime());
    }
    
    /**
     * Obtiene la fecha
     * @return fecha
     */
    public Date getFecha() {
        return fecha;
    }
    
    /**
     * Establece la fecha
     * @param fecha fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    /**
     * Obtiene el monto
     * @return monto
     */
    public float getMonto() {
        return monto;
    }
    
    /**
     * Establece el monto
     * @param monto monto
     */
    public void setMonto(float monto) {
        this.monto = monto;
    }
    
    /**
     * Obtiene el codigo de la cuenta que proporciona
     * @return codigo de la cuenta que proporciona
     */
    public long getCodigo_cuenta_proporciona() {
        return codigo_cuenta_proporciona;
    }
    
    /**
     * Establece el codigo de la cuenta que proporciona
     * @param codigo_cuenta_proporciona codigo de la cuenta que proporciona
     */
    public void setCodigo_cuenta_proporciona(long codigo_cuenta_proporciona) {
        this.codigo_cuenta_proporciona = codigo_cuenta_proporciona;
    }
    
    /**
     * Comprueba si la transaccion es valida
     * @return true si los campos son válidos, de lo contrario lanza una excepción.
     * @throws ValidacionDTOException si alguno de los campos no cumple con las validaciones.
     */
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
