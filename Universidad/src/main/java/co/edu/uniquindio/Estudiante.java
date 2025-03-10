package co.edu.uniquindio;

public class Estudiante {
    private String nombre;
    private int edad;
    private String ID;


    public Estudiante(String nombre, int edad, String ID) {
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
            }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ID='" + ID + '\'' +
                '}';
    }
}
