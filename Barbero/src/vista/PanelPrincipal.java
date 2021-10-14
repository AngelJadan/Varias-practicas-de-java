package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ec.edu.ups.modelo.Barberia;
import ec.edu.ups.modelo.Barbero;
import static java.awt.AWTEventMulticaster.add;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class PanelPrincipal extends JPanel implements Runnable {

    private Barberia barberia;

    private boolean clienteNuevo;

    private int contadorClientesNuevos;
    private Barbero barbero;

    private int contadorSegundos;
    private JLabel lblImagen1;
    private JLabel lblImagen2;
    private JLabel lblImagen3;
    private JLabel lblImagen4;
    private JLabel lblImagen5;
    private JLabel lblImagen6;
    private JTextArea area;
    private JLabel lblImagen7;

    public PanelPrincipal(JTextArea area) {
        this.area = area;
    }

    public PanelPrincipal() {
    }

    public PanelPrincipal(Barberia barberia) {

        this.barberia = barberia;
        contadorClientesNuevos = 1;
        contadorSegundos = 0;

        lblImagen1 = new JLabel(new ImageIcon(getClass().getResource("/ec/edu/ups/modelo/img1.jpg")));
        add(lblImagen1);
        lblImagen2 = new JLabel(new ImageIcon(getClass().getResource("/ec/edu/ups/modelo/img2.jpg")));
        add(lblImagen2);
        lblImagen3 = new JLabel(new ImageIcon(getClass().getResource("/ec/edu/ups/modelo/img3.jpg")));
        add(lblImagen3);
        lblImagen4 = new JLabel(new ImageIcon(getClass().getResource("/ec/edu/ups/modelo/img4.jpg")));
        add(lblImagen4);
        lblImagen5 = new JLabel(new ImageIcon(getClass().getResource("/ec/edu/ups/modelo/img5.jpg")));
        add(lblImagen5);
        lblImagen6 = new JLabel(new ImageIcon(getClass().getResource("/ec/edu/ups/modelo/img3.jpg")));
        add(lblImagen6);
        area = new JTextArea();
        add(area);
        lblImagen7 = new JLabel(new ImageIcon(getClass().getResource("/ec/edu/ups/modelo/img7.jpg")));
        add(lblImagen7);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        lblImagen1.setBounds(650, 90, 150, 185);
        lblImagen2.setBounds(0, 40, 70, 75);
        lblImagen3.setBounds(90, 40, 70, 75);
        lblImagen5.setBounds(180, 40, 70, 75);
        lblImagen4.setBounds(270, 40, 70, 75);
        lblImagen6.setBounds(360, 40, 70, 75);
        area.setBounds(30, 200, 400, 400);
        area.setBackground(Color.white);
        lblImagen7.setBounds(600, 280, 200, 200);

        // SILLAS DE ESPERA
        for (int i = 0; i < barberia.getSillas(); i++) {

            if (i >= 10) {
                if (barberia.getSillasDeEspera()[i].availablePermits() == 0) {
                    g.setColor(Color.red);
                    g.fillRect(10, 110, 50, 10);

                } else {
                    g.setColor(Color.green);
                    g.fillRect(10, 110, 50, 10);

                }
                repaint();

                if (i >= 100) {
                    if (barberia.getSillasDeEspera()[i].availablePermits() == 0) {
                        g.setColor(Color.red);
                        g.fillRect(100, 110, 50, 10);

                    } else {
                        g.setColor(Color.green);
                        g.fillRect(100, 110, 50, 10);

                    }
                    repaint();
                }
                if (i >= 190) {
                    if (barberia.getSillasDeEspera()[i].availablePermits() == 0) {
                        g.setColor(Color.red);
                        g.fillRect(190, 110, 50, 10);

                    } else {
                        g.setColor(Color.green);
                        g.fillRect(190, 110, 50, 10);

                    }
                    repaint();
                }
                if (i >= 280) {

                    if (barberia.getSillasDeEspera()[i].availablePermits() == 0) {
                        g.setColor(Color.red);
                        g.fillRect(280, 110, 50, 10);

                    } else {
                        g.setColor(Color.green);
                        g.fillRect(280, 110, 50, 10);

                    }
                    repaint();

                }
                continue;
            }
            if (barberia.getSillasDeEspera()[i].availablePermits() == 0) {
                g.setColor(Color.red);
                g.fillRect(90 * i, 100, 70, 30);

            } else {
                g.setColor(Color.green);
                g.fillRect(90 * i, 100, 70, 30);

            }
            repaint();
        }

        // BARBERO
        if (barberia.getBarbero().isDormido() == false) {

            lblImagen1.removeAll();
        }

        if (barberia.haySillasDeEsperaDisponibles() == false) {

            g.drawString(" SILLAS OCUPADAS", 60, 240);
        }

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            if (barberia.hayClienteNuevo() == true) {
                System.out.println("Cliente " + contadorClientesNuevos);
                contadorClientesNuevos++;
                // Llega un cliente nuevo
                clienteNuevo = true;
                repaint();

                try {
                    Random alet1 = new Random();
                    Thread.sleep(alet1.nextInt(500) + 500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                clienteNuevo = false;
                barberia.llegaCliente();
                repaint();
                try {
                    Random alet1 = new Random();
                    Thread.sleep(alet1.nextInt(500) + 500);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            } else {

                try {
                    Random alet1 = new Random();
                    Thread.sleep(alet1.nextInt(500) + 1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
            contadorSegundos++;
            repaint();

        }

    }

    public JTextArea getArea() {
        return area;
    }

    public void setArea(JTextArea area) {
        this.area = area;
    }

}
