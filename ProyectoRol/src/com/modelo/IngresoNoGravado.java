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
public class IngresoNoGravado {
    private int codigo;
    private double decimoCuarto;
    private String tipoDecimoCuarto;
    private double decimoTercero;
    private String tipoDecimoTercero;
    private double fondosReserva;
    private String tipoFondosReserva;
    private double alimentacion;
    private double transporte;
    private double totalIngresoNoGravado;

    public IngresoNoGravado() {
    }

    public IngresoNoGravado(int codigo, double decimoCuarto, String tipoDecimoCuarto, double decimoTercero, String tipoDecimoTercero, double fondosReserva, String tipoFondosReserva, double alimentacion, double transporte, double totalIngresoNoGravado) {
        this.codigo = codigo;
        this.decimoCuarto = decimoCuarto;
        this.tipoDecimoCuarto = tipoDecimoCuarto;
        this.decimoTercero = decimoTercero;
        this.tipoDecimoTercero = tipoDecimoTercero;
        this.fondosReserva = fondosReserva;
        this.tipoFondosReserva = tipoFondosReserva;
        this.alimentacion = alimentacion;
        this.transporte = transporte;
        this.totalIngresoNoGravado = totalIngresoNoGravado;
    }

    public boolean validaPorcetajeAlimentacion(double alimentacion, double sueldoNominal){
        return false;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getDecimoCuarto() {
        return decimoCuarto;
    }

    public void setDecimoCuarto(double decimoCuarto) {
        this.decimoCuarto = decimoCuarto;
    }

    public String getTipoDecimoCuarto() {
        return tipoDecimoCuarto;
    }

    public void setTipoDecimoCuarto(String tipoDecimoCuarto) {
        this.tipoDecimoCuarto = tipoDecimoCuarto;
    }

    public double getDecimoTercero() {
        return decimoTercero;
    }

    public void setDecimoTercero(double decimoTercero) {
        this.decimoTercero = decimoTercero;
    }

    public String getTipoDecimoTercero() {
        return tipoDecimoTercero;
    }

    public void setTipoDecimoTercero(String tipoDecimoTercero) {
        this.tipoDecimoTercero = tipoDecimoTercero;
    }

    public double getFondosReserva() {
        return fondosReserva;
    }

    public void setFondosReserva(double fondosReserva) {
        this.fondosReserva = fondosReserva;
    }

    public String getTipoFondosReserva() {
        return tipoFondosReserva;
    }

    public void setTipoFondosReserva(String tipoFondosReserva) {
        this.tipoFondosReserva = tipoFondosReserva;
    }

    public double getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(double alimentacion) {
        this.alimentacion = alimentacion;
    }

    public double getTransporte() {
        return transporte;
    }

    public void setTransporte(double transporte) {
        this.transporte = transporte;
    }

    public double getTotalIngresoNoGravado() {
        return totalIngresoNoGravado;
    }

    public void setTotalIngresoNoGravado(double totalIngresoNoGravado) {
        this.totalIngresoNoGravado = totalIngresoNoGravado;
    }
    
    
}
