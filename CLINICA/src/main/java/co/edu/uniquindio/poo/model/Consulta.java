package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Consulta {
    protected Paciente paciente;
    protected String id;
    protected Personal medico;
    protected String fechaConsulta;


    public Consulta(Paciente paciente, String id, Personal medico, String fechaConsulta) {
        this.paciente = paciente;
        this.id = id;
        this.medico = medico;
        this.fechaConsulta = fechaConsulta;

    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Personal getMedico() {
        return medico;
    }

    public void setMedico(Personal medico) {
        this.medico = medico;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public abstract double calcularCostoTotal();
}