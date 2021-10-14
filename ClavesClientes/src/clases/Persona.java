/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Angel
 */
public class Persona {
    
    private int codigo;
    private String nombre;
    private String apellido;
    private String ncomercial;
    private String direccion;
    private String telefono;
    private String correo;
    private Iess iess;
    private Mdt mdt;
    
    
    public Persona(){
        
    }
    public Persona(int codigo, String nombre, String apellido, String ncomercial, String direccion, String telefono, String correo, Iess iess, Mdt mdt){
        this.codigo=codigo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.ncomercial=ncomercial;
        this.direccion=direccion;
        this.telefono=telefono;
        this.correo=correo;
        this.iess=iess;
        this.mdt=mdt;        
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

    public String getNcomercial() {
        return ncomercial;
    }

    public void setNcomercial(String ncomercial) {
        this.ncomercial = ncomercial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Iess getIess() {
        return iess;
    }

    public void setIess(Iess iess) {
        this.iess = iess;
    }

    public Mdt getMdt() {
        return mdt;
    }

    public void setMdt(Mdt mdt) {
        this.mdt = mdt;
    }
    
    
    
    
    
}
