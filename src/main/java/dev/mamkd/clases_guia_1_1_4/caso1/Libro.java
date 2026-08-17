package dev.mamkd.clases_guia_1_1_4.caso1;

public class Libro {
    private String titulo;
    private String[] autores;
    private String isbn;
    private int num_paginas;
    private boolean disponibilidad;
    private String id_libro;

    public Libro(String titulo, String[] autores, String isbn, int num_paginas, String id_libro) {
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
        this.num_paginas = num_paginas;
        this.id_libro = id_libro;
        this.disponibilidad = true;
    }

    public String get_titulo() {
        return titulo;
    }

    public String[] get_autores() {
        return autores;
    }

    public boolean get_disponibilidad() {
        return disponibilidad;
    }

    public void cambiar_estado() {
        disponibilidad = !disponibilidad;
    }
}
