/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import java.io.Serializable;

/**
 *
 * @author EstAngelMesiasJadanC
 */
public class CargaFamiliar extends Persona{
    private int codigo;
    private String parentezco;

    public CargaFamiliar() {
        super();
    }

    public CargaFamiliar(int codigo, String parentezco) {
        super();
        this.codigo = codigo;
        this.parentezco = parentezco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getParentezco() {
        return parentezco;
    }

    public void setParentezco(String parentezco) {
        this.parentezco = parentezco;
    }
}