/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.ProductoDAO;
//import Vista.JAdmin;
import Vista.JProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josem
 */
public class ControladorCrudProducto implements ActionListener {

    JProducto vistaCrud = new JProducto();
    ProductoDAO modeloCrud = new ProductoDAO();
   // JAdmin vistaA = new JAdmin();


    public ControladorCrudProducto(JProducto vistaCrud, ProductoDAO modeloCrud){
//JAdmin vistaA) {
        this.modeloCrud = modeloCrud;
        this.vistaCrud = vistaCrud;
      //  this.vistaA=vistaA;
        this.vistaCrud.btnRegistrar.addActionListener(this);
        this.vistaCrud.btnCancelar.addActionListener(this);
        this.vistaCrud.btnRegistrados.addActionListener(this);
       // this.vistaA.btnProducto.addActionListener(this);
    }

    public void LlenarTable(JTable TablaD) {

        DefaultTableModel tabla = new DefaultTableModel();
        TablaD.setModel(tabla);

        tabla.addColumn("ID");
        tabla.addColumn("NOMBRE");
        tabla.addColumn("DESCRIPCION");
        tabla.addColumn("CANTIDAD");
        tabla.addColumn("PRECIO ");
        tabla.addColumn("CATEGORIA");

        Object[] columna = new Object[6];
        int numeroRegistros = modeloCrud.listProducto().size();

        for (int i = 0; i < numeroRegistros; i++) {
            columna[0] = modeloCrud.listProducto().get(i).getId();
            columna[1] = modeloCrud.listProducto().get(i).getNombre();
            columna[2] = modeloCrud.listProducto().get(i).getDescripcion();
            columna[3] = modeloCrud.listProducto().get(i).getCantidad();
            columna[4] = modeloCrud.listProducto().get(i).getPrecio();
            columna[5] = modeloCrud.listProducto().get(i).getCategoria();
            tabla.addRow(columna);
        }

    }

    public void InicializarCrud() {

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistaCrud.btnRegistrar) {
            String id = vistaCrud.txtId.getText();
            String nombre = vistaCrud.txtNombre.getText();
            String descripcion = vistaCrud.txtDesc.getText();
            String cantidad = vistaCrud.txtCantidad.getText();
            String precio = vistaCrud.txtCantidad.getText();
            String categoria = vistaCrud.txtCategoria.getSelectedItem().toString();

            String respuestRegistro = modeloCrud.insertProducto(id, nombre, descripcion, cantidad, precio, categoria);

            if (respuestRegistro != null) {
                JOptionPane.showMessageDialog(null, respuestRegistro);
            } else {
                JOptionPane.showMessageDialog(null, "Registro Erroneo");
            }
        }
       if (e.getSource() == vistaCrud.btnRegistrados) {
  LlenarTable(vistaCrud.TablaPR);
        }
    }
}


