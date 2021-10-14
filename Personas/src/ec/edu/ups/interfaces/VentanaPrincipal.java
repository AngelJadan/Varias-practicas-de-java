/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfaces;


import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.modelo.Persona;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Angel Jadan
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    /**
     * Creates new form VentanaPrincipal
     */
    
    private ControladorPersona controlador;
    
    public VentanaPrincipal() {
        
       controlador=new ControladorPersona();
        
       initComponents();
        setLocationRelativeTo(null);
       
        try {
            setIconImage(new ImageIcon(getClass().getResource("../ec.edu.ups.imagenes.IconPrograma.png")));
        } catch (Exception e) {
            
        }
        
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * regenerated by the Form Editor.     * WARNING: Do NOT modify this code. The content of this method is always

     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        ItemMenu = new javax.swing.JMenu();
        menuCrear = new javax.swing.JMenuItem();
        menuBuscar = new javax.swing.JMenuItem();
        menuActualizar = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenuItem();
        menuListar = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/IconPrograma.png")).getImage());

        desktopPane.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, desktopPane, org.jdesktop.beansbinding.ELProperty.create("${background}"), menuBar, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        ItemMenu.setMnemonic('f');
        ItemMenu.setText("Persona");
        ItemMenu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ItemMenuItemStateChanged(evt);
            }
        });
        ItemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuActionPerformed(evt);
            }
        });

        menuCrear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuCrear.setMnemonic('o');
        menuCrear.setText("Crear");
        menuCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCrearActionPerformed(evt);
            }
        });
        ItemMenu.add(menuCrear);

        menuBuscar.setMnemonic('s');
        menuBuscar.setText("Buscar");
        menuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarActionPerformed(evt);
            }
        });
        ItemMenu.add(menuBuscar);

        menuActualizar.setMnemonic('a');
        menuActualizar.setText("Actualizar");
        ItemMenu.add(menuActualizar);

        menuEliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuEliminar.setMnemonic('x');
        menuEliminar.setText("Eliminar");
        ItemMenu.add(menuEliminar);

        menuListar.setText("Listar");
        ItemMenu.add(menuListar);

        menuBar.add(ItemMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");
        editMenu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                editMenuItemStateChanged(evt);
            }
        });

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cortar");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copiar");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Pegar");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Eliminar");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ayuda");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCrearActionPerformed
        // TODO add your handling code here:     
        Crear crear= new Crear(controlador);
        crear.setVisible(true);
        desktopPane.add(crear);
    }//GEN-LAST:event_menuCrearActionPerformed

    private void ItemMenuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ItemMenuItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemMenuItemStateChanged

    private void ItemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuActionPerformed
        // TODO add your handling code here:
        
        Crear venCrear=new Crear(controlador);
        venCrear.setVisible(true);
        desktopPane.add(venCrear);
        
    }//GEN-LAST:event_ItemMenuActionPerformed

    private void editMenuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_editMenuItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_editMenuItemStateChanged

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMenuItemActionPerformed

    private void menuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ItemMenu;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem menuActualizar;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuBuscar;
    private javax.swing.JMenuItem menuCrear;
    private javax.swing.JMenuItem menuEliminar;
    private javax.swing.JMenuItem menuListar;
    private javax.swing.JMenuItem pasteMenuItem;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void setIconImage(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}