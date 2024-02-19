package com.itson.bdavanzadas.banco;

import com.itson.bdavanzadas.bancodominio.Cliente;
import com.itson.bdavanzadas.bancodominio.Cuenta;
import com.itson.bdavanzadas.bancopersistencia.conexion.Conexion;
import com.itson.bdavanzadas.bancopersistencia.conexion.IConexion;
import com.itson.bdavanzadas.bancopersistencia.daos.ClientesDAO;
import com.itson.bdavanzadas.bancopersistencia.daos.CuentasDAO;
import com.itson.bdavanzadas.bancopersistencia.daos.IClientesDAO;
import com.itson.bdavanzadas.bancopersistencia.daos.ICuentasDAO;
import com.itson.bdavanzadas.bancopersistencia.excepciones.PersistenciaException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class MenuClienteForm extends javax.swing.JFrame {

    private final IClientesDAO clientesDAO;
    private final Cliente cliente;
    private final ICuentasDAO cuentasDAO;
    
    public MenuClienteForm(IClientesDAO clientesDAO, Cliente cliente) {
        initComponents();
        this.clientesDAO = clientesDAO;
        this.cliente = cliente;
        String cadenaConexion = "jdbc:mysql://localhost/banco";
        String usuario = "root";
        String password = "123456789";
        IConexion conexion = new Conexion(cadenaConexion, usuario, password);
        this.cuentasDAO = new CuentasDAO(conexion);
        lblBienvenida.setText("Bienvenid@ "+cliente.getNombre_pila());
        mostrarCuentas();
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
        lblBienvenida = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnNuevaCuenta = new javax.swing.JButton();
        btnAjustes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuentas = new javax.swing.JTable();
        txtlogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBienvenida.setBackground(new java.awt.Color(255, 223, 148));
        lblBienvenida.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBienvenida.setText("Bienvenido a tu cuenta!");
        bg.add(lblBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

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
        bg.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 40, 40));

        btnNuevaCuenta.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnNuevaCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agregarCuentaB.png"))); // NOI18N
        btnNuevaCuenta.setText("Agregar Cuenta");
        btnNuevaCuenta.setBorder(null);
        btnNuevaCuenta.setBorderPainted(false);
        btnNuevaCuenta.setContentAreaFilled(false);
        btnNuevaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCuentaActionPerformed(evt);
            }
        });
        bg.add(btnNuevaCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 120, -1));

        btnAjustes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ajustes.png"))); // NOI18N
        btnAjustes.setBorder(null);
        btnAjustes.setBorderPainted(false);
        btnAjustes.setContentAreaFilled(false);
        btnAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjustesActionPerformed(evt);
            }
        });
        bg.add(btnAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 50, -1));

        tblCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblCuentas);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 600, 280));

        txtlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        bg.add(txtlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
        InicioForm inicioSesion = new InicioForm(clientesDAO);
        inicioSesion.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjustesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAjustesActionPerformed

    private void btnNuevaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCuentaActionPerformed
        this.setVisible(false);
        DlgCrearCuenta crearCuenta = new DlgCrearCuenta(this, rootPaneCheckingEnabled, cuentasDAO, cliente);
        crearCuenta.setVisible(true);
        mostrarCuentas();
        this.setVisible(true);
    }//GEN-LAST:event_btnNuevaCuentaActionPerformed

    //public Cuenta cuenta
    
    public void mostrarCuentas(){
        try {
            List<Cuenta> listaCuentas = cuentasDAO.consultarCuentas(cliente);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Numero de Cuenta");
            modelo.addColumn("Saldo");
            modelo.addColumn("Desactivar");
            modelo.addColumn("Transferir");
            modelo.addColumn("Retiro sin cuenta");
            for (Cuenta cuenta : listaCuentas) {
                Object[] fila = {cuenta.getCodigo(),cuenta.getSaldo(), "", "Transferir", "Retiro"};
                modelo.addRow(fila);
            }
            tblCuentas.setModel(modelo);
            TableColumnModel columnModel = tblCuentas.getColumnModel();
            
            ButtonColumn estadoButtonColumn = new ButtonColumn("Desactivar", new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Aqui va la logica del boton de estado");
//                    // Lógica para el botón "Eliminar"
//                    int row = tblSocios.convertRowIndexToModel(tblSocios.getEditingRow());
//                    // Acciones para eliminar el socio en la fila 'row'
//                    // ...
//                    Socio socio;
//                    try {
//                        socio = obtenerSocioDesdeFila(row);
//                        sociosDAO.eliminar(socio.getId());
//                    } catch (PersistenciaException ex) {
//                        Logger.getLogger(SociosForm.class.getName()).log(Level.SEVERE, null, ex);
//                    }
                }
            });
            
            ButtonColumn transferenciaButtonColumn = new ButtonColumn("Transferir", new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int row = tblCuentas.convertRowIndexToModel(tblCuentas.getEditingRow());
                    Cuenta cuenta;
                    try {
                        cuenta = obtenerCuentaDesdeFila(row);
                        TransferenciaForm transferencia = new TransferenciaForm(clientesDAO,cliente,cuentasDAO, cuenta);
                        transferencia.setVisible(true);
                        dispose();
                    } catch (PersistenciaException ex) {
                        Logger.getLogger(MenuClienteForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });

            ButtonColumn retiroButtonColumn = new ButtonColumn("Retiro", new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int row = tblCuentas.convertRowIndexToModel(tblCuentas.getEditingRow());
                    Cuenta cuenta;
                    try {
                        cuenta = obtenerCuentaDesdeFila(row);
                        dispose();
                        RetiroForm retiro = new RetiroForm(clientesDAO, cuenta, cliente, cuentasDAO);
                        retiro.setVisible(true);
                    } catch (PersistenciaException ex) {
                        Logger.getLogger(MenuClienteForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
            
            columnModel.getColumn(2).setCellRenderer(estadoButtonColumn);
            columnModel.getColumn(2).setCellEditor(estadoButtonColumn);

            columnModel.getColumn(3).setCellRenderer(transferenciaButtonColumn);
            columnModel.getColumn(3).setCellEditor(transferenciaButtonColumn);
            
            columnModel.getColumn(4).setCellRenderer(retiroButtonColumn);
            columnModel.getColumn(4).setCellEditor(retiroButtonColumn);

        } catch (PersistenciaException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al mostrar la tabla", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Cuenta obtenerCuentaDesdeFila(int fila) throws PersistenciaException {
        List<Cuenta> listaCuentas = cuentasDAO.consultarCuentas(cliente);
        if (fila >= 0 && fila < listaCuentas.size()) {
            return listaCuentas.get(fila);
        } else {
            return null;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnNuevaCuenta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JTable tblCuentas;
    private javax.swing.JLabel txtlogo;
    // End of variables declaration//GEN-END:variables
}
