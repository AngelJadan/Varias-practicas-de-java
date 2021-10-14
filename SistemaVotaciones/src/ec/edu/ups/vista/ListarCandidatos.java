/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Candidato;
import ec.edu.ups.controlador.ControladorCandidato;
import ec.edu.ups.modelo.Provincia;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angel
 */
public class ListarCandidatos extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListarVotantes
     */
    private ControladorCandidato ccandidato;

    public ListarCandidatos(ControladorCandidato ccandidato) {
        this.ccandidato = ccandidato;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblcandidatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("LISTA DE CANDIDATOS");

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btncerrar.setText("Cerrar");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        tblcandidatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cedula", "Nombre", "Apellido", "Edad", "Partido", "Genero", "Cargo", "Provincia", "Canton", "Parroquia", "Recinto", "Foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblcandidatos);
        if (tblcandidatos.getColumnModel().getColumnCount() > 0) {
            tblcandidatos.getColumnModel().getColumn(0).setResizable(false);
            tblcandidatos.getColumnModel().getColumn(1).setResizable(false);
            tblcandidatos.getColumnModel().getColumn(2).setResizable(false);
            tblcandidatos.getColumnModel().getColumn(3).setResizable(false);
            tblcandidatos.getColumnModel().getColumn(4).setResizable(false);
            tblcandidatos.getColumnModel().getColumn(5).setResizable(false);
            tblcandidatos.getColumnModel().getColumn(6).setResizable(false);
            tblcandidatos.getColumnModel().getColumn(7).setResizable(false);
            tblcandidatos.getColumnModel().getColumn(8).setResizable(false);
            tblcandidatos.getColumnModel().getColumn(9).setResizable(false);
            tblcandidatos.getColumnModel().getColumn(10).setResizable(false);
            tblcandidatos.getColumnModel().getColumn(11).setResizable(false);
            tblcandidatos.getColumnModel().getColumn(12).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(348, 348, 348))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(btnactualizar)
                        .addGap(70, 70, 70)
                        .addComponent(btncerrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnactualizar)
                    .addComponent(btncerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:

        DefaultTableModel modelo = (DefaultTableModel) tblcandidatos.getModel();//ASIGNAMOS EL MODELO QUE TIENE NUESTRO JTABLE
        tblcandidatos.setRowHeight(20);

        Object[] cand = new Object[12];

        int filas = modelo.getRowCount();//DECUELVE LA CANTIDAD  DE FILAS QUE HAY EN LA TABLA, SE DECLARA 
        for (int i = filas - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
        for (Candidato candidato : ccandidato.getMapa()) {

            cand[0] = candidato.getCodigo();
            cand[1] = candidato.getCedula();
            cand[2] = candidato.getNombre();
            cand[3] = candidato.getApellido();
            cand[4] = candidato.getEdad();
            cand[5] = candidato.getGenero();
            cand[6] = candidato.getPartido();
            cand[7] = candidato.getCargo();
            cand[8] = candidato.getProvincia();
            cand[9] = candidato.getCanton();
            cand[10] = candidato.getParroquia();
            cand[11]= candidato.getUrlImagen();
            
            modelo.addRow(cand);//AGREGAMOS LA FILA A LA LISTA

        }
        tblcandidatos.setModel(modelo);

    }//GEN-LAST:event_btnactualizarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblcandidatos;
    // End of variables declaration//GEN-END:variables
}
