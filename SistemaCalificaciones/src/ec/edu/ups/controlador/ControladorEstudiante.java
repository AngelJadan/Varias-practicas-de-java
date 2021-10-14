/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Curso;
import ec.edu.ups.modelo.Persona;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class ControladorEstudiante {

    private String nombre;
    private RandomAccessFile archivo;
    private Persona estudiante = new Persona();

    public ControladorEstudiante() {
        this.nombre = "estudiantes.dat";
        estudiante = new Persona();

    }

    public boolean crear(Persona estudiante) {

        try {
            archivo = new RandomAccessFile(nombre, "rw");

            archivo.writeInt(estudiante.getCodigo());//Recibe 4 caracteres
            archivo.writeUTF(estudiante.getNombre());//Recibe 20 caracteres
            archivo.writeUTF(estudiante.getApellido());//Recibe 20 caracteres
            archivo.writeUTF(estudiante.getCedula());//Recibe 10 caracteres
            archivo.writeInt(estudiante.getEdad());//Recibe 2 caracteres

            archivo.close();

            return true;

        } catch (FileNotFoundException ex) {
            System.out.println("Directorio no encontrado " + ex.getMessage());
            return false;
        } catch (IOException ex) {
            System.out.println("No se ha podido escribir " + ex.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error de archivo " + e.getMessage());
            return false;
        }

    }

    public Persona buscar(int codigo) {
        List<Persona> lista = listar();
        try {
            archivo = new RandomAccessFile(nombre, "rw");
            for (Persona est : lista) {
                if (est.getCodigo() == codigo) {
                    estudiante.setCodigo(est.getCodigo());
                    estudiante.setNombre(est.getApellido());
                    estudiante.setApellido(est.getApellido());
                    estudiante.setCedula(est.getCedula());
                    estudiante.setEdad(est.getEdad());

                    return estudiante;
                }
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido acceder al archivo "+ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Se ha generado un error al buscar"+ex);
        }
        return null;

    }

    public boolean actualizar(Persona personaActual, Persona personaNueva) {

        List<Persona> lista = listar();
        try {
            archivo = new RandomAccessFile(nombre, "rw");
            for (Persona persona  : lista) {
                if (persona.equals(personaActual)) {
                    
                    persona.setCodigo(personaNueva.getCodigo());
                    archivo.writeInt(persona.getCodigo());
                    persona.setNombre(personaNueva.getNombre());
                    archivo.writeUTF(persona.getNombre());
                    persona.setApellido(personaNueva.getApellido());
                    archivo.writeUTF(persona.getApellido());
                    persona.setCedula(personaNueva.getCedula());
                    archivo.writeUTF(persona.getCedula());
                    persona.setEdad(personaNueva.getEdad());
                    archivo.writeInt(persona.getEdad());
                    archivo.close();
                    return true;
                }
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showConfirmDialog(null, "Se ha generado un error a la hora de leer el archivo "+ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Se ha generado un error "+ex);
        }
        return false;
    }

    public List<Persona> listar() {
        List<Persona> lista = new ArrayList<>();
        try {
            RandomAccessFile lectura = new RandomAccessFile(nombre, "r");

            archivo.seek(1);
            estudiante.setCodigo(archivo.readInt());
            archivo.seek(5);
            estudiante.setNombre(archivo.readUTF());
            archivo.seek(27);
            estudiante.setApellido(archivo.readUTF());
            archivo.seek(49);
            estudiante.setCedula(archivo.readUTF());
            archivo.seek(61);
            estudiante.setEdad(archivo.readInt());

            lista.add(estudiante);
            archivo.close();
            return lista;

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder al archivo " + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el achivo " + ex.getMessage());
        }
        return lista;
    }

}
