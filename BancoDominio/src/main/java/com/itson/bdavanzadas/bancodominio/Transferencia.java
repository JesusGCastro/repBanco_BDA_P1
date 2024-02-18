package com.itson.bdavanzadas.bancodominio;

import java.util.Date;

/**
 *  Clase de Transferencia
 * @author Equipo 
 */
public class Transferencia extends Transaccion{
    
    private long codigo_transaccion;
    private long codigo_cuenta_recibe;

    /**
     * Constructor por defecto de la clase Transferencias.
     * Crea una instancia de Transferencias con valores predeterminados para los atributos.  
     */
    public Transferencia() {
    }

    /**
     * Constructor que inicializa una transferencia con la cuenta destinataria, fecha, monto y cuenta de envío especificados.
     * 
     * @param codigo_cuenta_recibe La cuenta a la que se realiza la transferencia.
     * @param fecha La fecha de la transferencia.
     * @param monto El monto de la transferencia.
     * @param codigo_cuenta_proporciona La cuenta desde la cual se realiza la transferencia.
     */
    public Transferencia(Date fecha, float monto, long codigo_cuenta_proporciona, long codigo_cuenta_recibe) {
        super(fecha, monto, codigo_cuenta_proporciona);
        this.codigo_cuenta_recibe = codigo_cuenta_recibe;
    }

    /**
     * Constructor que inicializa una transferencia con el código, cuenta destinataria, fecha, monto y cuenta de envío especificados.
     * 
     * @param codigo_transaccion El código único de la transferencia.
     * @param codigo_cuenta_recibe La cuenta a la que se realiza la transferencia.
     * @param fecha La fecha de la transferencia.
     * @param monto El monto de la transferencia.
     * @param codigo_cuenta_proporciona La cuenta desde la cual se realiza la transferencia.
     */
    public Transferencia(long codigo_transaccion, Date fecha, float monto, long codigo_cuenta_proporciona, long codigo_cuenta_recibe) {
        super(fecha, monto, codigo_cuenta_proporciona);
        this.codigo_transaccion = codigo_transaccion;
        this.codigo_cuenta_recibe = codigo_cuenta_recibe;
    }
    
    /**
     * Obtiene el código único de la transferencia.
     * 
     * @return El código de la transferencia.
     */
    public long getCodigo_transaccion() {
        return codigo_transaccion;
    }

    /**
     * Establece el código único de la transferencia.
     * 
     * @param codigo_transaccion El código de la transferencia.
     */
    public void setCodigo_transaccion(long codigo_transaccion) {
        this.codigo_transaccion = codigo_transaccion;
    }

    /**
     * Obtiene la cuenta destinataria de la transferencia.
     * 
     * @return La cuenta destinataria de la transferencia.
     */
    public long getCodigo_cuenta_recibe() {
        return codigo_cuenta_recibe;
    }

    /**
     * Establece la cuenta destinataria de la transferencia.
     * 
     * @param codigo_cuenta_recibe La cuenta destinataria de la transferencia.
     */
    public void setCodigo_cuenta_recibe(long codigo_cuenta_recibe) {
        this.codigo_cuenta_recibe = codigo_cuenta_recibe;
    }

    /**
     * Calcula el hash code para la transferencia.
     * 
     * @return El hash code calculado.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.codigo_transaccion ^ (this.codigo_transaccion >>> 32));
        return hash;
    }

    /**
     * Compara la transferencia con otro objeto para verificar su igualdad.
     * 
     * @param obj El objeto con el cual se compara la transferencia.
     * @return true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Transferencia other = (Transferencia) obj;
        return this.codigo_transaccion == other.codigo_transaccion;
    }

    /**
     * Devuelve una representación de cadena de la transferencia.
     * 
     * @return Una cadena que representa la transferencia.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transferencias{");
        sb.append("codigo_transaccion=").append(codigo_transaccion);
        sb.append(", codigo_cuenta_recibe=").append(codigo_cuenta_recibe);
        sb.append('}');
        return sb.toString();
    } 
}
