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
public class DatosR {
    
    private int codigo=1;
    private String ruc;
    private String razonsocial;
    private String direccion;
    private String telefono;
    private int serie1;
    private int serie2;
    private int autoriazacion;

    public DatosR() {
    }

    public String getRuc() {
        return ruc;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
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

    public int getSerie1() {
        return serie1;
    }

    public void setSerie1(int serie1) {
        this.serie1 = serie1;
    }

    public int getSerie2() {
        return serie2;
    }

    public void setSerie2(int serie2) {
        this.serie2 = serie2;
    }

    public int getAutoriazacion() {
        return autoriazacion;
    }

    public void setAutoriazacion(int autoriazacion) {
        this.autoriazacion = autoriazacion;
    }
    
    
    
}
