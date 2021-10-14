/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.vista.VentanaPrincipal;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @version 1.0.0 4/4/2017
 * @author Angel Jadan
 *
 */
public class ControladorDirecctorio {

    private String ruta;
    private File archivo;
    private File[] archivos;
    
    public void ControladorDirectorio(String ruta) {

    }
    
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public File[] getArchivos() {
        return archivos;
    }

    public void setArchivos(File[] archivos) {
        this.archivos = archivos;
    }
    /**
     * Listado de los archivos
     * @return La lista de archivos
     */

    public List<String> listarArchivos() {
        archivo = new File(ruta);
        archivos = archivo.listFiles();
        List<String> lista = new ArrayList<>();

        for (File arch : archivos) {
            if (arch.isFile()) {
                lista.add(arch.getName());
            }
        }
        return lista;

    }

    /**
     * Listado de directorios
     * @return Devuelve listado de directorios
     */
    public List<String> listarDirectorios() {
        archivo = new File(ruta);
        archivos = archivo.listFiles();
        List<String> listadir = new ArrayList<>();

        for (File dir : archivos) {
            if (dir.isDirectory()) {
                listadir.add(dir.getName());
            }
        }
        return listadir;

    }

    /**
     * Listado de archivos ocultos
     * @return Devuelve un listado de archivos ocultos
     */
    public List<String> listarArchivosOcultos() {
        archivo = new File(ruta);
        archivos = archivo.listFiles();
        List<String> listaArchOc = new ArrayList<>();

        for (File dir : archivos) {
            if (dir.isFile() && dir.isHidden()) {
                listaArchOc.add(dir.getName());
            }
        }
        return listaArchOc;
    }

    /**
     * Listado de directorios ocultos
     * @return Devuelve un listado de directorios ocultos
     */
    public List<String> listarDirectoriosOcultos() {
        archivo = new File(ruta);
        archivos = archivo.listFiles();
        List<String> listaDirOc = new ArrayList<>();

        for (File dir : archivos) {
            if (dir.isDirectory() && dir.isHidden()) {
                listaDirOc.add(dir.getName());
            }
        }
        return listaDirOc;
    }

    /**
     * 
     * @param nombre es para asignar al nuevo archivo
     */
    public void crearDirectorio(String nombre) {
        VentanaPrincipal vp = new VentanaPrincipal();
        archivo = new File(ruta + "//" + nombre);
        archivos = archivo.listFiles();
        if (archivo.exists() == false) {
            archivo.mkdir();
            JOptionPane.showMessageDialog(vp, nombre + " creado ");
        } else {
            JOptionPane.showMessageDialog(vp, nombre + " ya creada anteriormente");

        }
    }

    /**
     * 
     * @param nombre archivo para eliminar
     */
    public void eliminarDirecctorio(String nombre) {

        archivos = archivo.listFiles();

        archivo = new File(ruta + "//" + nombre);
        VentanaPrincipal vp = new VentanaPrincipal();
        if (archivo.exists() == true) {
            archivo.delete();
            JOptionPane.showMessageDialog(vp, "Directorio eliminado");
        } else {
            JOptionPane.showMessageDialog(vp, " no existe");

        }
    }
    
    /**
     * 
     * @param actual archivo a cambiar de nombre
     * @param nuevo nombre del archivo a renombrar
     */

    public void renombrarDirectoriio(String actual, String nuevo) {
        File f1 = new File(ruta + "//" + actual);
        if (f1.exists() == true) {
            File f2 = new File(ruta + "//" + nuevo);
            f1.renameTo(f2);
        } else {
        }
    }

    /**
     * 
     * @param nombre archivo que se requieren los datos
     * @return Devuelve la informacion del archivo recibido
     */
    public String mostrarInformacion(String nombre) {

        String lista = "";
        File ar = new File(nombre);
        String paren = ar.getAbsolutePath();
        String perescritura = "";

        long modificado = ar.lastModified();
        Date fecha = new Date();
        Calendar calendario = new GregorianCalendar();
        String dia = Integer.toString(calendario.get(Calendar.DATE));
        String mes = Integer.toString(calendario.get(Calendar.MONTH));
        String year = Integer.toString(calendario.get(Calendar.YEAR));

        if (ar.setReadOnly() == false) {
            perescritura = "Se puede escribir";
        } else {
            perescritura = "No se puede escribir";
        }

        lista = "Información: \n" + "Path Absolut: " + paren + " \n" + "Tamaño: " + ar.length() + " bytes" + "\n" + "Permisos de lectura: " + perescritura + "\n" + "Fecha de ultima modificacion: " + dia + "/" + mes + "/" + year;

        return lista;

    }

}
