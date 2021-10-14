/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.FactVenta;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;


/**
 *
 * @author Angel
 */
public class ControladorFactVenta {
    
    private FactVenta factVenta;
    private HashMap<Integer,FactVenta> lista;

    public ControladorFactVenta() {
        
        factVenta =new FactVenta();
        lista=new HashMap<>();
        
    }

    public ControladorFactVenta(FactVenta factVenta, HashMap<Integer, FactVenta> lista) {
        this.factVenta = factVenta;
        this.lista = lista;
    }
    
    public void crear(int codigo, FactVenta factVenta){
        lista.put(codigo,factVenta);
        
        
        
        
    }
    
    public FactVenta buscar(int codigo){
        Iterator it=lista.keySet().iterator();//Obtenemos el valor de la llave
        while (it.hasNext()) {
            int key = (Integer)it.next();
            
            FactVenta factVenta=lista.get(key);
            return factVenta;
        }
        return null;
    }
    
    public boolean actualizar(int codigo, FactVenta factVenta){
        
        for (FactVenta factVenta1 : lista.values()) {
            if (factVenta1.getCodigo()==codigo) {
                lista.put(codigo, factVenta);
                return true;
            }
        }
        
        return false;
        
    }
    
     public boolean eliminar(int codigo, FactVenta factVenta){
        Iterator it=lista.keySet().iterator();
        while (it.hasNext()) {
            int key=(Integer)it.next();
            FactVenta factVenta1=lista.get(key);
            lista.remove(key);
            return true;
        }
        return false;
        
    }

    public FactVenta getFactVenta() {
        return factVenta;
    }

    public void setFactVenta(FactVenta factVenta) {
        this.factVenta = factVenta;
    }

    public HashMap<Integer, FactVenta> getLista() {
        return lista;
    }

    public void setLista(HashMap<Integer, FactVenta> lista) {
        this.lista = lista;
    }
     
    
    
}
