package dev.mamkd.clases_guia_1_1_4.caso9;

public class BusEscolar {
    private int capacidad;
    private String recorrido;
    private String estado;
    private String rut_conductor;
    private String patente;

    public BusEscolar(int capacidad, String recorrido, String estado,String rut_conductor, String patente) {
        this.capacidad = capacidad;
        this.recorrido = recorrido;
        this.estado = estado;
        this.rut_conductor = rut_conductor;
        this.patente = patente;
    }

    public String get_estado() {
        return estado;
    }

    public void cambiar_estado(String nuevo_estado) {
        estado = nuevo_estado;
    }

    public void cambiar_conductor(String rut_nuevo_conductor) {
        rut_conductor = rut_nuevo_conductor;
    }
}
