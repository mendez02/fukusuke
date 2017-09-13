/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.JProducto;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author josem
 */
public class ProductoDAO {

    Conexion cx;
    JProducto producto;

    public ProductoDAO() {
        cx = new Conexion();
    }

    public String insertProducto(String id, String nombre, String descripcion, String cantidad, String precio, String categoria) {

        String respuestaRegistro = null;
        try {

            Connection con = cx.Conexion();
            //CallableStatement ps=con.prepareCall("{call sp_insertProducto(?,?,?,?,?,?)}");
            PreparedStatement ps=con.prepareStatement("insert into producto(id,nombre,descripcion,cantidad,precio,categoria)values(?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setString(2, nombre);
            ps.setString(3, descripcion);
            ps.setString(4, cantidad);
            ps.setString(5, precio);
            ps.setString(6, categoria);

            int numeroFilas = ps.executeUpdate();
            if (numeroFilas > 0) {
                respuestaRegistro = "Registro exitoso";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

        return respuestaRegistro;

    }

    public ArrayList<Producto> listProducto() {

        ArrayList listaProducto = new ArrayList();
        Producto producto;
        try {
            Connection con = cx.Conexion();
            PreparedStatement ps = con.prepareStatement("select * from producto");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                producto = new Producto();
                producto.setId(rs.getString(1));
                producto.setNombre(rs.getString(2));
                producto.setDescripcion(rs.getString(3));
                producto.setCantidad(rs.getString(4));
                producto.setPrecio(rs.getString(5));
                producto.setCategoria(rs.getString(6));
                listaProducto.add(producto);
            }
        } catch (Exception e) {
        }
        return listaProducto;
    }
}