package co.edu.uniquindio.poo.model;

public class F3D extends Funcion {
    private double recargo3D;

    public F3D(String tituloPelicula, int duracionPeliculaMin, String horarioPelicula, double precioBase, double recargo3D) {
        super(tituloPelicula, duracionPeliculaMin, horarioPelicula, precioBase);
        this.recargo3D = recargo3D;
    }
    public double getRecargo3D() {
        return recargo3D;
    }
    public void setRecargo3D(double recargo3D) {
        this.recargo3D = recargo3D;
    }
    public double calcularPrecioEntrada() {
        double precioEntrada = precioBase + recargo3D;
        return precioEntrada;
    }
}
