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
public interface TipoPersona {
    
    public Persona pjuridica(String ruc,String razonsocial);
    public Persona pnatural(String nombre, String apellido, String cedula);
    
}
