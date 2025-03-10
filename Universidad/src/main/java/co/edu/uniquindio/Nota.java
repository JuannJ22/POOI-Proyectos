package co.edu.uniquindio;

public class Nota {
    private String nombre;
    private double valorNota;

    /**
     * Método del Constructor
     * @param nombre y Valor Nota
     * @param valorNota
     */
    public Nota(String nombre, double valorNota) {
        this.nombre = nombre;
        this.valorNota = valorNota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return valorNota;
    }

    public void setValorNotaNota(double valorNotaota) {
        this.valorNota = valorNotaota;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "nombres='" + nombre + '\'' +
                ", valor=" + valorNota +
                '}';
    }
}

