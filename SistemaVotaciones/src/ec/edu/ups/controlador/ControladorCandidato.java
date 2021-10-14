/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Candidato;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Angel
 */
public class ControladorCandidato {
    
    private Candidato persona;
    private Set<Candidato> mapa;
    
    public ControladorCandidato(){
        mapa=new HashSet<>();
    }
    
    public void crear(Candidato candidato){
        mapa.add(persona);
    }
    
    public Candidato buscar(int codigo){
        for (Candidato candidato : mapa) {
            if (candidato.getCodigo()==codigo) {
                return candidato;
            }
        }
        return null;
    }
    
    public boolean actualizar(Candidato candidato){
        mapa.add(persona);
        return true;
    }
    
    public boolean eliminar(int codigo){
        for (Candidato candidato : mapa) {
            if (candidato.getCodigo()==codigo) {
                mapa.remove(candidato.getCodigo());
                return true;
            }
        }
        return false;
    }

    public Candidato getCandidato() {
        return persona;
    }

    public void setCandidato(Candidato candidato) {
        this.persona = candidato;
    }
    public Set<Candidato> getMapa() {
        return mapa;
    }

    public void setMapa(Set<Candidato> mapa) {
        this.mapa = mapa;
    }
    
    
}
