package com.itson.bdavanzadas.bancodominio;

import java.util.Date;
import java.util.Objects;

/**
 * Clase de Clientes
 * @author Equipo
 */
public class Cliente {
    
    private Long codigo;
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
     * Constructor por defecto de la clase Cliente.
     * Crea una instancia de Cliente con valores predeterminados para los atributos.
     */
    public Cliente() {
    }

    /**
     * Constructor que inicializa un cliente con los datos especificados.
     * 
     * @param nombre_pila El nombre del cliente.
     * @param apellido_paterno El primer apellido del cliente.
     * @param apellido_materno El segundo apellido del cliente.
     * @param fecha_nacimiento La fecha de nacimiento del cliente.
     * @param calle La calle de residencia del cliente.
     * @param numero El número de residencia del cliente.
     * @param colonia La colonia de residencia del cliente.
     * @param codigo_postal El código postal de la dirección del cliente.
     * @param correo El correo electrónico del cliente.
     * @param contrasenia La contraseña del cliente.
     */
    public Cliente(String nombre_pila, String apellido_paterno, String apellido_materno, Date fecha_nacimiento, String calle, String numero, String colonia, String codigo_postal, String correo, String contrasenia) {
        this.nombre_pila = nombre_pila;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.fecha_nacimiento = fecha_nacimiento;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.codigo_postal = codigo_postal;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    /**
     * Constructor que inicializa un cliente con los datos especificados, incluyendo el código.
     * 
     * @param codigo El código único del cliente.
     * @param nombre_pila El nombre del cliente.
     * @param apellido_paterno El primer apellido del cliente.
     * @param apellido_materno El segundo apellido del cliente.
     * @param fecha_nacimiento La fecha de nacimiento del cliente.
     * @param calle La calle de residencia del cliente.
     * @param numero El número de residencia del cliente.
     * @param colonia La colonia de residencia del cliente.
     * @param codigo_postal El código postal de la dirección del cliente.
     * @param correo El correo electrónico del cliente.
     * @param contrasenia La contraseña del cliente.
     */
    public Cliente(Long codigo, String nombre_pila, String apellido_paterno, String apellido_materno, Date fecha_nacimiento, String calle, String numero, String colonia, String codigo_postal, String correo, String contrasenia) {
        this.codigo = codigo;
        this.nombre_pila = nombre_pila;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.fecha_nacimiento = fecha_nacimiento;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.codigo_postal = codigo_postal;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    /**
     * Obtiene el código único del cliente.
     * 
     * @return El código único del cliente.
     */
    public Long getCodigo() {
        return codigo;
    }

    /**
     * Establece el código único del cliente.
     * 
     * @param codigo El código único del cliente.
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return El nombre del cliente.
     */
    public String getNombre_pila() {
        return nombre_pila;
    }

    /**
     * Establece el nombre del cliente.
     * 
     * @param nombre_pila El nombre del cliente.
     */
    public void setNombre_pila(String nombre_pila) {
        this.nombre_pila = nombre_pila;
    }

    /**
     * Obtiene el primer apellido del cliente.
     * 
     * @return El primer apellido del cliente.
     */
    public String getApellido_paterno() {
        return apellido_paterno;
    }

    /**
     * Establece el primer apellido del cliente.
     * 
     * @param apellido_paterno El primer apellido del cliente.
     */
    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    /**
     * Obtiene el segundo apellido del cliente.
     * 
     * @return El segundo apellido del cliente.
     */
    public String getApellido_materno() {
        return apellido_materno;
    }

    /**
     * Establece el segundo apellido del cliente.
     * 
     * @param apellido_materno El segundo apellido del cliente.
     */
    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    /**
     * Obtiene la fecha de nacimiento del cliente.
     * 
     * @return La fecha de nacimiento del cliente.
     */
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * Establece la fecha de nacimiento del cliente.
     * 
     * @param fecha_nacimiento La fecha de nacimiento del cliente.
     */
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * Obtiene la calle de residencia del cliente.
     * 
     * @return La calle de residencia del cliente.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece la calle de residencia del cliente.
     * 
     * @param calle La calle de residencia del cliente.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el número de residencia del cliente.
     * 
     * @return El número de residencia del cliente.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Establece el número de residencia del cliente.
     * 
     * @param numero El número de residencia del cliente.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Obtiene la colonia de residencia del cliente.
     * 
     * @return La colonia de residencia del cliente.
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Establece la colonia de residencia del cliente.
     * 
     * @param colonia La colonia de residencia del cliente.
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * Obtiene el código postal de la dirección del cliente.
     * 
     * @return El código postal de la dirección del cliente.
     */
    public String getCodigo_postal() {
        return codigo_postal;
    }

    /**
     * Establece el código postal de la dirección del cliente.
     * 
     * @param codigo_postal El código postal de la dirección del cliente.
     */
    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    /**
     * Obtiene el correo electrónico del cliente.
     * 
     * @return El correo electrónico del cliente.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del cliente.
     * 
     * @param correo El correo electrónico del cliente.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene la contraseña del cliente.
     * 
     * @return La contraseña del cliente.
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Establece la contraseña del cliente.
     * 
     * @param contrasenia La contraseña del cliente.
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    /**
     * Establece la contraseña del cliente.
     * 
     * @param contrasenia La contraseña del cliente.
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    /**
     * Compara el cliente con otro objeto para verificar su igualdad.
     * 
     * @param obj El objeto con el cual se compara el cliente.
     * @return true si los objetos son iguales, false en caso contrario.
     */
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

    /**
     * Devuelve una representación de cadena del cliente.
     * 
     * @return Una cadena que representa al cliente.
     */
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
        sb.append(", correo=").append(correo);
        sb.append(", contrasenia=").append(contrasenia);
        sb.append('}');
        return sb.toString();
    }

    
}
