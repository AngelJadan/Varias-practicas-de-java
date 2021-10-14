/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author angel
 */
public class Tiempo extends Thread {

    private JLabel tiempo;
    private int s;
    private int m;
    private int h;

    public Tiempo() {
    }

    public Tiempo(JLabel tiempo) {

        this.tiempo = tiempo;

    }

    public void run() {
        while (true) {
            try {
                s++;
                sleep(1000);
                if (s == 60) {
                    m++;
                    if (m == 60) {
                        h++;
                    }
                    if (h == 24) {
                        h = 0;
                    }
                    if (m == 61) {
                        m = 0;
                    }
                }
                if (s == 61) {
                    s = 0;
                }
                tiempo.setText("segundo: " + s + " minutos: " + m + " horas: " + h);
            } catch (InterruptedException ex) {
                ex.getStackTrace();
            }

        }

    }
}
