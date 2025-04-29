package co.edu.uniquindio.poo.model;

public class Festandar extends Funcion {

    public Festandar(String tituloPelicula, int duracionPeliculaMin, String horarioPelicula, double precioBase) {
        super(tituloPelicula, duracionPeliculaMin, horarioPelicula, precioBase);
    }

    @Override
    public double calcularPrecioEntrada() {
        double precioEntrada = precioBase;
        return precioEntrada;
    }
}
