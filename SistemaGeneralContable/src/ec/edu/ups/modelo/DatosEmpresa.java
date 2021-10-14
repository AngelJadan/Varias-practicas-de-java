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
public class DatosEmpresa {
    private int codigo;
    private String rsocial;
    private String ruc;
    private String telefono;
    private String celular;
    private String direccion;
    private String correo;
    
    public DatosEmpresa(){
        
    }

    public DatosEmpresa(int codigo, String rsocial, String ruc, String telefono, String celular, String direccion, String correo) {
        this.codigo = codigo;
        this.rsocial = rsocial;
        this.ruc = ruc;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.correo = correo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRsocial() {
        return rsocial;
    }

    public void setRsocial(String rsocial) {
        this.rsocial = rsocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "DatosEmpresa{" + "codigo=" + codigo + ", rsocial=" + rsocial + ", ruc=" + ruc + ", telefono=" + telefono + ", celular=" + celular + ", direccion=" + direccion + ", correo=" + correo + '}';
    }
    
    
}
