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
public class DecimoCuarto {
    private int codigo;
    private Trabajador trabajador;
    private double total;
    
    public DecimoCuarto(){
        
    }

    public DecimoCuarto(int codigo, Trabajador trabajador, double total) {
        this.codigo = codigo;
        this.trabajador = trabajador;
        this.total = total;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "DecimoCuarto{" + "codigo=" + codigo + ", trabajador=" + trabajador + ", total=" + total + '}';
    }
        
}
