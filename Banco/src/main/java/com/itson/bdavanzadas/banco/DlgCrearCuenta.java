package com.itson.bdavanzadas.banco;

import com.itson.bdavanzadas.bancodominio.Cliente;
import com.itson.bdavanzadas.bancopersistencia.daos.ICuentasDAO;
import com.itson.bdavanzadas.bancopersistencia.dtos.CuentaNuevaDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;
import javax.swing.JOptionPane;

public class DlgCrearCuenta extends javax.swing.JDialog {

    private final ICuentasDAO cuentasDAO;
    private final Cliente cliente;
    
    public DlgCrearCuenta(java.awt.Frame parent, boolean modal,ICuentasDAO cuentasDAO,  Cliente cliente) {
        super(parent, modal);
        initComponents();
        this.cuentasDAO = cuentasDAO;
        this.cliente = cliente;
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
        jLabel7 = new javax.swing.JLabel();
        labelUsuarioRegistro2 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 223, 148));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Ingrese los datos necesarios para crear su cuenta:");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        labelUsuarioRegistro2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUsuarioRegistro2.setText("Deposite el saldo inicial de la cuenta:");
        bg.add(labelUsuarioRegistro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        txtSaldo.setBackground(new java.awt.Color(255, 204, 102));
        txtSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSaldo.setForeground(new java.awt.Color(100, 100, 100));
        txtSaldo.setBorder(null);
        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });
        bg.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 150, -1));

        btnAceptar.setBackground(new java.awt.Color(255, 204, 102));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(100, 100, 100));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        bg.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        registarCuenta();
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActionPerformed

   public void registarCuenta(){
       Float saldo = Float.valueOf(txtSaldo.getText());
       
       CuentaNuevaDTO cuentaNueva = new CuentaNuevaDTO();
       cuentaNueva.setCodigo_cliente(cliente.getCodigo());
       cuentaNueva.setSaldo(saldo);
       
       try {
           cuentaNueva.esValido();
           this.cuentasDAO.registrarCuenta(cuentaNueva);
           JOptionPane.showMessageDialog(this, "Se registró la cuenta", "Notificaión", JOptionPane.INFORMATION_MESSAGE);
        } catch (ValidacionDTOException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error de validación", JOptionPane.ERROR_MESSAGE);
        } catch (PersistenciaException e) {
            JOptionPane.showMessageDialog(this, "No fue posible registrar la cuenta", "Error de almacenamiento", JOptionPane.ERROR_MESSAGE);
        }
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelUsuarioRegistro2;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
