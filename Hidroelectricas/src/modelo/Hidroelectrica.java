/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Angel
 */
public class Hidroelectrica {
    private int codigo;
    private String nombre;
    private String empresa;
    private String rio;
    private String longitud;
    private String latitud;
    private String potencian;
    private String potenciae;
    private String caida;
    private String salto;
    private String caudal;
    private String inversion;
    private String factor;
    private String turbina;
    private int idProvincia;

    public Hidroelectrica() {
    }

    public Hidroelectrica(int codigo, String nombre, String empresa, String rio, String longitud, String latitud, String potencian, String potenciae, String caida, String salto, String caudal, String inversion, String factor, String turbina, int idProvincia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.empresa = empresa;
        this.rio = rio;
        this.longitud = longitud;
        this.latitud = latitud;
        this.potencian = potencian;
        this.potenciae = potenciae;
        this.caida = caida;
        this.salto = salto;
        this.caudal = caudal;
        this.inversion = inversion;
        this.factor = factor;
        this.turbina = turbina;
        this.idProvincia = idProvincia;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRio() {
        return rio;
    }

    public void setRio(String rio) {
        this.rio = rio;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getPotencian() {
        return potencian;
    }

    public void setPotencian(String potencian) {
        this.potencian = potencian;
    }

    public String getPotenciae() {
        return potenciae;
    }

    public void setPotenciae(String potenciae) {
        this.potenciae = potenciae;
    }

    public String getCaida() {
        return caida;
    }

    public void setCaida(String caida) {
        this.caida = caida;
    }

    public String getSalto() {
        return salto;
    }

    public void setSalto(String salto) {
        this.salto = salto;
    }

    public String getCaudal() {
        return caudal;
    }

    public void setCaudal(String caudal) {
        this.caudal = caudal;
    }

    public String getInversion() {
        return inversion;
    }

    public void setInversion(String inversion) {
        this.inversion = inversion;
    }

    public String getFactor() {
        return factor;
    }

    public void setFactor(String factor) {
        this.factor = factor;
    }

    public String getTurbina() {
        return turbina;
    }

    public void setTurbina(String turbina) {
        this.turbina = turbina;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    @Override
    public String toString() {
        return "Hidroelectrica{" + "codigo=" + codigo + ", nombre=" + nombre + ", empresa=" + empresa + ", rio=" + rio + ", longitud=" + longitud + ", latitud=" + latitud + ", potencian=" + potencian + ", potenciae=" + potenciae + ", caida=" + caida + ", salto=" + salto + ", caudal=" + caudal + ", inversion=" + inversion + ", factor=" + factor + ", turbina=" + turbina + ", idProvincia=" + idProvincia + '}';
    }
    
}
