package com.itson.bdavanzadas.banco;

public class DlgCrearCuenta extends javax.swing.JDialog {

    /**
     * Creates new form FrmCrearCuenta
     */
    public DlgCrearCuenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        labelUsuarioRegistro1 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        labelUsuarioRegistro2 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 223, 148));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Ingrese los datos necesarios para crear su cuenta:");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        labelUsuarioRegistro1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUsuarioRegistro1.setText("Contraseña:");
        bg.add(labelUsuarioRegistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        txtContrasenia.setBackground(new java.awt.Color(255, 204, 102));
        txtContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtContrasenia.setForeground(new java.awt.Color(100, 100, 100));
        txtContrasenia.setBorder(null);
        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });
        bg.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 150, -1));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 150, 20));

        labelUsuarioRegistro2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUsuarioRegistro2.setText("Saldo de la cuenta:");
        bg.add(labelUsuarioRegistro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        txtSaldo.setBackground(new java.awt.Color(255, 204, 102));
        txtSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSaldo.setForeground(new java.awt.Color(100, 100, 100));
        txtSaldo.setBorder(null);
        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });
        bg.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 150, -1));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 150, 20));

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
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaActionPerformed

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

    }//GEN-LAST:event_btnAceptarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelUsuarioRegistro1;
    private javax.swing.JLabel labelUsuarioRegistro2;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
