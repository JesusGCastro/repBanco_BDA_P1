package com.itson.bdavanzadas.bancodominio;

import java.util.Date;
import java.util.Objects;

public class Cuenta {
    
    private Long codigo;
    private Long numero_cuenta;
    private String contrasenia;
    private Date fecha_apertura;
    private float saldo;
    private Long codigo_cliente;

    public Cuenta() {
    }

    public Cuenta(Long numero_cuenta, String contrasenia, Date fecha_apertura, float saldo, Long codigo_cliente) {
        this.numero_cuenta = numero_cuenta;
        this.contrasenia = contrasenia;
        this.fecha_apertura = fecha_apertura;
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }

    public Cuenta(Long codigo, Long numero_cuenta, String contrasenia, Date fecha_apertura, float saldo, Long codigo_cliente) {
        this.codigo = codigo;
        this.numero_cuenta = numero_cuenta;
        this.contrasenia = contrasenia;
        this.fecha_apertura = fecha_apertura;
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Long getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(Long numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
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

    public Long getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(Long codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
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
        sb.append(", codigo_cliente=").append(codigo_cliente);
        sb.append('}');
        return sb.toString();
    }
}
