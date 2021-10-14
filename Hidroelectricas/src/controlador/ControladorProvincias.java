/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Provincia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angel
 */
public class ControladorProvincias {

    public void insertar(Provincia provincia) {
        Connection con = null;
        String sql = "INSERT INTO LOCALIDADES (LOC_ID,"
                + "LOC_NOMBRE) "
                + "VALUES (?,?);";
        try {
            con = Conexion.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, provincia.getCodigo());
            ps.setString(2, provincia.getNombre());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
    }

    public Provincia buscar(int codigo) {
        Connection con = null;
        String sql = "SELECT LOC_ID, LOC_NOMBRE "
                + "FROM LOCALIDADES "
                + "WHERE LOC_ID=" + codigo;

        try {
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Provincia prov = new Provincia();
            prov.setCodigo(rs.getInt("loc_id"));
            prov.setNombre(rs.getString("loc_nombre").trim());

            return prov;

        } catch (Exception e) {
            e.getLocalizedMessage();
        }
        return null;
    }

    public boolean eliminar(int codigo) {

        Connection con = null;
        String sql = "DELETE FROM LOCALIDADES "
                + "WHERE LOC_ID = " + codigo;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            return true;

        } catch (Exception e) {
            e.getLocalizedMessage();
            System.out.println("No se ha podido eliminar");
        }
        return false;

    }

    public List<Provincia> listarProvincia() {

        List<Provincia> lista = new ArrayList<Provincia>();

        Connection con = null;
        String sql = "SELECT LOC_ID, LOC_NOMBRE "
                + "FROM LOCALIDADES;";

        System.out.println(sql);
        try {
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Provincia pro = new Provincia();

                pro.setCodigo(rs.getInt("LOC_ID"));
                pro.setNombre(rs.getString("LOC_NOMBRE").trim());
                lista.add(pro);

            }
        } catch (Exception e) {
            e.getLocalizedMessage();
        } finally {
            Conexion.close(con);
        }
        return lista;
    }
}
