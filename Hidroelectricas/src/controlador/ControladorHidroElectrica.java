/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Hidroelectrica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Angel
 */
public class ControladorHidroElectrica {
        

    public ControladorHidroElectrica() {
    }

    public void insertar(Hidroelectrica hid) {
        Connection con = null;
        String sql = "INSERT INTO HIDROELECTRICAS ("
                + "HID_ID, "
                + "HID_NOMBRE,"
                + "HID_RIO,"
                + "HID_LONGITUD,"
                + "HID_LATITUD,"
                + "HID_POT_NOMINAL,"
                + "HID_CAIDA_NETA,"
                + "HID_SALTO,"
                + "HID_CAUDAL,"
                + "HID_INVERSION,"
                + "HID_FACTOR_PLANTA,"
                + "HID_TURBINA,"
                + "HID_LOC_ID"
                + "      ) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            con = Conexion.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, hid.getCodigo());
            ps.setString(2, hid.getNombre());
            ps.setString(3, hid.getEmpresa());
            ps.setString(4, hid.getRio());
            ps.setString(5, hid.getLongitud());
            ps.setString(6, hid.getLatitud());
            ps.setString(7, hid.getPotencian());
            ps.setString(8, hid.getPotenciae());
            ps.setString(9, hid.getCaida());
            ps.setString(10, hid.getSalto());
            ps.setString(11, hid.getCaudal());
            ps.setString(12, hid.getInversion());
            ps.setString(13, hid.getFactor());
            ps.setString(14, hid.getTurbina());
            ps.setInt(15, hid.getIdProvincia());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexion.close(con);
        }
    }

    public Hidroelectrica buscar(int codigo) {
        Connection con = null;
        String sql = "SELECT * "
                + "FROM HIDROELECTRICAS HID"
                + "WHERE HID.HID_ID=" + codigo;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Hidroelectrica hid = new Hidroelectrica();

            hid.setCodigo(rs.getInt("HID_ID"));
            hid.setNombre(rs.getString("HID_NOMBRE").trim());
            hid.setEmpresa(rs.getString("HID_EMPRESA").trim());
            hid.setRio(rs.getString("HID_RIO").trim());
            hid.setLongitud(rs.getString("HID_LONGITUD").trim());
            hid.setLatitud(rs.getString("HID_LATITUD").trim());
            hid.setPotencian(rs.getString("HID_POT_NOMINAL").trim());
            hid.setPotenciae(rs.getString("HID_POT_EFECTIVA").trim());
            hid.setCaida(rs.getString("HID_CAIDA_NETA").trim());
            hid.setSalto(rs.getString("HID_SALTO").trim());
            hid.setCaudal(rs.getString("HID_CAUDAL").trim());
            hid.setInversion(rs.getString("HID_INVERSION").trim());
            hid.setFactor(rs.getString("HID_FACTOR_PLANTA").trim());
            hid.setTurbina(rs.getString("HID_TURBINA").trim());
            hid.setIdProvincia(rs.getInt("HID_LOC_ID"));

            return hid;

        } catch (Exception e) {
            e.getLocalizedMessage();
        }
        return null;
    }

    public boolean eliminarHidro(int codigo) {

        Connection con = null;
        String sql = "DELETE *"
                + "FROM HIDROELECTRICAS "
                + "WHERE HID_ID=" + codigo;
        try {
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            return true;

        } catch (Exception e) {
            e.getLocalizedMessage();
            
        }
        return false;

    }

    public List<Hidroelectrica> listarHidroelectrica() {
        
        List<Hidroelectrica> lista = new ArrayList<Hidroelectrica>();
        
        Connection con = null;
        String sql = "SELECT HID_ID, HID_NOMBRE, HID_EMPRESA, HID_RIO, "
                + "HID_LONGITUD, HID_LATITUD, HID_POT_NOMINAL,"
                + "HID_POT_EFECTIVA, HID_CAIDA_NETA,HID_SALTO,HID_CAUDAL,HID_INVERSION,HID_FACTOR_PLANTA,HID_TURBINA,HID_LOC_ID"
                + " FROM HIDROELECTRICAS;";
        
        
        
        try {
            con = Conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                System.out.println(sql);
                System.out.println("Corriendo");
                Hidroelectrica hid = new Hidroelectrica();

                hid.setCodigo(rs.getInt("HID_ID"));
                hid.setNombre(rs.getString("HID_NOMBRE").trim());
                hid.setEmpresa(rs.getString("HID_EMPRESA").trim());
                hid.setRio(rs.getString("HID_RIO").trim());
                hid.setLongitud(rs.getString("HID_LONGITUD").trim());
                hid.setLatitud(rs.getString("HID_LATITUD").trim());
                hid.setPotencian(rs.getString("HID_POT_NOMINAL").trim());
                hid.setPotenciae(rs.getString("HID_POT_EFECTIVA").trim());
                hid.setCaida(rs.getString("HID_CAIDA_NETA").trim());
                hid.setSalto(rs.getString("HID_SALTO").trim());
                hid.setCaudal(rs.getString("HID_CAUDAL").trim());
                hid.setInversion(rs.getString("HID_INVERSION").trim());
                hid.setFactor(rs.getString("HID_FACTOR_PLANTA").trim());
                hid.setTurbina(rs.getString("HID_TURBINA").trim());
                hid.setIdProvincia(rs.getInt("HID_LOC_ID"));

                lista.add(hid);
                
            }

        } catch (Exception e) {
            e.getLocalizedMessage();
            return lista;
        } finally {
            Conexion.close(con);
            return lista;
        }
    }

}
