package com.itson.bdavanzadas.bancopersistencia.daos;

import com.itson.bdavanzadas.bancodominio.Cliente;
import com.itson.bdavanzadas.bancopersistencia.conexion.IConexion;
import com.itson.bdavanzadas.bancopersistencia.dtos.ClienteNuevoDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase de ClientesDAO
 * @author Equipo
 */
public class ClientesDAO implements IClientesDAO{

    final IConexion conexionBD;
    static final Logger logger = Logger.getLogger(ClientesDAO.class.getName());

    /**
     * Constructor para la clase ClientesDAO.
     * 
     * @param conexionBD La conexión a la base de datos.
     */
    public ClientesDAO(IConexion conexionBD) {
        this.conexionBD = conexionBD;
    }

    /**
     * Registra un nuevo cliente en la base de datos.
     * 
     * @param clienteNuevo El DTO que contiene la información del nuevo cliente a registrar.
     * @return El objeto Cliente registrado.
     * @throws PersistenciaException Si ocurre un error durante el proceso de registro.
     */
    @Override
    public Cliente registrarCliente(ClienteNuevoDTO clienteNuevo) throws PersistenciaException {
        String sentenciaSQL = """
            INSERT INTO clientes(nombre_pila, apellido_paterno, apellido_materno, fecha_nacimiento, calle, numero, colonia, codigo_postal, correo, contrasenia) 
            VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
        """;
        try (
            Connection conexion = this.conexionBD.obtenerConexion();
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);
        ){
            comando.setString(1, clienteNuevo.getNombre_pila());
            comando.setString(2, clienteNuevo.getApellido_paterno());
            comando.setString(3, clienteNuevo.getApellido_materno());
            comando.setDate(4, clienteNuevo.getFecha_nacimiento());
            comando.setString(5, clienteNuevo.getCalle());
            comando.setString(6, clienteNuevo.getNumero());
            comando.setString(7, clienteNuevo.getColonia());
            comando.setString(8, clienteNuevo.getCodigo_postal());
            comando.setString(9, clienteNuevo.getCorreo());
            comando.setString(10, clienteNuevo.getContrasenia());
            int numRegistrosInsertados = comando.executeUpdate();
            logger.log(Level.INFO, "Se agregó {0} clientes", numRegistrosInsertados);
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
                    clienteNuevo.getCodigo_postal(),
                    clienteNuevo.getCorreo(),
                    clienteNuevo.getContrasenia());
            return cliente;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se pudo registrar el cliente", e);
            throw new PersistenciaException("No se pudo registrar el cliente", e);
        }
    }

    /**
     * Inicia sesión para un cliente existente en la base de datos.
     * 
     * @param cliente El DTO que contiene la información del cliente para iniciar sesión.
     * @return El objeto Cliente que representa al cliente que ha iniciado sesión.
     * @throws PersistenciaException Si ocurre un error durante el proceso de inicio de sesión.
     */
    @Override
    public Cliente iniciarSesion(ClienteNuevoDTO cliente) throws PersistenciaException {
        String sentenciaSQL = """
                SELECT * FROM clientes 
                WHERE correo = ? AND contrasenia = ?
        """;
        try (
            Connection conexion = this.conexionBD.obtenerConexion();
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL); 
        ){
            comando.setString(1, cliente.getCorreo());
            comando.setString(2, cliente.getContrasenia());
            ResultSet resultado = comando.executeQuery();
            if (resultado.next()) { 
                Long codigo = resultado.getLong("codigo");
                String nombre_pila = resultado.getString("nombre_pila");
                String apellido_paterno = resultado.getString("apellido_paterno");
                String apellido_materno = resultado.getString("apellido_materno");
                Date fecha_nacimiento = resultado.getDate("fecha_nacimiento");
                String calle = resultado.getString("calle");
                String numero_casa = resultado.getString("numero");
                String colonia = resultado.getString("colonia");
                String codigo_postal = resultado.getString("codigo_postal");
                String correo = resultado.getString("correo");
                String contrasenia = resultado.getString("contrasenia");

                Cliente clienteEncontrado = new Cliente(codigo, nombre_pila, apellido_paterno, apellido_materno, fecha_nacimiento, calle, numero_casa, colonia, codigo_postal, correo, contrasenia);
                logger.log(Level.INFO, "Cliente validado");
                return clienteEncontrado;
            } else {
                logger.log(Level.SEVERE, "No se encontro un cliente con el correo y contraseña ingresados");
                throw new PersistenciaException("No se encontro un cliente con el correo y contraseña ingresados");
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se encontro un cliente con el correo y contraseña ingresados", e);
            throw new PersistenciaException("No se encontro un cliente con el correo y contraseña ingresados", e);
        }
    }

    @Override
    public void ActualizarCliente(Cliente cliente) throws PersistenciaException {
        String sentenciaSQL = """
            UPDATE clientes
            SET 
                nombre_pila,
                apellido_paterno,
                apellido_materno,
                fecha_nacimiento,
                calle,
                numero,
                colonia,
                codigo_postal,
                correo,
                contrasenia
            WHERE codigo = ?;          
        """;
        try (
            Connection conexion = this.conexionBD.obtenerConexion();
            PreparedStatement comando = conexion.prepareStatement(sentenciaSQL);
        ){
            comando.setLong(1, cliente.getCodigo());
            ResultSet resultado = comando.executeQuery();
            
            comando.setString(1, cliente.getNombre_pila());
            comando.setString(2, cliente.getApellido_paterno());
            comando.setString(3, cliente.getApellido_materno());
            comando.setDate(4, (Date) cliente.getFecha_nacimiento());
            comando.setString(5, cliente.getCalle());
            comando.setString(6, cliente.getNumero());
            comando.setString(7, cliente.getColonia());
            comando.setString(8, cliente.getCodigo_postal());
            comando.setString(9, cliente.getCorreo());
            comando.setString(10, cliente.getContrasenia());
            logger.log(Level.INFO, "Cliente Encontrado");
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "No se encontro un cliente con el id", e);
            throw new PersistenciaException("No se encontro un cliente con el id", e);
        }
    }
    
    
    
}
