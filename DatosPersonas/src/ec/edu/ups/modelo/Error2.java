/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class Error2 extends RuntimeException{

    public Error2(String texto) {
        super(texto);
        JOptionPane.showMessageDialog(null,"NO HA INGRESADO UN NOMBRE ");
    }
    
    
}
