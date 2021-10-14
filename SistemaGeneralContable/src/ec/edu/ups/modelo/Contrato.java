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
public class Contrato {
    
    private int codigo;
    private Trabajador trabajador;
    private String ingreso;
    private String salida;
    private String horatotal;
    private Tcontrato tcontrato;
    
    
    public Contrato(){
        
    }

    public Contrato(int codigo, Trabajador trabajador, String ingreso, String salida, String horatotal, Tcontrato tcontrato) {
        this.codigo = codigo;
        this.trabajador = trabajador;
        this.ingreso = ingreso;
        this.salida = salida;
        this.horatotal = horatotal;
        this.tcontrato = tcontrato;
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

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getHoratotal() {
        return horatotal;
    }

    public void setHoratotal(String horatotal) {
        this.horatotal = horatotal;
    }

    public Tcontrato getTcontrato() {
        return tcontrato;
    }

    public void setTcontrato(Tcontrato tcontrato) {
        this.tcontrato = tcontrato;
    }

    @Override
    public String toString() {
        return "Contrato{" + "codigo=" + codigo + ", trabajador=" + trabajador + ", ingreso=" + ingreso + ", salida=" + salida + ", horatotal=" + horatotal + ", tcontrato=" + tcontrato + '}';
    }
    
}
