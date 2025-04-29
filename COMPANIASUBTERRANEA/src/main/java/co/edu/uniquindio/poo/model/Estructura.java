package co.edu.uniquindio.poo.model;

public class Estructura {
    protected String id;
    protected String profundidad;
    protected String ubicacionGeografica;
    protected int anioInstalacion;

    public Estructura(String id, String profundidad, String ubicacion, int anioInstalacion) {
        this.id = id;
        this.profundidad = profundidad;
        this.ubicacionGeografica = ubicacion;
        this.anioInstalacion = anioInstalacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(String profundidad) {
        this.profundidad = profundidad;
    }

    public String getUbicacionGeografica() {
        return ubicacionGeografica;
    }

    public void setUbicacionGeografica(String ubicacionGeografica) {
        this.ubicacionGeografica = ubicacionGeografica;
    }

    public int getAnioInstalacion() {
        return anioInstalacion;
    }

    public void setAnioInstalacion(int anioInstalacion) {
        this.anioInstalacion = anioInstalacion;
    }

    @Override
    public String toString() {
        return "Estructura{" +
                "id='" + id + '\'' +
                ", profundidad='" + profundidad + '\'' +
                ", ubicacionGeografica='" + ubicacionGeografica + '\'' +
                ", anioInstalacion=" + anioInstalacion +
                '}';
    }
}
