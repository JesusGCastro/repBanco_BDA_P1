package com.itson.bdavanzadas.banco;

import com.itson.bdavanzadas.bancopersistencia.daos.IClientesDAO;

public class MenuForm extends javax.swing.JFrame {

    private final IClientesDAO clientesDAO;
    
    public MenuForm(IClientesDAO clientesDAO) {
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
        jLabel7 = new javax.swing.JLabel();
        btnRegistrarUsuario = new javax.swing.JButton();
        btnInicioSesion = new javax.swing.JButton();
        btnRetiro = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 430));

        bg.setBackground(new java.awt.Color(255, 223, 148));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Bienvenido a tu banco de confianza");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        btnRegistrarUsuario.setBackground(new java.awt.Color(255, 223, 148));
        btnRegistrarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegistrarUsuario.setForeground(new java.awt.Color(100, 100, 100));
        btnRegistrarUsuario.setText("Registrar usuario");
        btnRegistrarUsuario.setBorder(null);
        btnRegistrarUsuario.setBorderPainted(false);
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });
        bg.add(btnRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 200, -1));

        btnInicioSesion.setBackground(new java.awt.Color(255, 223, 148));
        btnInicioSesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnInicioSesion.setForeground(new java.awt.Color(100, 100, 100));
        btnInicioSesion.setText("Iniciar Sesión");
        btnInicioSesion.setBorder(null);
        btnInicioSesion.setBorderPainted(false);
        btnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSesionActionPerformed(evt);
            }
        });
        bg.add(btnInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        btnRetiro.setBackground(new java.awt.Color(255, 223, 148));
        btnRetiro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRetiro.setForeground(new java.awt.Color(100, 100, 100));
        btnRetiro.setText("Retiro sin cuenta");
        btnRetiro.setBorder(null);
        btnRetiro.setBorderPainted(false);
        btnRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroActionPerformed(evt);
            }
        });
        bg.add(btnRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 180, -1));

        botonCancelar.setBackground(new java.awt.Color(255, 224, 150));
        botonCancelar.setText("Salir");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        bg.add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        dispose();
        RegistroForm registro = new RegistroForm(clientesDAO);
        registro.setVisible(true);
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed
        dispose();
        InicioForm inicioSesion = new InicioForm(clientesDAO);
        inicioSesion.setVisible(true);
    }//GEN-LAST:event_btnInicioSesionActionPerformed

    private void btnRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroActionPerformed
        dispose();
        RetiroSinCuentaForm retiro = new RetiroSinCuentaForm(clientesDAO);
        retiro.setVisible(true);
    }//GEN-LAST:event_btnRetiroActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JButton btnRetiro;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
