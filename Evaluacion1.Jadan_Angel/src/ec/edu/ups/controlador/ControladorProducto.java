/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Producto;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jdk.jfr.events.FileWriteEvent;

/**
 *
 * @author Angel Jadan
 * @version 1.0.0.0
 */
public class ControladorProducto {

    private String nombre;
    private FileOutputStream archivoEscritura;
    private DataOutputStream escritura;
    private FileInputStream archivoLectura;
    private DataInputStream lectura;
    private FileWriter archivoTexto;

    public ControladorProducto() {
        this.nombre = "inventario.dat";
    }
    /**
     * 
     * @param prod objeto con atributos para ser escritos en un archivo binario
     * @return 
     */
    public boolean crear(Producto prod) {

        try {
            archivoEscritura = new FileOutputStream(nombre, true);
            escritura = new DataOutputStream(archivoEscritura);

            escritura.writeInt(prod.getCodigo());
            escritura.writeUTF(prod.getNombre());
            escritura.writeInt(prod.getStock());
            escritura.writeDouble(prod.getCosto());
            escritura.close();
            archivoEscritura.close();
            return true;

        } catch (FileNotFoundException ex) {
            System.out.println("No se ha encontrado el arhivo " + ex);
            ex.printStackTrace();

        } catch (IOException ex) {
            System.out.println("Se ha generado un error al guardar los datos " + ex + " Los datos no se han podido guardar");
            ex.printStackTrace();
        } catch (Exception e) {
            System.out.println("Se ha generado un error inesperado " + e);
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Metodo que sirve para leer el archivo binario
     * @return Regresa un listado de los productos y sus atributos
     */
    public List<Producto> listadoLectura() {
        List<Producto> lista = new ArrayList<>();
        try {
            archivoLectura = new FileInputStream(nombre);
            lectura = new DataInputStream(archivoLectura);

            while (true) {
                Producto p = new Producto();
                p.setCodigo(lectura.readInt());
                p.setNombre(lectura.readUTF());
                p.setStock(lectura.readInt());
                p.setCosto(lectura.readDouble());
                lista.add(p);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se ha encontrado el archivo" + ex);
            ex.printStackTrace();
        } catch (EOFException e) {

        } catch (IOException ex) {

        } finally {
            try {
                lectura.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
        return lista;
    }

    /**
     * 
     * @param inventario Recibe el valor total del inventario para ser escrito
     */
    public void costoInventario(String inventario) {
        
        try {

            archivoTexto = new FileWriter("inventario.txt", false);
            archivoTexto.write(String.valueOf(inventario));
            archivoTexto.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

}
