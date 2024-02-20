
package com.itson.bdavanzadas.bancopersistencia.dtos;

import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;

/**
 * Clase DTO para transferencia nueva
 * @author Equipo
 */
public class TransferenciaNuevaDTO extends TransaccionNuevaDTO{
    
    private long codigo_transaccion;
    private long codigo_cuenta_recibe;
    
    /**
     * Constructor
     */
    public TransferenciaNuevaDTO() {
        super();
    }
    
    /**
     * Obtiene codigo de transaccion
     * @return codigo de transaccion
     */
    public long getCodigo_transaccion() {
        return codigo_transaccion;
    }
    
    /**
     * Establece el codigo de transaccion
     * @param codigo_transaccion codigo de transaccion
     */
    public void setCodigo_transaccion(long codigo_transaccion) {
        this.codigo_transaccion = codigo_transaccion;
    }
    
    /**
     * Obtiene el codigo de la cuenta que recibe
     * @return codigo de la cuenta que recibe
     */
    public long getCodigo_cuenta_recibe() {
        return codigo_cuenta_recibe;
    }
    
    /**
     * Establece el codigo de la cuenta que recibe
     * @param codigo_cuenta_recibe codigo de la cuenta que recibe
     */
    public void setCodigo_cuenta_recibe(long codigo_cuenta_recibe) {
        this.codigo_cuenta_recibe = codigo_cuenta_recibe;
    }
    
    /**
     * Valida si la transaccion es correcta
     * @return true si los campos son válidos, de lo contrario lanza una excepción.
     * @throws ValidacionDTOException si alguno de los campos no cumple con las validaciones.
     */
    @Override
    public boolean esValido() throws ValidacionDTOException{
        super.esValido();
        if (this.codigo_transaccion <0) {
            throw new ValidacionDTOException("Codigo de transaccion invalido");
        }
        if (this.codigo_cuenta_recibe<0) {
            throw new ValidacionDTOException("Codigo de cuenta que recibe invalido");
        }
        return true;
    }
    
}
