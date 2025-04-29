package co.edu.uniquindio.poo.model;

public class TecnicoEsp {
    private String nombre;
    private String codigo;
    private String especialidad;
    private String zonaOperacionAsignada;

    public TecnicoEsp(String nombre, String codigo, String especialidad, String zonaOperacionAsignada) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.zonaOperacionAsignada = zonaOperacionAsignada;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getZonaOperacionAsignada() {
        return zonaOperacionAsignada;
    }

    public void setZonaOperacionAsignada(String zonaOperacionAsignada) {
        this.zonaOperacionAsignada = zonaOperacionAsignada;
    }
}
