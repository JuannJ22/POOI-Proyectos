package co.edu.uniquindio.poo.model;

public class Gas extends Estructura {
    private String presionMaximaPermitida;

    public Gas(String id, String profundidad, String ubicacion, int anioInstalacion, String presionMaximaPermitida) {
        super(id, profundidad, ubicacion, anioInstalacion);
        this.presionMaximaPermitida = presionMaximaPermitida;
    }
    public String getPresionMaximaPermitida() {
        return presionMaximaPermitida;
    }
    public void setPresionMaximaPermitida(String presionMaximaPermitida) {
        this.presionMaximaPermitida = presionMaximaPermitida;
    }
}
