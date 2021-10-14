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
public class Recinto {

    private Parroquia parroquia;
    private int codigo;
    private String nombre;

    public Recinto() {

    }
    
    public Parroquia getParroquia(){
        return parroquia;
    }
    
    public void setParroquia(Parroquia parroquia){
        this.parroquia=parroquia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Recinto { " + " codigo " + codigo + " nombre " + nombre + " }";
    }
}
