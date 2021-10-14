/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador.modelo;

import com.conexion.Conexion;
import com.modelo.Prestamo;
import com.modelo.RolDePagos;
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
public class ControladorPrestamo {

    Conexion conexion = new Conexion();

    public ControladorPrestamo() {
    }

    public boolean crearPrestamo(Prestamo prestamo, RolDePagos rolDePagos) {
        boolean estado = false;
        try {
            String sql = "INSERT INTO PRESTAMOS VALUES("
                    + 0
                    + ",'"
                    + prestamo.getTipoPrestamo() + "',"
                    + prestamo.getValor() + ",'"
                    + prestamo.getCuota() + "','"
                    + prestamo.getDetalle()+"',"
                    + rolDePagos.getCodigo()
                    + ");";
            PreparedStatement ps=conexion.getConeConnection().prepareStatement(sql);
            ps.execute();
            estado=true;
        } catch (SQLException e) {
            System.out.println("Se ha generado un error en crear el prestamo "+e.getLocalizedMessage());
            estado=false;
        }finally{
            return estado;
        }
    }

    public Prestamo buscarPrestamo(int codigo) {
        try {
            String sql = "SELECT * FROM PRESAMOS "
                    + "WHERE pre_id='" + codigo + ");";
            Connection conn = null;
            conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            Prestamo prestamo = new Prestamo();
            while (rs.next()) {
                prestamo.setCodigo(rs.getInt(1));
                prestamo.setTipoPrestamo(rs.getString(2));
                prestamo.setValor(rs.getDouble(3));
                prestamo.setCuota(rs.getString(4));
                prestamo.setDetalle(rs.getString(5));
                RolDePagos rolDePagos=new RolDePagos();
                rolDePagos.setCodigo(rs.getInt(6));
                prestamo.setRolDePagos(rolDePagos);
            }
            conexion.cerrarConexion();
            return prestamo;
        } catch (SQLException e) {
            System.out.println("Error al consultar el prestamo " + e.getLocalizedMessage());
        }
        return null;
    }

    public boolean eliminarPrestamo(int codigo) {
        String sql = "DELETE FROM PRESTAMOS "
                + "WHERE PRE_ID=" + codigo + ";";
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

    public List<Prestamo> listaPrestamo() {
        List<Prestamo> prestamos = new ArrayList<Prestamo>();
        try {
            String sql = "SELECT * FROM PRESTAMOS;";
            Connection conn = null;
            conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Prestamo prestamo=new Prestamo();
                prestamo.setCodigo(rs.getInt(1));
                prestamo.setTipoPrestamo(rs.getString(2));
                prestamo.setValor(rs.getDouble(3));
                prestamo.setCuota(rs.getString(4));
                prestamo.setDetalle(rs.getString(5));
                RolDePagos rolDePagos=new RolDePagos();
                rolDePagos.setCodigo(rs.getInt(6));
                prestamo.setRolDePagos(rolDePagos);
                prestamos.add(prestamo);
            }
            conexion.cerrarConexion();
            return prestamos;
        } catch (SQLException e) {
            System.out.println("Error al consultar los prestamos " + e.getMessage());
        }
        return null;
    }
}
