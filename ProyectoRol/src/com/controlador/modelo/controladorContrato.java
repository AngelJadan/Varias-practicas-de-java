/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador.modelo;

import com.conexion.Conexion;
import com.modelo.Contrato;
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
public class controladorContrato {

    Conexion conexion = new Conexion();

    public controladorContrato() {
    }

    public boolean crearContrato(Contrato contrato) {
        boolean estado = false;
        try {
            String sql = "INSERT INTO CONTRATOS VALUES("
                    + 0 + ",'"
                    + contrato.getFechaIngreso() + "','"
                    + contrato.getFechaSalida() + "','"
                    + contrato.getRelacionLaboral() + "','"
                    + contrato.getCargo() + "',"
                    + contrato.getSueldo() + ","
                    + contrato.isPeriodoPrueba() + ","
                    + contrato.getEmpresa().getCodigo() + ","
                    + contrato.getTrabajador().getCodigo()
                    + ")";
            PreparedStatement ps = conexion.getConeConnection().prepareStatement(sql);
            ps.execute();
            estado = true;
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error al crear el contrato " + e.getLocalizedMessage());
            estado = false;
        } finally {
            return estado;
        }
    }

    public Contrato buscarContrato(Trabajador trabajador, int empId) {
        Contrato contrato = new Contrato();
        Trabajador trabEncontrado = new Trabajador();
        Empresa empresa = new Empresa();
        try {
            String sql = "SELECT C.con_id, C.CON_FECHA_INGRESO, C.CON_FECHA_SALIDA, C.CON_RELACION_LABORAL, C.CON_CARGO, C.CON_SUELDO, C.CON_PERIODO_PRUEBA "
                    + "FROM PERSONAS P, EMPRESAS E, CONTRATOS C"
                    + "WHERE PER_IDENTIFICACION ='" + trabajador.getIdentificacion() + "'"
                    + " OR CONCAT(PER_NOMBRE,' ',PER_APELLIDO)= '" + trabajador.getNombre() + " " + trabajador.getAplellido() + "' AND "
                    + "PER_ID=CON_PER_ID AND emp_id=" + empId + " AND con_emp_id=emp_id"
                    + ");";
            Connection conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                contrato.setCodigo(rs.getInt(1));
                contrato.setFechaIngreso(rs.getString(2));
                contrato.setFechaSalida(rs.getString(3));
                contrato.setRelacionLaboral(rs.getString(4));
                contrato.setCargo(rs.getString(5));
                contrato.setSueldo(rs.getDouble(6));
                contrato.setPeriodoPrueba(rs.getBoolean(7));
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Se ha generado un error en la busqueda " + e.getLocalizedMessage());
            contrato = null;
        } finally {
            return contrato;
        }
    }

    /**
     *
     * @param codigoContrato id del numero de contrato
     * @return mayor a cero si se realizo correctamente
     */
    public int eliminarContrato(int codigoContrato) {
        int nFilas = 0;
        try {
            String sql = "DELETE CONTRATOS WHERE CON_ID=" + codigoContrato;
            Connection conn = conexion.getConeConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            nFilas = ps.executeUpdate();
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Se ha generado un error al eliminar el contrato " + e.getLocalizedMessage());
            nFilas = 0;
        } finally {
            return nFilas;
        }
    }

    public int actualizarContrato(Contrato contrato) {
        int nfilas = 0;
        try {
            String sql = "UPDATE CONTRATOS "
                    + "SET CON_FECHA_INGRESO = '" + contrato.getFechaIngreso() + "',"
                    + "CON_FECHA_SALIDA='" + contrato.getFechaSalida() + "',"
                    + "CON_RELACION_LABORAL='" + contrato.getRelacionLaboral() + "',"
                    + "CON_CARGO='" + contrato.getCargo() + "',"
                    + "CON_SUELDO=" + contrato.getSueldo() + ","
                    + "CON_PERIODO_PRUEBA=" + contrato.isPeriodoPrueba()
                    + "";
            Connection conn = conexion.getConeConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            nfilas = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Se ha generado un error al actualizar el contrato " + e.getLocalizedMessage());
            nfilas = 0;
        } finally {
            return nfilas;
        }
    }

    public List<Contrato> listarContrato(int empId) {
        List<Contrato> contratos = new ArrayList<Contrato>();
        try {
            String sql = "SELECT C.con_id, C.CON_FECHA_INGRESO, C.CON_FECHA_SALIDA, C.CON_RELACION_LABORAL, C.CON_CARGO, C.CON_SUELDO, C.CON_PERIODO_PRUEBA "
                    + "FROM PERSONAS P, EMPRESAS E, CONTRATOS C"
                    + "WHERE PER_ID=CON_PER_ID AND emp_id=" + empId + " AND con_emp_id=emp_id"
                    + ");";
            Connection conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Contrato contrato=new Contrato();
                
                contrato.setCodigo(rs.getInt(1));
                contrato.setFechaIngreso(rs.getString(2));
                contrato.setFechaSalida(rs.getString(3));
                contrato.setRelacionLaboral(rs.getString(4));
                contrato.setCargo(rs.getString(5));
                contrato.setSueldo(rs.getDouble(6));
                contrato.setPeriodoPrueba(rs.getBoolean(7));
                
                contratos.add(contrato);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Se ha generado un error al listar los contratos "+e.getLocalizedMessage());
        }finally{
            return contratos;
        }
    }
}
