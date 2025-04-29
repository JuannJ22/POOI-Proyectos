package co.edu.uniquindio.poo.model;

public class Telecomunicaciones extends Estructura{
    private String tipoCableado;

    public Telecomunicaciones(String id, String profundidad, String ubicacion, int anioInstalacion, String tipoCableado) {
        super(id, profundidad, ubicacion, anioInstalacion);
        this.tipoCableado = tipoCableado;
    }
    public String getTipoCableado() {
        return tipoCableado;
    }
    public void setTipoCableado(String tipoCableado) {
        this.tipoCableado = tipoCableado;
    }
}
