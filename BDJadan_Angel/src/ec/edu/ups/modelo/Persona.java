/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author angel
 */
public class Persona {
    private int codigo;
    private String nombre;
    private String direccion;
    private String fechaCreacion;
    private int numeroEstuantes;

    public Persona() {
    }

    public Persona(int codigo, String nombre, String direccion, String fechaCreacion, int numeroEstuantes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaCreacion = fechaCreacion;
        this.numeroEstuantes = numeroEstuantes;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getNumeroEstuantes() {
        return numeroEstuantes;
    }

    public void setNumeroEstuantes(int numeroEstuantes) {
        this.numeroEstuantes = numeroEstuantes;
    }
    
    
    
}
