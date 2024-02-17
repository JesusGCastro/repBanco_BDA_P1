package com.itson.bdavanzadas.bancodominio;

import java.util.GregorianCalendar;

/**
 *  Clase de Transacciones
 * @author Equipo
 */
public class Transacciones {
    
    private long codigo;
    private GregorianCalendar fecha;
    private float monto;
    private Cuenta cuentaEnvio;

    /**
     * Constructor por defecto de la clase Transacciones.
     * Crea una instancia de Transacciones con valores predeterminados para los atributos.
     */
    public Transacciones() {
    }

    /**
     * Constructor que inicializa una transacción con la fecha, monto y cuenta de envío especificados.
     * 
     * @param fecha La fecha de la transacción.
     * @param monto El monto de la transacción.
     * @param cuentaEnvio La cuenta desde la cual se realiza la transacción.
     */
    public Transacciones(GregorianCalendar fecha, float monto, Cuenta cuentaEnvio) {
        this.fecha = fecha;
        this.monto = monto;
        this.cuentaEnvio = cuentaEnvio;
    }

    /**
     * Constructor que inicializa una transacción con el código, fecha, monto y cuenta de envío especificados.
     * 
     * @param codigo El código único de la transacción.
     * @param fecha La fecha de la transacción.
     * @param monto El monto de la transacción.
     * @param cuentaEnvio La cuenta desde la cual se realiza la transacción.
     */
    public Transacciones(long codigo, GregorianCalendar fecha, float monto, Cuenta cuentaEnvio) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.monto = monto;
        this.cuentaEnvio = cuentaEnvio;
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
    public GregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la transacción.
     * 
     * @param fecha La fecha de la transacción.
     */
    public void setFecha(GregorianCalendar fecha) {
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
    public Cuenta getCuentaEnvio() {
        return cuentaEnvio;
    }

    /**
     * Establece la cuenta desde la cual se realiza la transacción.
     * 
     * @param cuentaEnvio La cuenta desde la cual se realiza la transacción.
     */
    public void setCuentaEnvio(Cuenta cuentaEnvio) {
        this.cuentaEnvio = cuentaEnvio;
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
        final Transacciones other = (Transacciones) obj;
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
        sb.append(", cuentaEnvio=").append(cuentaEnvio);
        sb.append('}');
        return sb.toString();
    }
}
