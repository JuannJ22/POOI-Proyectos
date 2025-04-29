package co.edu.uniquindio.poo.model;

import java.util.Date;
import java.util.List;

public class ConsultaQuirurgica extends Consulta{
        int numeroIntervenciones;
        double valorBase;

    public ConsultaQuirurgica(Paciente paciente, String id, Personal medico, String fechaConsulta, int numeroIntervenciones) {
        super(paciente, id, medico, fechaConsulta);
        this.numeroIntervenciones = numeroIntervenciones;
        this.valorBase = 100000;
    }

    @Override
    public double calcularCostoTotal(){
        double valorBase = this.valorBase;
        valorBase += numeroIntervenciones*50000;
        double costoTotal = valorBase;
        return costoTotal;
    }
}
