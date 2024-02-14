package com.itson.bdavanzadas.bancodominio;

public class Retiro {
    private int codigo_transaccion;
    private int folio;
    private int contraseña;
    private byte estado;

    public Retiro() {
    }

    public Retiro(int folio, int contraseña, byte estado) {
        this.folio = folio;
        this.contraseña = contraseña;
        this.estado = estado;
    }

    public Retiro(int codigo_transaccion, int folio, int contraseña, byte estado) {
        this.codigo_transaccion = codigo_transaccion;
        this.folio = folio;
        this.contraseña = contraseña;
        this.estado = estado;
    }
    
    public int getCodigo_transaccion() {
        return codigo_transaccion;
    }

    public void setCodigo_transaccion(int codigo_transaccion) {
        this.codigo_transaccion = codigo_transaccion;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.codigo_transaccion;
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
        final Retiro other = (Retiro) obj;
        return this.codigo_transaccion == other.codigo_transaccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Retiro{");
        sb.append("codigo_transaccion=").append(codigo_transaccion);
        sb.append(", folio=").append(folio);
        sb.append(", contrase\u00f1a=").append(contraseña);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
}
