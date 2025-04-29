package co.edu.uniquindio.model;

public class VehiculoTransporteTropa extends Vehiculo {
    private int capacidadSoldados;

    public VehiculoTransporteTropa(String id, String modelo, int anioFabricacion, double kilometraje, int misionesCompletas, EstadoOperativo estadoOperativo) {
        super(id, modelo, anioFabricacion, kilometraje, misionesCompletas, estadoOperativo);

        this.capacidadSoldados = capacidadSoldados;
    }

    @Override
    public void desplazar() {
        System.out.println("El vehiculo de tropas se esta moviendo");
    }

    public int getCapacidadSoldados() {
        return capacidadSoldados;
    }

    public void setCapacidadSoldados(int misionesCompletas) {
        this.misionesCompletadas = capacidadSoldados;
    }

    public int getMisionesCompletadas() {
        return misionesCompletadas;
    }


    public void setMisionesCompletadas(int misionesCompletas) {

        this.misionesCompletadas = misionesCompletas;
    }
}
