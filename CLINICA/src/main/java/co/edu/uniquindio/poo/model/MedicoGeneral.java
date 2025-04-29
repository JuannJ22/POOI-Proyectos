package co.edu.uniquindio.poo.model;

public class MedicoGeneral extends Personal{
    private String especialidad;

    public MedicoGeneral(String nombre, String cedula, String direccion, String telefono, String especialidad) {
        super(nombre, cedula, direccion, telefono);
        this.especialidad = especialidad;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
}
