/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.cotrolador;

import ec.edu.ups.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 * Gestionar la entidad Persona CRUD{CREATE-REAR-UPDATE-DELETE} Crear Actualizar
 * Eliminar Buscar Listar
 *
 * @author Estudiante
 */
public class ControladorPersona {

    private List<Persona> lista;

    public ControladorPersona() {
        lista = new ArrayList<>();
    }

    public void crearPersona(Persona persona) {
        lista.add(persona);
    }

    public Persona buscarPersona(int codigo) {
        for (Persona p : lista) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    public void actualizar(int codigo, Persona p) {
        for (int i = 0; i < lista.size(); i++) {
            Persona pAux = lista.get(i);
            if (pAux.getCodigo() == codigo) {
                lista.set(i, p);
            }
        }
    }

    public void eliminar(int codigo) {
        for (int i = 0; i < lista.size(); i++) {
            Persona pAux = lista.get(i);
            if (pAux.getCodigo() == codigo) {
                lista.remove(i);
            }
        }
    }

    public List<Persona> listar() {
        return lista;
    }
}
