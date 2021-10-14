/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EstAngelMesiasJadanC
 */
public class Contrato {
    private int codigo;
    private int jornada;
    private String fechaIngreso;
    private String fechaSalida;
    private String relacionLaboral;
    private String cargo;
    private double sueldo;
    private List<Horario> horario;
    private boolean periodoPrueba;

    Trabajador trabajador =new Trabajador();
    Empresa empresa=new Empresa();
    public Contrato() {
    }

    public Contrato(int codigo, int jornada, String fechaIngreso, String fechaSalida, String relacionLaboral, String cargo, double sueldo, List<Horario> horario, boolean periodoPrueba) {
        this.codigo = codigo;
        this.jornada = jornada;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.relacionLaboral = relacionLaboral;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.horario = horario;
        this.periodoPrueba = periodoPrueba;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
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

    public String getRelacionLaboral() {
        return relacionLaboral;
    }

    public void setRelacionLaboral(String relacionLaboral) {
        this.relacionLaboral = relacionLaboral;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public List<Horario> getHorario() {
        return horario;
    }

    public void setHorario(List<Horario> horario) {
        this.horario = horario;
    }

    public boolean isPeriodoPrueba() {
        return periodoPrueba;
    }

    public void setPeriodoPrueba(boolean periodoPrueba) {
        this.periodoPrueba = periodoPrueba;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
