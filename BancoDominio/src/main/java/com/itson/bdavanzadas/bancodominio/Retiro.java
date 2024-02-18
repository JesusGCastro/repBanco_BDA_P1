package com.itson.bdavanzadas.bancodominio;

/**
 * Clase de Retiro
 * @author Equipo
 */
public class Retiro {
    private long codigo_transaccion;
    private long folio;
    private int contrasena;
    private byte estado;

    /**
     * Constructor por defecto de la clase Retiro.
     * Crea una instancia de Retiro con valores predeterminados para los atributos.
     */
    public Retiro() {
    }

    /**
     * Constructor que inicializa un retiro con el folio, contraseña y estado especificados.
     * 
     * @param folio El folio del retiro.
     * @param contrasena La contraseña asociada al retiro.
     * @param estado El estado del retiro.
     */
    public Retiro(long folio, int contrasena, byte estado) {
        this.folio = folio;
        this.contrasena = contrasena;
        this.estado = estado;
    }

    /**
     * Constructor que inicializa un retiro con el código de transacción, folio, contraseña y estado especificados.
     * 
     * @param codigo_transaccion El código único de transacción del retiro.
     * @param folio El folio del retiro.
     * @param contrasena La contraseña asociada al retiro.
     * @param estado El estado del retiro.
     */
    public Retiro(long codigo_transaccion, long folio, int contrasena, byte estado) {
        this.codigo_transaccion = codigo_transaccion;
        this.folio = folio;
        this.contrasena = contrasena;
        this.estado = estado;
    }
    
    /**
     * Obtiene el código de transacción del retiro.
     * 
     * @return El código de transacción del retiro.
     */
    public long getCodigo_transaccion() {
        return codigo_transaccion;
    }

    /**
     * Establece el código de transacción del retiro.
     * 
     * @param codigo_transaccion El código de transacción del retiro.
     */
    public void setCodigo_transaccion(long codigo_transaccion) {
        this.codigo_transaccion = codigo_transaccion;
    }

    /**
     * Obtiene el folio del retiro.
     * 
     * @return El folio del retiro.
     */
    public long getFolio() {
        return folio;
    }

    /**
     * Establece el folio del retiro.
     * 
     * @param folio El folio del retiro.
     */
    public void setFolio(long folio) {
        this.folio = folio;
    }

    /**
     * Obtiene la contraseña asociada al retiro.
     * 
     * @return La contraseña asociada al retiro.
     */
    public int getContrasena() {
        return contrasena;
    }

    /**
     * Establece la contraseña asociada al retiro.
     * 
     * @param contrasena La contraseña asociada al retiro.
     */
    public void setContrasenia(int contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Obtiene el estado del retiro.
     * 
     * @return El estado del retiro.
     */
    public byte getEstado() {
        return estado;
    }

    /**
     * Establece el estado del retiro.
     * 
     * @param estado El estado del retiro.
     */
    public void setEstado(byte estado) {
        this.estado = estado;
    }

    /**
     * Calcula el hash code para el retiro.
     * 
     * @return El hash code calculado.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.codigo_transaccion ^ (this.codigo_transaccion >>> 32));
        return hash;
    }

    /**
     * Compara el retiro con otro objeto para verificar su igualdad.
     * 
     * @param obj El objeto con el cual se compara el retiro.
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
        final Retiro other = (Retiro) obj;
        return this.codigo_transaccion == other.codigo_transaccion;
    }

    /**
     * Devuelve una representación de cadena del retiro.
     * 
     * @return Una cadena que representa el retiro.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Retiro{");
        sb.append("codigo_transaccion=").append(codigo_transaccion);
        sb.append(", folio=").append(folio);
        sb.append(", contrasena=").append(contrasena);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
}
