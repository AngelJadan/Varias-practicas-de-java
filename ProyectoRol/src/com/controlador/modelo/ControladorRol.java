/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador.modelo;

import com.conexion.Conexion;
import com.modelo.Empresa;
import com.modelo.IngresoGravado;
import com.modelo.IngresoNoGravado;
import com.modelo.RepresentanteLegal;
import com.modelo.RolDePagos;
import com.modelo.Sucursal;
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
public class ControladorRol {

    Conexion conexion = new Conexion();

    public ControladorRol() {
    }

    public boolean crearRolDePagos(RolDePagos rolDePagos, Empresa empresa, RepresentanteLegal representanteLegal, IngresoGravado ingresoGravado, IngresoNoGravado ingresoNoGravado) {
        boolean estdo = false;
        try {
            String sql = "INSERT INTO ROLES VALUES("
                    + 0 + ","
                    + empresa.getCodigo() + ","
                    + representanteLegal.getCodigo() + ","
                    + ingresoGravado.getSueldoNominal()
                    + rolDePagos.getDia() + ","
                    + ingresoGravado.getValorHorasExtras() + ","
                    + ingresoGravado.getValorHorasSuplementarias() + ","
                    + ingresoGravado.getValorHorasNocturnas() + ","
                    + ingresoGravado.getValorComision() + ","
                    + ingresoGravado.getTotalIngresoGravado() + ","
                    + ingresoNoGravado.getDecimoCuarto() + ",'"
                    + ingresoNoGravado.getTipoDecimoCuarto() + "',"
                    + ingresoNoGravado.getDecimoTercero() + ",'"
                    + ingresoNoGravado.getTipoDecimoTercero() + "',"
                    + ingresoNoGravado.getFondosReserva() + ",'"
                    + ingresoNoGravado.getTipoFondosReserva() + "',"
                    + ingresoNoGravado.getAlimentacion() + ","
                    + ingresoNoGravado.getTransporte() + ","
                    + ingresoNoGravado.getTotalIngresoNoGravado() + ","
                    + rolDePagos.getAporteSeguroSocial() + ","
                    + rolDePagos.getDescuento() + ","
                    + rolDePagos.getSueldoLiquido()
                    + ");";
            PreparedStatement ps = conexion.getConeConnection().prepareStatement(sql);
            ps.execute();
            estdo = true;
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Se ha generado un error al crear el rol " + e.getLocalizedMessage());
            estdo = false;
        } finally {
            return estdo;
        }
    }

    public RolDePagos buscarRol(int codigo) {

        try {
            String sql = "SELECT * FROM ROLES WHERE rol_id = " + codigo + ";";
            Connection conn = null;
            conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            RolDePagos rolDePagos = new RolDePagos();
            while (rs.next()) {
                rolDePagos.setCodigo(rs.getInt(1));
                Trabajador trabajador = new Trabajador();
                trabajador.setCodigo(rs.getInt(2));
                rolDePagos.setTrabajador(trabajador);
                Sucursal sucursal = new Sucursal();
                sucursal.setCodigo(rs.getInt(3));
                rolDePagos.setSucursal(sucursal);
                RepresentanteLegal repLegal = new RepresentanteLegal();
                repLegal.setCodigo(rs.getInt(4));
                rolDePagos.setRepresentanteLegal(repLegal);
                IngresoGravado ingresoGravado = new IngresoGravado();
                ingresoGravado.setSueldoNominal(rs.getDouble(5));
                ingresoGravado.setDiasAsistidos(rs.getInt(6));
                ingresoGravado.setValorHorasExtras(rs.getDouble(7));
                ingresoGravado.setValorHorasSuplementarias(rs.getDouble(8));
                ingresoGravado.setValorHorasNocturnas(rs.getDouble(9));
                ingresoGravado.setValorComision(rs.getDouble(10));
                ingresoGravado.setTotalIngresoGravado(rs.getDouble(11));
                rolDePagos.setIngresoGravado(ingresoGravado);
                IngresoNoGravado ingresoNoGravado = new IngresoNoGravado();
                ingresoNoGravado.setDecimoCuarto(rs.getDouble(12));
                ingresoNoGravado.setTipoDecimoCuarto(rs.getString(13));
                ingresoNoGravado.setDecimoTercero(rs.getDouble(14));
                ingresoNoGravado.setDecimoTercero(rs.getDouble(15));
                ingresoNoGravado.setTipoDecimoTercero(rs.getString(16));
                ingresoNoGravado.setFondosReserva(rs.getDouble(17));
                ingresoNoGravado.setTipoFondosReserva(rs.getString(18));
                ingresoNoGravado.setAlimentacion(rs.getDouble(19));
                ingresoNoGravado.setTransporte(rs.getDouble(20));
                ingresoNoGravado.setTotalIngresoNoGravado(rs.getDouble(21));
                rolDePagos.setIngresoNoGravado(ingresoNoGravado);
                rolDePagos.setAporteSeguroSocial(rs.getDouble(22));
                rolDePagos.setSueldoLiquido(rs.getDouble(23));
            }
            return rolDePagos;
        } catch (Exception e) {
            System.out.println("Error en consulta de del rol de pagos " + e.getMessage());
            return null;
        } finally {
            try {
                conexion.cerrarConexion();
            } catch (SQLException ex) {
            }
        }
    }

