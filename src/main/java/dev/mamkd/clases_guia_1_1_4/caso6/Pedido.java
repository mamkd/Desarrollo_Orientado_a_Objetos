package dev.mamkd.clases_guia_1_1_4.caso6;

import java.util.Date;

public class Pedido {
    private String estado;
    private String rut_repartidor_asignado;
    private String rut_cliente;
    private Date fecha_pedido;
    private String direccion;
    private int total;

    public Pedido(String rut_repartidor_asignado, String rut_cliente, Date fecha_pedido, String direccion, int total) {
        this.estado = "preparando";
        this.rut_repartidor_asignado = rut_repartidor_asignado;
        this.rut_cliente = rut_cliente;
        this.fecha_pedido = fecha_pedido;
        this.direccion = direccion;
        this.total = total;
    }

    public void cambiar_estado(String nuevo_estado) {
        estado = nuevo_estado;
    }

    public String get_direccion() {
        return direccion;
    }

    public String get_rut_cliente() {
        return rut_cliente;
    }
}
