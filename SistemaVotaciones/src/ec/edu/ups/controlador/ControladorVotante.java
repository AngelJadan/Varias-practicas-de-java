/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Votante;
import java.util.HashSet;
    import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author Angel
 */
public class ControladorVotante {
    
    private Set<Votante> lVotante;
    
    public ControladorVotante(){
        lVotante=new TreeSet<>();
    }
    
    public void crear(Votante votante){
        lVotante.add(votante);
    }
    
    public Votante buscar(int codigo){
        for (Votante votante : lVotante) {
            if (votante.getCodigo()==codigo) {
                return votante;
            }
        }
        return null;
    }
    
    public boolean actualizar(Votante persona){
        lVotante.add(persona);
        return true;
    }
    
    public boolean eliminar(int codigo){
        for (Votante votante : lVotante) {
            lVotante.add(votante);
            return true;
        }
        return false;
        
    }

    public Set<Votante> getlVotante() {
        return lVotante;
    }

    public void setlVotante(Set<Votante> lVotante) {
        this.lVotante = lVotante;
    }
    
}
