/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vista;

import com.controlador.modelo.ControladorTrabajador;
import com.modelo.Empresa;
import com.modelo.Trabajador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angel
 */
public class VistaAsistencia extends javax.swing.JInternalFrame {

    private Empresa empresa;
    public static final String SEPARATOR = ";";
    public static final String QUOTE = "\"";
    ControladorTrabajador ctrabajador=new ControladorTrabajador();

    public VistaAsistencia(Empresa empresa) {
        initComponents();
        this.empresa = empresa;
        lblempresa.setText(empresa.getRazonSocial());
        lTrabajador();
    }
    private void lTrabajador(){
        for (Trabajador trabajador : ctrabajador.listaTrabajador(empresa.getCodigo())) {
            cboxnombre.addItem(trabajador.getNombre()+" "+trabajador.getAplellido());
        }
    }
    private static String[] removeTrailingQuotes(String[] fields) {

        String result[] = new String[fields.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = fields[i].replaceAll("^" + QUOTE, "").replaceAll(QUOTE + "$", "");
        }
        return result;
    }

    public void seleccionarArchivo() {
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        if (archivo != null) {
            String ruta = archivo.getAbsolutePath();
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(ruta));
                String line = br.readLine();
                List<Object> listado = new ArrayList<Object>();
                while (null != line) {
                    String[] fields = line.split(SEPARATOR);
                    //System.out.println(Arrays.toString(fields));

                    fields = removeTrailingQuotes(fields);
                    //System.out.println(Arrays.toString(fields));
                    listado.add(Arrays.toString(fields));
                    line = br.readLine();
                }
                //System.out.println("MES: " + listado.get(1).toString());
                //System.out.println("ANIO: " + listado.get(2).toString());
                String listmes = (listado.get(1).toString()).replaceAll("]", " ");
                String listanio = (listado.get(2).toString()).replaceAll("]", " ");
                String armes[] = listmes.split(",");
                String aranio[] = listanio.split(",");
                String mes = String.valueOf(armes[1]);
                String anio = String.valueOf(aranio[1]);

                String jornada = (((listado.get(3).toString()).replace("[", "")).replace("]", "")).replace(" ", "");
                System.out.println(jornada);
                String arrjor[] = jornada.split(",");
                int ncolumnas = arrjor.length;
                System.out.println(ncolumnas);

                int intmes = mes(mes);
                int intanio = anio(anio);

                jcboxmes.setMonth(intmes);
                jcboxanio.setYear(intanio);
                llenarTablaHoras(listado, ncolumnas);

            } catch (Exception e) {
            } finally {
                if (null != br) {
                    try {
                        br.close();
                    } catch (IOException ex) {
                        Logger.getLogger(VistaAsistencia.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    public int mes(String m) {
        int mesInt = 0;
        switch (m) {
            case " 1 ":
                mesInt = 0;
                break;
            case " 2 ":
                mesInt = 1;
                break;

            case " 3 ":
                mesInt = 2;
                break;

            case " 4 ":
                mesInt = 3;
                break;

            case " 5 ":
                mesInt = 4;
                break;

            case " 6 ":
                mesInt = 5;
                break;

            case " 7 ":
                mesInt = 6;
                break;

            case " 8 ":
                mesInt = 7;
                break;

            case " 9 ":
                mesInt = 8;
                break;
            case " 10 ":
                mesInt = 9;
                break;

            case " 11 ":
                mesInt = 10;
                break;

            case " 12 ":
                mesInt = 11;
                break;
        }
        return mesInt;
    }

    public int anio(String anio) {
        String an = anio.replace(" ", "");
        int intAnio = Integer.parseInt(an);
        return intAnio;
    }
/**
 * 
 * @param horas
 * @param ncolumnas numero de columnas
 */
    public void llenarTablaHoras(List<Object> horas, int ncolumnas) {

        DefaultListModel mlista = new DefaultListModel();
        int tam = (ncolumnas);
        Object[][] dato = new Object[0][0];
        String[] encabezado = new String[tam];
        int j = 0;
        encabezado[0] = "Dia";
        for (int i = 1; i < tam; i++) {
            if (i % 2 == 0) {
                encabezado[i] = "Salida";
            } else {
                encabezado[i] = "Entrada";
            }
        }

        DefaultTableModel modelo = new DefaultTableModel(dato, encabezado);
        tbltabla.setModel(modelo);

        List<Object> listado = new ArrayList<Object>();
        listado = horas;

        Object[] c = new Object[ncolumnas];

        int contador = 4;
        int con = 0;

        String cabezera[] = ((listado.get(3)).toString()).split(",");

        for (int i = 4; i < listado.size(); i++) {
            String fila = (listado.get(i)).toString();
            fila = fila.replace("[", "");
            fila = fila.replace("]", "");

            String arrFila[] = fila.split(",");

            for (int k = 0; k < cabezera.length; k++) {
                if (k < arrFila.length) {
                    c[k] = arrFila[k];
                } else {
                    c[k] = "";
                }
            }
            modelo.addRow(c);
        }
        tbltabla.setModel(modelo);
    }

    public void generarTabla(int n) {

        int tam = (n * 2) + 1;
        Object[][] dato = new Object[0][0];
        String[] encabezado = new String[tam];
        int j = 0;
        encabezado[0] = "Dias";
        for (int i = 1; i < tam; i++) {
            if (i % 2 == 0) {
                encabezado[i] = "Salida";
            } else {
                encabezado[i] = "Entrada";
            }
        }

        DefaultTableModel modelo = new DefaultTableModel(dato, encabezado);
        Object[] colum = new Object[7];
        //colum[0] = "Lunes";
        //modelo.addRow(colum);
        //colum[0] = "Martes";
        //modelo.addRow(colum);
        //colum[0] = "Miercoles";
        //modelo.addRow(colum);
        //colum[0] = "Jueves";
        //modelo.addRow(colum);
        //colum[0] = "Viernes";
        //modelo.addRow(colum);
        //colum[0] = "Sabado";
        //modelo.addRow(colum);
        //colum[0] = "Domingo";
        //modelo.addRow(colum);
        tbltabla.setModel(modelo);

    }

    public void lecturaTabla(){
        for (int i = 0; i < tbltabla.getRowCount(); i++) {
            
        }
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cboxnombre = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        txtn = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcboxanio = new com.toedter.calendar.JYearChooser();
        jcboxmes = new com.toedter.calendar.JMonthChooser();
        jButton7 = new javax.swing.JButton();
        lblempresa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jpasistencia = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbltabla = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de asistencia de trabajadores");

        jLabel2.setText("Identificacion");

        jLabel3.setText("Empleado");

        jLabel4.setText("Jornada");

        jButton1.setText("Buscar");

        jButton2.setText("Guardar");

        jButton3.setText("Eliminar");

        jButton4.setText("Actualizar");

        cboxnombre.setEditable(true);
        cboxnombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Nombre" }));
        cboxnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cboxnombreMouseReleased(evt);
            }
        });

        jButton6.setText("Buscar");

        txtn.setText("3");
        txtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnActionPerformed(evt);
            }
        });

        jButton5.setText("Componer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setText("Numero de jornadas");

        jLabel6.setText("Mes");

        jLabel8.setText("Año");

        jButton7.setText("Cargar Archivo CSV");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        lblempresa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblempresa.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboxnombre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jcboxmes, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcboxanio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton5)
                            .addGap(9, 9, 9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jButton7)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblempresa)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cboxnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcboxmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6))
                    .addComponent(jcboxanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        tbltabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbltabla);

        javax.swing.GroupLayout jpasistenciaLayout = new javax.swing.GroupLayout(jpasistencia);
        jpasistencia.setLayout(jpasistenciaLayout);
        jpasistenciaLayout.setHorizontalGroup(
            jpasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpasistenciaLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 187, Short.MAX_VALUE))
        );
        jpasistenciaLayout.setVerticalGroup(
            jpasistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpasistenciaLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 260, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jpasistencia);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(txtn.getText());
        generarTabla(n);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void cboxnombreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxnombreMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxnombreMouseReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        seleccionarArchivo();
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboxnombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private com.toedter.calendar.JYearChooser jcboxanio;
    private com.toedter.calendar.JMonthChooser jcboxmes;
    private javax.swing.JPanel jpasistencia;
    private javax.swing.JLabel lblempresa;
    private javax.swing.JTable tbltabla;
    private javax.swing.JTextField txtn;
    // End of variables declaration//GEN-END:variables
}
