package co.edu.uniquindio.poo.model;

public class ConsultaEspecialista extends Consulta {
    private Especialidad especialidad;
    private int valorBase;
    private int numeroTratamientos;

    public ConsultaEspecialista(Paciente paciente, String id, Personal medico, String fechaConsulta, Especialidad especialidad, int numeroTratamientos) {
        super(paciente, id, medico, fechaConsulta);
        this.especialidad = especialidad;
        this.valorBase = 0;
        this.numeroTratamientos = numeroTratamientos;

    }

    public double calcularCostoTotal() {
        if (especialidad == Especialidad.CARDIOLOGIA) {
            valorBase = 80000;
        } else if (especialidad == Especialidad.NEUROLOGIA) {
            valorBase = 160000;
        }
        if (numeroTratamientos == 0) {
            return valorBase;
        } else {
            return numeroTratamientos * valorBase;
        }
    }
}
