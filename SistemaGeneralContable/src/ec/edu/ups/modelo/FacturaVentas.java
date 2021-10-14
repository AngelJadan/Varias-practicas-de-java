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
public class FacturaVentas {
    private int codigo;
    private Cliente cliente;
    private Producto producto;
    private double descuento;
    private double total;
    private FormaPago fpago;
    private DatosSRI datosSRI;
    
    public FacturaVentas(){
        
    }

    public FacturaVentas(int codigo, Cliente cliente, Producto producto, double descuento, double total, FormaPago fpago, DatosSRI datosSRI) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.producto = producto;
        this.descuento = descuento;
        this.total = total;
        this.fpago = fpago;
        this.datosSRI = datosSRI;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public FormaPago getFpago() {
        return fpago;
    }

    public void setFpago(FormaPago fpago) {
        this.fpago = fpago;
    }

    public DatosSRI getDatosSRI() {
        return datosSRI;
    }

    public void setDatosSRI(DatosSRI datosSRI) {
        this.datosSRI = datosSRI;
    }

    @Override
    public String toString() {
        return "FacturaVentas{" + "codigo=" + codigo + ", cliente=" + cliente + ", producto=" + producto + ", descuento=" + descuento + ", total=" + total + ", fpago=" + fpago + ", datosSRI=" + datosSRI + '}';
    }

    
    
}
