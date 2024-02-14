package com.itson.bdavanzadas.bancodominio;

import java.util.GregorianCalendar;
import java.util.Objects;

public class Cliente {
    
    private Long codigo;
    private String nombre_pila;
    private String apellido_paterno;
    private String apellido_materno;
    private GregorianCalendar fecha_nacimiento;
    private String calle;
    private String numero;
    private String colonia;
    private String codigo_postal;

    public Cliente() {
    }

    public Cliente(String nombre_pila, String apellido_paterno, String apellido_materno, GregorianCalendar fecha_nacimiento, String calle, String numero, String colonia, String codigo_postal) {
        this.nombre_pila = nombre_pila;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.fecha_nacimiento = fecha_nacimiento;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.codigo_postal = codigo_postal;
    }

    public Cliente(Long codigo, String nombre_pila, String apellido_paterno, String apellido_materno, GregorianCalendar fecha_nacimiento, String calle, String numero, String colonia, String codigo_postal) {
        this.codigo = codigo;
        this.nombre_pila = nombre_pila;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.fecha_nacimiento = fecha_nacimiento;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.codigo_postal = codigo_postal;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre_pila() {
        return nombre_pila;
    }

    public void setNombre_pila(String nombre_pila) {
        this.nombre_pila = nombre_pila;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public GregorianCalendar getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(GregorianCalendar fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
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
        final Cliente other = (Cliente) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("codigo=").append(codigo);
        sb.append(", nombre_pila=").append(nombre_pila);
        sb.append(", apellido_paterno=").append(apellido_paterno);
        sb.append(", apellido_materno=").append(apellido_materno);
        sb.append(", fecha_nacimiento=").append(fecha_nacimiento);
        sb.append(", calle=").append(calle);
        sb.append(", numero=").append(numero);
        sb.append(", colonia=").append(colonia);
        sb.append(", codigo_postal=").append(codigo_postal);
        sb.append('}');
        return sb.toString();
    }
}
