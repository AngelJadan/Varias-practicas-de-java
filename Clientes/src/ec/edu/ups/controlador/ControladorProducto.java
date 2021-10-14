/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Producto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author ggual
 */
public class ControladorProducto {
    
    private Map<Integer,Producto> listaProductos;

    public ControladorProducto() {
        listaProductos = new HashMap<>();
    }
    
   public void crear (Integer key, Producto producto){
       listaProductos.put(key, producto);
   }
   
   public Producto buscar  (int codigo){
      Iterator it = listaProductos.keySet().iterator();
       while (it.hasNext()) {
           int key = (Integer)it.next();
           if (codigo == key) {
               Producto producto = listaProductos.get(key);
               return producto;         
           }
           
       }
      return null; 
   }
   
   
   ///BUSCAR POR NOMBRE DEL PRODUCTO
   /**  public Producto buscar  (String nombre ){
      Iterator<Integer> it = listaProductos.keySet().iterator();
       while (it.hasNext()) {
           int key = it.next();
           if (codigo == key) {
               Producto producto = listaProductos.get(key);
               return producto;
           }
           
       }
      return null; 
   }**/
   

   public boolean eliminar (int codigo){
     Iterator it = listaProductos.keySet().iterator();
       while (it.hasNext()) {
           int key = (Integer)it.next();
           if (codigo == key) {
               it.remove();
               return true;
           }
   }
       return false;
}
   
   public void actualizar (Integer llave, Producto nuevoProducto ){
       for (int i = 0; i < listaProductos.size(); i++) {
           Producto producto = listaProductos.get(i);
           
           if (nuevoProducto.getCodigo()== producto.getCodigo()) {
               
               listaProductos.put(llave, nuevoProducto);
           }
           
           
       }
 
   }
   

    public Map<Integer, Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(Map<Integer, Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
   
}    
    
    

