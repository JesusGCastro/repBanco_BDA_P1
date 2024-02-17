package com.itson.bdavanzadas.bancodominio;

import java.util.Date;

public class Cuenta {
    
    private long codigo;
    private Date fecha_apertura;
    private float saldo;
    private long codigo_cliente;
    private String estado;

    public Cuenta() {
    }
    
    public Cuenta(Date fecha_apertura, float saldo, long codigo_cliente, String estado) {
        this.fecha_apertura = fecha_apertura;
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
        this.estado = estado;
    }
    
    public Cuenta(long codigo, Date fecha_apertura, float saldo, long codigo_cliente, String estado) {
        this.codigo= codigo;
        this.fecha_apertura = fecha_apertura;
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
        this.estado = estado;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(Date fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public long getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(long codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        return hash;
    }

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

    @Override
    public String toString() {
        return "Cuenta{" + "codigo=" + codigo + ", fecha_apertura=" + fecha_apertura + ", saldo=" + saldo + ", codigo_cliente=" + codigo_cliente + ", estado=" + estado + '}';
    }
    
}
