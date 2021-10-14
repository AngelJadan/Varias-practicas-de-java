/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;
import ec.edu.ups.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angel
 */
public class ControladorPersona {
    
private List<Persona> lista;

public ControladorPersona(){
    lista=new ArrayList();
}

public boolean crear(Persona persona){
    lista.add(persona);
    return true;
}

public Persona buscar(int codigo){
    for (Persona persona : lista) {
        if (persona.getCodigo()==codigo) {
            return persona;
        }
    }
    return null;
}

public boolean eliminar(int codigo){
     Persona persona = buscar(codigo);
        if (persona != null ) {
            lista.remove(persona);  
            return true;
            
        }
        return false;
}
public boolean actualizar(Persona pNueva){
    for (int i = 0; i < lista.size(); i++) {
            Persona persona = lista.get(i);
            if (persona.getCodigo() == pNueva.getCodigo()) {
                lista.set(i, pNueva);
                return true;
            }
            
        }
    return false;
}

    public List<Persona> getLista() {
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }
   
}
