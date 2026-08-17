package dev.mamkd.clases_guia_1_1_4.caso8;

public class Paciente {
    private String rut_paciente;
    private String nombre_paciente;
    private int edad;
    private String unidad;

    public Paciente(String rut_paciente, String nombre_paciente, int edad, String unidad) {
        this.rut_paciente = rut_paciente;
        this.nombre_paciente = nombre_paciente;
        this.edad = edad;
        this.unidad = unidad;
    }

    public String get_rut_paciente() {
        return rut_paciente;
    }

    public String get_nombre_paciente() {
        return nombre_paciente;
    }

    public String get_unidad() {
        return unidad;
    }
}
