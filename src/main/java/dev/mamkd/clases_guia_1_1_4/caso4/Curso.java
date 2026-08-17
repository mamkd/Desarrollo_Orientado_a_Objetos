package dev.mamkd.clases_guia_1_1_4.caso4;

public class Curso {
    private String sigla;
    private String nombre_curso;
    private String nombre_profesor;
    private int cantidad_estudiantes;

    public Curso(String sigla, String nombre_curso, int cantidad_estudiantes) {
        this.sigla = sigla;
        this.nombre_curso = nombre_curso;
        this.cantidad_estudiantes = cantidad_estudiantes;
        this.nombre_profesor = null;
    }

    public String get_sigla() {
        return sigla;
    }

    public String get_nombre_curso() {
        return nombre_curso;
    }

    public void asignar_profesor(String nombre_profesor) {
        this.nombre_profesor = nombre_profesor;
    }
}
