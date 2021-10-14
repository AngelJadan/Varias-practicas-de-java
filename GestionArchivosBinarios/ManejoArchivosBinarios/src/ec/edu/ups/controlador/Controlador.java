/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Empleado;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel
 */
public class Controlador {

    private FileOutputStream archivoEscritura;
    private DataOutputStream archivo;
    private DataOutputStream escritura;
    private FileInputStream archivoLectura;
    private DataInputStream leer;
        
    public Controlador() {
        
    }

    public FileOutputStream getArchivoEscritura() {
        return archivoEscritura;
    }

    public void setArchivoEscritura(FileOutputStream archivoEscritura) {
        this.archivoEscritura = archivoEscritura;
    }

    public DataOutputStream getArchivo() {
        return archivo;
    }

    public void setArchivo(DataOutputStream archivo) {
        this.archivo = archivo;
    }

    public DataOutputStream getEscritura() {
        return escritura;
    }

    public void setEscritura(DataOutputStream escritura) {
        this.escritura = escritura;
    }

    public FileInputStream getArchivoLectura() {
        return archivoLectura;
    }

    public void setArchivoLectura(FileInputStream archivoLectura) {
        this.archivoLectura = archivoLectura;
    }

    public DataInputStream getLeer() {
        return leer;
    }

    public void setLeer(DataInputStream leer) {
        this.leer = leer;
    }
    
    public void escribir(Empleado empleado, String nombre) {
        try {
            
            this.archivoEscritura = new FileOutputStream(nombre, true);
            
            this.archivo = new DataOutputStream(archivoEscritura);
            
            archivo.writeInt(empleado.getCodigo());
            archivo.writeUTF(empleado.getNombre());
            archivo.writeUTF(empleado.getApellido());
            archivo.writeUTF(empleado.getCedula());
            archivo.writeDouble(empleado.getSueldo());
            
            archivo.close();
            archivoEscritura.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no existe");
        } catch (IOException ex) {
            System.out.println("Error en el archivo");
        } catch(Exception e){
            System.out.println("Error general");
        }

    }

    public List<Empleado> leerArchivo(String nombre) {
        List<Empleado> lista = new ArrayList<>();
        try {
            archivoLectura = new FileInputStream(nombre);

            while (true) {

                Empleado em = new Empleado();

                em.setCodigo(leer.readInt());

                em.setNombre(leer.readUTF());
                em.setApellido(leer.readUTF());
                em.setCedula(leer.readUTF());
                em.setSueldo(leer.readDouble());

                lista.add(em);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (EOFException ex) {
            System.out.println("Fin de archivo");
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                leer.close();
                archivoLectura.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar");
            }

        }
        return lista;
    }
}
