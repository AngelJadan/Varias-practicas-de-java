/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conexion;

import java.sql.*;
/**
 *
 * @author EstAngelMesiasJadanC
 */
public class Conexion {
    
    private static Connection conn=null;
    private static String url="jdbc:mysql://localhost:3306/rol_pagosdb?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC";
    private static String usuario="Angel";
    private static String password="Angel";
    
    public static Connection getConeConnection(){
        try {
            conn=DriverManager.getConnection(url,usuario,password);
            
        } catch (SQLException e) {
            System.out.println("Error "+e.getLocalizedMessage());
        }finally{
            return conn;
        }
    }
    public static void cerrarConexion()throws SQLException{
        conn.close();
    }
}
