/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Recinto;
import java.util.SortedSet;
import java.util.TreeSet;
/**
 *
 * @author Angel
 */
public class ControladorRecinto {
    
    private Recinto recinto;
    private SortedSet<Recinto> mapa;
    
    public ControladorRecinto(){
        mapa=new TreeSet<>();
    }
    
    public void crear(Recinto recinto){
        mapa.add(recinto);
    }
    
    public Recinto buscar(int codigo){
        
        for (Recinto recinto1 : mapa) {
            if (recinto1.getCodigo()==codigo) {
                return recinto1;                                
            }
        }
        return null;
    }
    
    public boolean actualizar(Recinto recinto){
        mapa.add(recinto);
        return true;
    }
    
    public boolean eliminar(int codigo){
        for (Recinto recinto1 : mapa) {
            if (recinto1.getCodigo()==codigo) {
                mapa.remove(recinto1);
                return true;
            }
        }
        return false;
        
    }

    public Recinto getPersona() {
        return recinto;
    }

    public void setPersona(Recinto recinto) {
        this.recinto = recinto;
    }

    public SortedSet<Recinto> getMapa() {
        return mapa;
    }

    public void setMapa(SortedSet<Recinto> mapa) {
        this.mapa = mapa;
    }

    
}
