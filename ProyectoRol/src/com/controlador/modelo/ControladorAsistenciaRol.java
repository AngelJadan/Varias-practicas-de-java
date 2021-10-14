/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador.modelo;

import com.conexion.Conexion;
import com.modelo.Asistencia;
import com.modelo.Prestamo;
import com.modelo.RolDePagos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EstAngelMesiasJadanC
 */
public class ControladorAsistenciaRol {
    Conexion conexion=new Conexion();

    public ControladorAsistenciaRol() {
    }
    public boolean crearAsitenciaRol(Asistencia asistencia, RolDePagos rolDePagos){
        boolean estado=false;
        try {
            String sql="INSERT INTO ASIS_ROLES VALUES("
                    +0+","
                    +asistencia.getAnio()+","
                    +asistencia.getMes()+","
                    +asistencia.getCodigo()
                    + ");";
            PreparedStatement ps=conexion.getConeConnection().prepareStatement(sql);
            ps.execute();
            estado=true;
        } catch (SQLException e) {
            System.out.println("Se ha generado un error al insertar asistencias y roles "+e.getLocalizedMessage());
            estado=false;
        }finally{
            return estado;
        }
    }

    public boolean eliminarPrestamo(int codigo) {
        String sql = "DELETE FROM ASIS_ROLES "
                + "WHERE ASI_ID=" + codigo + ";";
        try {
            Connection conn = conexion.getConeConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, 3);
            conexion.cerrarConexion();
            return true;

        } catch (SQLException ex) {
            System.out.println("Se ha generaro un error " + ex.getLocalizedMessage());
        }

        return false;
    }
}
