/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorDatos;
import ec.edu.ups.modelo.Datos;
import ec.edu.ups.modelo.Funcion;
import ec.edu.ups.modelo.Interpolacion;
import ec.edu.ups.modelo.Metodos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angel
 */
public class Principal {

  /*  public static void main(String[] args) {
        ControladorDatos cd=new ControladorDatos();
        
        Datos d = new Datos();
        
            Funcion f = new Funcion("x^2");

            d.setA(0);
            d.setB(1);
            Metodos m = new Metodos(d);
            
            m.biseccion(f, d.getA(), d.getB(), 5, 100);
            
            for (Datos li : cd.getLista()) {
                System.out.print(" N: "+d.getN());
                System.out.print(" a: "+d.getA());
                System.out.print(" b: "+d.getB());
                System.out.print(" c: "+d.getC());
                System.out.print(" fa: "+d.getFa());
                System.out.println(" fb: "+d.getFb());
                
            }
        // double val=f.evaluar(3);
        //System.out.println(val);
        //m.reglafalsa(f, 0, 0, 34, 100);
        /*
        Interpolacion inter=new Interpolacion();
        double datos[]={1,4,6,5};
        inter.lagrange(f, datos, 2);
         */
    /*
    }*/
}
