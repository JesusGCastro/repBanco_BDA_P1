package com.itson.bdavanzadas.bancopersistencia.excepciones;

/**
 * Clase de excepciones PersistenciaException
 * @author Equipo
 */
public class PersistenciaException extends Exception {

    /**
     * Constructor por defecto.
     */
    public PersistenciaException() {
    }

    /**
     * Constructor que acepta un mensaje de error.
     * 
     * @param message el mensaje de error.
     */
    public PersistenciaException(String message) {
        super(message);
    }

    /**
     * Constructor que acepta un mensaje de error y una causa.
     * 
     * @param message el mensaje de error.
     * @param cause la causa de la excepción.
     */
    public PersistenciaException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor que acepta una causa.
     * 
     * @param cause la causa de la excepción.
     */
    public PersistenciaException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor que acepta un mensaje de error, una causa, y control sobre la supresión de la traza de pila y la escritura de la traza de pila.
     * 
     * @param message el mensaje de error.
     * @param cause la causa de la excepción.
     * @param enableSuppression controla si la supresión de la traza de pila está habilitada o no.
     * @param writableStackTrace controla si la traza de pila debe escribirse o no.
     */
    public PersistenciaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}