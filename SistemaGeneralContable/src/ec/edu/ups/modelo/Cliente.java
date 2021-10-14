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
public class Cliente {
    private int codigo;
    private Persona persona;
    private Tipocliente tipo;
    
    public Cliente(){
        
    }

    public Cliente(int codigo, Persona persona, Tipocliente tipo) {
        this.codigo = codigo;
        this.persona = persona;
        this.tipo = tipo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setTipo(Tipocliente tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", persona=" + persona + ", tipo=" + tipo + '}';
    }
    

    
}
