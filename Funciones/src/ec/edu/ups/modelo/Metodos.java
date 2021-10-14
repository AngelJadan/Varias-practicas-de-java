/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.controlador.ControladorDatos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class Metodos {

    private Datos d;

    public Metodos() {
    }

    public Metodos(Datos d) {
        this.d = d;

    }

    /**
     *
     * @param f Funcion
     * @param a Primer punto
     * @param b Segundo punto
     * @param iter Numero de iteraciones
     * @param err Error ingresado
     * @serialData 1
     */
    public void biseccion(Funcion f, double a, double b, double iter, double err) {

        ControladorDatos cd = new ControladorDatos();
        
        double c = 0;
        int i = 0;
        double fa = 0;
        double fb = 0;
        fa = f.evaluar(a);
        //d.setFa(fa);
        fb = f.evaluar(b);
        //d.setFb(fb);

          System.out.println(fa);
           System.out.println(fb);
        while (i < iter) {
            //d.setN(i);
               System.out.println("ITERACION " + i);
            c = (a + b) / 2;
            //d.setC(c);
              System.out.println("c: " + c);
            if (c != 0) {
                fa = f.evaluar(a);
                //d.setFa(fa);
                   System.out.print("f(a): " + fa);
                fb = f.evaluar(b);
                //d.setFb(fb);
                  System.out.print("f(b):" + fb);

                if ((fa * fb) < 0) {
                    a = c;
                    //d.setA(a);
                     System.out.print("a: " + a);
                }
                if ((fa * fb) > 0) {
                    b = c;
                  //  d.setB(b);
                    System.out.print("b: " + b);
                }
                System.out.println("");
                //cd.guardarDatos(d);
                
                i++;
            }
        }
        JOptionPane.showMessageDialog(null, "La raiz aproximada es "+c);
    }

    /*
    public void biseccion(Funcion f, double a, double b, double iter, double err) {
        double c = 0;
        int i = 0;
        double fa = 0;
        double fb = 0;
        fa = f.evaluar(a);
        fb = f.evaluar(b);

        System.out.println(fa);
        System.out.println(fb);

        while (i <= iter) {
            System.out.println("ITERACION " + i);
            c = (a + b) / 2;
            System.out.println("c: " + c);
            if (c != 0) {
                fa = f.evaluar(a);
                System.out.print("f(a): " + fa);
                fb = f.evaluar(b);
                System.out.print("f(b):" + fb);

                if ((fa * fb) < 0) {
                    a = c;
                    System.out.print("a: " + a);
                }
                if ((fa * fb) > 0) {
                    b = c;
                    System.out.print("b: " + b);
                }
                i++;
                System.out.println("");
            }
        }
    }*/
    /**
     *
     * @param f Funcion a evaluar
     * @param a Primer punto
     * @param b Segundo punto
     * @param itera Numero de iteraciones
     * @param error Error permitido
     * @serialData 2
     */
    public void reglafalsa(Funcion f, double a, double b, int itera, double error) {//Falta implementar para que se detenga cuando este con el erro ingresado
        double c = 0;
        double fa = 0;
        double fb = 0;
        double fc = 0;

        int i = 0;
        double e = 100;

        while (i < itera) {//Mientras la iteracion sea mayor a i, y error calculado(e) sea mayor al error ingresado(permitido)

            System.out.print(" x" + i);
            System.out.print(" a: " + a);
            System.out.print(" b: " + b);
            fa = f.evaluar(a);
            fb = f.evaluar(b);
            System.out.print(" f(a): " + fa);
            System.out.print(" f(b): " + fb);

            c = a - ((fb * (a - b)) / (fa - fb));
            System.out.print(" Raiz: " + c);

            fc = f.evaluar(c);

            if (fb * fc != 0) {
                if (fb * fc < 0) {
                    a = c;
                }
                if (fb * fc > 0) {
                    b = c;
                }
                e = Math.abs((fb - b) / fb * 100);
                System.out.print(" Error: " + e + "%");

            } else {
                System.out.print("Raiz encontrada");
            }
            System.out.println("");
            i++;

        }
        JOptionPane.showMessageDialog(null, "La raiz aproximada es "+c);

    }

    /**
     *
     * @param f Funcion a evaluar
     * @param a Primer punto
     * @param b Segundo punto
     * @param iteracion Numero de iteraciones
     * @param error Error ingresado(Permitido)
     * @serialData 3
     */
    public void secante(Funcion f, double a, double b, int iteracion, int error) {
        double c = 0;
        double fa = 0;
        double fb = 0;
        double fc = 0;

        int i = 0;
        double e = 100;

        while (i < iteracion) {
            fa = f.evaluar(a);
            fb = f.evaluar(b);

            c = b - ((fb * (a - b)) / (fa - fb));

            e = Math.abs((c - b) / c) * 100;

            i++;
            if (i==iteracion) {
                JOptionPane.showMessageDialog(null, "La raiz aproximada es "+c+" con un error de "+e);
            }
        }
        

    }

    /**
     *
     * @param f Funcion
     * @param a Punto de inicio
     * @param iter Numero de iteraciones
     * @serialData 4
     */
    public void puntoFijo(Funcion f, double a, int iter) {
        double fa = 0;
        double b = 0;
        int i = 0;
        double e = 0;

        while (i < iter) {
            System.out.print(" x" + i);
            fa = f.evaluar(a);

            b = fa;
            System.out.print(" f(x): " + b);
            e = Math.abs((b - a) / b) * 100;
            System.out.print(" Error: " + e);
            System.out.println("");
            a = b;
            i++;
        }

    }

    /**
     *
     * @param f Funcion original
     * @param fd Funcion derivada
     * @param a Punto de inicio de la iteracion
     * @param iter Numero de iteraciones
     * @serialData 5
     */
    public void newton(Funcion f, Funcion fd, double a, int iter) {
        double fa = 0;
        double fda = 0;
        double b = 0;
        int i = 0;
        double e = Double.NaN;

        while (i < iter) {
            // System.out.print("x"+i);
            //System.out.println(": "+a);
            fa = f.evaluar(a);
            System.out.print(" f(a): " + fa);
            fda = fd.evaluar(a);
            System.out.print(" derivada: " + fda);
            b = a - (fa / fda);
            System.out.print(" b: " + b);
            e = Math.abs(((b - a) / b) * 100);
            a = b;
            System.out.print(" Error: " + e + "%");
            i++;
            System.out.println("");
        }
        
        JOptionPane.showMessageDialog(null, "Error aproximado\n"+e);
    }

}
