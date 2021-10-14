/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author angel
 */
public class Conexion {

    public Conexion() {
    }
    
    public static Connection getConection() throws Exception{
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            
            Connection con=DriverManager.getConnection("jdbc:hsqldb:file:resouce/DBJadanAngel","SA","");
            System.out.println(con);
            System.out.println("Conectado");
            return con;
            
        } catch (Exception e) {
            System.out.println("Error al conectar "+e.getMessage());
            e.getStackTrace();
            throw new Exception(e);
        }
        
    }
    
    public static void close(Connection con){
        try {
            con.close();
        } catch (Exception e) {
        }
    }
    
}
