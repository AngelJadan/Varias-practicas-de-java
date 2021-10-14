/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador.modelo;

import com.conexion.Conexion;
import com.modelo.CargaFamiliar;
import com.modelo.Cargo;
import com.modelo.Empresa;
import com.modelo.Persona;
import com.modelo.Trabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EstAngelMesiasJadanC
 */
public class ControladorTrabajador {

    Trabajador trabajador = new Trabajador();
    Conexion conexion = new Conexion();

    public ControladorTrabajador() {
    }

    public boolean crearTrabajador(Trabajador trabajador, int idEmp) {
        boolean filasAfectadas = false;
        String sql = "INSERT INTO PERSONAS VALUES ("
                + 0
                + ",'" + trabajador.getTipoIdentificacion() + "','"
                + trabajador.getIdentificacion() + "','"
                + trabajador.getFechaDeNacimiento() + "','"
                + trabajador.getNombre() + "','"
                + trabajador.getAplellido() + "','"
                + trabajador.getCorreoElectronico() + "','"
                + trabajador.getDireccion() + "','"
                + trabajador.getTelefono() + "','"
                + "TRABAJADOR',"
                + idEmp
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

    /**
     *
     * @param identificacion Numero de cedula de trabajador
     * @param nombreCompleto Nombres y apellidos del trabjador
     * @param empId Codigo id de empresa
     * @return retorna los datos del trabajador
     */
    public Trabajador buscarTrabajador(String identificacion, String nombreCompleto, int empId) {
        try {
            String sql = "SELECT PER_ID, PER_TIPO_ID, PER_IDENTIFICACION, PER_FECHANACIMIENTO, PER_NOMBRE, PER_APELLIDO,\n"
                    + "                    PER_CORREO_ELECTRONICO, PER_DIRECCION, PER_TELEFONO , PER_EMP_ID"
                    + " FROM PERSONAS"
                    + " WHERE PER_IDENTIFICACION='" + identificacion + "'"
                    + " AND PER_EMP_ID=" + empId;
            //+ " OR CONCAT(P.per_nombre,' ',P.per_apellido)='" + nombreCompleto + "';";
            Connection conn = null;
            conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            Trabajador trabajador = new Trabajador();
            Empresa emp = new Empresa();
            while (rs.next()) {
                trabajador.setCodigo(rs.getInt(1));
                trabajador.setTipoIdentificacion(rs.getString(2));
                trabajador.setIdentificacion(rs.getString(3));
                trabajador.setFechaDeNacimiento(rs.getString(4));
                trabajador.setNombre(rs.getString(5));
                trabajador.setAplellido(rs.getString(6));
                trabajador.setCorreoElectronico(rs.getString(7));
                trabajador.setDireccion(rs.getString(8));
                trabajador.setTelefono(rs.getString(9));
                emp.setCodigo(rs.getInt(10));
                trabajador.setEmpresa(emp);
            }
            return trabajador;
        } catch (SQLException e) {
            System.out.println("Error al consultar el trabajador " + e.getMessage());
        }
        return null;
    }

    public boolean eliminarTrabajador(String identificacion) {
        String sql = "DELETE FROM PERSONAS "
                + "WHERE TRA_IDENTIFICACION=" + identificacion + ";";
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

    public List<Trabajador> listaTrabajador(int empId) {
        List<Trabajador> trabajadores = new ArrayList<Trabajador>();
        try {
            String sql = "SELECT * FROM PERSONAS WHERE PER_EMP_ID="+empId+" AND PER_PARENTEZCO='TRABAJADOR'";
            Connection conn = null;
            conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Trabajador trabajador = new Trabajador();

                trabajador.setCodigo(rs.getInt(1));
                trabajador.setTipoIdentificacion(rs.getString(2));
                trabajador.setIdentificacion(rs.getString(3));
                trabajador.setFechaDeNacimiento(rs.getString(4));
                trabajador.setNombre(rs.getString(5));
                trabajador.setAplellido(rs.getString(6));
                trabajador.setCorreoElectronico(rs.getString(7));
                trabajador.setDireccion(rs.getString(8));
                trabajador.setTelefono(rs.getString(9));

                trabajadores.add(trabajador);
            }
            conexion.cerrarConexion();
            return trabajadores;
        } catch (SQLException e) {
            System.out.println("Error al consultar trabajadores " + e.getMessage());
        }
        return null;
    }

    public int actualizarCargo(Trabajador trabajador) {
        int filasAfectadas = 0;
        try {
            String sql = "UPDATE PERSONAS "
                    + "SET "
                    + "PER_TIPO_ID=" + trabajador.getTipoIdentificacion()
                    + "PER_FECHANACIMIENTO=" + trabajador.getFechaDeNacimiento()
                    + "PER_NOMBRE="
                    + "PER_APELLIDO="
                    + "PER_CORREO_ELECTRONICO="
                    + "PER_DIRECCION="
                    + "PER_TELEFONO="
                    + " WHERE PER_IDENTIFICACION=" + trabajador.getIdentificacion();
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
