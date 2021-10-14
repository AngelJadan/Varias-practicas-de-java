/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador.modelo;

import com.conexion.Conexion;
import com.modelo.Cargo;
import com.modelo.Empresa;
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
public class ControladorCargo {

    Cargo cargo = new Cargo();
    Conexion conexion = new Conexion();

    public ControladorCargo() {
    }

    /**
     * 
     * @param cargo recibe el nombre del cargo
     * @return Regresa si true o false.
     */
    public boolean crearCargo(Cargo cargo) {
        boolean filasAfectadas = false;
        String sql = "INSERT INTO CARGOS VALUES ("
                + 0
                + ",'" + cargo.getCargo() + "',"
                + cargo.getSueldo()
                + ");";
        try {
            Connection con = null;
            con = conexion.getConeConnection();

            PreparedStatement ps = con.prepareCall(sql);
            ps.executeUpdate();
            filasAfectadas = true;
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error en insertar tabla persona " + e.getMessage());
            filasAfectadas = false;
        }
        return filasAfectadas;
    }

    public Cargo buscarCargo(String cargo) {
        try {
            String sql = "SELECT * FROM TIPOS_CONTRATOS"
                    + " WHERE TCO_CONTRATO='" + cargo + "';";

            Connection conn = null;
            conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            Cargo car = new Cargo();
            while (rs.next()) {
                car.setCodigo(rs.getInt(1));
                car.setCargo(rs.getString(2));
                car.setSueldo(rs.getDouble(3));
            }
            return car;
        } catch (SQLException e) {
            System.out.println("Error al consultar el trabajador " + e.getMessage());
        }
        return null;
    }

    public List<Cargo> listarCargo() {
        List<Cargo> lCargo = new ArrayList<Cargo>();
        try {
            String sql = "SELECT * FROM TIPOS_CONTRATOS;";

            Connection conn = null;
            conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Cargo car = new Cargo();
                car.setCodigo(rs.getInt(1));
                car.setCargo(rs.getString(2));
                car.setSueldo(rs.getDouble(3));
                lCargo.add(car);
            }
            return lCargo;
        } catch (SQLException e) {
            System.out.println("Error al consultar el trabajador " + e.getMessage());
        }
        return null;
    }

    public boolean eliminarCargo(String cargo) {
        String sql = "DELETE FROM TIPOS_CONTRATOS "
                + "WHERE TCO_CONTRATO=" + cargo + ";";
        try {
            Connection conn = conexion.getConeConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, 3);
            conexion.cerrarConexion();
            return true;

        } catch (SQLException ex) {
            System.out.println("Se ha generaro un error al eliminar el contrato " + ex.getLocalizedMessage());
        }

        return false;
    }

    public int actualizarCargo(Cargo cargo) {
        int filasAfectadas = 0;
        try {
            String sql = "UPDATE TIPOS_CONTRATOS "
                    + "SET TCO_CONTRATO=" + cargo.getCargo() + ", "
                    + "TCO_SUELDO_B=" + cargo.getSueldo()
                    + " WHERE TCO_ID=" + cargo.getCodigo();

            Connection conn = null;
            conn = conexion.getConeConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            filasAfectadas = ps.executeUpdate();

        } catch (SQLException e) {
            filasAfectadas = 0;
            System.out.println("Error al actualizar el contrato \n" + e.getLocalizedMessage());
        } finally {
            return filasAfectadas;
        }
    }
}
