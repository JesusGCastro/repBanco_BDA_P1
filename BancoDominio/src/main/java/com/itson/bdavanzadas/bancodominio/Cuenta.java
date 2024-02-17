package com.itson.bdavanzadas.bancodominio;

import java.util.GregorianCalendar;
import java.util.Objects;

public class Cuenta {
    
    private Long codigo;
    private GregorianCalendar fecha_apertura;
    private float saldo;
    private Cliente cliente;
    private boolean estado;

    public Cuenta() {
    }

    public Cuenta(GregorianCalendar fecha_apertura, float saldo, Cliente cliente, boolean estado) {
        this.fecha_apertura = fecha_apertura;
        this.saldo = saldo;
        this.cliente = cliente;
        this.estado = estado;
    }

    public Cuenta(Long codigo, GregorianCalendar fecha_apertura, float saldo, Cliente cliente, boolean estado) {
        this.codigo = codigo;
        this.fecha_apertura = fecha_apertura;
        this.saldo = saldo;
        this.cliente = cliente;
        this.estado = estado;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public GregorianCalendar getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(GregorianCalendar fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.codigo);
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
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append("codigo=").append(codigo);
        sb.append(", fecha_apertura=").append(fecha_apertura);
        sb.append(", saldo=").append(saldo);
        sb.append(", cliente=").append(cliente);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }

    
}
