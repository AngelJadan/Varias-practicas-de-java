/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Controlador {

    private FileOutputStream archivoEscritura;
    private ObjectOutputStream escritura;
    private FileInputStream archivoLectura;
    private ObjectInput lectura;

    public Controlador() {
    }

    public void escribir(String nombreArchivo, Persona p) {
        try {
            archivoEscritura = new FileOutputStream(nombreArchivo);
            escritura = new ObjectOutputStream(archivoEscritura);
            escritura.writeObject(p);
            escritura.close();
            archivoEscritura.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Error en ruta de archivo");
        } catch (IOException ex) {
            System.out.println("Error en escritura de archivo");
        }

    }
    
    public List lectura(String ruta){
        List<Persona> lista=new ArrayList<>();
        try {
            archivoLectura=new FileInputStream(ruta);
            lectura=new ObjectInputStream(archivoLectura);
            
            Persona per=(Persona)lectura.readObject();
            lista.add(per);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error en ruta de direcctorio");
        } catch (IOException ex) {
            System.out.println("Error en lectura de objeto");
        
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en lectura de objetos");
        }
        return lista;
        
    }
    

}
