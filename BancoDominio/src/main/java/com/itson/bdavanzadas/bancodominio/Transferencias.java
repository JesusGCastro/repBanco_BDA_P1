package com.itson.bdavanzadas.bancodominio;

import java.util.GregorianCalendar;

public class Transferencias extends Transacciones{
    
    private int codigo_transferencia;
    private Cuenta cuentaDestinataria;

    public Transferencias() {
    }

    public Transferencias(Cuenta cuentaDestinataria, GregorianCalendar fecha, float monto, Cuenta cuentaEnvio) {
        super(fecha, monto, cuentaEnvio);
        this.cuentaDestinataria = cuentaDestinataria;
    }

    public Transferencias(int codigo, Cuenta cuentaDestinataria, GregorianCalendar fecha, float monto, Cuenta cuentaEnvio) {
        super(fecha, monto, cuentaEnvio);
        this.codigo_transferencia = codigo;
        this.cuentaDestinataria = cuentaDestinataria;
    }

    public int getCodigo_transferencia() {
        return codigo_transferencia;
    }

    public void setCodigo_transferencia(int codigo_transferencia) {
        this.codigo_transferencia = codigo_transferencia;
    }

    public Cuenta getCuentaDestinataria() {
        return cuentaDestinataria;
    }

    public void setCuentaDestinataria(Cuenta cuentaDestinataria) {
        this.cuentaDestinataria = cuentaDestinataria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.codigo_transferencia;
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
        final Transferencias other = (Transferencias) obj;
        return this.codigo_transferencia == other.codigo_transferencia;
    }

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
