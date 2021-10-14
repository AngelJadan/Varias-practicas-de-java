/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author Angel
 */
public class Candidato extends Persona implements Comparable<Candidato>{
    
    private String cargo;
    private String partido;
    
    
    public Candidato(){
        
    }

    public Candidato(String cargo, String partido) {
        this.cargo = cargo;
        this.partido = partido;
    }

    public Candidato(String cargo, String partido, int codigo, String cedula, String nombre, String apellido, int edad, ImageIcon urlImagen, String genero, String provincia, String canton, String parroquia, String recinto) {
        super(codigo, cedula, nombre, apellido, edad, urlImagen, genero, provincia, canton, parroquia, recinto);
        this.cargo = cargo;
        this.partido = partido;
    }
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return "Canditato{" + "cargo=" + cargo + ", partido=" + partido + '}';
    }

    @Override
    public int compareTo(Candidato o) {
        return getNombre().compareTo(o.getNombre());
    }
    
    
}
