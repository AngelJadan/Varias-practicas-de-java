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
public class Parroquia {
    
    private int codigo;
    private String canton;
    private String parroquia;
        
    public Parroquia(){
        
    }
    
    public String getCanton(){
        return canton;
    }
    
    public void setCanton(String canton){
        this.canton=canton;
    }
    
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public String getParroquia(){
    return parroquia;
    }
    
    public void setParroquia(String parroquia){
        this.parroquia=parroquia;
    }
    

    @Override
    public String toString() {
        return "Parroquia{" + "codigo=" + codigo + ", parroquia=" + parroquia + '}';
    }
    
    
        
}
