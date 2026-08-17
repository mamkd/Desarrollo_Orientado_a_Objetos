package dev.mamkd.clases_guia_1_1_4.caso4;

public class Estudiante {
    private String rut_estudiante;
    private String nombre_estudiante;
    private String apellido_estudiante;
    private String carrera;
    private int semestre_actual;

    public Estudiante(String rut_estudiante, String nombre_estudiante, String apellido_estudiante, String carrera) {
        this.rut_estudiante = rut_estudiante;
        this.nombre_estudiante = nombre_estudiante;
        this.apellido_estudiante = apellido_estudiante;
        this.carrera = carrera;
        this.semestre_actual = 1;
    }

    public String get_rut_estudiante() {
        return rut_estudiante;
    }

    public String get_nombre_estudiante() {
        return nombre_estudiante;
    }

    public void avanzar_semestre() {
        semestre_actual += 1;
    }
}
