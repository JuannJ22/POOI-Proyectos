package co.edu.uniquindio.poo.model;

public class Clinica {
    private String nombre;
    private String nit;

    public Clinica(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Clinica{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                '}';
    }
}
