package co.edu.uniquindio.poo.model;

public class Inspeccion {
    Estructura estructura;
    TecnicoEsp tecnico;
    String fecha;
    Resultado resultado;

    public Inspeccion(Estructura estructura, TecnicoEsp tecnico, String fecha, Resultado resultado) {
        this.estructura = estructura;
        this.tecnico = tecnico;
        this.fecha = fecha;
        this.resultado = resultado;
    }

    public Estructura getEstructura() {
        return estructura;
    }

    public void setEstructura(Estructura estructura) {
        this.estructura = estructura;
    }

    public TecnicoEsp getTecnico() {
        return tecnico;
    }

    public void setTecnico(TecnicoEsp tecnico) {
        this.tecnico = tecnico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }
}
