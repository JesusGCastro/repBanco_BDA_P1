package com.itson.bdavanzadas.bancodominio;

import java.util.Date;

/**
 *  Clase de Transaccion
 * @author Equipo
 */
public class Transaccion {
    
    private long codigo;
    private Date fecha;
    private float monto;
    private long codigo_cuenta_proporciona;

    /**
     * Constructor por defecto de la clase Transacciones.
     * Crea una instancia de Transacciones con valores predeterminados para los atributos.
     */
    public Transaccion() {
    }

    /**
     * Constructor que inicializa una transacción con la fecha, monto y cuenta de envío especificados.
     * 
     * @param fecha La fecha de la transacción.
     * @param monto El monto de la transacción.
     * @param codigo_cuenta_proporciona La cuenta desde la cual se realiza la transacción.
     */
    public Transaccion(Date fecha, float monto, long codigo_cuenta_proporciona) {
        this.fecha = new Date();
        this.monto = monto;
        this.codigo_cuenta_proporciona = codigo_cuenta_proporciona;
    }

    /**
     * Constructor que inicializa una transacción con el código, fecha, monto y cuenta de envío especificados.
     * 
     * @param codigo El código único de la transaccion.
     * @param fecha La fecha de la transaccion.
     * @param monto El monto de la transaccion.
     * @param codigo_cuenta_proporciona La cuenta desde la cual se realiza la transaccion.
     */
    public Transaccion(long codigo, Date fecha, float monto, long codigo_cuenta_proporciona) {
        this.codigo = codigo;
        this.fecha = new Date();
        this.monto = monto;
        this.codigo_cuenta_proporciona = codigo_cuenta_proporciona;
    }

    /**
     * Obtiene el código único de la transacción.
     * 
     * @return El código de la transacción.
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * Establece el código único de la transacción.
     * 
     * @param codigo El código de la transacción.
     */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene la fecha de la transacción.
     * 
     * @return La fecha de la transacción.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la transacción.
     * 
     * @param fecha La fecha de la transacción.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el monto de la transacción.
     * 
     * @return El monto de la transacción.
     */
    public float getMonto() {
        return monto;
    }

    /**
     * Establece el monto de la transacción.
     * 
     * @param monto El monto de la transacción.
     */
    public void setMonto(float monto) {
        this.monto = monto;
    }

    /**
     * Obtiene la cuenta desde la cual se realiza la transacción.
     * 
     * @return La cuenta desde la cual se realiza la transacción.
     */
    public long getCodigo_cuenta_proporciona() {
        return codigo_cuenta_proporciona;
    }

    /**
     * Establece la cuenta desde la cual se realiza la transacción.
     * 
     * @param codigo_cuenta_proporciona cuenta que realiza la transferencia.
     */
    public void setCodigo_cuenta_proporciona(long codigo_cuenta_proporciona) {
        this.codigo_cuenta_proporciona = codigo_cuenta_proporciona;
    }

    /**
     * Calcula el hash code para la transacción.
     * 
     * @return El hash code calculado.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        return hash;
    }

    /**
     * Compara la transacción con otro objeto para verificar su igualdad.
     * 
     * @param obj El objeto con el cual se compara la transacción.
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
        final Transaccion other = (Transaccion) obj;
        return this.codigo == other.codigo;
    }

    /**
     * Devuelve una representación de cadena de la transacción.
     * 
     * @return Una cadena que representa la transacción.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transacciones{");
        sb.append("codigo=").append(codigo);
        sb.append(", fecha=").append(fecha);
        sb.append(", monto=").append(monto);
        sb.append(", codigo_cuenta_proporciona=").append(codigo_cuenta_proporciona);
        sb.append('}');
        return sb.toString();
    }
}
