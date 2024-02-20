package com.itson.bdavanzadas.banco;

import com.itson.bdavanzadas.bancodominio.Cliente;
import com.itson.bdavanzadas.bancodominio.Cuenta;
import com.itson.bdavanzadas.bancopersistencia.daos.IClientesDAO;
import com.itson.bdavanzadas.bancopersistencia.daos.ICuentasDAO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import javax.swing.JOptionPane;


/**
 * Clase que representa el formulario para realizar un retiro de dinero de una cuenta.
 * Permite al cliente ingresar el monto que desea retirar y realizar la operación.
 * 
 * @author Equipo
 */
public class RetiroForm extends javax.swing.JFrame {
    
    private final IClientesDAO clientesDAO;
    private final Cuenta cuenta;
    private final Cliente cliente;
    private final ICuentasDAO cuentasDAO;
    //private final IRetirosDAO retirosDAO;
    
    /**
     * Constructor de la clase RetiroForm.
     * 
     * @param clientesDAO Instancia de IClientesDAO para interactuar con la capa de persistencia de clientes.
     * @param cuenta Objeto Cuenta asociado al retiro.
     * @param cliente Objeto Cliente al que pertenece la cuenta.
     * @param cuentasDAO Instancia de ICuentasDAO para interactuar con la capa de persistencia de cuentas.
     */
    public RetiroForm(IClientesDAO clientesDAO, Cuenta cuenta, Cliente cliente, ICuentasDAO cuentasDAO) {
        initComponents();
        this.clientesDAO = clientesDAO;
        this.cuenta = cuenta;
        this.cliente = cliente;
        this.cuentasDAO = cuentasDAO;
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
        txtMonto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(522, 300));
        setPreferredSize(new java.awt.Dimension(522, 300));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(522, 300));
        bg.setPreferredSize(new java.awt.Dimension(522, 300));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 223, 148));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 223, 148));
        jLabel1.setText("Retiro de dinero");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        txtMonto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(100, 100, 100));
        txtMonto.setBorder(null);
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        bg.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 320, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 320, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Monto a retirar:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(100, 100, 100));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salida.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setDefaultCapable(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        bg.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 50, -1));

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
        bg.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 90, -1));

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
        MenuClienteForm menuCliente = new MenuClienteForm(clientesDAO, cliente);
        menuCliente.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        retirar();
        dispose();
        MenuClienteForm menuCliente = new MenuClienteForm(clientesDAO, cliente);
        menuCliente.setVisible(true);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    /**
     * Método para realizar un retiro de dinero de la cuenta asociada.
     * Obtiene el monto ingresado por el usuario y realiza la operación de retiro.
     * Muestra un mensaje de error si la operación no puede ser completada.
     */
    public void retirar(){
        float monto = Float.valueOf(txtMonto.getText());
        
        try {
            this.cuentasDAO.registarRetiro(cuenta, monto);
        } catch (PersistenciaException ex) {
            JOptionPane.showMessageDialog(this, "No fue posible realizar la operacion", "Error de almacenamiento", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
