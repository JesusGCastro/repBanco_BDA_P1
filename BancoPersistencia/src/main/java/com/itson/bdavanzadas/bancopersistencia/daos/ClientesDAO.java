package com.itson.bdavanzadas.bancopersistencia.daos;

import com.itson.bdavanzadas.bancodominio.Cliente;
import com.itson.bdavanzadas.bancopersistencia.conexion.IConexion;
import com.itson.bdavanzadas.bancopersistencia.dtos.ClienteNuevoDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientesDAO implements IClientesDAO{

    final IConexion conexionBD;
    static final Logger logger = Logger.getLogger(ClientesDAO.class.getName());

    public ClientesDAO(IConexion conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public Cliente registrarCliente(ClienteNuevoDTO clienteNuevo) throws PersistenciaException {
        String sentenciaSQL = """
            INSERT INTO socios(nombre,telefono,correo) 
            VALUES (?,?,?);                      
        """;
        try (
            Connection conexion = this.conexionBD.obtenerConexion();
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);
        ){
            comando.setString(1, clienteNuevo.getNombre_pila());
            comando.setString(1, clienteNuevo.getApellido_paterno());
            comando.setString(1, clienteNuevo.getApellido_materno());
            comando.setString(1, clienteNuevo.getFecha_nacimiento().toString());
            comando.setString(1, clienteNuevo.getCalle());
            comando.setString(1, clienteNuevo.getNumero());
            comando.setString(1, clienteNuevo.getColonia());
            comando.setString(1, clienteNuevo.getCodigo_postal());
            //Socio a devolver con id
            ResultSet idsGenerados = comando.getGeneratedKeys();
            idsGenerados.next();
            Cliente cliente = new Cliente(
                    idsGenerados.getLong(1), 
                    clienteNuevo.getNombre_pila(), 
                    clienteNuevo.getApellido_paterno(), 
                    clienteNuevo.getApellido_materno(), 
                    clienteNuevo.getFecha_nacimiento(), 
                    clienteNuevo.getCalle(), 
                    clienteNuevo.getNumero(), 
                    clienteNuevo.getColonia(), 
                    clienteNuevo.getCodigo_postal());
            return cliente;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudo registrar el cliente", e);
            throw new PersistenciaException("No se pudo registrar el clientex", e);
        }
    }
    
}
