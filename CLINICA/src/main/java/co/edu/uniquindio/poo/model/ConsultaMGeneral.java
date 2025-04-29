package co.edu.uniquindio.poo.model;


public class ConsultaMGeneral extends Consulta{
    protected int numeroTratamientosSencillos;
    double valorBase;

    public ConsultaMGeneral(Paciente paciente,String id, Personal medico, String fechaConsulta, int numeroTratamientosSencillos) {
        super(paciente, id, medico, fechaConsulta);
        this.numeroTratamientosSencillos = numeroTratamientosSencillos;
        this.valorBase = 30000;
    }
    @Override
    public double calcularCostoTotal(){
        double valorBase = this.valorBase;
        double costoTotal = valorBase + numeroTratamientosSencillos*5000;
        return costoTotal;
    }
}
