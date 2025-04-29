package co.edu.uniquindio.poo.model;

public class FVIP extends Funcion{
    private double recargoServicio;

    public FVIP(String tituloPelicula, int duracionPeliculaMin, String horarioPelicula, double precioBase, double recargoServicio) {
        super(tituloPelicula, duracionPeliculaMin, horarioPelicula, precioBase);
        this.recargoServicio = recargoServicio;
    }


    @Override
    public double calcularPrecioEntrada() {
        double precioEntrada = 0;
        precioEntrada = precioBase + recargoServicio;
        return precioEntrada;
    }

    public double getRecargoServicio() {
        return recargoServicio;
    }

    public void setRecargoServicio(double recargoServicio) {
        this.recargoServicio = recargoServicio;
    }
}
