/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

/**
 *
 * @author Angel
 */
public class Principal {
    public static void main(String[] args) {
        ControladorTexto ctexto= new ControladorTexto("C:\\Users\\Angel\\Desktop\\Prueba");
        ctexto.escritura("datos.txt");
        System.out.println(ctexto.lectura("datos.txt"));
                
    }
    
}
