/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.util.Map;
import ec.edu.ups.modelo.Persona;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Angel
 */
public class ControladorPersona {
    
    private Map<Integer,Persona> listaCliente;

    public ControladorPersona() {
        listaCliente = new HashMap<>();
    }
    
    public void crear(Integer codigo, Persona persona){
        listaCliente.put(codigo, persona);
        System.out.println(listaCliente);
        Persona per=buscar(codigo);
        System.out.println("Persona buscada "+per.toString());
    }
    
    
    
    public Persona buscar  (int codigo){
        
        System.out.println(listaCliente);
      Iterator it = listaCliente.keySet().iterator();
       while (it.hasNext()) {
           int key = (Integer)it.next();
           if (codigo == key) {
               Persona persona = listaCliente.get(key);
               
               System.out.println(persona.toString());
               
               return persona;         
           }
           
       }
      return null; 
   }
   
   

    public boolean actualizar(int codigo, Persona persona) {

        for (Persona persona1 : listaCliente.values()) {
            if (persona1.getCodigo() == codigo) {
                listaCliente.clear();
                listaCliente.put(codigo, persona);
                return true;
            }
        }

        return false;

    }
    

    public boolean eliminar(int codigo, Persona persona) {
        Iterator it = listaCliente.keySet().iterator();
        while (it.hasNext()) {
            int key = (Integer) it.next();
            Persona persona1 = listaCliente.get(key);
            listaCliente.remove(key);
            return true;
        }
        return false;

    }

    public Map<Integer, Persona> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(Map<Integer, Persona> listaCliente) {
        this.listaCliente = listaCliente;
    }
    
    
    
    
}
