/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import java.util.List;

/**
 *
 * @author EstAngelMesiasJadanC
 */
public class Dia {
    private int codigo;
    private int dia;
    private List<Hora> hora;

    public Dia() {
    }

    public Dia(int codigo, int dia, List<Hora> hora) {
        this.codigo = codigo;
        this.dia = dia;
        this.hora = hora;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public List<Hora> getHora() {
        return hora;
    }

    public void setHora(List<Hora> hora) {
        this.hora = hora;
    }
    
}
