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
public class Producto {
    
    private int codigo;
    private String nombre;
    private String cantidad;
    private double tarifa14;
    private double tarifa0;
    private String detalle;

    public Producto(int codigo, String nombre, String cantidad, double tarifa14, double tarifa0, String detalle) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tarifa14 = tarifa14;
        this.tarifa0 = tarifa0;
        this.detalle = detalle;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public double getTarifa14() {
        return tarifa14;
    }

    public void setTarifa14(double tarifa14) {
        this.tarifa14 = tarifa14;
    }

    public double getTarifa0() {
        return tarifa0;
    }

    public void setTarifa0(double tarifa0) {
        this.tarifa0 = tarifa0;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", tarifa14=" + tarifa14 + ", tarifa0=" + tarifa0 + ", detalle=" + detalle + '}';
    }
    
    
    
}
