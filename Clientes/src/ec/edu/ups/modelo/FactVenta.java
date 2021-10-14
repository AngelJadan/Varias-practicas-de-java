/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author Angel
 */
public class FactVenta {

    private int codigo;
    private String fecha;
    private String serie1;
    private String serie2;
    private int autorizacion;
    private Persona cliente;
    private DetalleFactura detalle;
    
    public FactVenta() {
    }

    public FactVenta(int codigo, String fecha, int autorizacion, Persona cliente, DetalleFactura detalle) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.autorizacion = autorizacion;
        this.cliente = cliente;
        this.detalle = detalle;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSerie1() {
        return serie1;
    }

    public void setSerie1(String serie1) {
        this.serie1 = serie1;
    }

    public String getSerie2() {
        return serie2;
    }

    public void setSerie2(String serie2) {
        this.serie2 = serie2;
    }
    

    public int getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(int autorizacion) {
        this.autorizacion = autorizacion;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public DetalleFactura getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleFactura detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "FactVenta{" + "codigo=" + codigo + ", fecha=" + fecha + ", autorizacion=" + autorizacion + ", cliente=" + cliente + ", detalle=" + detalle + '}';
    }
    
    
    
    
}
