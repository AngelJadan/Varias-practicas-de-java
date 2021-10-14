/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

/**
 *
 * @author EstAngelMesiasJadanC
 */
public class RepresentanteLegal extends Persona{
    private int codigo;
    private String fechaIngreso;
    private String fechaSalida;

    public RepresentanteLegal() {
        super();
    }

    public RepresentanteLegal(int codigo, String fechaIngreso, String fechaSalida) {
        super();
        this.codigo = codigo;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
}
