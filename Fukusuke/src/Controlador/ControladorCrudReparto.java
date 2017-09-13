/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Compra_RepartoDAO;
import Vista.JReparto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author LC1300XXXX
 */

public class ControladorCrudReparto implements ActionListener {

    JReparto vistaReparto = new JReparto();
    Compra_RepartoDAO modeloReparto = new Compra_RepartoDAO();

    public ControladorCrudReparto(JReparto vistaReparto, Compra_RepartoDAO modeloReparto) {
        this.vistaReparto = vistaReparto;
        this.modeloReparto = modeloReparto;
        this.vistaReparto.btnRegistrar2.addActionListener(this);

    }

    public void InicializarCrud() {

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistaReparto.btnRegistrar2) {
            Integer id_reparto = Integer.parseInt(vistaReparto.txtIdReparto1.getText());
            String direccion = vistaReparto.txtDireccion.getText();
            Integer costo_total = Integer.parseInt(vistaReparto.txtCosto1.getText());
            String usuario = vistaReparto.txtUsuario1.getText();
            String detalle_pedido = vistaReparto.txtDetalle1.getText();
            String run = vistaReparto.txtRun.getText();

            String respuestaRegistro = modeloReparto.insertReparto(id_reparto, direccion, costo_total, usuario, detalle_pedido, run);

            if (respuestaRegistro != null) {

                JOptionPane.showMessageDialog(null, respuestaRegistro);
            } else {
                JOptionPane.showMessageDialog(null, "REGISTRO ERRONEO");
            }

        }
    }


}

