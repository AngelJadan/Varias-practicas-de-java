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
public class Votante extends Persona implements Comparable<Votante>{
    
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    
    public Votante(){
        
    }

    public Votante(int codigo, String cedula, String nombre, String apellido, int edad, ImageIcon urlImagen, String genero, String provincia, String canton, String parroquia, String recinto) {
        super(codigo, cedula, nombre, apellido, edad, urlImagen, genero, provincia, canton, parroquia, recinto);
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Votante{" + "nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }

    @Override
    public int compareTo(Votante o) {
        return this.nombre.compareTo(o.nombre);
    }

    
    
    
    
    
}
