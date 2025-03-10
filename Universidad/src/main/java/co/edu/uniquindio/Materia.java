package co.edu.uniquindio;
import java.util.List;


public class Materia {
    private String nombre;
    private String codigo;
    private Docente docente;
    private List<Estudiante> listEstudiantes;

    public Materia(String nombre, String codigo, Docente docente, List<Estudiante> listEstudiantes) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.docente = docente;
        this.listEstudiantes = listEstudiantes;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public List<Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }

    public void setListEstudiantes(List<Estudiante> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", docente=" + docente +
                ", listEstudiantes=" + listEstudiantes +
                '}';
    }
}
