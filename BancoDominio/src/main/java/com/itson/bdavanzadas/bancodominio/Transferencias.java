package com.itson.bdavanzadas.bancodominio;

import java.util.GregorianCalendar;

/**
 *  Clase de Transferencias
 * @author Equipo 
 */
public class Transferencias extends Transacciones{
    
    private int codigo_transferencia;
    private Cuenta cuentaDestinataria;

    /**
     * Constructor por defecto de la clase Transferencias.
     * Crea una instancia de Transferencias con valores predeterminados para los atributos.  
     */
    public Transferencias() {
    }

    /**
     * Constructor que inicializa una transferencia con la cuenta destinataria, fecha, monto y cuenta de envío especificados.
     * 
     * @param cuentaDestinataria La cuenta a la que se realiza la transferencia.
     * @param fecha La fecha de la transferencia.
     * @param monto El monto de la transferencia.
     * @param cuentaEnvio La cuenta desde la cual se realiza la transferencia.
     */
    public Transferencias(Cuenta cuentaDestinataria, GregorianCalendar fecha, float monto, Cuenta cuentaEnvio) {
        super(fecha, monto, cuentaEnvio);
        this.cuentaDestinataria = cuentaDestinataria;
    }

    /**
     * Constructor que inicializa una transferencia con el código, cuenta destinataria, fecha, monto y cuenta de envío especificados.
     * 
     * @param codigo El código único de la transferencia.
     * @param cuentaDestinataria La cuenta a la que se realiza la transferencia.
     * @param fecha La fecha de la transferencia.
     * @param monto El monto de la transferencia.
     * @param cuentaEnvio La cuenta desde la cual se realiza la transferencia.
     */
    public Transferencias(int codigo, Cuenta cuentaDestinataria, GregorianCalendar fecha, float monto, Cuenta cuentaEnvio) {
        super(fecha, monto, cuentaEnvio);
        this.codigo_transferencia = codigo;
        this.cuentaDestinataria = cuentaDestinataria;
    }

    /**
     * Obtiene el código único de la transferencia.
     * 
     * @return El código de la transferencia.
     */
    public int getCodigo_transferencia() {
        return codigo_transferencia;
    }

    /**
     * Establece el código único de la transferencia.
     * 
     * @param codigo_transferencia El código de la transferencia.
     */
    public void setCodigo_transferencia(int codigo_transferencia) {
        this.codigo_transferencia = codigo_transferencia;
    }

    /**
     * Obtiene la cuenta destinataria de la transferencia.
     * 
     * @return La cuenta destinataria de la transferencia.
     */
    public Cuenta getCuentaDestinataria() {
        return cuentaDestinataria;
    }

    /**
     * Establece la cuenta destinataria de la transferencia.
     * 
     * @param cuentaDestinataria La cuenta destinataria de la transferencia.
     */
    public void setCuentaDestinataria(Cuenta cuentaDestinataria) {
        this.cuentaDestinataria = cuentaDestinataria;
    }

    /**
     * Calcula el hash code para la transferencia.
     * 
     * @return El hash code calculado.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.codigo_transferencia;
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
        final Transferencias other = (Transferencias) obj;
        return this.codigo_transferencia == other.codigo_transferencia;
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
        sb.append("codigo_transferencia=").append(codigo_transferencia);
        sb.append(", cuentaDestinataria=").append(cuentaDestinataria);
        sb.append('}');
        return sb.toString();
    } 
}
