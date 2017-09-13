/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author LC1300XXXX
 */
public class Compra_RepartoDAO {

    Conexion cx;

    public Compra_RepartoDAO() {

        cx = new Conexion();

    }

    public String insertReparto(Integer id_reparto, String direccion, Integer costo_total, String usuario, String detalle_pedido, String run) {

        String respuestaRegistro = null;

        try {
            Connection con = cx.Conexion();
            PreparedStatement ps = con.prepareStatement("insert into compra_reparto(id_reparto,direccion,costo_total,usuario,detalle_pedido,run)values(?,?,?,?,?,?)");
              
            int numeroFilas=ps.executeUpdate();
            if ( numeroFilas>0) {
                respuestaRegistro = "Registro Exitoso...";
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            return respuestaRegistro;
    }
}