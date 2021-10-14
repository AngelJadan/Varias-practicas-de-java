/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.Controlador;
import ec.edu.ups.modelo.Persona;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class Principal {
    public static void main(String[] args) {
        Persona per=new Persona();
        Controlador c=new Controlador();
        
        per.setCodigo(1);
        per.setNombre("Pepe");
        per.setApellido("Torres");
        
        per.setCodigo(2);
        per.setNombre("Pepe2");
        per.setApellido("Torres2");
        
        
        c.escribir("nuevo.ups", per);
        
        List<Persona>lis=c.lectura("nuevo.ups");
        
            for (Persona pe : lis) {
                System.out.println("Codigo: "+pe.getCodigo());
                System.out.println("Nombre: "+pe.getNombre());
                System.out.println("Apellido:"+pe.getApellido());
        }
    }
    
}
