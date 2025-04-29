package co.edu.uniquindio.poo.model;

public class Especialista extends Personal {
    private int aniosExperiencia;
    private Especialidad especialidad;

    public Especialista(String nombre, String apellido, String direccion, String telefono, int aniosExperiencia) {
        super(nombre, apellido, direccion, telefono);
        this.aniosExperiencia = aniosExperiencia;
        this.especialidad = especialidad;

    }
}
