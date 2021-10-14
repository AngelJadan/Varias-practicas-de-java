/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.DatosR;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Angel
 */
public class ControladorDatosR {
    
    
    private Map<Integer,DatosR> ldatos;

    public ControladorDatosR() {
        ldatos = new HashMap<>();
    }
    
    public void crear(Integer codigo, DatosR datos){
        ldatos.put(codigo, datos);
    }
    
    public DatosR buscar  (int codigo){
        
      Iterator it = ldatos.keySet().iterator();
       while (it.hasNext()) {
           int key = (Integer)it.next();
           if (codigo == key) {
               DatosR datosr = ldatos.get(key);
               
               
               return datosr;         
           }
           
       }
      return null; 
   }
   
   

    public boolean actualizar(int codigo, DatosR datosr) {

        for (DatosR datosr1 : ldatos.values()) {
            if (datosr1.getCodigo() == codigo) {
                ldatos.clear();
                ldatos.put(codigo, datosr1);
                return true;
            }
        }

        return false;

    }
    

    public boolean eliminar(int codigo, DatosR datosr) {
        Iterator it = ldatos.keySet().iterator();
        while (it.hasNext()) {
            int key = (Integer) it.next();
            DatosR datosr1 = ldatos.get(key);
            ldatos.remove(key);
            return true;
        }
        return false;

    }

    public Map<Integer, DatosR> getLdatos() {
        return ldatos;
    }

    public void setLdatos(Map<Integer, DatosR> ldatos) {
        this.ldatos = ldatos;
    }
    
}
