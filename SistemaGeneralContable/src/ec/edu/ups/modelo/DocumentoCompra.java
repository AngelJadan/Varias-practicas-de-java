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
public class DocumentoCompra {
    private int codigo;
    private Tipodocumento tipodoc;
    private Proveedor proveedor;
    private Producto producto;
    private FormaPago fpago;
    private double total;
    
    public DocumentoCompra(){
        
    }   

    public DocumentoCompra(int codigo, Tipodocumento tipodoc, Proveedor proveedor, Producto producto, FormaPago fpago, double total) {
        this.codigo = codigo;
        this.tipodoc = tipodoc;
        this.proveedor = proveedor;
        this.producto = producto;
        this.fpago = fpago;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Tipodocumento getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(Tipodocumento tipodoc) {
        this.tipodoc = tipodoc;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public FormaPago getFpago() {
        return fpago;
    }

    public void setFpago(FormaPago fpago) {
        this.fpago = fpago;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "DocumentoCompra{" + "codigo=" + codigo + ", tipodoc=" + tipodoc + ", proveedor=" + proveedor + ", producto=" + producto + ", fpago=" + fpago + ", total=" + total + '}';
    }
    
    
}
