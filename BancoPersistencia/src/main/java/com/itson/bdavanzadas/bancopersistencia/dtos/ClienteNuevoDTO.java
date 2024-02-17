package com.itson.bdavanzadas.bancopersistencia.dtos;

import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

public class ClienteNuevoDTO {
    
    private String nombre_pila;
    private String apellido_paterno;
    private String apellido_materno;
    private Date fecha_nacimiento;
    private String calle;
    private String numero;
    private String colonia;
    private String codigo_postal;
    private String correo;
    private String contrasenia;

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

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    public boolean esValido() throws ValidacionDTOException{
        //Validaciones solo de Formato
        if (this.nombre_pila == null 
                || this.nombre_pila.isBlank()
                || this.nombre_pila.trim().length() > 100) {
            throw new ValidacionDTOException("Nombre de Cliente inválido");
        }
        if (this.apellido_paterno == null 
                || this.apellido_paterno.isBlank()
                || this.apellido_paterno.trim().length() > 100) {
            throw new ValidacionDTOException("Apellido Paterno de Cliente inválido");
        }
        if (this.apellido_materno == null 
                || this.apellido_materno.isBlank()
                || this.apellido_materno.trim().length() > 100) {
            throw new ValidacionDTOException("Apellido Materno de Cliente inválido");
        }
        if (this.calle == null 
                || this.calle.isBlank()
                || this.calle.trim().length() > 100) {
            throw new ValidacionDTOException("Calle de Cliente inválida");
        }
        if (this.numero == null 
                || this.numero.isBlank()
                || this.numero.trim().length() > 50) {
            throw new ValidacionDTOException("Numero de casa de Cliente inválido");
        }
        if (this.colonia == null 
                || this.colonia.isBlank()
                || this.colonia.trim().length() > 100) {
            throw new ValidacionDTOException("Colonia de Cliente inválida");
        }
        if (this.codigo_postal == null 
                || this.codigo_postal.isBlank()
                || this.codigo_postal.trim().length() > 10) {
            throw new ValidacionDTOException("Codigo Postal de Cliente inválida");
        }
        if (this.fecha_nacimiento == null) {
            throw new ValidacionDTOException("Fecha de Cliente inválida");
        }
        LocalDate fechaNacimientoLocal = this.fecha_nacimiento.toLocalDate();
        int years = Period.between(fechaNacimientoLocal, LocalDate.now()).getYears();

        if (years < 18) {
            throw new ValidacionDTOException("El cliente debe de ser mayor de 18 años");
        }
        if (this.correo == null 
                || this.correo.isBlank()
                || this.correo.trim().length() > 100) {
            throw new ValidacionDTOException("Correo de Cliente inválida");
        }
        if (this.contrasenia == null 
                || this.contrasenia.isBlank()
                || this.contrasenia.trim().length() > 50) {
            throw new ValidacionDTOException("Codigo Postal de Cliente inválida");
        }
        return true;
    }
    
    public void esValidoInicioSesion() throws ValidacionDTOException{
        if (this.correo == null 
                || this.correo.isBlank()
                || this.correo.trim().length() > 100) {
            throw new ValidacionDTOException("Correo de Cliente inválida");
        }
        if (this.contrasenia == null 
                || this.contrasenia.isBlank()
                || this.contrasenia.trim().length() > 50) {
            throw new ValidacionDTOException("Codigo Postal de Cliente inválida");
        }
    }
}
