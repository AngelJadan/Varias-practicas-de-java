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
public class IngresoGravado {
    private int codigo;
    private double sueldoNominal;
    private int diasAsistidos;
    private double valorHorasExtras;
    private double valorHorasSuplementarias;
    private double valorHorasNocturnas;
    private double valorComision;
    private double totalIngresoGravado;

    public IngresoGravado() {
    }

    public IngresoGravado(int codigo, double sueldoNominal, int diasAsistidos, double valorHorasExtras, double valorHorasSuplementarias, double valorHorasNocturnas, double valorComision, double totalIngresoGravado) {
        this.codigo = codigo;
        this.sueldoNominal = sueldoNominal;
        this.diasAsistidos = diasAsistidos;
        this.valorHorasExtras = valorHorasExtras;
        this.valorHorasSuplementarias = valorHorasSuplementarias;
        this.valorHorasNocturnas = valorHorasNocturnas;
        this.valorComision = valorComision;
        this.totalIngresoGravado = totalIngresoGravado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSueldoNominal() {
        return sueldoNominal;
    }

    public void setSueldoNominal(double sueldoNominal) {
        this.sueldoNominal = sueldoNominal;
    }

    public int getDiasAsistidos() {
        return diasAsistidos;
    }

    public void setDiasAsistidos(int diasAsistidos) {
        this.diasAsistidos = diasAsistidos;
    }

    public double getValorHorasExtras() {
        return valorHorasExtras;
    }

    public void setValorHorasExtras(double valorHorasExtras) {
        this.valorHorasExtras = valorHorasExtras;
    }

    public double getValorHorasSuplementarias() {
        return valorHorasSuplementarias;
    }

    public void setValorHorasSuplementarias(double valorHorasSuplementarias) {
        this.valorHorasSuplementarias = valorHorasSuplementarias;
    }

    public double getValorHorasNocturnas() {
        return valorHorasNocturnas;
    }

    public void setValorHorasNocturnas(double valorHorasNocturnas) {
        this.valorHorasNocturnas = valorHorasNocturnas;
    }

    public double getValorComision() {
        return valorComision;
    }

    public void setValorComision(double valorComision) {
        this.valorComision = valorComision;
    }

    public double getTotalIngresoGravado() {
        return totalIngresoGravado;
    }

    public void setTotalIngresoGravado(double totalIngresoGravado) {
        this.totalIngresoGravado = totalIngresoGravado;
    }
    
    
    
}
