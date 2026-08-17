package dev.mamkd.clases_guia_1_1_4.caso5;

public class Mascota {
    private String nombre;
    private String especie;
    private String rut_duenio;
    private String motivo_visita;
    private boolean en_tratamiento;

    public Mascota(String nombre, String especie, String rut_duenio, String motivo_visita) {
        this.nombre = nombre;
        this.especie = especie;
        this.rut_duenio = rut_duenio;
        this.motivo_visita = motivo_visita;
        this.en_tratamiento = true;
    }

    public String get_nomre() {
        return nombre;
    }

    public String get_rut_duenio() {
        return rut_duenio;
    }

    public void curar() {
        en_tratamiento = false;
    }
}
