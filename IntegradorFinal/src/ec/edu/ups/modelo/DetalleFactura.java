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
    private double base14;
    private double base0;
    private double descuento;
    private double iva;
    private double total;

    public DetalleFactura() {
    }
    
    public DetalleFactura(int codigo, int codigoProducto, int cantidad, double base14, double base0, double descuento, double iva, double total) {
        this.codigo = codigo;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.base14 = base14;
        this.base0 = base0;
        this.descuento = descuento;
        this.iva = iva;
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

    public double getBase14() {
        return base14;
    }

    public void setBase14(double base14) {
        this.base14 = base14;
    }

    public double getBase0() {
        return base0;
    }

    public void setBase0(double base0) {
        this.base0 = base0;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "codigo=" + codigo + ", codigoProducto=" + codigoProducto + ", cantidad=" + cantidad + ", base14=" + base14 + ", base0=" + base0 + ", descuento=" + descuento + ", iva=" + iva + ", total=" + total + '}';
    }
    
    
}
