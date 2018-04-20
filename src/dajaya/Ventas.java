
package dajaya;

import com.sun.javafx.binding.SelectBinding;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import dajaya.Ventas;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.Principal;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emanu
 */
public class Ventas extends javax.swing.JFrame {
String usuarioId="";
    String usuarioNombre="";
    String usuarioNivel="";
    String usuarioUsuario="";
    
    public Ventas() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Img/LogoForm.png")).getImage());
        MostrarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbed = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cmbDestino = new javax.swing.JComboBox<>();
        cmbBoletos = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMostrarUsuario = new javax.swing.JTextField();
        lblMostrarUsuario = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaInsercionViajes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtAbono = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Viajes Dajaya");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTabbed.setBackground(new java.awt.Color(207, 203, 211));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setToolTipText("");

        cmbDestino.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cmbDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Destino", "Villahumada", "Delicias", "Chihuahua" }));

        cmbBoletos.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cmbBoletos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boletos", "1", "2", "3", "4", "5" }));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonAgregar.png"))); // NOI18N
        btnAgregar.setToolTipText("Clic para agregar a tabla");
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Abono");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Total");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Imagen Ventas.png"))); // NOI18N
        jLabel1.setToolTipText("Viajes Dajaya");

        txtMostrarUsuario.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtMostrarUsuario.setEnabled(false);

        lblMostrarUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblMostrarUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblMostrarUsuario.setText("Usuario:");

        TablaInsercionViajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaInsercionViajes.setToolTipText("Tabla Viajes");
        jScrollPane3.setViewportView(TablaInsercionViajes);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("Precio");

        txtTotal.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtTotal.setToolTipText("Agregue total de la compra");

        txtAbono.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtAbono.setToolTipText("Agregue abono a total");

        txtPrecio.setEditable(false);
        txtPrecio.setText("700");
        txtPrecio.setToolTipText("Precio por default");
        txtPrecio.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbBoletos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMostrarUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMostrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAbono, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMostrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMostrarUsuario))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbBoletos)
                            .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAbono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbed.addTab("Punto de Venta", jPanel1);

        jPanel2.setBackground(new java.awt.Color(162, 162, 177));

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Imagen Historial.png"))); // NOI18N
        jLabel9.setToolTipText("Historial de Ventas");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonHome.png"))); // NOI18N
        jButton1.setToolTipText("Volver a Login");
        jButton1.setContentAreaFilled(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton generar reporte.png"))); // NOI18N
        jButton2.setToolTipText("Generar Reporte Excel");
        jButton2.setContentAreaFilled(false);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton ver reporte.png"))); // NOI18N
        jButton3.setToolTipText("Ver reporte en tabla");
        jButton3.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbed.addTab("Historial", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbed)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void MostrarTabla() {
             ConexionBD mysql;
        mysql = new ConexionBD();
        Connection conn = mysql.Conectar();
        Statement myStmt = null;
        ResultSet myRs = null;
        
        DefaultTableModel TablaViajes = new DefaultTableModel();
        
        try{
            myStmt = conn.createStatement();
            myRs = myStmt.executeQuery("SELECT * FROM boletosvendidos");
            TablaViajes.setColumnIdentifiers(new Object[]{"IdBoletosV","NumeroBoletos","Precio","Abono","Total","Destino"});
            while (myRs.next()) {
                
                Object[] fila = new Object[6];
                fila[0] = myRs.getString("IdBoletosV");
                fila[1] = myRs.getString("NumeroBoletos");
                fila[2] = myRs.getString("Precio");
                fila[3] = myRs.getString("Abono");
                fila[4] = myRs.getString("Total");
                fila[5] = myRs.getString("Destino");
                TablaViajes.addRow(fila);        
            }
            TablaInsercionViajes.setModel(TablaViajes);
            
        }catch(SQLException ex) {
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "error");
            }
    }
    
     public void obtenerUsuario(){
        ConexionBD mysql;
        mysql = new ConexionBD();
        Connection conn = mysql.Conectar();
        Statement myStmt = null;
        ResultSet myRs = null;
        String usuario = txtMostrarUsuario.getText();

        try{
            myStmt = conn.createStatement();
            myRs = myStmt.executeQuery("SELECT * FROM usuarios WHERE usuario = '" + usuario +"' LIMIT 1");
            if (myRs.next()) {
                usuarioId = myRs.getString("ID");
                usuarioNombre = myRs.getString("Nombre");
                usuarioUsuario = myRs.getString("Usuario");
                usuarioNivel = myRs.getString("Tipo");
            }
            if(!usuarioNivel.equals("Admin")){
                jTabbed.setEnabledAt(1, false);
            }
        }catch(SQLException ex) {
            System.out.println(ex);
        }
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ConexionBD mysql;
        mysql = new ConexionBD();
        Connection conn = mysql.Conectar();
        
        String Boletos = this.cmbBoletos.getSelectedItem().toString();
        String Abono = this.txtAbono.getText();
        String Total = this.txtAbono.getText();
        String Destino = this.cmbDestino.getSelectedItem().toString();
        
        try{
            PreparedStatement ps = null;
            String insert = "INSERT INTO boletosvendidos (NumeroBoletos,Abono,Total,Destino) VALUES (?,?,?,?)";
            ps = conn.prepareStatement(insert);
            ps.setString(1, Boletos); 
            ps.setString(2, Abono);
            ps.setString(3, Total);
            ps.setString(4, Destino);
            ps.executeUpdate();
            
            MostrarTabla();
            JOptionPane.showMessageDialog(null, "Viaje agregado exitosamente");
            cmbBoletos.setSelectedItem("Boletos");
            txtTotal.setText("");
            txtAbono.setText("");
            cmbDestino.setSelectedItem("Destino");
            
           
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        obtenerUsuario();
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaInsercionViajes;
    private javax.swing.JButton btnAgregar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbBoletos;
    private javax.swing.JComboBox<String> cmbDestino;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbed;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblMostrarUsuario;
    private javax.swing.JTextField txtAbono;
    public javax.swing.JTextField txtMostrarUsuario;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}