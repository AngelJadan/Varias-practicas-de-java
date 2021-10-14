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
    private Date fecha;
    private int autorizacion;
    private Persona cliente;
    private DetalleFactura detalle;
    
    public FactVenta() {
    }

    public FactVenta(int codigo, Date fecha, int autorizacion, Persona cliente, DetalleFactura detalle) {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
