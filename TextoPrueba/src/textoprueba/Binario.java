/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoprueba;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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
public class Binario {

    private FileOutputStream archivoEscritura;
    private DataOutputStream salida;
    private DataOutputStream escritura;
    private FileInputStream archivoLectura;
    private DataInputStream leectura;

    public Binario() {
        List<Persona>lista=new ArrayList<>();
    }

    public void crear(List<Persona> lista, String nombre) {
        try {
            archivoEscritura = new FileOutputStream(nombre, false);
            salida = new DataOutputStream(archivoEscritura);
            escritura = new DataOutputStream(salida);
            
            for (Persona persona : lista) {
                System.out.println("Escritura");
                System.out.println(persona.getCodigo()+persona.getNombre()+persona.getApellido());
                
                escritura.writeInt(persona.getCodigo());
                escritura.writeUTF(persona.getNombre());
                escritura.writeUTF(persona.getApellido());

            }
            escritura.close();
            salida.close();
            archivoEscritura.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Binario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Binario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Persona> listar() {
        Persona per = new Persona();
        List<Persona>lista=new ArrayList<>();
        try {
            archivoLectura = new FileInputStream("per.dat");
            leectura = new DataInputStream(archivoLectura);

            while (true) {
                per.setCodigo(leectura.readInt());
                per.setNombre(leectura.readUTF());
                per.setApellido(leectura.readUTF());

                lista.add(per);

                leectura.close();
                archivoLectura.close();

                return lista;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Binario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Binario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
