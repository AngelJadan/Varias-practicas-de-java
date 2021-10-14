/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador.modelo;

import com.conexion.Conexion;
import com.modelo.RepresentanteLegal;
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
public class ControladorRepresentanteLegal {

    Conexion conexion = new Conexion();
    RepresentanteLegal repLegal = new RepresentanteLegal();

    public ControladorRepresentanteLegal() {
    }

    public boolean crearRepLegal(RepresentanteLegal representanteLegal, int empresaId) {
        boolean estado = false;
        try {
            String sql = "INSERT INTO REP_LEGALES VALUES("
                    + 0 + ",'"
                    + representanteLegal.getFechaIngreso() + "','"
                    + representanteLegal.getFechaSalida() + "',"
                    + empresaId + ",'"
                    + representanteLegal.getCodigo()//Clave foranea
                    + ";)";
            PreparedStatement ps = conexion.getConeConnection().prepareCall(sql);
            ps.execute();
            estado = true;
            conexion.cerrarConexion();

        } catch (SQLException e) {
            System.out.println("Error al crear representante Legal \n" + e.getLocalizedMessage());
            estado = false;
        } finally {
            return estado;
        }
    }

    public RepresentanteLegal buscarRepLegal(String identificacion, String nombreCompleto) {
        try {
            String sql = "SELECT * FROM REP_LEGALES, PERSONAS , EMPRESAS "
                    + "WHERE PER_IDENTIFICACION=" + identificacion + " OR CONCAT(PER_NOMBRE,' ',PER_APELLIDO)=" + nombreCompleto + ""
                    + " AND PER_ID=PER_PER_ID AND REP_EMP_ID=EMP_ID";
            Connection conn = null;
            conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            RepresentanteLegal repLegal = new RepresentanteLegal();
            while (rs.next()) {
                repLegal.setCodigo(rs.getInt(1));
                repLegal.setTipoIdentificacion(rs.getString(2));
                repLegal.setIdentificacion(rs.getString(3));
                repLegal.setFechaDeNacimiento(rs.getString(4));
                repLegal.setNombre(rs.getString(5));
                repLegal.setAplellido(rs.getString(6));
                repLegal.setCorreoElectronico(rs.getString(7));
                repLegal.setDireccion(rs.getString(8));
                repLegal.setTelefono(rs.getString(9));
                repLegal.setFechaIngreso(rs.getString(13));
                repLegal.setFechaSalida(rs.getString(14));
            }
            conexion.cerrarConexion();
            return repLegal;
        } catch (SQLException e) {
            System.out.println("Error al consulta el representante legal \n" + e.getMessage());
        }
        return null;
    }

    public boolean eliminarRepLegal(String identificacion) {
        boolean estado = false;
        try {
            String sql = "DELETE REP_LEGALES, PERSONAS "
                    + "FROM  REP_LEGALES"
                    + "JOIN PERSONAS"
                    + "ON REP_LEGALES.PER_PER_ID=PERSONAS.PER_ID"
                    + "WHERE PERSONAS.PER_IDENTIFICACION=" + identificacion;
            Connection conn = null;
            conn = conexion.getConeConnection();
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1, 3);
            conexion.cerrarConexion();
            estado = true;

        } catch (SQLException e) {
            System.out.println("Se ha generado un error al eliminar el representante legal \n" + e.getLocalizedMessage());
            estado = false;
        } finally {
            return estado;
        }
    }

    public int actualizarRepLegal(RepresentanteLegal representanteLegal, int empresaId, int perId) {
        int filasAfectadas = 0;
        try {
            String sql = "UPDATE REP_LEGALES "
                    + "SET REP_EMP_ID=" + empresaId + ","
                    + "REP_FECHA_INGRESO='" + representanteLegal.getFechaIngreso() + "',"
                    + "REP_FECHA_SALIDA='" + representanteLegal.getFechaSalida() + "'"
                    + "WHERE REP_EMP_ID=" + empresaId
                    + " AND PER_PER_ID=" + perId
                    + ";";

            Connection conn = null;
            conn = conexion.getConeConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            filasAfectadas = ps.executeUpdate();

        } catch (SQLException e) {
            filasAfectadas = 0;
            System.out.println("Error al actualizar el Representante Legal \n" + e.getLocalizedMessage());
        } finally {
            return filasAfectadas;
        }
    }

    public List<RepresentanteLegal> listarRepLegal() {
        List<RepresentanteLegal> representantesLegales = new ArrayList<RepresentanteLegal>();
        try {
            String sql = "SELECT * FROM REP_LEGALES, PERSONAS , EMPRESAS "
                    + "WHERE PER_ID=PER_PER_ID AND REP_EMP_ID=EMP_ID";
            Connection conn = null;
            conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                RepresentanteLegal repLegal = new RepresentanteLegal();
                repLegal.setCodigo(rs.getInt(1));
                repLegal.setTipoIdentificacion(rs.getString(2));
                repLegal.setIdentificacion(rs.getString(3));
                repLegal.setFechaDeNacimiento(rs.getString(4));
                repLegal.setNombre(rs.getString(5));
                repLegal.setAplellido(rs.getString(6));
                repLegal.setCorreoElectronico(rs.getString(7));
                repLegal.setDireccion(rs.getString(8));
                repLegal.setTelefono(rs.getString(9));
                repLegal.setFechaIngreso(rs.getString(13));
                repLegal.setFechaSalida(rs.getString(14));

                representantesLegales.add(repLegal);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Se ha generado un error al consultar los Representantes legales " + e.getLocalizedMessage());
        } finally {
            return representantesLegales;
        }
    }
}
