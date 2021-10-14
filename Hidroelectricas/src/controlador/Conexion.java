/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Angel
 */
public class Conexion {

    public static Connection getConnection() {
        try {

            Class.forName("org.hsqldb.jdbcDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:hsqldb:file:bd\\resources\\dbhidroelectricas", "admi", "admi");
            //Class.forName("com.mysql.jdbc.Driver");
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname",
            //        "root", "dbpass");
            System.out.println("Conectado");
            return con;
        } catch (Exception ex) {
            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
            
            return null;
        }
    }

    public static void close(Connection con) {
        try {
            con.close();
            System.out.println("Conexion terminada");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
