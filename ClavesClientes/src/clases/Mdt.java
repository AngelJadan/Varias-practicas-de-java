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
public class Mdt {
    
    private String clave;
    private String usuario;
    
    public Mdt(){
        
    }
    public Mdt(String clave, String usuario){
        this.clave=clave;
        this.usuario=usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
