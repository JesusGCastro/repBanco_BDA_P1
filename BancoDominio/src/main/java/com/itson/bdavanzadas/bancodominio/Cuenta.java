package com.itson.bdavanzadas.bancodominio;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase de Cuenta
 * @author Equipo
 */
public class Cuenta {
    
    private long codigo;
    private Date fecha_apertura;
    private float saldo;
    private long codigo_cliente;
    private boolean estado = true; //De principio estara activa

    /**
     * Constructor por defecto de la clase Cuenta.
     * Crea una instancia de Cuenta con valores predeterminados para los atributos.
     */
    public Cuenta() {
    }
    
    /**
     * Constructor que inicializa una cuenta con el saldo y código de cliente especificados.
     * La fecha de apertura se establece automáticamente como la fecha actual.
     * 
     * @param saldo El saldo inicial de la cuenta.
     * @param codigo_cliente El código del cliente asociado a la cuenta.
     */
    public Cuenta( float saldo, long codigo_cliente) {
        this.fecha_apertura = new Date();
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }
    
    /**
     * Constructor que inicializa una cuenta con el código, saldo y código de cliente especificados.
     * La fecha de apertura se establece automáticamente como la fecha actual.
     * 
     * @param codigo El código único de la cuenta.
     * @param saldo El saldo inicial de la cuenta.
     * @param codigo_cliente El código del cliente asociado a la cuenta.

     */
    public Cuenta(long codigo, float saldo, long codigo_cliente) {
        this.codigo= codigo;
        this.fecha_apertura = new Date();
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }

    /**
     * Constructor que inicializa una cuenta con el código y saldo especificados.
     * 
     * @param codigo El código único de la cuenta.
     * @param saldo El saldo inicial de la cuenta
     */
    public Cuenta(long codigo, float saldo) {
        this.codigo = codigo;
        this.saldo = saldo;
    }

    public Cuenta(long codigo, Date fecha_apertura, float saldo, long codigo_cliente) {
        this.codigo = codigo;
        this.fecha_apertura = fecha_apertura;
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }
    
    public Cuenta(Date fecha_apertura, float saldo, long codigo_cliente) {
        this.fecha_apertura = fecha_apertura;
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }
    
    /**
     * Obtiene el código único de la cuenta.
     * 
     * @return El código único de la cuenta.
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * Establece el código único de la cuenta.
     * 
     * @param codigo El código único de la cuenta.
     */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene la fecha de apertura de la cuenta en formato de cadena (yyyy-MM-dd).
     * 
     * @return La fecha de apertura de la cuenta en formato de cadena.
     */
    public String getFechaAperturaFormateada() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        return formatoFecha.format(fecha_apertura);
    }

//    public void setFecha_apertura(Date fecha_apertura) {
//        this.fecha_apertura = fecha_apertura;
//    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return El saldo actual de la cuenta.
     */

    public float getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo El saldo de la cuenta.
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el código del cliente asociado a la cuenta.
     * 
     * @return El código del cliente asociado a la cuenta.
     */
    public long getCodigo_cliente() {
        return codigo_cliente;
    }

    /**
     * Establece el código del cliente asociado a la cuenta.
     * 
     * @param codigo_cliente El código del cliente asociado a la cuenta.
     */
    public void setCodigo_cliente(long codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    /**
     * Obtiene el estado de la cuenta.
     * 
     * @return true si la cuenta está activa, false si está inactiva.
     */
    public boolean getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la cuenta.
     * 
     * @param estado El estado de la cuenta (true si está activa, false si está inactiva).
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * Calcula el hash code para la cuenta.
     * 
     * @return El hash code calculado.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        return hash;
    }

    /**
     * Compara la cuenta con otro objeto para verificar su igualdad.
     * 
     * @param obj El objeto con el cual se compara la cuenta.
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
        final Cuenta other = (Cuenta) obj;
        return this.codigo == other.codigo;
    }

    /**
     * Devuelve una representación de cadena de la cuenta.
     * 
     * @return Una cadena que representa la cuenta.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append("codigo=").append(codigo);
        sb.append(", fecha_apertura=").append(fecha_apertura);
        sb.append(", saldo=").append(saldo);
        sb.append(", codigo_cliente=").append(codigo_cliente);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }

    
    
}
