/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author angel
 */
public class ControladorPersona {

    Conexion baseDatos = new Conexion();
    
    public boolean insertar(Persona per){
        Connection con=null;
        String url="INSET INTO PERSONA(CODIGO,NOMBRE,DIRECCION,FECHACREACION,NUMERO)"
                + "VALUES(?,?,?,?,?);";
        try {
            con=baseDatos.getConection();
            
            PreparedStatement ps=con.prepareStatement(url);
            
            ps.setInt(1, per.getCodigo());
            ps.setString(2, per.getNombre());
            ps.setString(3, per.getDireccion());
            ps.setString(4, per.getFechaCreacion());
            ps.setInt(5, per.getNumeroEstuantes());
            

            ps.executeUpdate();
            return true;
            
        } catch (Exception e) {
            System.out.println("Error al insertar datos");
            e.getStackTrace();
            return false;
        }    
    }
    
    public Persona buscar(int codigo){
        Persona pa=new Persona();
        Connection con=null;
        String url="SELECT CODIGO,NOMBRE,DIRECCION,FECHACREACION,NUMERO"
                +"FROM PERSONA"
                +"WHERE CODIGO='"+codigo+"'";
        try {
            con=baseDatos.getConection();
            PreparedStatement ps=con.prepareStatement(url);
            ResultSet rs=ps.executeQuery();
            
            pa.setCodigo(rs.getInt("CODIGO"));
            pa.setNombre(rs.getString("NOMBRE"));
            pa.setDireccion(rs.getString("DIRECCION"));
            pa.setFechaCreacion(rs.getString("FECHACREACION"));
            pa.setNumeroEstuantes(rs.getInt("NUMERO"));
            
            return pa;
            
        }catch(Exception e){
            return null;
        }finally{
            baseDatos.close(con);
        }
        
        
    }
    
    public boolean actulizar(Persona per){
        Connection con=null;
        String url="UPDATE PERSONA,"
                + "SET CODIGO=?,"
                + "NOMBRE=?"
                + "DIRECCION=?"
                + "FECHACREACION=?"
                + "NUMERO=?"
                +"WHERE CODIGO='"+per.getCodigo()+"'";
        try {
            con=baseDatos.getConection();
            
            PreparedStatement ps=con.prepareStatement(url);
            ps.setInt(1, per.getCodigo());
            ps.setString(2, per.getNombre());
            ps.setString(3, per.getDireccion());
            ps.setString(4, per.getFechaCreacion());
            ps.setInt(5, per.getNumeroEstuantes());
            
            int n=ps.executeUpdate();
            if (n==1) {
                return true;
            }
            
        } catch (Exception e) {
            System.out.println("Error al actualizar datos");
            return false;
        }finally{
            baseDatos.close(con);
        }
        return false;
    }
    
}