    public boolean eliminarRolDePagos(int codigo) {
        String sql = "DELETE FROM ROLES "
                + "WHERE ROL_ID=" + codigo + ";";
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

    public List<RolDePagos> listarRoles() {
        List<RolDePagos> rolesDePagos = new ArrayList<RolDePagos>();

        try {
            String sql = "SELECT * FROM ROLES, PERSONAS, EMPRESAS, rep_legales WHERE rol_per_id=per_id AND rol_emp_id=emp_id "
                    + "AND rep_legales_rep_id=rep_id;";
            Connection conn = null;
            conn = conexion.getConeConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                RolDePagos rolDePagos = new RolDePagos();
                rolDePagos.setCodigo(rs.getInt(1));
                Trabajador trabajador = new Trabajador();
                trabajador.setCodigo(rs.getInt(2));
                rolDePagos.setTrabajador(trabajador);
                Sucursal sucursal = new Sucursal();
                sucursal.setCodigo(rs.getInt(3));
                rolDePagos.setSucursal(sucursal);
                RepresentanteLegal repLegal = new RepresentanteLegal();
                repLegal.setCodigo(rs.getInt(4));
                rolDePagos.setRepresentanteLegal(repLegal);
                IngresoGravado ingresoGravado = new IngresoGravado();
                ingresoGravado.setSueldoNominal(rs.getDouble(5));
                ingresoGravado.setDiasAsistidos(rs.getInt(6));
                ingresoGravado.setValorHorasExtras(rs.getDouble(7));
                ingresoGravado.setValorHorasSuplementarias(rs.getDouble(8));
                ingresoGravado.setValorHorasNocturnas(rs.getDouble(9));
                ingresoGravado.setValorComision(rs.getDouble(10));
                ingresoGravado.setTotalIngresoGravado(rs.getDouble(11));
                rolDePagos.setIngresoGravado(ingresoGravado);
                IngresoNoGravado ingresoNoGravado = new IngresoNoGravado();
                ingresoNoGravado.setDecimoCuarto(rs.getDouble(12));
                ingresoNoGravado.setTipoDecimoCuarto(rs.getString(13));
                ingresoNoGravado.setDecimoTercero(rs.getDouble(14));
                ingresoNoGravado.setDecimoTercero(rs.getDouble(15));
                ingresoNoGravado.setTipoDecimoTercero(rs.getString(16));
                ingresoNoGravado.setFondosReserva(rs.getDouble(17));
                ingresoNoGravado.setTipoFondosReserva(rs.getString(18));
                ingresoNoGravado.setAlimentacion(rs.getDouble(19));
                ingresoNoGravado.setTransporte(rs.getDouble(20));
                ingresoNoGravado.setTotalIngresoNoGravado(rs.getDouble(21));
                rolDePagos.setIngresoNoGravado(ingresoNoGravado);
                rolDePagos.setAporteSeguroSocial(rs.getDouble(22));
                rolDePagos.setSueldoLiquido(rs.getDouble(23));
                rolesDePagos.add(rolDePagos);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            System.out.println("Error en listar " + e.getMessage());
            return null;
        } finally {
            return rolesDePagos;
        }
    }
}
