/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Parroquia;
import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 *
 * @author Angel
 */
public class ControladorParroquia {
    
    private Parroquia parroquia;
    private SortedSet<Parroquia> mapa;
    
    public ControladorParroquia(){
        mapa=new TreeSet<>();
    }
    
    public void crear(Parroquia parroquia){
        mapa.add(parroquia);
    }
    
    public Parroquia buscar(int codigo){
        for (Parroquia parroquia1 : mapa) {
            if (parroquia1.getCodigo()==codigo) {
                return parroquia1;
            }
        }
        return null;
    }
    
    public boolean actualizar(Parroquia parroquia){
        mapa.add(parroquia);
        return true;
    }
    
    public boolean eliminar(int codigo){
      
        for (Parroquia parroquia1 : mapa) {
            if (parroquia1.getCodigo()==codigo) {
                mapa.remove(parroquia1);
                return true;
            }
        }
        return false;
        
    }

    public Parroquia getParroquia() {
        return parroquia;
    }

    public void setPersona(Parroquia parroquia) {
        this.parroquia = parroquia;
    }

    public SortedSet<Parroquia> getMapa() {
        return mapa;
    }

    public void setMapa(SortedSet<Parroquia> mapa) {
        this.mapa = mapa;
    }
    
}
