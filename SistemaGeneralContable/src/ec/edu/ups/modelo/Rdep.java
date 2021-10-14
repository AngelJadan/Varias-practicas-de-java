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
public class Rdep {
    private int codigo;
    private Trabajador trabajador;
    private double xiii;
    private double xiv;
    private double freserva;
    private double utilidad;

    public Rdep(int codigo, Trabajador trabajador, double xiii, double xiv, double freserva, double utilidad) {
        this.codigo = codigo;
        this.trabajador = trabajador;
        this.xiii = xiii;
        this.xiv = xiv;
        this.freserva = freserva;
        this.utilidad = utilidad;
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

    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }

    @Override
    public String toString() {
        return "Rdep{" + "codigo=" + codigo + ", trabajador=" + trabajador + ", xiii=" + xiii + ", xiv=" + xiv + ", freserva=" + freserva + ", utilidad=" + utilidad + '}';
    }
    
}
