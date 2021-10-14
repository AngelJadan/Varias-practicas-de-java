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
public class Voto {
    
    private int codigo;
    private Votante votante;
    private Candidato candidato;
    private Provincia provincia;
    private Canton canton;
    private Parroquia parroquia;
    private Recinto recinto;
    private int voto;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Votante getVotante() {
        return votante;
    }

    public void setVotante(Votante votante) {
        this.votante = votante;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Canton getCanton() {
        return canton;
    }

    public void setCanton(Canton canton) {
        this.canton = canton;
    }

    public Parroquia getParroquia() {
        return parroquia;
    }

    public void setParroquia(Parroquia parroquia) {
        this.parroquia = parroquia;
    }

    public Recinto getRecinto() {
        return recinto;
    }

    public void setRecinto(Recinto recinto) {
        this.recinto = recinto;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    @Override
    public String toString() {
        return "Voto{" + "codigo=" + codigo + ", votante=" + votante + ", candidato=" + candidato + ", provincia=" + provincia + ", canton=" + canton + ", parroquia=" + parroquia + ", recinto=" + recinto + ", voto=" + voto + '}';
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
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
        final Voto other = (Voto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.votante, other.votante)) {
            return false;
        }
        if (!Objects.equals(this.candidato, other.candidato)) {
            return false;
        }
        if (!Objects.equals(this.provincia, other.provincia)) {
            return false;
        }
        if (!Objects.equals(this.canton, other.canton)) {
            return false;
        }
        if (!Objects.equals(this.parroquia, other.parroquia)) {
            return false;
        }
        if (!Objects.equals(this.recinto, other.recinto)) {
            return false;
        }
        return true;
    }
    
    
    
}
