/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Movimiento;
import ec.edu.ups.modelo.Jugador;
import ec.edu.ups.modelo.Tiempo;
import java.awt.event.KeyEvent;

/**
 *
 * @author Angel Jadan
 */
public class Vista_Principal extends javax.swing.JFrame {

    /**
     * Declaracion de Variables
     */
    private Movimiento hilo;
    private Tiempo t;
    private int x;
    private int y;

    /**
     * Creates new form Vista_Principal
     */

    public Vista_Principal() {

        initComponents();
        this.lbljugador.setFocusable(true);
        this.t=new Tiempo(this.lbltiempo);
        this.hilo = new Movimiento(this.lbljugador, this.lblenemigo1, this.lblenemigo2, this.lblenemigo3);
        t.start();
        hilo.start();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lbljugador = new javax.swing.JLabel();
        lblenemigo2 = new javax.swing.JLabel();
        lblenemigo3 = new javax.swing.JLabel();
        lblenemigo1 = new javax.swing.JLabel();
        jencabezado = new javax.swing.JPanel();
        lbltiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(246, 247, 248));
        setForeground(new java.awt.Color(253, 243, 243));

        panel.setBackground(new java.awt.Color(254, 254, 254));
        panel.setForeground(new java.awt.Color(235, 238, 246));
        panel.setPreferredSize(new java.awt.Dimension(600, 600));
        panel.setLayout(null);

        lbljugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/recursos/images.jpeg"))); // NOI18N
        lbljugador.setText("jLabel2");
        lbljugador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbljugadorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbljugadorKeyReleased(evt);
            }
        });
        panel.add(lbljugador);
        lbljugador.setBounds(0, 0, 80, 100);

        lblenemigo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/recursos/images1.jpeg"))); // NOI18N
        panel.add(lblenemigo2);
        lblenemigo2.setBounds(470, 190, 68, 83);

        lblenemigo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/recursos/images1.jpeg"))); // NOI18N
        lblenemigo3.setText("\n");
        panel.add(lblenemigo3);
        lblenemigo3.setBounds(509, 395, 72, 83);

        lblenemigo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/recursos/images1.jpeg"))); // NOI18N
        panel.add(lblenemigo1);
        lblenemigo1.setBounds(530, 0, 68, 74);

        jencabezado.setBackground(new java.awt.Color(175, 203, 231));

        lbltiempo.setFont(new java.awt.Font("Noto Sans", 3, 18)); // NOI18N

        javax.swing.GroupLayout jencabezadoLayout = new javax.swing.GroupLayout(jencabezado);
        jencabezado.setLayout(jencabezadoLayout);
        jencabezadoLayout.setHorizontalGroup(
            jencabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jencabezadoLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(lbltiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jencabezadoLayout.setVerticalGroup(
            jencabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jencabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jencabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jencabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbljugadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbljugadorKeyPressed
        Jugador j = new Jugador();

        x = lbljugador.getX();
        y = lbljugador.getY();
        j.setPosicion(y);

        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            y--;
            System.out.println("Arriba" + y);
            j.setPosicion(y);
            if (y <= 0) {
                y=0;
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            y++;
            System.out.println("Abajo" + y);
            j.setPosicion(y);
            if (y>400) {
                y=400;
            }
        }

        lbljugador.setLocation(x, y);
    }//GEN-LAST:event_lbljugadorKeyPressed

    private void lbljugadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbljugadorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbljugadorKeyReleased

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
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jencabezado;
    private javax.swing.JLabel lblenemigo1;
    private javax.swing.JLabel lblenemigo2;
    private javax.swing.JLabel lblenemigo3;
    private javax.swing.JLabel lbljugador;
    private javax.swing.JLabel lbltiempo;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}