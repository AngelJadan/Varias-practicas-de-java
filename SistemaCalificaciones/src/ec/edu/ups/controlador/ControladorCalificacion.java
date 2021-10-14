/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Calificacion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class ControladorCalificacion {
    private String nombre;
    private FileOutputStream archivoEscritura;
    private ObjectOutputStream salida;
    private FileInputStream archivoLectura;
    private ObjectInputStream entrada;
    

    public ControladorCalificacion() {
        nombre="calificaciones.dat";
    }
    
    public boolean crear(Calificacion calificacion){
        try {
            archivoEscritura=new FileOutputStream(nombre);
            salida=new ObjectOutputStream(archivoEscritura);
            
            salida.writeObject(calificacion);
            salida.close();
            return true;
            
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Se ha generado un error al acceder al archivo "+ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Se ha generado un error al leer el achivo "+ex.getMessage());
        }
        return false;
    }
    
    public List<Calificacion> listar(){
        List<Calificacion>list=new ArrayList<>();
        try {
            archivoLectura=new FileInputStream(nombre);
            entrada=new ObjectInputStream(archivoLectura);
            
            while (true) {                
                Calificacion calif=(Calificacion)entrada.readObject();
                list.add(calif);
                return list;
                
            }
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No existe la carpeta "+ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Se ha generado un error al leer el archivo "+ex);
        }catch (IOException ex) {
            JOptionPane.showMessageDialog(null," Se ha generado un error inesperado "+ex);
        } 
        return list;
    }
}
