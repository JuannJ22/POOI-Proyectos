package co.edu.uniquindio.poo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsultaTest {

    @Test
    public void calcularCostoTotal() {
        Paciente paciente1 = new Paciente("Juan", "1005091618", "dsjfsdjf@gmail.com", "UniQuindio", "22/04/2003");
        Personal personal2 = new Especialista("Carlos", "43423432656", "dfsfdf", "656", 5);
        Consulta consulta = new ConsultaEspecialista(paciente1, "121515", personal2, "22/04/2025", Especialidad.NEUROLOGIA, 5);
        assertEquals(consulta.calcularCostoTotal(), 800000);
    }
    public void
}