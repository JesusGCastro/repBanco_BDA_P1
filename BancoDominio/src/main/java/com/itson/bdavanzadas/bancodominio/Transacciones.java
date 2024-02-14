package com.itson.bdavanzadas.bancodominio;

import java.util.GregorianCalendar;

public class Transacciones {
    
    private long codigo;
    private GregorianCalendar fecha;
    private float monto;
    private Cuenta cuentaEnvio;

    public Transacciones() {
    }

    public Transacciones(GregorianCalendar fecha, float monto, Cuenta cuentaEnvio) {
        this.fecha = fecha;
        this.monto = monto;
        this.cuentaEnvio = cuentaEnvio;
    }

    public Transacciones(long codigo, GregorianCalendar fecha, float monto, Cuenta cuentaEnvio) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.monto = monto;
        this.cuentaEnvio = cuentaEnvio;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Cuenta getCuentaEnvio() {
        return cuentaEnvio;
    }

    public void setCuentaEnvio(Cuenta cuentaEnvio) {
        this.cuentaEnvio = cuentaEnvio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
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
        final Transacciones other = (Transacciones) obj;
        return this.codigo == other.codigo;
    }

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
