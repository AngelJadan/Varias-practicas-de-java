/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Errores;
import ec.edu.ups.modelo.Producto;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ggual
 */
public class VentanaMantenimientoProductos extends javax.swing.JInternalFrame {
    private ControladorProducto controladorProducto;

    public VentanaMantenimientoProductos(ControladorProducto controladorProducto) {
        this.controladorProducto = controladorProducto;
        initComponents();
        cargarImagen();
    }
    
    

    /**
     * Creates new form VistaMantenimientoProductos
     */
    public VentanaMantenimientoProductos() {
        initComponents();    
    }
    
    public void cargarImagen (){
        ImageIcon imagen = new ImageIcon((getClass().getResource("/images/logo.jpg")));//LA RUTA LA HACEMOS UN ICONO
        Icon icono = new ImageIcon(imagen.getImage());
        lblImage.setIcon(icono);
    }
    
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtCodigo1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUnidades = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txfDescripcion = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("MANTENIMIENTO DE PRODUCTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(620, 620, 620)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(205, 205, 205)
                    .addComponent(jLabel13)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(41, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setForeground(new java.awt.Color(0, 204, 204));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Codigo:");

        txtCodigo.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Unidades en Stock:");

        txtUnidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidadesKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Descripción:");

        jScrollPane3.setViewportView(txfDescripcion);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Precio Unitario:");

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Ubicación:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Tipo de Producto:");

        txtTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoKeyTyped(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BotonCrearNuevo.gif"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Nuevo");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Eliminar");

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Crear.png"))); // NOI18N
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Crear");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Actualizar");

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actualizar.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Buscar:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btnBuscar))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel14))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(264, 264, 264)
                                        .addComponent(jLabel6)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                    .addComponent(txtUbicacion)
                                    .addComponent(txtPrecio))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11))
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)))
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel9)))))
                .addGap(41, 41, 41))
        );

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "UNIDADES E STOCK", "PRECIO UNITARIO", "UBICACION", "TIPO DE PRODUCTO", "DESCRIPCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblLista);
        if (tblLista.getColumnModel().getColumnCount() > 0) {
            tblLista.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("PRODUCTOS DISPONIBLES EN LA FERRETERIA ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(182, 182, 182))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        Producto producto = new Producto();
        producto.setCodigo(Integer.parseInt(txtCodigo.getText()));
        
        producto.setUnidadesStock(Integer.parseInt(txtUnidades.getText()));//UNIDADES EN STOCK
        producto.setPrecioUnitario(Double.parseDouble(txtPrecio.getText()));//PRECIO UNITARIO DE CADA PRODUCTO
        producto.setNombre(txtNombre.getText());//NOMBRE
        producto.setUbicacion(txtUbicacion.getText());
        producto.setTipoProducto(txtTipo.getText());
        producto.setDescripcion(txfDescripcion.getText());
        
        int opcion = JOptionPane.showConfirmDialog(this, "DESEA CREAR EL PRODUCTO ");
        
        if (opcion == 0) {
            controladorProducto.crear(producto.getCodigo(), producto);
            //JOptionPane.showMessageDialog(this, "PRODCUTO CREADO ");
            actualizarInformacion();// METODO PARA ACTUALIZAR LA INFORMACION
            
        }
        else if (opcion == 1) {
            // JOptionPane.showMessageDialog(this, " OPERACION CANCELADA ");
        }
       
        
        
        
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
         for (int i = 0; i <= controladorProducto.getListaProductos().size()+1; i++) {
            txtCodigo.setText(String.valueOf(i));
            
        }
        btnCrear.setEnabled(true); 
        btnEliminar.setEnabled(false);
        btnActualizar.setEnabled(false);    
        
        txtNombre.setText("");
        txtUnidades.setText("");
        txfDescripcion.setText("");
        txtPrecio.setText("");
        txtUbicacion.setText("");
        txtTipo.setText("");
        
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
         int opcion = JOptionPane.showConfirmDialog(this, "DESEA ELIMINAR EL PRODUCTO ");
    if (opcion == 0){
         boolean resultado = controladorProducto.eliminar(Integer.parseInt(txtCodigo.getText()));
          if (resultado == true ) {
            //JOptionPane.showMessageDialog(this, "PRODUCTO ELIMINADO ");
            txtCodigo.setText("");
            txtNombre.setText("");
            txtUnidades.setText("");
            txfDescripcion.setText("");
            txtPrecio.setText("");
            txtUbicacion.setText("");
            txtTipo.setText("");
            
            actualizarInformacion();// METODO PARA ACTUALIZAR LA INFORMACION 
            
            }
           
            else if (resultado == false) {
                
                
            } 
    }      
          
            
            
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
           
           Producto producto = controladorProducto.buscar(Integer.parseInt(txtCodigo1.getText()));
           //Producto producto = controladorProducto.buscar(Integer.parseInt("1"));
           txtCodigo.setText("");
           
        if (producto != null) {
            txtCodigo.setText(String.valueOf(producto.getCodigo()));
            txtNombre.setText(producto.getNombre());
            txtUnidades.setText(String.valueOf(producto.getUnidadesStock()));
            txfDescripcion.setText(producto.getDescripcion());
            txtPrecio.setText(String.valueOf(producto.getPrecioUnitario()));
            txtUbicacion.setText(producto.getUbicacion());
            txtTipo.setText(producto.getTipoProducto());
            btnCrear.setEnabled(false);
            btnEliminar.setEnabled(true);
            btnActualizar.setEnabled(true);

        }
        else{
           JOptionPane.showMessageDialog(this, "PRODCUTO INEXISTENTE EN LA FERRETERIA ");
        }
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        
        Producto producto = controladorProducto.buscar(Integer.parseInt(txtCodigo.getText()));
        
        producto.setCodigo(Integer.parseInt(txtCodigo.getText()));
        producto.setNombre(txtNombre.getText());//NOMBRE
        producto.setUnidadesStock(Integer.parseInt(txtUnidades.getText()));//UNIDADES EN STOCK
        producto.setPrecioUnitario(Double.parseDouble(txtPrecio.getText()));//PRECIO UNITARIO DE CADA PRODUCTO
        producto.setUbicacion(txtUbicacion.getText());
        producto.setTipoProducto(txtTipo.getText());
        producto.setDescripcion(txfDescripcion.getText());
        
        int opcion = JOptionPane.showConfirmDialog(this, "DESEA MODIFICAR EL PRODUCTO ");
        
        if (opcion == 0) {
            controladorProducto.actualizar(producto.getCodigo(),producto);
            //JOptionPane.showMessageDialog(this, "PRODCUTO CREADO ");
            
            
             actualizarInformacion();// METODO PARA ACTUALIZAR LA INFORMACION
        }
        else if (opcion == 1) {
             //JOptionPane.showMessageDialog(this, " OPERACION CANCELADA ");
        }
        
    
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoKeyTyped
        // TODO add your handling code here:
        
         char valido = evt.getKeyChar();//Obtenemos la letra por letra al momento de presionar 
        try {
        if (!Character.isLetter(valido) && valido != KeyEvent.VK_SPACE  && valido != KeyEvent.VK_BACK_SPACE) {//Si el char que ingresa es diferente de una letra , la consumimos es dc=ecir no deja 
            
            evt.consume();
            throw  new Errores(" ESTE CAMPO SOLO ADMITE LETRAS ");
        }
        }
        catch (Errores e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_txtTipoKeyTyped

    private void txtUnidadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadesKeyTyped
        // TODO add your handling code here:
        
        int valido = evt.getKeyChar(); 
        try {
        if ((Character.isLetter(valido)) )  {
            evt.consume();
            throw  new Errores(" ESTE CAMPO SOLO ADMITE NUMEROS ");
        }
        } catch (Errores e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_txtUnidadesKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
         int valido = evt.getKeyChar(); 
        try {
        if ((Character.isLetter(valido)) )  {
            evt.consume();
            throw  new Errores(" ESTE CAMPO SOLO ADMITE NUMEROS ");
        }
        } catch (Errores e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_txtPrecioKeyTyped
   
    public void actualizarInformacion (){
        DefaultTableModel modelo = (DefaultTableModel) tblLista.getModel();//ASIGNAMOS EL MODELO QUE TIENE NUESTRO JTABLE
       
            Object[] pro = new Object[9];
        
            //METODO PARA LIMPIAR   LA TABLA
            int filas = modelo.getRowCount();//DECUELVE LA CANTIDAD  DE FILAS QUE HAY EN LA TABLA, SE DECLARA
            for (int i = filas - 1; i >= 0; i--) {
            modelo.removeRow(i);
            }
        
            Iterator<Integer> it = controladorProducto.getListaProductos().keySet().iterator();
            while (it.hasNext()) {
            int key = it.next();
            Producto product  = controladorProducto.getListaProductos().get(key);
            pro[0] = product.getCodigo();
            pro[1] = product.getNombre();
            pro[2] = product.getUnidadesStock(); 
            pro[3] =product.getPrecioUnitario();
            pro[4] = product.getUbicacion(); 
            pro[5] = product.getTipoProducto();
            pro[6] = product.getDescripcion();
            modelo.addRow(pro);//AGREGAMOS LA FILA A LA LISTA
  
    }
           tblLista.setModel(modelo);
        }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextPane txfDescripcion;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtUbicacion;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables
}
