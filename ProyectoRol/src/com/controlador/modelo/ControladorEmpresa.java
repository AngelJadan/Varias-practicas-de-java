/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador.modelo;

import com.conexion.Conexion;
import com.modelo.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author EstAngelMesiasJadanC
 */
public class ControladorEmpresa {

    Empresa empresa = new Empresa();
    Conexion conexion = new Conexion();

    public ControladorEmpresa() {
    }

    public boolean crearEmpresa(Empresa empresa) {
        boolean estado = false;
        String sql = "INSERT INTO EMPRESAS VALUES (" + 0 + ",'"
                + empresa.getRazonSocial() + ','
                + empresa.getRuc() + ','
                + empresa.getTelefono() + ','
                + empresa.getDireccion() + ','
                + empresa.getCorreoElectronico()
                + "');";
        try {
            PreparedStatement ps = conexion.getConeConnection().prepareCall(sql);
            ps.execute();
            estado = true;
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error al crear empresa \n " + e.getMessage());
            estado = false;
        }
        return estado;
    }

    public Empresa buscarEmpresa(String razonSocial, String ruc) {

        try {
            String sql = "SELECT * FROM EMPRESAS WHERE emp_razon_social = '" + razonSocial + "' OR emp_ruc='" + ruc+"'";
            Connection conn = null;
            conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            Empresa emp = new Empresa();
            while (rs.next()) {
                emp.setCodigo(rs.getInt(1));
                emp.setRazonSocial(rs.getString(2));
                emp.setRuc(rs.getString(3));
                emp.setTelefono(rs.getString(4));
                emp.setDireccion(rs.getString(5));
                emp.setCorreoElectronico(rs.getString(6));
            }
            return emp;
        } catch (Exception e) {
            System.out.println("Error en consulta de " + razonSocial + " " + ruc + "\n error " + e.getMessage());
            return null;
        } finally {
            try {
                conexion.cerrarConexion();
            } catch (SQLException ex) {
            }
        }
    }

    public List<Empresa> listarEmpresa() {
        List<Empresa> listado = new ArrayList<Empresa>();

        try {
            String sql = "SELECT * FROM EMPRESAS";
            Connection conn = null;
            conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Empresa emp = new Empresa();
                
                emp.setCodigo(rs.getInt(1));
                emp.setRazonSocial(rs.getString(2));
                emp.setRuc(rs.getString(3));
                emp.setTelefono(rs.getString(4));
                emp.setDireccion(rs.getString(5));
                emp.setCorreoElectronico(rs.getString(6));

                listado.add(emp);
            }
            return listado;
        } catch (Exception e) {
            System.out.println("Error en listar " + e.getMessage());
            return null;
        } finally {
            try {
                conexion.cerrarConexion();
                return listado;
            } catch (SQLException ex) {
            }
        }
    }
}
