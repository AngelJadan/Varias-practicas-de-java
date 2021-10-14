/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author ggual
 */
public class Producto {
    
    private int codigo;
    private String nombre;
    private int unidadesStock;
    private double precioUnitario;
    private String ubicacion;
    private String tipoProducto;
    private String descripcion;

    public Producto() {
    }

    public Producto(int codigo, String nombre, int unidadesStock, double precioUnitario, String ubicacion, String tipoProducto, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.unidadesStock = unidadesStock;
        this.precioUnitario = precioUnitario;
        this.ubicacion = ubicacion;
        this.tipoProducto = tipoProducto;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getUnidadesStock() {
        return unidadesStock;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidadesStock(int unidadesStock) {
        this.unidadesStock = unidadesStock;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    
    
    
    
    
}
