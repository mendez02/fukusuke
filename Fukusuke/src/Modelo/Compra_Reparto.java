/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author LC1300XXXX
 */
public class Compra_Reparto {
    
    private Integer id_reparto;
    private String  direccion;
    private Integer costo_total;
    private String usuario;
    private String detalle_pedido;
    private String run;

    public Compra_Reparto() {
    }

    public Compra_Reparto(Integer id_reparto, String direccion, Integer costo_total, String usuario, String detalle_pedido, String run) {
        this.id_reparto = id_reparto;
        this.direccion = direccion;
        this.costo_total = costo_total;
        this.usuario = usuario;
        this.detalle_pedido = detalle_pedido;
        this.run = run;
    }

    public Integer getId_reparto() {
        return id_reparto;
    }

    public void setId_reparto(Integer id_reparto) {
        this.id_reparto = id_reparto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(Integer costo_total) {
        this.costo_total = costo_total;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDetalle_pedido() {
        return detalle_pedido;
    }

    public void setDetalle_pedido(String detalle_pedido) {
        this.detalle_pedido = detalle_pedido;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }
    
    
}
