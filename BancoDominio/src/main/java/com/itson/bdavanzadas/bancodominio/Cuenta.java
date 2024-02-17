package com.itson.bdavanzadas.bancodominio;

import java.util.Date;

public class Cuenta {
    
    private Long numero_cuenta;
    private String contrasenia;
    private Date fecha_apertura;
    private float saldo;
    private Long codigo_cliente;

    public Cuenta() {
    }

    public Cuenta(String contrasenia, Date fecha_apertura, float saldo, Long codigo_cliente) {
        this.contrasenia = contrasenia;
        this.fecha_apertura = fecha_apertura;
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }

    public Cuenta(Long numero_cuenta, String contrasenia, Date fecha_apertura, float saldo, Long codigo_cliente) {
        this.numero_cuenta = numero_cuenta;
        this.contrasenia = contrasenia;
        this.fecha_apertura = fecha_apertura;
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{");
        sb.append("numero_cuenta=").append(numero_cuenta);
        sb.append(", contrasenia=").append(contrasenia);
        sb.append(", fecha_apertura=").append(fecha_apertura);
        sb.append(", saldo=").append(saldo);
        sb.append(", codigo_cliente=").append(codigo_cliente);
        sb.append('}');
        return sb.toString();
    }  
}
