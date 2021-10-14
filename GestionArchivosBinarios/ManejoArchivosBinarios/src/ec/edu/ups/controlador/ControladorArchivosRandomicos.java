/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel
 */
public class ControladorArchivosRandomicos {
    
    private RandomAccessFile archivo;
    private int tamanoRancomico;

    public RandomAccessFile getArchivo() {
        return archivo;
    }

    public void setArchivo(RandomAccessFile archivo) {
        this.archivo = archivo;
    }

    public int getTamanoRancomico() {
        return tamanoRancomico;
    }

    public void setTamanoRancomico(int tamanoRancomico) {
        this.tamanoRancomico = tamanoRancomico;
    }
    
    
    
    public void escribir(String nombreArchivo){
        try {
            archivo=new RandomAccessFile(nombreArchivo,"rw");
            
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        }
        
    }
    public void leer(File nombre){
        try {
            RandomAccessFile f=new RandomAccessFile(nombre, "r");
            
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        }
        
    }
    
}
