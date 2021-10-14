/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Canton;
import java.util.Map;
import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 *
 * @author Angel
 */
public class ControladorCanton {
    
    private Canton canton;
    private SortedSet<Canton> mapa;
    
    public ControladorCanton(){
        mapa=new TreeSet<>();
    }
    
    public void crear(Canton canton){
        mapa.add(canton);
    }
    
    public Canton buscar(int codigo){
        
        for (Canton canton1 : mapa) {
            if (canton1.getCodigo()==codigo) {
                return canton1;
            }
        }
        return null;
    }
    
    public boolean actualizar(Canton canton){
        mapa.add(canton);
        return true;
    }
    
    public boolean eliminar(int codigo){
        
        for (Canton canton1 : mapa) {
            if (canton1.getCodigo()==codigo) {
                return true;
            }
        }
        return false;
        
    }

    public Canton getCanton() {
        return canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }

    public SortedSet<Canton> getMapa() {
        return mapa;
    }

    public void setMapa(SortedSet<Canton> mapa) {
        this.mapa = mapa;
    }

   
    
}
