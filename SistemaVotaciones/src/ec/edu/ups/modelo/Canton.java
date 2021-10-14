/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Objects;

/**
 *
 * @author Angel
 */
public class Canton {
    
    private int codigo;
    private String canton;
    private Provincia provincia;
    
    
    public Canton(){
        
    }

    public Canton(int codigo, String canton, Provincia provincia) {
        this.provincia = provincia;
        this.codigo = codigo;
        this.canton = canton;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    @Override
    public String toString() {
        return "Canton{" + "provincia=" + provincia + ", codigo=" + codigo + ", canton=" + canton + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.provincia);
        hash = 11 * hash + this.codigo;
        hash = 11 * hash + Objects.hashCode(this.canton);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Canton other = (Canton) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.canton, other.canton)) {
            return false;
        }
        if (!Objects.equals(this.provincia, other.provincia)) {
            return false;
        }
        return true;
    }    
    
}
