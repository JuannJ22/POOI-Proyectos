package co.edu.uniquindio;


public class Estudiante {
    private String numeroIdentificacion;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private int edad;

    public Estudiante(String nombres, String apellidos, String numeroIdentificacion, String correo, String telefono, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
    }
}
