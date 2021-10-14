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
public class Trabajador extends Persona{
    
    private int codigo;
    private Persona persona;
    private Date fechaing;
    private XIII xiii;
    private XIV xiv;
    private FReserva freserva;
    private Contrato contrato;
    private double sueldo;
    private String codigoIESS;
    private Date fechanacimiento;
    
    public Trabajador(){
        
    }

    public Trabajador(int codigo, Persona persona, Date fechaing, XIII xiii, XIV xiv, FReserva freserva, Contrato contrato, double sueldo, String codigoIESS, Date fechanacimiento) {
        this.codigo = codigo;
        this.persona = persona;
        this.fechaing = fechaing;
        this.xiii = xiii;
        this.xiv = xiv;
        this.freserva = freserva;
        this.contrato = contrato;
        this.sueldo = sueldo;
        this.codigoIESS = codigoIESS;
        this.fechanacimiento = fechanacimiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Date getFechaing() {
        return fechaing;
    }

    public void setFechaing(Date fechaing) {
        this.fechaing = fechaing;
    }

    public XIII getXiii() {
        return xiii;
    }

    public void setXiii(XIII xiii) {
        this.xiii = xiii;
    }

    public XIV getXiv() {
        return xiv;
    }

    public void setXiv(XIV xiv) {
        this.xiv = xiv;
    }

    public FReserva getFreserva() {
        return freserva;
    }

    public void setFreserva(FReserva freserva) {
        this.freserva = freserva;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCodigoIESS() {
        return codigoIESS;
    }

    public void setCodigoIESS(String codigoIESS) {
        this.codigoIESS = codigoIESS;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Identificacion identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "codigo=" + codigo + ", persona=" + persona + ", fechaing=" + fechaing + ", xiii=" + xiii + ", xiv=" + xiv + ", freserva=" + freserva + ", contrato=" + contrato + ", sueldo=" + sueldo + ", codigoIESS=" + codigoIESS + ", fechanacimiento=" + fechanacimiento + '}';
    }
        
}
