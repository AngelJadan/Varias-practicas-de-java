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
public class Asistencia {
    private int codigo;
    private int anio;
    private int mes;
    private Trabajador trabajador=new Trabajador();
    private Dia dia;
    private Hora hora;

    public Asistencia() {
    }

    public Asistencia(int codigo, int anio, int mes, Dia dia, Hora hora) {
        this.codigo = codigo;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }
    
    
}
