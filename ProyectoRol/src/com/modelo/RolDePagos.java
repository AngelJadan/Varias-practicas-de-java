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
public class RolDePagos {

    private int codigo;
    private double aporteSeguroSocial;
    private double sueldoLiquido;
    private int dia;
    private double descuento;

    Sucursal sucursal = new Sucursal();
    RepresentanteLegal representanteLegal=new RepresentanteLegal();
    Trabajador trabajador = new Trabajador();
    IngresoGravado ingresoGravado = new IngresoGravado();
    IngresoNoGravado ingresoNoGravado = new IngresoNoGravado();
    Prestamo prestamo = new Prestamo();

    public RolDePagos() {
    }

    public RolDePagos(int codigo, double aporteSeguroSocial, double sueldoLiquido, int dia, double descuento) {
        this.codigo = codigo;
        this.aporteSeguroSocial = aporteSeguroSocial;
        this.sueldoLiquido = sueldoLiquido;
        this.dia = dia;
        this.descuento = descuento;
    }

    /**
     *
     * @param totalIngresoGravado Suma total de sueldo + ingresos gravados
     * @param porcentaje Porcentaje de 1-100
     * @return Valor calculado
     */
    public double calculaDescuentoSeguroSocial(double totalIngresoGravado, double porcentaje) {
        double valor;
        valor = (totalIngresoGravado * porcentaje) / 100;
        return valor;
    }

    public double sumaDescuento(List<Prestamo> prestamos) {
        double valor = 0;
        for (Prestamo prestamo1 : prestamos) {
            valor = valor + prestamo1.getValor();
        }
        return valor;
    }

    public RepresentanteLegal getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(RepresentanteLegal representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getAporteSeguroSocial() {
        return aporteSeguroSocial;
    }

    public void setAporteSeguroSocial(double aporteSeguroSocial) {
        this.aporteSeguroSocial = aporteSeguroSocial;
    }

    public double getSueldoLiquido() {
        return sueldoLiquido;
    }

    public void setSueldoLiquido(double sueldoLiquido) {
        this.sueldoLiquido = sueldoLiquido;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public IngresoGravado getIngresoGravado() {
        return ingresoGravado;
    }

    public void setIngresoGravado(IngresoGravado ingresoGravado) {
        this.ingresoGravado = ingresoGravado;
    }

    public IngresoNoGravado getIngresoNoGravado() {
        return ingresoNoGravado;
    }

    public void setIngresoNoGravado(IngresoNoGravado ingresoNoGravado) {
        this.ingresoNoGravado = ingresoNoGravado;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

}
