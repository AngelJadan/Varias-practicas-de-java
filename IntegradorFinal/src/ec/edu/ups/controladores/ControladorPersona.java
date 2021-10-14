/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Persona;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Angel
 */
public class ControladorPersona {
    
    private HashMap<Integer, Persona> listaPersona;

    public ControladorPersona() {
    
        listaPersona=new HashMap<>();   
        
    }

    public void crear(Integer codigo, Persona persona) {
        listaPersona.put(codigo, persona);
        
    }
    

    public Persona buscar(int codigo) {
        Iterator it = listaPersona.keySet().iterator();//Obtenemos el valor de la llave
        while (it.hasNext()) {
            int key = (Integer) it.next();

            Persona persona1 = listaPersona.get(key);
            return persona1;
        }
        return null;
    }

    public boolean actualizar(int codigo, Persona persona) {

        for (Persona persona1 : listaPersona.values()) {
            if (persona1.getCodigo() == codigo) {
                listaPersona.clear();
                listaPersona.put(codigo, persona);
                return true;
            }
        }

        return false;

    }

    public boolean eliminar(int codigo, Persona persona) {
        Iterator it = listaPersona.keySet().iterator();
        while (it.hasNext()) {
            int key = (Integer) it.next();
            Persona persona1 = listaPersona.get(key);
            listaPersona.remove(key);
            return true;
        }
        return false;

    }
    
    public HashMap<Integer, Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(HashMap<Integer, Persona> listaPersona) {
        this.listaPersona = listaPersona;
    } 
        

}
