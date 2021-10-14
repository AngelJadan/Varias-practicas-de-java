/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Curso;
import ec.edu.ups.modelo.Profesor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class ControladorCurso {
    
    private String nombre;
    private File archivo;
    private FileWriter archivoEscritura;
    private BufferedWriter escritura;
    private FileReader archivoLeer;
    private BufferedReader leer;

    public ControladorCurso() {
        this.nombre="cursos.txt";
    }

    public boolean Crear( Curso curso) {

        try {
            archivoEscritura = new FileWriter(nombre);
           
            escritura = new BufferedWriter(archivoEscritura);
            
            escritura.write(curso.getCodigo()+";");
            escritura.write(curso.getNivel()+";");
            escritura.write(curso.getNombre()+";");
            escritura.write(curso.getEspecialidad()+";");
            escritura.write(String.valueOf(curso.getProfesor().toString())+";");
            
            escritura.close();
            archivoEscritura.close();
            return true;

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Error en el archivo al crear " + ex.getMessage());
            return false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado " + e.getMessage());
            return false;
        }

    }
    

    public List<Curso> listar(){
        Profesor p=new Profesor();
        List<Curso> lista=new ArrayList<>();
         try {
            archivoLeer=new FileReader(nombre);
            leer=new BufferedReader(archivoLeer);
            
            String linea="";
            
            while (linea != null) {
                linea = leer.readLine();
                if (linea != null) {
                    String ar[] = linea.split(";");
                    for (int i = 0; i < ar.length; i++) {
                        Curso cur=new Curso();
                        cur.setCodigo(Integer.parseInt(ar[0]));
                        cur.setNivel(Integer.parseInt(ar[1]));
                        cur.setNombre(ar[2]);
                        cur.setEspecialidad(ar[3]);
                        cur.setProfesor(p);
                        
                        lista.add(cur);
                    }   System.out.println("  ");
                }
            }
            
        } catch (FileNotFoundException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder "+ex.getMessage());
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, "Error al leer "+ex.getMessage());
        }
         return lista;
    }
        

}
