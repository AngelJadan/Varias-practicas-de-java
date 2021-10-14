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
public class RoldePagos {
    private int codigo;
    private Trabajador trabajador;
    private int dias;
    private double xiii;
    private double xiv;
    private double freserva;
    private double hextras;
    private double hsuplementarias;
    private double aporteIESS;
    private double pquirografarios;
    private double phipotecarios;
    private double atrasos;
    private double otrosdecuentos;
    private double utilidades;
    private String observaciones;
    
    public RoldePagos(){
        
    }

    public RoldePagos(int codigo, Trabajador trabajador, int dias, double xiii, double xiv, double freserva, double hextras, double hsuplementarias, double aporteIESS, double pquirografarios, double phipotecarios, double atrasos, double otrosdecuentos, double utilidades, String observaciones) {
        this.codigo = codigo;
        this.trabajador = trabajador;
        this.dias = dias;
        this.xiii = xiii;
        this.xiv = xiv;
        this.freserva = freserva;
        this.hextras = hextras;
        this.hsuplementarias = hsuplementarias;
        this.aporteIESS = aporteIESS;
        this.pquirografarios = pquirografarios;
        this.phipotecarios = phipotecarios;
        this.atrasos = atrasos;
        this.otrosdecuentos = otrosdecuentos;
        this.utilidades = utilidades;
        this.observaciones = observaciones;
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

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getXiii() {
        return xiii;
    }

    public void setXiii(double xiii) {
        this.xiii = xiii;
    }

    public double getXiv() {
        return xiv;
    }

    public void setXiv(double xiv) {
        this.xiv = xiv;
    }

    public double getFreserva() {
        return freserva;
    }

    public void setFreserva(double freserva) {
        this.freserva = freserva;
    }

    public double getHextras() {
        return hextras;
    }

    public void setHextras(double hextras) {
        this.hextras = hextras;
    }

    public double getHsuplementarias() {
        return hsuplementarias;
    }

    public void setHsuplementarias(double hsuplementarias) {
        this.hsuplementarias = hsuplementarias;
    }

    public double getAporteIESS() {
        return aporteIESS;
    }

    public void setAporteIESS(double aporteIESS) {
        this.aporteIESS = aporteIESS;
    }

    public double getPquirografarios() {
        return pquirografarios;
    }

    public void setPquirografarios(double pquirografarios) {
        this.pquirografarios = pquirografarios;
    }

    public double getPhipotecarios() {
        return phipotecarios;
    }

    public void setPhipotecarios(double phipotecarios) {
        this.phipotecarios = phipotecarios;
    }

    public double getAtrasos() {
        return atrasos;
    }

    public void setAtrasos(double atrasos) {
        this.atrasos = atrasos;
    }

    public double getOtrosdecuentos() {
        return otrosdecuentos;
    }

    public void setOtrosdecuentos(double otrosdecuentos) {
        this.otrosdecuentos = otrosdecuentos;
    }

    public double getUtilidades() {
        return utilidades;
    }

    public void setUtilidades(double utilidades) {
        this.utilidades = utilidades;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "RoldePagos{" + "codigo=" + codigo + ", trabajador=" + trabajador + ", dias=" + dias + ", xiii=" + xiii + ", xiv=" + xiv + ", freserva=" + freserva + ", hextras=" + hextras + ", hsuplementarias=" + hsuplementarias + ", aporteIESS=" + aporteIESS + ", pquirografarios=" + pquirografarios + ", phipotecarios=" + phipotecarios + ", atrasos=" + atrasos + ", otrosdecuentos=" + otrosdecuentos + ", utilidades=" + utilidades + ", observaciones=" + observaciones + '}';
    }
    
    
}
