/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import jdk.jfr.events.FileReadEvent;

/**
 *
 * @author Angel
 */
public class ControladorTexto {

    private String ruta;
    private FileWriter arvhivoEscritura;
    private BufferedWriter estritura;

    public ControladorTexto(String ruta) {
        this.ruta = "C:\\Users\\Angel\\Desktop\\Prueba";
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public FileWriter getArvhivoEscritura() {
        return arvhivoEscritura;
    }

    public void setArvhivoEscritura(FileWriter arvhivoEscritura) {
        this.arvhivoEscritura = arvhivoEscritura;
    }

    public BufferedWriter getEstritura() {
        return estritura;
    }

    public void setEstritura(BufferedWriter estritura) {
        this.estritura = estritura;
    }

    public void escritura(String nombre) {

        try {
            FileWriter archivoEscritura = new FileWriter(ruta + "\\" + nombre, false);//Si no se pone ruta el archivo se crea en el proyecto de NetBeans
            BufferedWriter escritura = new BufferedWriter(archivoEscritura);
            escritura.write("Hola mundo ");
            escritura.close();
            archivoEscritura.close();

        } catch (IOException e1) {
            System.out.println("Error " + e1);
        }

    }

    public String lectura(String nombre) {
        String resultado = "";
        try {
            FileReader archivoLecturas = new FileReader(ruta + "\\" + nombre);
            BufferedReader lectura = new BufferedReader(archivoLecturas);
            String linea = "";

            //Recorido de linea para leer el archivo
            while ((linea = lectura.readLine()) != null) {
                resultado += linea;
                
            }
            lectura.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("Error de lectura");
        }
        return resultado;
    }

}
