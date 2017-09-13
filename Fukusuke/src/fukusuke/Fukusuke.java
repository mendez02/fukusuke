/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fukusuke;

import Controlador.ControladorCrudProducto;
import Controlador.ControladorCrudReparto;
import Modelo.Compra_RepartoDAO;
import Modelo.ProductoDAO;
import Vista.JProducto;
import Vista.JReparto;

/**
 *
 * @author josem
 */
public class Fukusuke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //vistas
        JReparto vistaReparto=new JReparto();
        JProducto vistac = new JProducto();
        
        //Modelos
        ProductoDAO modeloc = new ProductoDAO();
        Compra_RepartoDAO modeloReparto=new Compra_RepartoDAO();
        
        
        //Controladores
        ControladorCrudProducto controlaC = new ControladorCrudProducto(vistac, modeloc);
        ControladorCrudReparto reparto=new ControladorCrudReparto(vistaReparto, modeloReparto);

        
        //hacer visible
        vistaReparto.setVisible(true);
        vistac.setVisible(false);
        vistac.setLocationRelativeTo(null);
    }

}
