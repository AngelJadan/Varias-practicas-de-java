/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Error2;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class Crear extends javax.swing.JInternalFrame {

    private ControladorPersona controlador;

    public Crear(ControladorPersona controlador) {
        this.controlador = controlador;
        initComponents();
        for (int i = 0; i <= controlador.getLista().size(); i++) {
            txtCodigo.setText(String.valueOf(i + 1));
        }

        for (int i = 1; i <= 100; i++) {
            cbxEdad.addItem(String.valueOf(i));
        }
    }

    /**
     * Creates new form VentanaCrear
     */
    public Crear() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jTextField7 = new javax.swing.JTextField();
        sexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnAdjuntar = new javax.swing.JButton();
        jrbFemenino = new javax.swing.JRadioButton();
        cbxEdad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jrbMasculino = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTextField7.setText("jTextField7");

        setBackground(new java.awt.Color(204, 204, 204));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellido");

        txtCodigo.setEditable(false);
        txtCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel6.setText("Edad");

        jLabel7.setText("Genero");

        jLabel8.setText("Telefono");

        jLabel9.setText("Direccion");

        lblImagen.setBackground(new java.awt.Color(153, 255, 153));
        lblImagen.setAlignmentX(0.1F);
        lblImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAdjuntar.setText("Adjuntar...");
        btnAdjuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjuntarActionPerformed(evt);
            }
        });

        sexo.add(jrbFemenino);
        jrbFemenino.setText("Femenino");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cbxEdad, org.jdesktop.beansbinding.ObjectProperty.create(), cbxEdad, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        cbxEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEdadActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Registro de Trabajador");

        sexo.add(jrbMasculino);
        jrbMasculino.setText("Masculino");

        jLabel2.setText("Codigo");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel3.setText("Cedula");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btnGuardar)
                .addGap(73, 73, 73)
                .addComponent(btnCancelar)
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(32, 32, 32)
                            .addComponent(jrbMasculino)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jrbFemenino))
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(jLabel1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAdjuntar)
                                    .addGap(27, 27, 27))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(190, 190, 190)
                                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(496, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(9, 9, 9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdjuntar))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cbxEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(7, 7, 7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jrbFemenino)
                                .addComponent(jrbMasculino))))
                    .addContainerGap(57, Short.MAX_VALUE)))
        );

        lblImagen.getAccessibleContext().setAccessibleParent(lblImagen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
        Persona persona = new Persona ();
        persona.setCodigo(Integer.parseInt(txtCodigo.getText()));//CODIGO DE LA PERSONA
        
        persona.setCedula(txtCedula.getText());
                
        if (txtNombre.getText().length()==0) {
            
            throw new Error2("No ha ingresado un nombre");
            
        }
        try {
            persona.setNombre(txtNombre.getText()); 
        } catch (Error2 e) {
            
            JOptionPane.showMessageDialog(this,"NO HA INGRESADO UN NOMBRE ");
            
        }
               
                               
        persona.setApellido(txtApellido.getText());
        
        String edad = (String) cbxEdad.getSelectedItem();
        persona.setEdad(Integer.parseInt(edad));
        
        persona.setTelefono(txtTelefono.getText());
        persona.setDireccion(txtDireccion.getText());
        persona.setUrlImagen((ImageIcon)lblImagen.getIcon());
        
        
        if (jrbMasculino.isSelected()) {
            persona.setGenero(jrbMasculino.getText());
        } else {
            persona.setGenero(jrbFemenino.getText());
        }
        controlador.crear(persona);
        JOptionPane.showMessageDialog(this,"PERSONA CREADA ");
       
        txtCodigo.getText();
        txtCedula.setText("");
        txtNombre.setText("");
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEdadActionPerformed

    private void btnAdjuntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjuntarActionPerformed
        // TODO add your handling code here:
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        
        File file = chooser.getSelectedFile();
        String nombre = file.getName();
        File ruta = new File("/..ec.edu.ups.imagenes");
        
        ImageIcon imagen = new ImageIcon("imagenes/" + nombre);
        chooser.setCurrentDirectory(ruta);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblImagen.getWidth(),lblImagen.getHeight(),Image.SCALE_DEFAULT ) );
        lblImagen.setIcon(icono);
        lblImagen.setVisible(true);
        
        
    }//GEN-LAST:event_btnAdjuntarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdjuntar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxEdad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JRadioButton jrbFemenino;
    private javax.swing.JRadioButton jrbMasculino;
    private javax.swing.JLabel lblImagen;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
