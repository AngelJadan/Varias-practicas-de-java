/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Angel
 */
public class Utilidad {
    private int codigo;
    private Trabajador trabajador;
    private int cargas;
    private RoldePagos rol;
    private double totalUtilidad;
    private double utilidadtrabajador;
    
    public Utilidad(){
        
    }

    public Utilidad(int codigo, Trabajador trabajador, int cargas, RoldePagos rol, double totalUtilidad, double utilidadtrabajador) {
        this.codigo = codigo;
        this.trabajador = trabajador;
        this.cargas = cargas;
        this.rol = rol;
        this.totalUtilidad = totalUtilidad;
        this.utilidadtrabajador = utilidadtrabajador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public int getCargas() {
        return cargas;
    }

    public void setCargas(int cargas) {
        this.cargas = cargas;
    }

    public RoldePagos getRol() {
        return rol;
    }

    public void setRol(RoldePagos rol) {
        this.rol = rol;
    }

    public double getTotalUtilidad() {
        return totalUtilidad;
    }

    public void setTotalUtilidad(double totalUtilidad) {
        this.totalUtilidad = totalUtilidad;
    }

    public double getUtilidadtrabajador() {
        return utilidadtrabajador;
    }

    public void setUtilidadtrabajador(double utilidadtrabajador) {
        this.utilidadtrabajador = utilidadtrabajador;
    }

    @Override
    public String toString() {
        return "Utilidad{" + "codigo=" + codigo + ", trabajador=" + trabajador + ", cargas=" + cargas + ", rol=" + rol + ", totalUtilidad=" + totalUtilidad + ", utilidadtrabajador=" + utilidadtrabajador + '}';
    }
    
    
}
