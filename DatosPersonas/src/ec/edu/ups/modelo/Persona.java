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
public class Persona {
    
    private int codigo;
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private String telefono;
    private String direccion;
    private String genero;
    private ImageIcon urlImagen;
    
    public Persona(){
        
    }

    public Persona(int codigo, String nombre, String apellido, String cedula, int edad, String telefono, String direccion, String genero, ImageIcon urlImagen) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.genero = genero;
        this.urlImagen = urlImagen;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ImageIcon getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(ImageIcon urlImagen) {
        this.urlImagen = urlImagen;
    }

    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", edad=" + edad + ", telefono=" + telefono + ", direccion=" + direccion + ", genero=" + genero + ", urlImagen=" + urlImagen + '}';
    }
    
    
    
    
}
