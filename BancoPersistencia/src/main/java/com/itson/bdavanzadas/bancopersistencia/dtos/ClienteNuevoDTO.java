package com.itson.bdavanzadas.bancopersistencia.dtos;

import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

/**
 * Clase DTO para un Cliente nuevo
 * @author Equipo
 */
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

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return el nombre del cliente.
     */
    public String getNombre_pila() {
        return nombre_pila;
    }

    /**
     * Establece el nombre del cliente.
     * 
     * @param nombre_pila el nombre del cliente a establecer.
     */
    public void setNombre_pila(String nombre_pila) {
        this.nombre_pila = nombre_pila;
    }

    /**
     * Obtiene el apellido paterno del cliente.
     * 
     * @return el apellido paterno del cliente.
     */
    public String getApellido_paterno() {
        return apellido_paterno;
    }

    /**
     * Establece el apellido paterno del cliente.
     * 
     * @param apellido_paterno el apellido paterno del cliente a establecer.
     */
    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    /**
     * Obtiene el apellido materno del cliente.
     * 
     * @return el apellido materno del cliente.
     */
    public String getApellido_materno() {
        return apellido_materno;
    }

    /**
     * Establece el apellido materno del cliente.
     * 
     * @param apellido_materno el apellido materno del cliente a establecer.
     */
    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    /**
     * Obtiene la fecha de nacimiento del cliente.
     * 
     * @return la fecha de nacimiento del cliente.
     */
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * Establece la fecha de nacimiento del cliente.
     * 
     * @param fecha_nacimiento la fecha de nacimiento del cliente a establecer.
     */
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    /**
     * Obtiene la calle del cliente.
     * 
     * @return la calle del cliente.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece la calle del cliente.
     * 
     * @param calle la calle del cliente.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el numero de casa del cliente.
     * 
     * @return el numero de casa del cliente.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Establece el numero de casa del cliente.
     * 
     * @param numero el numero de casa del cliente.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Obtiene la colonia del cliente.
     * 
     * @return la colonia del cliente.
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Establece la colonia del cliente.
     * 
     * @param colonia la colonia del cliente.
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * Obtiene el codigo postal del cliente.
     * 
     * @return el codigo postal del cliente.
     */
    public String getCodigo_postal() {
        return codigo_postal;
    }

    /**
     * Establece el codigo postal del cliente.
     * 
     * @param codigo_postal el codigo postal del cliente.
     */
    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    /**
     * Obtiene el correo del cliente.
     * 
     * @return el correo del cliente.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     *Establece el correo del cliente.
     * 
     * @param correo  el correo del cliente.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene la contasenia del cliente.
     * 
     * @return la contrasenia del cliente.
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Establece la contrasenia del cliente.
     * 
     * @param contrasenia la contrasenia del cliente.
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    /**
     * Valida los campos del cliente.
     * 
     * @return true si los campos son válidos, de lo contrario lanza una excepción.
     * @throws ValidacionDTOException si alguno de los campos no cumple con las validaciones.
     */
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
            throw new ValidacionDTOException("Contraseña inválida");
        }
        return true;
    }
    
    /**
     * Valida los campos de inicio de sesión del cliente.
     * 
     * @throws ValidacionDTOException si alguno de los campos no cumple con las validaciones.
     */
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
