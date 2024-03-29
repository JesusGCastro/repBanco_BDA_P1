package com.itson.bdavanzadas.banco;

import com.itson.bdavanzadas.bancopersistencia.conexion.Conexion;
import com.itson.bdavanzadas.bancopersistencia.conexion.IConexion;
import com.itson.bdavanzadas.bancopersistencia.daos.CuentasDAO;
import com.itson.bdavanzadas.bancopersistencia.daos.IClientesDAO;
import com.itson.bdavanzadas.bancopersistencia.daos.ICuentasDAO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import javax.swing.JOptionPane;

/**
 * Clase que representa el formulario para realizar un retiro de dinero sin una cuenta asociada.
 * Permite al cliente ingresar el folio de la transacción y su contraseña para realizar el retiro.
 * Utiliza la capa de persistencia para realizar la operación de retiro.
 * 
 * @author Equipo
 */
public class RetiroSinCuentaForm extends javax.swing.JFrame {
    
    private final IClientesDAO clientesDAO;
    private final ICuentasDAO cuentasDAO;
    
    /**
     * Constructor de la clase RetiroSinCuentaForm.
     * 
     * @param clientesDAO Instancia de IClientesDAO para interactuar con la capa de persistencia de clientes.
     */
    public RetiroSinCuentaForm(IClientesDAO clientesDAO) {
        initComponents();
        this.clientesDAO = clientesDAO;
        String cadenaConexion = "jdbc:mysql://localhost/banco";
        String usuario = "root";
        String password = "123456789";
        IConexion conexion = new Conexion(cadenaConexion, usuario, password);
        this.cuentasDAO = new CuentasDAO(conexion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings(value = "unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtfolio = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        txtContrasenia = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(400, 400));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 223, 148));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 223, 148));
        jLabel1.setText("Retiro de dinero");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        txtfolio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfolio.setForeground(new java.awt.Color(100, 100, 100));
        txtfolio.setBorder(null);
        bg.add(txtfolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 320, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 310, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Folio:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 137, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Contraseña:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 310, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 223, 148));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(100, 100, 100));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        bg.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 90, -1));

        btnAceptar.setBackground(new java.awt.Color(255, 223, 148));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(100, 100, 100));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        bg.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 90, -1));

        txtContrasenia.setForeground(new java.awt.Color(100, 100, 100));
        txtContrasenia.setBorder(null);
        bg.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 310, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
        MenuForm principal = new MenuForm(clientesDAO);
        principal.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        retirarSinCuenta();
    }//GEN-LAST:event_btnAceptarActionPerformed

   /**
     * Método para realizar un retiro de dinero sin una cuenta asociada.
     * Obtiene el folio y la contraseña ingresados por el usuario y realiza la operación de retiro.
     * Muestra un mensaje de error si la operación no puede ser completada.
     */
    public void retirarSinCuenta(){
        int folio = Integer.valueOf(txtfolio.getText());
        String password = new String(txtContrasenia.getPassword());//Lo hacemos string para poder usar el valueOf
        int contrasenia = Integer.valueOf(password);
        
        try {
            this.cuentasDAO.realizarRetiro(folio, contrasenia);
        } catch (PersistenciaException e) {
            JOptionPane.showMessageDialog(this, "No fue posible realizar la operacion", "Error de almacenamiento", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtfolio;
    // End of variables declaration//GEN-END:variables
}
