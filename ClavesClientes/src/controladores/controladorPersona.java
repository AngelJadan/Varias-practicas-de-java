/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import clases.Persona;
import com.sun.javafx.collections.MapAdapterChange;
import java.util.HashMap;
import java.sql.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author Angel
 */
public class controladorPersona {

    Connection conexion;
    Statement sentencia;
    ResultSet resultados;

    String drivers = "sun.jdbc.odbc.JdbcOdbcDriver";
    String url = "jbbc:odbc:AliasPunto2";
    String username = "PUBLIC";
    String pasword = "PUBLIC";
    
    private Persona persona;

    HashMap<Integer, Persona> mapa = new HashMap<>();

    public controladorPersona(Persona persona) {
        this.persona = persona;
    }

    public void crear(int codigo, Persona persona) {
        mapa.put(codigo, persona);
    }

}
