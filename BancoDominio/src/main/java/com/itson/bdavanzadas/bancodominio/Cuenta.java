package com.itson.bdavanzadas.bancodominio;

import java.util.GregorianCalendar;
import java.util.Objects;

public class Cuenta {
    
    private Long codigo;
    private int numero_cuenta;
    private String contrasenia;
    private GregorianCalendar fecha_apertura;
    private float saldo;
    private Cliente cliente;

    public Cuenta() {
    }

    public Cuenta(int numero_cuenta, String contrasenia, GregorianCalendar fecha_apertura, float saldo, Cliente cliente) {
        this.numero_cuenta = numero_cuenta;
        this.contrasenia = contrasenia;
        this.fecha_apertura = fecha_apertura;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Cuenta(Long codigo, int numero_cuenta, String contrasenia, GregorianCalendar fecha_apertura, float saldo, Cliente cliente) {
        this.codigo = codigo;
        this.numero_cuenta = numero_cuenta;
        this.contrasenia = contrasenia;
        this.fecha_apertura = fecha_apertura;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
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
        sb.append(", numero_cuenta=").append(numero_cuenta);
        sb.append(", contrasenia=").append(contrasenia);
        sb.append(", fecha_apertura=").append(fecha_apertura);
        sb.append(", saldo=").append(saldo);
        sb.append(", cliente=").append(cliente);
        sb.append('}');
        return sb.toString();
    }
}
