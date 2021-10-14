/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.controlador.Controlador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner l=new Scanner(System.in);
        Empleado e=new Empleado();
        e.setCodigo(1);
        e.setNombre("Angel");
        e.setApellido("Jadan");
        e.setCedula("1234567890");
        e.setSueldo(23);
        
        
        Controlador c=new Controlador();
        c.escribir(e,"archivo.ups");
        
        List<Empleado> lista= new ArrayList<>();
        
        
        
    }
    
}
