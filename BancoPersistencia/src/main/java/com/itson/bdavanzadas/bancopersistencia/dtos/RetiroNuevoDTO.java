
package com.itson.bdavanzadas.bancopersistencia.dtos;

import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;

/**
 * Clase DTO de retiro
 * @author Equipo
 */
public class RetiroNuevoDTO extends TransaccionNuevaDTO{
    
    private long codigo_transaccion;
    private long folio;
    private int contrasena;
    private byte estado;
    
    /**
     * Constructor
     */
    public RetiroNuevoDTO() {
        super();
    }
    
    /**
     * Obtiene codigo transaccion
     * @return codigo transaccion
     */
    public long getCodigo_transaccion() {
        return codigo_transaccion;
    }
    
    /**
     * Establece codigo transaccion
     * @param codigo_transaccion codigo transaccion
     */
    public void setCodigo_transaccion(long codigo_transaccion) {
        this.codigo_transaccion = codigo_transaccion;
    }
    
    /**
     * Obtiene folio
     * @return folio
     */
    public long getFolio() {
        return folio;
    }
    
    /**
     * Establece folio
     * @param folio folio
     */
    public void setFolio(long folio) {
        this.folio = folio;
    }
    
    /**
     * Obtiene contraseña
     * @return contraseña
     */
    public int getContrasena() {
        return contrasena;
    }
    
    /**
     * Establece contraseña
     * @param contrasena contraseña
     */
    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }
    
    /**
     * Obtiene estado
     * @return estado
     */
    public byte getEstado() {
        return estado;
    }
    
    /**
     * Establece estado
     * @param estado estado
     */
    public void setEstado(byte estado) {
        this.estado = estado;
    }
    
    /**
     * Comprueba si el Retiro es valido
     * @return true si los campos son válidos, de lo contrario lanza una excepción.
     * @throws ValidacionDTOException si alguno de los campos no cumple con las validaciones.
     */
    public boolean esValido() throws ValidacionDTOException{
        if (this.codigo_transaccion < 0) {
            throw new ValidacionDTOException("Codigo de transaccion invalido");
        }
        if (this.folio < 0) {
            throw new ValidacionDTOException("Folio invalido");
        }
        if (this.contrasena < 0) {
            throw new ValidacionDTOException("Contraseña invalida");
        }
        if (this.estado < 0) {
            throw new ValidacionDTOException("Estado invalido");
        }
        return true;
    }
    
}
