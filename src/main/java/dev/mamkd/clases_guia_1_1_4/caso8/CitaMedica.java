package dev.mamkd.clases_guia_1_1_4.caso8;

import java.sql.Time;
import java.util.Date;

public class CitaMedica {
    private Date fecha;
    private Time hora;
    private String estado;
    private String rut_medico;
    private String nombre_medico;
    private String rut_paciente;
    private String nombre_paciente;

    public CitaMedica(Date fecha, Time hora, String rut_medico, String nombre_medico, String rut_paciente, String nombre_paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.estado = "pendiente";
        this.rut_medico = rut_medico;
        this.nombre_medico = nombre_medico;
        this.rut_paciente = rut_paciente;
        this.nombre_paciente = nombre_paciente;
    }

    public void terminar_cita() {
        estado = "terminada";
    }

    public void cancelar_cita() {
        estado = "cancelada";
    }

    public String get_nombre_medico() {
        return nombre_medico;
    }
}
