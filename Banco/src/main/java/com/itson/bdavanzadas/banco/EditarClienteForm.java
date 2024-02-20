package com.itson.bdavanzadas.banco;

import com.itson.bdavanzadas.bancodominio.Cliente;
import com.itson.bdavanzadas.bancopersistencia.daos.IClientesDAO;
import com.itson.bdavanzadas.bancopersistencia.dtos.ClienteNuevoDTO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import com.itson.bdavanzadas.bancopersistencia.excepciones.ValidacionDTOException;
import javax.swing.JOptionPane;


public class EditarClienteForm extends javax.swing.JFrame {

    private final IClientesDAO clientesDAO;
    private final Cliente cliente;
    
    public EditarClienteForm(IClientesDAO clientesDAO, Cliente cliente) {
        initComponents();
        this.clientesDAO = clientesDAO;
        this.cliente = cliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        R = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelUsuarioRegistro = new javax.swing.JLabel();
        labelEmailRegistro = new javax.swing.JLabel();
        labelContraseñaRegistro = new javax.swing.JLabel();
        botonRegistrarCliente = new javax.swing.JButton();
        txtNombreUsuario = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        labelUsuarioRegistro1 = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        labelUsuarioRegistro2 = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        labelEmailRegistro1 = new javax.swing.JLabel();
        labelEmailRegistro2 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        txtNumeroCasa = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jDateFechaNacimiento = new com.toedter.calendar.JDateChooser();
        labelTelefono1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        labelTelefono2 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        pswdConstrasenia = new javax.swing.JPasswordField();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 500));

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        R.setBackground(new java.awt.Color(255, 255, 255));
        R.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setBackground(new java.awt.Color(255, 223, 148));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 223, 148));
        jLabel2.setText("Actualizar Cliente");

        labelUsuarioRegistro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUsuarioRegistro.setText("Nombre:");

        labelEmailRegistro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEmailRegistro.setText("Calle:");

        labelContraseñaRegistro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelContraseñaRegistro.setText("Fecha nacimiento:");

        botonRegistrarCliente.setBackground(new java.awt.Color(255, 223, 148));
        botonRegistrarCliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        botonRegistrarCliente.setForeground(new java.awt.Color(100, 100, 100));
        botonRegistrarCliente.setText("Actualizar");
        botonRegistrarCliente.setBorder(null);
        botonRegistrarCliente.setBorderPainted(false);
        botonRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarClienteActionPerformed(evt);
            }
        });

        txtNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(100, 100, 100));
        txtNombreUsuario.setBorder(null);

        txtColonia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtColonia.setForeground(new java.awt.Color(100, 100, 100));
        txtColonia.setBorder(null);

        labelTelefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTelefono.setText("Codigo Postal:");

        txtCodigoPostal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodigoPostal.setForeground(new java.awt.Color(100, 100, 100));
        txtCodigoPostal.setBorder(null);

        labelUsuarioRegistro1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUsuarioRegistro1.setText("Apellido Paterno:");

        txtApellidoPaterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApellidoPaterno.setForeground(new java.awt.Color(100, 100, 100));
        txtApellidoPaterno.setBorder(null);

        labelUsuarioRegistro2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelUsuarioRegistro2.setText("Apellido Materno:");

        txtApellidoMaterno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApellidoMaterno.setForeground(new java.awt.Color(100, 100, 100));
        txtApellidoMaterno.setBorder(null);

        labelEmailRegistro1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEmailRegistro1.setText("Numero:");

        labelEmailRegistro2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEmailRegistro2.setText("Colonia:");

        txtCalle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCalle.setForeground(new java.awt.Color(100, 100, 100));
        txtCalle.setBorder(null);

        txtNumeroCasa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNumeroCasa.setForeground(new java.awt.Color(100, 100, 100));
        txtNumeroCasa.setBorder(null);

        jDateFechaNacimiento.setDateFormatString("yyyy-MM-dd");

        labelTelefono1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTelefono1.setText("Correo:");

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(100, 100, 100));
        txtCorreo.setBorder(null);

        labelTelefono2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTelefono2.setText("Contraseña:");

        pswdConstrasenia.setBorder(null);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RLayout.createSequentialGroup()
                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(RLayout.createSequentialGroup()
                                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidoPaterno)
                                    .addComponent(jSeparator3)))
                            .addGroup(RLayout.createSequentialGroup()
                                .addComponent(labelUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(labelUsuarioRegistro1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(RLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RLayout.createSequentialGroup()
                                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RLayout.createSequentialGroup()
                                        .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(RLayout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(labelUsuarioRegistro2))
                                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(60, 60, 60))
                                    .addGroup(RLayout.createSequentialGroup()
                                        .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelEmailRegistro)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(RLayout.createSequentialGroup()
                                                .addComponent(labelEmailRegistro1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtNumeroCasa)
                                            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelEmailRegistro2)
                                    .addComponent(txtColonia, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(jSeparator8)))
                            .addGroup(RLayout.createSequentialGroup()
                                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelTelefono1)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(jSeparator9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RLayout.createSequentialGroup()
                                        .addComponent(labelTelefono2)
                                        .addGap(59, 59, 59))
                                    .addComponent(pswdConstrasenia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(RLayout.createSequentialGroup()
                                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTelefono)
                                    .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCodigoPostal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(56, 56, 56)
                                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelContraseñaRegistro)
                                    .addComponent(jDateFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 44, Short.MAX_VALUE)))))
                .addGap(32, 32, 32))
            .addGroup(RLayout.createSequentialGroup()
                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(botonRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(RLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        RLayout.setVerticalGroup(
            RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RLayout.createSequentialGroup()
                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addGroup(RLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuarioRegistro)
                    .addComponent(labelUsuarioRegistro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelUsuarioRegistro2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEmailRegistro1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelEmailRegistro)
                        .addComponent(labelEmailRegistro2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtColonia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RLayout.createSequentialGroup()
                        .addComponent(labelTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTelefono1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RLayout.createSequentialGroup()
                        .addComponent(labelContraseñaRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTelefono2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pswdConstrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(botonRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );

        bg.add(R, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 530));

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

    private void botonRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarClienteActionPerformed
        ActualizarCliente();
    }//GEN-LAST:event_botonRegistrarClienteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        MenuClienteForm menuCliente = new MenuClienteForm(clientesDAO, cliente);
        menuCliente.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void ActualizarCliente(){
        String nombre_pila = txtNombreUsuario.getText();
        String apellido_paterno = txtApellidoPaterno.getText();
        String apellido_materno = txtApellidoMaterno.getText();
        
        java.util.Date fechaSeleccionada;
        java.sql.Date fechaNacimiento = null;
        
        String calle = txtCalle.getText();
        String numero = txtNumeroCasa.getText();
        String colonia = txtColonia.getText();
        String codigo_postal = txtCodigoPostal.getText();
        String correo = txtCorreo.getText();
        String contrasenia = new String(pswdConstrasenia.getPassword());
        
        ClienteNuevoDTO clienteNuevo = new ClienteNuevoDTO();
        clienteNuevo.setNombre_pila(nombre_pila);
        clienteNuevo.setApellido_paterno(apellido_paterno);
        clienteNuevo.setApellido_materno(apellido_materno);
        clienteNuevo.setCalle(calle);
        clienteNuevo.setNumero(numero);
        clienteNuevo.setColonia(colonia);
        clienteNuevo.setCodigo_postal(codigo_postal);
        clienteNuevo.setCorreo(correo);
        clienteNuevo.setContrasenia(contrasenia);
        try {
            if (jDateFechaNacimiento.getDate() == null) throw new ValidacionDTOException("La fecha no debe estar vacía");
            else{
                fechaSeleccionada = jDateFechaNacimiento.getDate();
                fechaNacimiento = new java.sql.Date(fechaSeleccionada.getTime());
                clienteNuevo.setFecha_nacimiento(fechaNacimiento);
            }
            this.clientesDAO.registrarCliente(clienteNuevo);
            JOptionPane.showMessageDialog(this, "Se actualizo el cliente", "Notificaión", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (ValidacionDTOException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error de validación", JOptionPane.ERROR_MESSAGE);
        } catch (PersistenciaException e) {
            JOptionPane.showMessageDialog(this, "No fue posible actualizar el cliente", "Error de almacenamiento", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel R;
    private javax.swing.JPanel bg;
    private javax.swing.JButton botonRegistrarCliente;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JDateChooser jDateFechaNacimiento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelContraseñaRegistro;
    private javax.swing.JLabel labelEmailRegistro;
    private javax.swing.JLabel labelEmailRegistro1;
    private javax.swing.JLabel labelEmailRegistro2;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTelefono1;
    private javax.swing.JLabel labelTelefono2;
    private javax.swing.JLabel labelUsuarioRegistro;
    private javax.swing.JLabel labelUsuarioRegistro1;
    private javax.swing.JLabel labelUsuarioRegistro2;
    private javax.swing.JPasswordField pswdConstrasenia;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtNumeroCasa;
    // End of variables declaration//GEN-END:variables
}
