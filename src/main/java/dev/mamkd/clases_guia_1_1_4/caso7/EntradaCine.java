package dev.mamkd.clases_guia_1_1_4.caso7;

import java.sql.Time;
import java.util.Date;

public class EntradaCine {
    private String id_entrada;
    private String rut_comprador;
    private Date fecha_compra;
    private Date fecha_funcion;
    private Time hora_funcion;
    private String nombre_pelicula;
    private String asiento;
    private boolean validez;

    public EntradaCine(String id_entrada, String rut_comprador, Date fecha_compra, Date fecha_funcion, Time hora_funcion, String nombre_pelicula, String asiento) {
        this.id_entrada = id_entrada;
        this.rut_comprador = rut_comprador;
        this.fecha_compra = fecha_compra;
        this.fecha_funcion = fecha_funcion;
        this.hora_funcion = hora_funcion;
        this.nombre_pelicula = nombre_pelicula;
        this.asiento = asiento;
        this.validez = true;
    }

    public String get_rut_comprador() {
        return rut_comprador;
    }

    public String get_nombre_pelicula() {
        return nombre_pelicula;
    }

    public void expirar_entrada() {
        validez = false;
    }
}
