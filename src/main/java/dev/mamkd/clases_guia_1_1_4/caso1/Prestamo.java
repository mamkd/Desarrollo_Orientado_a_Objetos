package dev.mamkd.clases_guia_1_1_4.caso1;

import java.util.Date;

public class Prestamo {
    private String id_libro;
    private String rut_prestatario;
    private Date fecha_realizacion;
    private Date fecha_retorno;

    public Prestamo(String id_libro, String rut_prestatario, Date fecha_realizacion, Date fecha_retorno) {
        this.id_libro = id_libro;
        this.rut_prestatario = rut_prestatario;
        this.fecha_realizacion = fecha_realizacion;
        this.fecha_retorno = fecha_retorno;
    }

    public String get_id_libro() {
        return id_libro;
    }

    public String get_rut_destinatario() {
        return rut_prestatario;
    }

    public void renovar(Date nueva_fecha_retorno) {
        fecha_retorno = nueva_fecha_retorno;
    }
}
