
package com.itson.bdavanzadas.bancopersistencia.dtos;

import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;


public class RetiroNuevoDTO {
    
    private long codigo_transaccion;
    private long folio;
    private int contrasena;
    private byte estado;

    public long getCodigo_transaccion() {
        return codigo_transaccion;
    }

    public void setCodigo_transaccion(long codigo_transaccion) {
        this.codigo_transaccion = codigo_transaccion;
    }

    public long getFolio() {
        return folio;
    }

    public void setFolio(long folio) {
        this.folio = folio;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }
    
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
