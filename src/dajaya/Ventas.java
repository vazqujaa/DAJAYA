
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
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Principal;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

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
        MostrarTablaVentas();
        mostrarTablaClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jColorChooser1 = new javax.swing.JColorChooser();
        jOptionPane1 = new javax.swing.JOptionPane();
        jTabbed = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblNombreCte = new javax.swing.JLabel();
        txtNombreCte = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidoCte = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelCte = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cmbAsiento = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtIdCte = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtMostrarUsCtes = new javax.swing.JTextField();
        btnAgregarCte = new javax.swing.JButton();
        lblDestino = new javax.swing.JLabel();
        cmbDestino = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        btnBorrarCliente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        cmbBoleto = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        lblAbono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMostrarUsuario = new javax.swing.JTextField();
        lblMostrarUsuario = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaCompraBoletos = new javax.swing.JTable();
        txtAbono = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtIdVenta = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        lblIdCliente = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        btnSalirHistorial = new javax.swing.JButton();
        btnGenerarReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Viajes Dajaya");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTabbed.setBackground(new java.awt.Color(186, 230, 201));

        jPanel3.setBackground(new java.awt.Color(216, 251, 216));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ImagenClientes.png"))); // NOI18N
        jLabel4.setToolTipText("Clientes Dajaya");

        lblNombreCte.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lblNombreCte.setText("Nombre:");

        txtNombreCte.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtNombreCte.setToolTipText("Agregar nombre cliente");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel5.setText("Apellido:");

        txtApellidoCte.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtApellidoCte.setToolTipText("Agregar apellido cliente");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel8.setText("Teléfono:");

        txtTelCte.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtTelCte.setToolTipText("agregar telefono emergencia");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel10.setText("Asiento:");

        cmbAsiento.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        cmbAsiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1A", "2A", "3A", "4A", "1B", "2B", "3B", "4B", "1C", "2C", "3C", "4C", "1D", "2D", "3D", "4D", "1E", "2E", "3E", "4E", "1F", "2F", "3F", "4F", "1G", "2G", "3G", "4G" }));
        cmbAsiento.setToolTipText("Elegir asiento");

        TablaClientes.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaClientes.setToolTipText("Clientes");
        TablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaClientes);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel11.setText("Id cliente");

        txtIdCte.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtIdCte.setToolTipText("Id de cliente");
        txtIdCte.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Usuario:");

        txtMostrarUsCtes.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtMostrarUsCtes.setToolTipText("Usuario registrado");
        txtMostrarUsCtes.setEnabled(false);
        txtMostrarUsCtes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMostrarUsCtesActionPerformed(evt);
            }
        });

        btnAgregarCte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BotonClientes.png"))); // NOI18N
        btnAgregarCte.setToolTipText("Clic para agregar cliente");
        btnAgregarCte.setContentAreaFilled(false);
        btnAgregarCte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCteActionPerformed(evt);
            }
        });

        lblDestino.setText("Destino");

        cmbDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1-Delicias", "2-Cuauhtemoc", "3-Chihuahua", "4-Creel" }));
        cmbDestino.setToolTipText("Elegir destino");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnRegresardeCtes.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnBorrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonBorrar.png"))); // NOI18N
        btnBorrarCliente.setToolTipText("Clic para eliminar cliente");
        btnBorrarCliente.setContentAreaFilled(false);
        btnBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMostrarUsCtes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(14, 14, 14)
                                        .addComponent(cmbAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIdCte, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblNombreCte)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNombreCte, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelCte, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(lblDestino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtApellidoCte, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnAgregarCte, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addContainerGap())
            .addComponent(jSeparator1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMostrarUsCtes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreCte)
                            .addComponent(txtNombreCte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtApellidoCte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTelCte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDestino)
                            .addComponent(cmbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnAgregarCte, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtIdCte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cmbAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63))
        );

        jTabbed.addTab("Clientes", jPanel3);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setToolTipText("");

        cmbBoleto.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cmbBoleto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleto", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28" }));
        cmbBoleto.setToolTipText("Elegir Id de boleto");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonComprar.png"))); // NOI18N
        btnAgregar.setToolTipText("Clic para comprar boleto");
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblAbono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblAbono.setForeground(new java.awt.Color(51, 51, 51));
        lblAbono.setText("Abono:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Imagen Ventas.png"))); // NOI18N
        jLabel1.setToolTipText("Viajes Dajaya");

        txtMostrarUsuario.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        txtMostrarUsuario.setToolTipText("Usuario registrado");
        txtMostrarUsuario.setEnabled(false);

        lblMostrarUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblMostrarUsuario.setForeground(new java.awt.Color(153, 153, 153));
        lblMostrarUsuario.setText("Usuario:");

        TablaCompraBoletos.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        TablaCompraBoletos.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaCompraBoletos.setToolTipText("Tabla Viajes");
        TablaCompraBoletos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCompraBoletosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaCompraBoletos);

        txtAbono.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtAbono.setToolTipText("Agregue abono de cliente");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel13.setText("Id Venta:");

        txtIdVenta.setToolTipText("Id Venta");
        txtIdVenta.setEnabled(false);

        lblPrecio.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lblPrecio.setText("Precio:");

        jTextField3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jTextField3.setText("450");
        jTextField3.setToolTipText("precio destino: Delicias");
        jTextField3.setEnabled(false);

        lblIdCliente.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        lblIdCliente.setText("Id Cliente:");

        txtIdCliente.setToolTipText("Agregue id de cliente");

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BotonActualizar.png"))); // NOI18N
        btnActualizar.setToolTipText("Clic para actualizar abono");
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnRegresardeVenta.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lblMostrarUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMostrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(160, 160, 160)
                                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblAbono)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtAbono, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(25, 25, 25)
                                                .addComponent(lblPrecio)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblIdCliente)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(cmbBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addComponent(jLabel1)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMostrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMostrarUsuario)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAbono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAbono))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrecio)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdCliente)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jTabbed.addTab("Punto de venta", jPanel1);

        jPanel2.setBackground(new java.awt.Color(162, 162, 177));

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Imagen Historial.png"))); // NOI18N
        jLabel9.setToolTipText("Historial de Ventas");

        TablaVentas.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaVentasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaVentas);

        btnSalirHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHome.png"))); // NOI18N
        btnSalirHistorial.setToolTipText("Volver a Login");
        btnSalirHistorial.setContentAreaFilled(false);
        btnSalirHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalirHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirHistorialActionPerformed(evt);
            }
        });

        btnGenerarReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton generar reporte.png"))); // NOI18N
        btnGenerarReporte.setToolTipText("Generar Reporte Excel");
        btnGenerarReporte.setContentAreaFilled(false);
        btnGenerarReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel9)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnSalirHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalirHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbed.addTab("Historial", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 581, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarTablaVentas() {
        ConexionBD mysql;
        mysql = new ConexionBD();
        Connection conn = mysql.Conectar();
        Statement myStmt = null;
        ResultSet myRs = null;
        
        DefaultTableModel TablaBoletos = new DefaultTableModel();
        DefaultTableModel TablaMostrarVentas= new DefaultTableModel();
        
        try{
            myStmt = conn.createStatement();
            myRs = myStmt.executeQuery("SELECT * FROM ventaboletos");
            TablaBoletos.setColumnIdentifiers(new Object[]{"Id_Venta","Id_Boleto","Id_Cliente","Abono","Fecha_Venta"});
            while (myRs.next()) {
                
                Object[] fila = new Object[5];
                fila[0] = myRs.getString("Id_Venta");
                fila[1] = myRs.getString("Id_Boleto");
                fila[2] = myRs.getString("Id_Cliente");
                fila[3] = myRs.getString("Abono");
                fila[4] = myRs.getString("Fecha_Venta");
                TablaBoletos.addRow(fila);        
            }
            TablaCompraBoletos.setModel(TablaBoletos);
            TablaVentas.setModel(TablaBoletos);
            
        }catch(SQLException ex) {
                System.out.println(ex);
                JOptionPane.showMessageDialog(null, "Error");
            }
    }
    public void mostrarTablaClientes(){
        ConexionBD mysql;
        mysql = new ConexionBD();
        Connection conn = mysql.Conectar();
        Statement myStmt = null;
        ResultSet myRs = null;
        
        DefaultTableModel TablaClientesM = new DefaultTableModel();
        
        try{
            myStmt = conn.createStatement();
            myRs = myStmt.executeQuery("SELECT * FROM clientes");
            TablaClientesM.setColumnIdentifiers(new Object[]{"Id_Cliente","Nombre","Apellido","Destino","Telefono","Id_Asiento"});
            while (myRs.next()) {
                
                Object[] fila = new Object[6];
                fila[0] = myRs.getString("Id_Cliente");
                fila[1] = myRs.getString("Nombre");
                fila[2] = myRs.getString("Apellido");
                fila[3] = myRs.getString("Destino");
                fila[4] = myRs.getString("Telefono");
                fila[5] = myRs.getString("Id_Asiento");
                TablaClientesM.addRow(fila);        
            }
            TablaClientes.setModel(TablaClientesM);
            
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
                jTabbed.setEnabledAt(2, false);
                btnBorrarCliente.setEnabled(false);
            }
        }catch(SQLException ex) {
            System.out.println(ex);
        }
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ConexionBD mysql;
        mysql = new ConexionBD();
        Connection conn = mysql.Conectar();
        
        String IdVenta=this.txtIdVenta.getText();
        String Boleto = this.cmbBoleto.getSelectedItem().toString();
        String IdCliente=this.txtIdCliente.getText();
        String Abono = this.txtAbono.getText();
        
        
        try{
            PreparedStatement ps = null;
            String insert = "INSERT INTO ventaboletos (Id_Boleto,Id_Cliente,Abono) VALUES (?,?,?)";
            ps = conn.prepareStatement(insert);
            
            ps.setString(1, Boleto);
            ps.setString(2, IdCliente);
            ps.setString(3, Abono);
            ps.executeUpdate();
            
            MostrarTablaVentas();
            JOptionPane.showMessageDialog(null, "Boleto vendido exitosamente");
            txtIdVenta.setText("");
            cmbBoleto.setSelectedItem("Boleto");
            txtIdCliente.setText("");
            txtAbono.setText("");
            
           
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        obtenerUsuario();
    }//GEN-LAST:event_formWindowActivated

    private void btnAgregarCteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCteActionPerformed
        ConexionBD mysql;
        mysql = new ConexionBD();
        Connection conn = mysql.Conectar();
        
        String NombreCte=this.txtNombreCte.getText();
        String ApellidoCte = this.txtApellidoCte.getText();
        String Destino=this.cmbDestino.getSelectedItem().toString();
        String Tel = this.txtTelCte.getText();
        String Asiento = this.cmbAsiento.getSelectedItem().toString();
        
        try{
            PreparedStatement ps = null;
            String insert = "INSERT INTO clientes (Nombre,Apellido,Destino,Telefono,Id_Asiento) VALUES (?,?,?,?,?)";
            ps = conn.prepareStatement(insert);
            ps.setString(1, NombreCte); 
            ps.setString(2, ApellidoCte);
            ps.setString(3, Destino);
            ps.setString(4, Tel);
            ps.setString(5, Asiento);
            ps.executeUpdate();
            
            mostrarTablaClientes();
            JOptionPane.showMessageDialog(null, "Cliente agregado exitosamente");
            txtNombreCte.setText("");
            txtApellidoCte.setText("");
            cmbDestino.setSelectedItem("1-Delicias");
            txtTelCte.setText("");
            cmbAsiento.setSelectedItem("Seleccionar");
            
           
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_btnAgregarCteActionPerformed
    
    
    private void txtMostrarUsCtesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostrarUsCtesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMostrarUsCtesActionPerformed

    private void TablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaClientesMouseClicked
        DefaultTableModel model = (DefaultTableModel)TablaClientes.getModel();
        int selectedRowIndex = TablaClientes.getSelectedRow();
         txtIdCte.setText(model.getValueAt(selectedRowIndex, 0).toString());
         txtNombreCte.setText(model.getValueAt(selectedRowIndex, 1).toString());
         txtApellidoCte.setText(model.getValueAt(selectedRowIndex, 2).toString());
         txtTelCte.setText(model.getValueAt(selectedRowIndex, 4).toString());
    }//GEN-LAST:event_TablaClientesMouseClicked

    private void TablaCompraBoletosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCompraBoletosMouseClicked
        DefaultTableModel model = (DefaultTableModel)TablaCompraBoletos.getModel();
        int selectedRowIndex = TablaCompraBoletos.getSelectedRow();
         txtIdVenta.setText(model.getValueAt(selectedRowIndex, 0).toString());
         txtIdCliente.setText(model.getValueAt(selectedRowIndex, 2).toString());
         txtAbono.setText(model.getValueAt(selectedRowIndex, 3).toString());
        
        
    }//GEN-LAST:event_TablaCompraBoletosMouseClicked

    private void btnSalirHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirHistorialActionPerformed
        this.dispose();
        Login go=new Login();
        go.setVisible(true);
      
    }//GEN-LAST:event_btnSalirHistorialActionPerformed

    private void TablaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaVentasMouseClicked
        
    }//GEN-LAST:event_TablaVentasMouseClicked

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
       ConexionBD mysql;
        mysql = new ConexionBD();
        Connection conn = mysql.Conectar();
        Statement myStmt = null;
        ResultSet myRs = null;
        Statement submyStmt = null;
        ResultSet submyRs = null;
        
        try{
            int contador = 3;  
            myStmt = conn.createStatement();
            myRs = myStmt.executeQuery("SELECT VentaBoletos.Id_Venta, VentaBoletos.Id_Boleto,VentaBoletos.Id_Cliente, Abono, Fecha_Venta, Clientes.Nombre,Apellido,Clientes.Destino ,Telefono,Clientes.Id_Asiento FROM ventaboletos INNER JOIN clientes WHERE VentaBoletos.Id_Cliente = Clientes.Id_Cliente AND VentaBoletos.Fecha_Venta >= CURRENT_DATE()");
            Workbook libro = new HSSFWorkbook();
            org.apache.poi.ss.usermodel.Sheet hoja =  libro.createSheet("Hoja1");
            String fechaHoy = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
            String file = "Dajaya-reporte_"+fechaHoy+".xls";
            
            
            Row filaTitulo= hoja.createRow(0);
            org.apache.poi.ss.usermodel.Cell celdaTitulo = filaTitulo.createCell(0);
            celdaTitulo.setCellValue("Reporte de ventas del dia: "+ fechaHoy+" generado por: "+usuarioNombre );
            
            Row filaCabecera = hoja.createRow(2);
            org.apache.poi.ss.usermodel.Cell celdaIdVenta = filaCabecera.createCell(0);
            celdaIdVenta.setCellValue("Id Venta");
            org.apache.poi.ss.usermodel.Cell celdaIdBoleto = filaCabecera.createCell(1);
            celdaIdBoleto.setCellValue("Id Boleto");
             org.apache.poi.ss.usermodel.Cell celdaIdCliente= filaCabecera.createCell(2);
            celdaIdCliente.setCellValue("Id Cliente");
             org.apache.poi.ss.usermodel.Cell celdaAbono = filaCabecera.createCell(3);
            celdaAbono.setCellValue("Abono");
             org.apache.poi.ss.usermodel.Cell celdaFechaVenta = filaCabecera.createCell(4);
            celdaFechaVenta.setCellValue("Fecha y hora de venta");
            org.apache.poi.ss.usermodel.Cell celdaNombre = filaCabecera.createCell(5);
            celdaNombre.setCellValue("Nombre Cliente");
            org.apache.poi.ss.usermodel.Cell celdaApellido = filaCabecera.createCell(6);
            celdaApellido.setCellValue("Apellido Cliente");
            org.apache.poi.ss.usermodel.Cell celdaDestino = filaCabecera.createCell(7);
            celdaDestino.setCellValue("Destino");
            org.apache.poi.ss.usermodel.Cell celdaTel = filaCabecera.createCell(8);
            celdaTel.setCellValue("Teléfono");
            org.apache.poi.ss.usermodel.Cell celdaAsiento = filaCabecera.createCell(9);
            celdaAsiento.setCellValue("Asiento");
            
            
            while (myRs.next()) {
                submyStmt = conn.createStatement();
                
                Row fila = hoja.createRow(contador);
                org.apache.poi.ss.usermodel.Cell celda1 = fila.createCell(0);
                celda1.setCellValue(myRs.getString("Id_Venta"));
                
                org.apache.poi.ss.usermodel.Cell celda2 = fila.createCell(1);
                celda2.setCellValue(myRs.getString("Id_Boleto"));
                
                org.apache.poi.ss.usermodel.Cell celda3 = fila.createCell(2);
                celda3.setCellValue(myRs.getString("Id_Cliente"));
                
                org.apache.poi.ss.usermodel.Cell celda4 = fila.createCell(3);
                celda4.setCellValue(myRs.getString("Abono"));
                
                org.apache.poi.ss.usermodel.Cell celda5 = fila.createCell(4);
                celda5.setCellValue(myRs.getString("Fecha_Venta"));
                
                org.apache.poi.ss.usermodel.Cell celda6 = fila.createCell(5);
                celda6.setCellValue(myRs.getString("Nombre"));
                
                org.apache.poi.ss.usermodel.Cell celda7 = fila.createCell(6);
                celda7.setCellValue(myRs.getString("Apellido"));
                
                org.apache.poi.ss.usermodel.Cell celda8 = fila.createCell(7);
                celda8.setCellValue(myRs.getString("Destino"));
                
                org.apache.poi.ss.usermodel.Cell celda9 = fila.createCell(8);
                celda9.setCellValue(myRs.getString("Telefono"));
                
                org.apache.poi.ss.usermodel.Cell celda10 = fila.createCell(9);
                celda10.setCellValue(myRs.getString("Id_Asiento"));
                
                contador++;
            }
            try {
                org.apache.poi.ss.usermodel.Sheet sheet = libro.getSheetAt(0);
                sheet.autoSizeColumn((short)1); 
                sheet.autoSizeColumn((short)2);
                sheet.autoSizeColumn((short)3); 
                sheet.autoSizeColumn((short)4);
               
                FileOutputStream out = new FileOutputStream(file);
                libro.write(out);
                out.close();
                JOptionPane.showMessageDialog(null, "Reporte generado correctamente");
                }catch(IOException ex){
                    System.out.println(ex);
                }
        }catch(SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Login ir= new Login();
        ir.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Login ver=new Login();
        ver.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       ConexionBD mysql;
        mysql = new ConexionBD();
        Connection conn = mysql.Conectar();
        try{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "¿Esta seguro?", "Actualizar abono", dialogButton);
            String ActAbono = txtAbono.getText();
            if(dialogResult == 0) {
                PreparedStatement ActualizarAbono = conn.prepareStatement("UPDATE ventaboletos SET Abono = '"+ActAbono+"' WHERE Id_Venta = "+txtIdVenta.getText()+"");
                ActualizarAbono.executeUpdate();
                MostrarTablaVentas();
                JOptionPane.showMessageDialog(null, "Abono actualizado con éxito");
                txtAbono.setText("");
            } else {
              return;
            } 
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarClienteActionPerformed
        ConexionBD mysql;
        mysql = new ConexionBD();
        Connection conn = mysql.Conectar();
        try{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "¿Esta seguro?", "Eliminar Cliente", dialogButton);
            if(dialogResult == 0) {
                PreparedStatement ActClientes = conn.prepareStatement("DELETE FROM Clientes where Id_Cliente = '"+txtIdCte.getText()+"'");
                ActClientes.executeUpdate();
                mostrarTablaClientes();
                JOptionPane.showMessageDialog(null, "Cliente eliminado con exito");
            } else {
              return;
            } 
            
        }catch(SQLException ex){
            System.out.println(ex);
        }

    }//GEN-LAST:event_btnBorrarClienteActionPerformed


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
    private javax.swing.JTable TablaClientes;
    private javax.swing.JTable TablaCompraBoletos;
    private javax.swing.JTable TablaVentas;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarCte;
    private javax.swing.JButton btnBorrarCliente;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnSalirHistorial;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbAsiento;
    private javax.swing.JComboBox<String> cmbBoleto;
    private javax.swing.JComboBox<String> cmbDestino;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbed;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblAbono;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblIdCliente;
    private javax.swing.JLabel lblMostrarUsuario;
    private javax.swing.JLabel lblNombreCte;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JTextField txtAbono;
    private javax.swing.JTextField txtApellidoCte;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdCte;
    private javax.swing.JTextField txtIdVenta;
    public javax.swing.JTextField txtMostrarUsCtes;
    public javax.swing.JTextField txtMostrarUsuario;
    private javax.swing.JTextField txtNombreCte;
    private javax.swing.JTextField txtTelCte;
    // End of variables declaration//GEN-END:variables

}