/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoprueba;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class TextoPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona p = new Persona();
        Binario b = new Binario();
        /*
        p.setCodigo(1);
        p.setNombre("Juan");
        p.setApellido("Perez");

        Controlar c = new Controlar();
        c.escribir(p, "persona.txt");

        p.setCodigo(2);
        p.setNombre("Rosa");
        p.setApellido("Gutirrez");
        c.escribir(p, "persona.txt");

        p.setCodigo(3);
        p.setNombre("Nombre 3");
        p.setApellido("Apellido 3");

        c.escribir(p, "persona.txt");
        System.out.println("Lectura--------");
        c.leer("persona.txt");
        
     
        
        
        System.out.println("SPLIT");
        c.sp("persona.txt", "1");
         */

        System.out.println("Binario-----");
        
        List<Persona> list = b.listar();
        
        Scanner l=new Scanner(System.in);
        
        System.out.println("Codigo");
        p.setCodigo(l.nextInt());
        System.out.println("Nombre");
        p.setNombre(l.next());
        System.out.println("Apellido");
        p.setApellido(l.next());
        
        list.add(p);
        
        b.crear(list, "per.dat");
        
        System.out.println("-----Lectura-----");
        for (Persona persona : list) {
            System.out.println(persona.getCodigo());
            System.out.println(persona.getNombre());
            System.out.println(persona.getApellido());
        }

    }

}
