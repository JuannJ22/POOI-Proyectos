package co.edu.uniquindio.poo.model;

public class Drenaje extends Estructura {
    private String tipoFluido;

    public Drenaje(String id, String profundidad, String ubicacion, int anioInstalacion, String tipoFluido) {
        super(id,profundidad,ubicacion,anioInstalacion);
        this.tipoFluido = tipoFluido;
    }
    public String getTipoFluido() {
        return tipoFluido;
    }
    public void setTipoFluido(String tipoFluido) {
        this.tipoFluido = tipoFluido;
    }
}
