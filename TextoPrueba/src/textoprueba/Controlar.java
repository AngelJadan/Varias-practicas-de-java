/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textoprueba;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel
 */
public class Controlar {

    private FileWriter archivoEscritura;
    private BufferedWriter escritura;
    private FileReader archivoLectura;
    private BufferedReader lectura;

    public Controlar() {
    }

    public void escribir(Persona per, String ruta) {
        try {
            archivoEscritura = new FileWriter(ruta, true);
            escritura = new BufferedWriter(archivoEscritura);
            escritura.write(per.getCodigo() + ";");
            escritura.write(per.getNombre() + ";");
            escritura.write(per.getApellido() + ";");
            escritura.write("\n");
            escritura.close();

        } catch (IOException ex) {
            Logger.getLogger(Controlar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void sp(String ruta, String codigo) {
        try {
            archivoLectura = new FileReader(ruta);
            lectura = new BufferedReader(archivoLectura);

            String linea = "";
            
            while (linea != null) {
                linea = lectura.readLine();
                if (linea != null) {
                    String ar[] = linea.split(";");
                    for (int i = 0; i < ar.length; i++) {
                        if (ar[0].equals(codigo)) {
                            System.out.println(ar[i]);
                        }
                    }
                    System.out.println("  ");
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controlar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controlar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leer(String ruta) {
        try {
            archivoLectura = new FileReader(ruta);
            lectura = new BufferedReader(archivoLectura);

            String linea = "";
            while (linea != null) {
                linea = lectura.readLine();
                System.out.println(linea);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controlar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controlar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void buscar(int codigo, String ruta) {
        try {

            archivoLectura = new FileReader(ruta);
            lectura = new BufferedReader(archivoLectura);
            String linea = "";
            while (linea != null) {
                linea = lectura.readLine();

                if (lectura.read() == codigo) {
                    System.out.println(linea);
                    break;
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controlar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controlar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
