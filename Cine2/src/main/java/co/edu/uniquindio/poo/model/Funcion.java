package co.edu.uniquindio.poo.model;

public abstract class Funcion {
    private String tituloPelicula;
    private int duracionPeliculaMin;
    public String horarioPelicula;
    public double precioBase;

    public Funcion(String tituloPelicula, int duracionPeliculaMin, String horarioPelicula, double precioBase) {
        this.tituloPelicula = tituloPelicula;
        this.duracionPeliculaMin = duracionPeliculaMin;
        this.horarioPelicula = horarioPelicula;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioEntrada();

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public int getDuracionPeliculaMin() {
        return duracionPeliculaMin;
    }

    public void setDuracionPeliculaMin(int duracionPeliculaMin) {
        this.duracionPeliculaMin = duracionPeliculaMin;
    }

    public String getHorarioPelicula() {
        return horarioPelicula;
    }

    public void setHorarioPelicula(String horarioPelicula) {
        this.horarioPelicula = horarioPelicula;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
