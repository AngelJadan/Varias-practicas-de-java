/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Provincia;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 *
 * @author Angel
 */
public class ControladorProvincia{
    
    private SortedSet<Provincia> lprov;
    
    public ControladorProvincia(){
        
        lprov=new TreeSet<>();
    }
    
    public void crear(Provincia provincia){
        lprov.add(provincia);
                
    }
    
    public Provincia buscar(int codigo){
        
        
        for (Provincia provincia1 : lprov) {
            if (provincia1.getCodigo()==codigo) {
                return provincia1;
            }
        }
        return null;
    }
    
    public boolean actualizar(Provincia provincia){
        lprov.add(provincia);
        return true;
    }
    
    public boolean eliminar(int codigo){
        
        for (Provincia provincia1 : lprov) {
            if (provincia1.getCodigo()==codigo) {
                lprov.remove(provincia1);
                return true;
            }
        }
        
        return false;
        
    }

    public Set<Provincia> getLprov() {
        return lprov;
    }

    public void setLprov(SortedSet<Provincia> lprov) {
        this.lprov = lprov;
    }

    
    
}
