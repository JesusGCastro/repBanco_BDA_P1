package com.itson.bdavanzadas.bancodominio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cuenta {
    
    private long codigo;
    private Date fecha_apertura;
    private float saldo;
    private long codigo_cliente;
    private boolean estado = true; //De principio estara activa

    public Cuenta() {
    }
    
    public Cuenta( float saldo, long codigo_cliente) {
        this.fecha_apertura = new Date();
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }
    
    public Cuenta(long codigo, float saldo, long codigo_cliente) {
        this.codigo= codigo;
        this.fecha_apertura = new Date();
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }

    public Cuenta(long codigo, float saldo) {
        this.codigo = codigo;
        this.saldo = saldo;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getFechaAperturaFormateada() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        return formatoFecha.format(fecha_apertura);
    }

//    public void setFecha_apertura(Date fecha_apertura) {
//        this.fecha_apertura = fecha_apertura;
//    }

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

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
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
