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
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private ImageIcon urlImagen;
    private String genero;
    private String provincia;
    private String canton;
    private String parroquia;
    private String recinto;
            
    
    public Persona(){
        
    }

    public Persona(int codigo, String cedula, String nombre, String apellido, int edad, ImageIcon urlImagen, String genero, String provincia, String canton, String parroquia, String recinto) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.urlImagen = urlImagen;
        this.genero = genero;
        this.provincia = provincia;
        this.canton = canton;
        this.parroquia = parroquia;
        this.recinto = recinto;
    }

   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public ImageIcon getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(ImageIcon urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getRecinto() {
        return recinto;
    }

    public void setRecinto(String recinto) {
        this.recinto = recinto;
    }

    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", urlImagen=" + urlImagen + ", genero=" + genero + ", provincia=" + provincia + ", canton=" + canton + ", parroquia=" + parroquia + ", recinto=" + recinto + '}';
    }
    
    
   
}
