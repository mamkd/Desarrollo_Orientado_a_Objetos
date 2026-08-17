package dev.mamkd.clases_guia_1_1_4.caso10;

public class Socio {
    private String rut_socio;
    private String tipo_plan;
    private String vigencia_pagos;
    private String frecuencia_asistencia;

    public Socio(String rut_socio, String tipo_plan, String vigencia_pagos, String frecuencia_asistencia) {
        this.rut_socio = rut_socio;
        this.tipo_plan = tipo_plan;
        this.vigencia_pagos = vigencia_pagos;
        this.frecuencia_asistencia = frecuencia_asistencia;
    }

    public String get_rut_socio() {
        return rut_socio;
    }

    public String get_tipo_plan() {
        return tipo_plan;
    }

    public void cambiar_tipo_plan(String nuevo_tipo_plan) {
        tipo_plan = nuevo_tipo_plan;
    }
}
