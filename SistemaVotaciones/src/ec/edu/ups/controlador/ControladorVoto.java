/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Votante;
import ec.edu.ups.modelo.Voto;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Angel
 */
public class ControladorVoto {
    
    private Voto voto;
    private HashMap<Integer, Voto> mapa;
        
    public void crear(int codigo, Voto voto){
        mapa.put(codigo,voto);
    }
    
    public Voto buscar(int codigo){
        Iterator it=mapa.keySet().iterator();//Obtenemos el valor de la llave
        while (it.hasNext()) {
            int key = (Integer)it.next();
            
            Voto valor=mapa.get(key);
            return valor;
        }
        return null;
    }
    
    public boolean actualizar(int codigo, Voto voto){
        mapa.put(codigo, voto);
        return true;
    }
    
    public boolean eliminar(int codigo, Voto voto){
        Iterator it=mapa.keySet().iterator();
        while (it.hasNext()) {
            int key=(Integer)it.next();
            Voto vot=mapa.get(key);
            mapa.remove(key);
            return true;
        }
        return false;
        
    }

    public Voto getVoto() {
        return voto;
    }

    public void setPersona(Voto voto) {
        this.voto = voto;
    }

    public Map<Integer, Voto> getMapa() {
        return mapa;
    }

    public void setMapa(Map<Integer, Voto> mapa) {
        this.mapa = (HashMap<Integer, Voto>) mapa;
    }

}


