/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador.modelo;

import com.conexion.Conexion;
import com.modelo.Horario;

/**
 *
 * @author EstAngelMesiasJadanC
 */
public class ControladorHorario {
    Conexion conexion=new Conexion();
    Horario horario=new Horario();
    
    public ControladorHorario() {
    }
    public boolean crearDia(Horario horario){
        boolean estado=false;
        try {
            String sql="INSERT INTO DIAS VALUES AUN CORREGIR("
                    +0+","
                    +horario.getDia()
                    + ");";
        } catch (Exception e) {
        }finally{
            return estado;
        }
    }    
    public boolean crearHorario(int contId, int diaId, int horaId){
        boolean estado= false;
        try {
            String sql="INSERT INTO HORIOS VALUES("
                    +0+","
                    +"contratos_con_id="+contId+","
                    +"dias_hor_id="+diaId+","
                    +"hor_id="+horaId
                    + ")";
            
        } catch (Exception e) {
        }finally{
            return estado;
        }
    }
}
