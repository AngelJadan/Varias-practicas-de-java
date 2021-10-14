/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador.modelo;

import com.conexion.Conexion;
import com.modelo.Asistencia;
import com.modelo.Dia;
import com.modelo.Hora;
import com.modelo.Horario;
import com.modelo.Trabajador;
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
public class ControladorAsistencia {

    Conexion conexion = new Conexion();

    public ControladorAsistencia() {
    }

    public boolean crearAsistencia(Hora hora, Dia dia, Trabajador trabajador) {
        boolean estado = false;
        try {
            String sql = "INSERT INTO ASISTENCIAS VALUES("
                    + 0 + ","
                    + dia.getCodigo() + ","
                    + hora.getCodigo() + ","
                    + trabajador.getCodigo()
                    + ");";
            PreparedStatement ps = conexion.getConeConnection().prepareStatement(sql);
            ps.execute();
            estado = true;
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Se ha generado un error al crear la asistenia " + e.getLocalizedMessage());
            estado = false;
        } finally {
            return estado;
        }
    }

    public Asistencia buscarAsitencia(int codigo) {
        try {
            String sql = "SELECT * FROM ASITENCIAS "
                    + "WHERE ASI_ID=" + codigo + ");";
            Connection conn = null;
            conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            Asistencia asistencia = new Asistencia();
            Dia dia = new Dia();
            Hora hora = new Hora();
            Trabajador trabajador = new Trabajador();
            while (rs.next()) {
                List<Horario> horarios = new ArrayList<Horario>();
                asistencia.setCodigo(rs.getInt(1));
                dia.setCodigo(rs.getInt(2));
                asistencia.setDia(dia);
                hora.setCodigo(rs.getInt(3));
                asistencia.setHora(hora);
                trabajador.setCodigo(rs.getInt(4));
                asistencia.setTrabajador(trabajador);

            }
            conexion.cerrarConexion();
            return asistencia;
        } catch (SQLException e) {
            System.out.println("Error al consultar la asistencia " + e.getLocalizedMessage());
        }
        return null;
    }

    public boolean eliminarAsistencia(int codigo) {
        String sql = "DELETE FROM ASISTENCIAS "
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

    public List<Asistencia> listaTrabajador() {
        List<Asistencia> trabajadores = new ArrayList<Asistencia>();
        try {
            String sql = "SELECT * FROM ASISTENCIAS;";
            Connection conn = null;
            conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Asistencia asistencia = new Asistencia();
                Dia dia=new Dia();
                Hora hora=new Hora();
                Trabajador trabajador=new Trabajador();
                
                asistencia.setCodigo(rs.getInt(1));
                dia.setCodigo(rs.getInt(2));
                asistencia.setDia(dia);
                hora.setCodigo(rs.getInt(3));
                asistencia.setHora(hora);
                trabajador.setCodigo(rs.getInt(4));
                asistencia.setTrabajador(trabajador);
            }
            conexion.cerrarConexion();
            return trabajadores;
        } catch (SQLException e) {
            System.out.println("Error al consultar la asistencia " + e.getMessage());
        }
        return null;
    }
}
