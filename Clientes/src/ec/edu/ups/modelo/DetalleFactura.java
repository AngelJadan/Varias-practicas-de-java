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
public class DetalleFactura {
    
    
    private int codigo;
    private int codigoProducto;
    private int cantidad;
    private String nombre;
    private double costo;
    private double total;

    public DetalleFactura() {
    }

    public DetalleFactura(int codigo, int codigoProducto, int cantidad, String nombre, double costo, double total) {
        this.codigo = codigo;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.costo = costo;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
