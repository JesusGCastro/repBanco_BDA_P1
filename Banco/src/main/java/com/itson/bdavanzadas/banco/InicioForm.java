package com.itson.bdavanzadas.banco;

import com.itson.bdavanzadas.bancodominio.Cliente;
import com.itson.bdavanzadas.bancopersistencia.daos.IClientesDAO;
import com.itson.bdavanzadas.bancopersistencia.dtos.ClienteNuevoDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;
import javax.swing.JOptionPane;

/**
 * La clase InicioForm representa una ventana de interfaz gráfica de usuario (GUI)
 * para el inicio de sesión de un cliente en el sistema bancario. Permite al usuario
 * ingresar su correo electrónico y contraseña para iniciar sesión. La clase utiliza
 * componentes de Swing para construir la interfaz de usuario y se comunica con la capa
 * de persistencia a través de la interfaz IClientesDAO para autenticar al cliente.
 * 
 * @author Equipo
 */
public class InicioForm extends javax.swing.JFrame {

    private final IClientesDAO clientesDAO;
    
   /**
     * Constructor de la clase InicioForm.
     * 
     * @param clientesDAO Una instancia de IClientesDAO para autenticar al cliente.
     */
    public InicioForm(IClientesDAO clientesDAO) {
        initComponents();
        this.clientesDAO = clientesDAO;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        L = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        R = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        pswdConstrasenia = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnIniciarSesion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L.setBackground(new java.awt.Color(255, 223, 148));
        L.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setText("© [2023] SCAA. Todos los derechos reservados.\"");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Somos tu banco de confianza!!");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Tu dinero, siempre en tus manos");

        javax.swing.GroupLayout LLayout = new javax.swing.GroupLayout(L);
        L.setLayout(LLayout);
        LLayout.setHorizontalGroup(
            LLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(LLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(70, 70, 70))
            .addGroup(LLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LLayout.setVerticalGroup(
            LLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(53, 53, 53))
        );

        bg.add(L, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        R.setBackground(new java.awt.Color(255, 255, 255));
        R.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setBackground(new java.awt.Color(255, 223, 148));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 223, 148));
        jLabel1.setText("Inicio de Sesion");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Correo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Contraseña:");

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(100, 100, 100));
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        pswdConstrasenia.setForeground(new java.awt.Color(100, 100, 100));
        pswdConstrasenia.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btnIniciarSesion.setBackground(new java.awt.Color(255, 223, 148));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(100, 100, 100));
        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(100, 100, 100));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salida.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RLayout = new javax.swing.GroupLayout(R);
        R.setLayout(RLayout);
        RLayout.setHorizontalGroup(
            RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(txtCorreo)
                        .addComponent(pswdConstrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RLayout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(14, 14, 14))))
        );
        RLayout.setVerticalGroup(
            RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir)
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswdConstrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        bg.add(R, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método invocado cuando se presiona el botón "Iniciar Sesión".
     * Llama al método iniciar() para procesar el inicio de sesión.
     */
    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        iniciar();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed
    
    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed
    /**
     * Método invocado cuando se presiona el botón "Salir".
     * Cierra la ventana actual e instancia un nuevo menú principal.
     */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        MenuForm principal = new MenuForm(clientesDAO);
        principal.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed
    
    /**
     * Método para procesar el inicio de sesión del cliente.
     * Recupera el correo electrónico y la contraseña ingresados por el usuario,
     * valida las credenciales utilizando un objeto ClienteNuevoDTO y el método
     * iniciarSesion() del DAO de clientes, y muestra un mensaje de éxito o error
     * según el resultado.
     */
    public void iniciar(){
        Cliente clienteInicio;
        
        String correo = txtCorreo.getText();
        String contrasenia = new String(pswdConstrasenia.getPassword());
        
        ClienteNuevoDTO cliente = new ClienteNuevoDTO();
        cliente.setCorreo(correo);
        cliente.setContrasenia(contrasenia);
        
        try {
            cliente.esValidoInicioSesion();
            clienteInicio = this.clientesDAO.iniciarSesion(cliente);
            JOptionPane.showMessageDialog(this, "Credenciales validas", "Notificaión", JOptionPane.INFORMATION_MESSAGE);
            limpiarDatos();
            this.dispose();
            MenuClienteForm menuCliente = new MenuClienteForm(clientesDAO, clienteInicio);
            menuCliente.setVisible(true);
        } catch (ValidacionDTOException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error de validación", JOptionPane.ERROR_MESSAGE);
        } catch (PersistenciaException e) {
            JOptionPane.showMessageDialog(this, "No fue posible iniciar sesion", "Error de credenciales", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Método para limpiar los datos ingresados por el usuario en los campos de correo y contraseña.
     */
    public void limpiarDatos(){
        txtCorreo.setText("");
        pswdConstrasenia.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel L;
    private javax.swing.JPanel R;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField pswdConstrasenia;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
