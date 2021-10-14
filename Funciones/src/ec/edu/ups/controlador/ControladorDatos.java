/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Datos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angel
 */
public class ControladorDatos {

    private List<Datos> lista;
    
    public ControladorDatos() {
        lista=new ArrayList<>();
    }

    public ControladorDatos(Datos d) {
        d=new Datos();
    }
    
    
    
    public void guardarDatos(Datos d){
        lista.add(d);
    }

    public List<Datos> getLista() {
        return lista;
    }

    public void setLista(List<Datos> lista) {
        this.lista = lista;
    }
    
}
