/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class NewClass {
    public static void main(String[] args) {
        
        Scanner l=new Scanner(System.in);
        
        Controlador c=new Controlador();
        System.out.println("---creacion directorio-----");
        c.crearDirectorio();
        System.out.println("---Lista de direcctorio---");
        c.listarDirectorio();
        System.out.println("---Lista de direcctorio ocultos---");
        c.listarDirectorioOculto();
        System.out.println("---Lista de archivos---");
        c.listarArchivos();
        System.out.println("---Lista de archivos ocultos---");
        c.listarArchivosOcultos();
        System.out.println("Nombre del archivo");
        String nuevo=l.nextLine();
        
        c.renombre("C:\\Users\\Angel\\Desktop\\Prueba", nuevo);
        c.eliminar();
        
        System.out.println("---Eliminado con recursividad");
        File directorio= new File("C:\\Users\\Angel\\Desktop\\Prueba\\Nueva carpeta");
        c.borrado(directorio);
        
        
    }
}
