package ec.edu.ups.modelo;

import com.sun.java.accessibility.util.AWTEventMonitor;
import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import ec.edu.ups.modelo.Jugador;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Angel Jadan
 */
public class Movimiento extends Thread{
    
    /**Declaracion de Variables*/
    private int t;
    private int xe1;
    private int xe2;
    private int xe3;
    private int xj;
    private JLabel jugador;
    private JLabel enemigo1;
    private JLabel enemigo2;
    private JLabel enemigo3;
    
    public Movimiento() {
        
    }

    public Movimiento(JLabel jugador,JLabel enemigo1,JLabel enemigo2,JLabel enemigo3) {
        this.jugador = jugador;
        this.enemigo1=enemigo1;
        this.enemigo2=enemigo2;
        this.enemigo3=enemigo3;
        this.xe1=500;
        this.xe2=500;
        this.xe3=500;
    }
    
    public void run(){
           
     while(true){
         try {
            Jugador j=new Jugador(); 
            t=j.getPosicion();
             //Enemigos             
             enemigo1.setBounds(xe1, 10, 90, 90);
             Thread.sleep(1);
              xe1--;
              if (xe1==0) {
                 xe1=500;
             }
              
             enemigo2.setBounds(xe3, 150, 90, 90);
             Thread.sleep(1);
              xe3--;
              if (xe3==0) {
                 xe3=460;
             }
             enemigo3.setBounds(xe3, 300, 90, 90);
             Thread.sleep(3);
             if (xe3==0) {
                 xe3=490;
             }
             System.out.println("pos "+j.getPosicion());
             if (t>0&&t<=10||t<=150&&t>=130||t==300&&t>=340) {
                 System.out.println("movfin");
                 JOptionPane.showMessageDialog(jugador, "GAME OVER");
                 System.exit(0);
             }
             
         } catch (InterruptedException ex) {
             ex.printStackTrace();
         }
     }   
    }

}
