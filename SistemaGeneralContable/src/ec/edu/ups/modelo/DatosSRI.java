/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Angel
 */
public class DatosSRI {
    private int codigo;
    private int autorizacion;
    private String serie1;
    private String serie2;
    
    public DatosSRI(){
        
    }

    public DatosSRI(int codigo, int autorizacion, String serie1, String serie2) {
        this.codigo = codigo;
        this.autorizacion = autorizacion;
        this.serie1 = serie1;
        this.serie2 = serie2;
    }

    @Override
    public String toString() {
        return "DatosSRI{" + "codigo=" + codigo + ", autorizacion=" + autorizacion + ", serie1=" + serie1 + ", serie2=" + serie2 + '}';
    }
    
    
}
