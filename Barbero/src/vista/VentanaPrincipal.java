package vista;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ec.edu.ups.modelo.Barberia;

public class VentanaPrincipal extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public VentanaPrincipal() {
        setSize(850, 700);
        setTitle(" BARBERIA  ");
        
    }

    public static void main(String[] args) {
        Barberia barberia = new Barberia(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero de sillas :")));
        VentanaPrincipal ventana = new VentanaPrincipal();
        PanelPrincipal panel = new PanelPrincipal(barberia);
        panel.setOpaque(true);
        panel.setBackground(Color.LIGHT_GRAY);
        ventana.getContentPane().add(panel);
        ventana.setVisible(true);

        //Iniciar hilos del barbero y del panel
        barberia.getBarbero().start();
        new Thread(panel).start();
    }

}
