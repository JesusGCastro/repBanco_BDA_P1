package com.itson.bdavanzadas.banco;

import com.itson.bdavanzadas.bancodominio.Cliente;
import com.itson.bdavanzadas.bancodominio.Cuenta;
import com.itson.bdavanzadas.bancopersistencia.conexion.Conexion;
import com.itson.bdavanzadas.bancopersistencia.conexion.IConexion;
import com.itson.bdavanzadas.bancopersistencia.daos.CuentasDAO;
import com.itson.bdavanzadas.bancopersistencia.daos.IClientesDAO;
import com.itson.bdavanzadas.bancopersistencia.daos.ICuentasDAO;
import com.itson.bdavanzadas.bancopersistencia.daos.ITransferenciasDAO;
import com.itson.bdavanzadas.bancopersistencia.daos.TransferenciasDAO;
import com.itson.bdavanzadas.bancopersistencia.dtos.TransferenciaNuevaDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;
import static java.lang.Float.parseFloat;
import static java.lang.Long.parseLong;
import javax.swing.JOptionPane;

public class TransferenciaForm extends javax.swing.JFrame {

    private final IClientesDAO clientesDAO;
    private final ICuentasDAO cuentasDAO;
    private final Cuenta cuenta;
    private final Cliente cliente;
    
    public TransferenciaForm(IClientesDAO clientesDAO, Cliente cliente,ICuentasDAO cuentasDAO, Cuenta cuenta) {
        initComponents();
        this.clientesDAO = clientesDAO;
        this.cliente = cliente;
        this.cuentasDAO = cuentasDAO;
        this.cuenta = cuenta;
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
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtCuentaDestino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtMonto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 223, 148));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Ingrese los datos solicitados:");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        btnSalir.setBackground(new java.awt.Color(255, 223, 148));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(100, 100, 100));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        bg.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 90, -1));

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
        bg.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 120, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 310, -1));

        txtCuentaDestino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCuentaDestino.setForeground(new java.awt.Color(100, 100, 100));
        txtCuentaDestino.setBorder(null);
        txtCuentaDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuentaDestinoActionPerformed(evt);
            }
        });
        bg.add(txtCuentaDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 320, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Cuenta a transferir:");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 137, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 310, -1));

        txtMonto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(100, 100, 100));
        txtMonto.setBorder(null);
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        bg.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Monto a transferir:");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        MenuClienteForm menuCliente = new MenuClienteForm(clientesDAO, cliente);
        menuCliente.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        transferir();
        dispose();
        MenuClienteForm menuCliente = new MenuClienteForm(clientesDAO, cliente);
        menuCliente.setVisible(true);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtCuentaDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuentaDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuentaDestinoActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    public void transferir(){
        Long codigoCuentaDestino = Long.valueOf(txtCuentaDestino.getText());
        Float monto = Float.valueOf(txtMonto.getText());
        
        try {
            this.cuentasDAO.realizarTransferencia(cuenta, codigoCuentaDestino, monto);
            JOptionPane.showMessageDialog(this, "Se realizo la operacion", "Notificaión", JOptionPane.INFORMATION_MESSAGE);
        } catch (PersistenciaException e) {
            JOptionPane.showMessageDialog(this, "No fue posible realizar la operacion", "Error de almacenamiento", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCuentaDestino;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
