/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class Interpolacion {

    public Interpolacion() {
    }
    
    /**
     *
     * @param f Funcion a evalar
     * @param datos Datos del polinomio a evaluar
     * @param x Valor de x
     *
     */
    public double lagrange(Funcion f, double[] datos, double x) {
        double fxn[] = new double[datos.length];
        double sup = 1;
        double inf = 1;
        double res = 0;

        for (int i = 0; i < datos.length; i++) {
            System.out.print(" i: " + datos[i]);
            fxn[i] = f.evaluar(datos[i]);
            System.out.print("f(x" + i + ")= " + fxn[i]);
            for (int j = 0; j < datos.length; j++) {
                System.out.println("i=" + datos[i] + " j= " + datos[j]);
                if (i != j) {//Comparamos que Xn(i) se diferente a Xn-1(j)

                    sup = sup * (x - datos[j]);
                    System.out.println(" x= " + x + " j= " + datos[j]);

                    inf = inf * (datos[i] - datos[j]);

                }

                res = (sup / inf) * fxn[i];// 
                return res;
            }
            System.out.println("");
        }
        JOptionPane.showMessageDialog(null, "raiz=" + res);
        System.out.println("raiz=" + res);
        return res;
    }

    public double diferenciasDivididas(Funcion f, double[] datos, double x, int m) {
        double fxn[] = new double[datos.length];
        double res = 0;
        int i = 0;

        for (int j = 0; j < fxn.length; j++) {
            fxn[j] = f.evaluar(datos[j]);
        }

        while (i < m - 1) {
            res = (fxn[i + 1] - fxn[i]) / (datos[i + 1] - datos[i]);
            System.out.println("Resultado= " + res);
            i++;
            
        }
        JOptionPane.showMessageDialog(null, "La raiz aproximada es "+res);
        return res;
    }
    

    public double trapecio(Funcion f, double a, double b) {
        double fa = 0;
        double fb = 0;
        double res = 0;

        fa = f.evaluar(a);
        fb = f.evaluar(b);

        res = (b - a) * ((fa + fb) / 2);

        System.out.println("Resultado= " + res);
        
        JOptionPane.showMessageDialog(null, "La raiz aproximada es "+res);
        return res;
    }

    public double simpson(Funcion f, double a, double b) {
        double fa = 0;
        double fb = 0;
        double h = 0;
        double res = 0;
        double c = 0;
        double fc = 0;

        h = (b - a) / 2;
        fa = f.evaluar(a);
        fb = f.evaluar(b);
        c = a + h;
        fc = f.evaluar(c);
        res = (h / 3) * (fa + 4 * fc + fb);
        
        JOptionPane.showMessageDialog(null, "La raiz aproximada es "+res);
        return res;
    }
 
}
