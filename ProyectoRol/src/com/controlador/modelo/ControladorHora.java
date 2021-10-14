/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador.modelo;

import com.conexion.Conexion;
import com.modelo.Hora;
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
public class ControladorHora {

    Conexion conexion = new Conexion();
    Hora hora = new Hora();

    public ControladorHora() {
    }

    public boolean crearHora(Hora hora) {
        boolean estado = false;
        try {
            String sql = "INSERT INTO HORAS VALUES("
                    + 0 + ",'"
                    + "HOR_ENTRADA=" + hora.getHoraEntrada() + "','"
                    + "HOR_SALIDA=" + hora.getHoraSalida() + "'"
                    + ");";

            PreparedStatement ps = conexion.getConeConnection().prepareStatement(sql);
            ps.execute();
            estado = true;
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error al crear la hora " + e.getLocalizedMessage());
            estado = false;
        } finally {
            return estado;
        }
    }

    public Hora buscarHora(int id) {
        Hora hora = new Hora();
        try {
            String sql = "SELECT * FROM HORAS WHERE HOR_ID1=" + id;
            Connection conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                hora.setCodigo(rs.getInt(1));
                hora.setHoraEntrada(rs.getString(2));
                hora.setHoraSalida(rs.getString(3));
            }
        } catch (SQLException e) {
            System.out.println("Se ha generado un error al buscar la hora " + e.getLocalizedMessage());
            hora = null;
        } finally {
            return hora;
        }
    }

    public List<Hora> listarHora() {
        List<Hora> horas = new ArrayList<Hora>();
        try {
            String sql = "SELECT * FROM HORAS";

            Connection conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                hora.setCodigo(rs.getInt(1));
                hora.setHoraEntrada(rs.getString(2));
                hora.setHoraSalida(rs.getString(3));
                horas.add(hora);
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar las horas " + e.getLocalizedMessage());
            horas = null;
        } finally {
            return horas;
        }
    }
}
