/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author josem
 */
public class Conexion {
    
    Connection cx;

    public Connection  Conexion() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            cx = DriverManager.getConnection("jdbc:mysql://localhost/bb_sushi","root","");
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cx;
    }

}


   

