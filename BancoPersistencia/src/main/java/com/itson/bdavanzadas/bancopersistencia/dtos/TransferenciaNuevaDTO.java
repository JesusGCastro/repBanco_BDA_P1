
package com.itson.bdavanzadas.bancopersistencia.dtos;

import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;
import static java.lang.Long.parseLong;
import java.sql.Date;

public class TransferenciaNuevaDTO extends TransaccionNuevaDTO{
    
    private long codigo_transaccion;
    private long codigo_cuenta_recibe;

    public TransferenciaNuevaDTO() {
        super();
    }
    
    public long getCodigo_transaccion() {
        return codigo_transaccion;
    }

    public void setCodigo_transaccion(long codigo_transaccion) {
        this.codigo_transaccion = codigo_transaccion;
    }

    public long getCodigo_cuenta_recibe() {
        return codigo_cuenta_recibe;
    }

    public void setCodigo_cuenta_recibe(long codigo_cuenta_recibe) {
        this.codigo_cuenta_recibe = codigo_cuenta_recibe;
    }
    
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
