/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.File;

/**
 *
 * @author Estudiante
 */
public class Controlador {

    private File archivo;
    private String ruta;
    private String nombre;

    public Controlador() {
        this.archivo = archivo;
        this.ruta = "C:\\Users\\Angel\\Desktop\\Prueba";
        this.nombre = "nArchivo";
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.archivo = archivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void crearDirectorio() {
        File raiz = new File(ruta + "//" + nombre);
        if (raiz.exists() == false) {
            raiz.mkdir();
            System.out.println("Capeta creada en " + ruta);
        } else {
            System.out.println("Carpeta ya creada}");

        }
    }

    public void eliminar() {
        File raiz = new File(ruta + "//" + nombre);
        if (raiz.exists() == true) {
            raiz.delete();
            System.out.println("Carpeta eliminada");
        } else {
            System.out.println("Carpeta no existente}");

        }
    }

    public void borrado(File directorio) {
        File f[] = directorio.listFiles();

        for (int i = 0; i < f.length; i++) {
            if (f[i].isFile()) {
                borrado(f[i]);
            } else {
                f[i].delete();
            }

        }

    }

    public void renombre(String actual, String nuevo) {
        File f1 = new File(ruta + "//" + actual);
        if (f1.exists() == true) {
            File f2 = new File(ruta + "//" + nuevo);
            f1.renameTo(f2);
            System.out.println("Archivo creado");
        } else {
            System.out.println("Achivo no existe");
        }
    }

    public void listarDirectorio() {
        File raiz = new File(ruta);
        File lista[] = raiz.listFiles();

        for (File elemento : lista) {
            if (elemento.isDirectory()) {
                System.out.println(elemento.getAbsolutePath());
            }
        }
    }

    public void listarDirectorioOculto() {
        File raiz = new File(ruta);
        File lista[] = raiz.listFiles();

        for (File elemento : lista) {
            if (elemento.isDirectory() && elemento.isHidden()) {
                System.out.println(elemento.getAbsolutePath());
            }
        }
    }

    public void listarArchivos() {
        File raiz = new File(ruta);
        File lista[] = raiz.listFiles();

        for (File elemento : lista) {
            if (elemento.isFile()) {
                System.out.println(elemento.getName());
            }
        }
    }

    public void listarArchivosOcultos() {
        File raiz = new File(ruta);
        File lista[] = raiz.listFiles();

        for (File elemento : lista) {
            if (elemento.isFile() && elemento.isHidden()) {
                System.out.println(elemento.getName());
            }
        }
    }

}
