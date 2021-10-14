/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.util.List;
import ec.edu.ups.modelo.Persona;
import java.util.ArrayList;

/**
 *
 * @author Angel Jadan
 */
public class ControladorPersona {

    private List<Persona> lista;

    public ControladorPersona() {

        lista = new ArrayList<>();

    }

    public void crear(Persona persona) {
        lista.add(persona);
    }

    public Persona buscar(String codigo) {
        for (Persona persona : lista) {
            if (persona.getCodigo()==codigo) {
                return persona;
            }
        }
        return null;
    }

    public void actualizar(Persona persona) {
        for (int i = 0; i < lista.size(); i++) {
            Persona per = lista.get(i);
            if (per.getCodigo() == persona.getCodigo()) {
                lista.set(i, persona);
            }
        }
    }

    public List<Persona> getLista() {
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }

}
