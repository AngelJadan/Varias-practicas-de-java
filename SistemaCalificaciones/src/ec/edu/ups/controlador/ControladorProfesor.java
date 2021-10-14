/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Profesor;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel Jadan
 * @version 1.0.0.0
 * 
 */
public class ControladorProfesor {

    private String nombre;
    private FileOutputStream archivoEscritura;
    private DataOutputStream archivo;
    private DataOutputStream escritura;
    private FileInputStream archivoLectura;
    private DataInputStream leer;
    private Profesor prof;

    public ControladorProfesor() {
        this.nombre="profesor.dat";
        prof=new Profesor();
    }

    public boolean crear(Profesor profesor) {
        try {
            archivoEscritura = new FileOutputStream(nombre, true);
            archivo = new DataOutputStream(archivoEscritura);
            escritura = new DataOutputStream(archivo);
            
            escritura.writeInt(profesor.getCodigo());
            escritura.writeUTF(profesor.getNombre());
            escritura.writeUTF(profesor.getApellido());
            escritura.writeUTF(profesor.getCedula());
            escritura.writeInt(profesor.getEdad());
            escritura.writeDouble(profesor.getSueldo());
            escritura.writeUTF(profesor.getCelular());
            escritura.close();
            archivo.close();
            archivoEscritura.close();
            return true;

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo" + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos al texto" + ex.getMessage());
        }
        return false;
    }

    public Profesor buscar(int codigo) {
        
        listar();
        for (Profesor profesor : listar()) {
            if (profesor.getCodigo()==codigo) {
                prof.setCodigo(profesor.getCodigo());
                prof.setNombre(profesor.getNombre());
                prof.setApellido(profesor.getApellido());
                prof.setCedula(profesor.getCedula());
                prof.setEdad(profesor.getEdad());
                prof.setSueldo(profesor.getSueldo());
                prof.setCelular(profesor.getCelular());
                
                return prof;
            }
            else{
            JOptionPane.showMessageDialog(null, "No se ha podido encontrar con el codigo ingresado");
            }
        }
        return null;
    }

    public List<Profesor> listar() {
        List<Profesor> lista = new ArrayList<>();
        try {

            archivoLectura = new FileInputStream(nombre);
            leer = new DataInputStream(archivoLectura);

            while (true) {
                prof.setCodigo(leer.readInt());
                prof.setNombre(leer.readUTF());
                prof.setApellido(leer.readUTF());
                prof.setCedula(leer.readUTF());
                prof.setEdad(leer.readInt());
                prof.setSueldo(leer.readDouble());
                prof.setCelular(leer.readUTF());
                
                lista.add(prof);
                leer.close();
                archivoLectura.close();
                return lista;
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Aun no tiene un archivo creado " + ex.getMessage());
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la lectura "+ex.getMessage());
        }
        
        return lista;
    }

}
