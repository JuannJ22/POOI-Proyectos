package co.edu.uniquindio.model;

public class EstadisticaEquipo {
    private String nombre;
    private int golesFavor;
    private int golesContra;
    private int diferenciaGoles;
    private int puntos;

    public EstadisticaEquipo(String nombre) {
        this.nombre = nombre;
    }

    public void registrarEstadisticaPartido(int golesAFavor, int golesEnContra) {
        this.golesFavor += golesAFavor;
        this.golesContra += golesEnContra;
        this.diferenciaGoles = this.golesFavor - this.golesContra;

        if (golesAFavor > golesEnContra) {
            this.puntos += 3;
        } else if (golesAFavor == golesEnContra) {
            this.puntos += 1;
        }
    }

    public int getPuntos() {
        return puntos;
    }

    public int getDiferenciaGoles() {
        return diferenciaGoles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " GF " + golesFavor + " GC " + golesContra + " DG " + diferenciaGoles + " Ptos " + puntos;


    }
}