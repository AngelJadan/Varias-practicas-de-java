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
public class Prestamo {
    private int codigo;
    private String tipoPrestamo;
    private double valor;
    private String cuota;
    private String detalle;
    RolDePagos rolDePagos=new RolDePagos();

    public Prestamo() {
    }

    public Prestamo(int codigo, String tipoPrestamo, double valor, String cuota, String detalle) {
        this.codigo = codigo;
        this.tipoPrestamo = tipoPrestamo;
        this.valor = valor;
        this.cuota = cuota;
        this.detalle = detalle;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipoPrestamo() {
        return tipoPrestamo;
    }

    public void setTipoPrestamo(String tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCuota() {
        return cuota;
    }

    public void setCuota(String cuota) {
        this.cuota = cuota;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public RolDePagos getRolDePagos() {
        return rolDePagos;
    }

    public void setRolDePagos(RolDePagos rolDePagos) {
        this.rolDePagos = rolDePagos;
    }
}
