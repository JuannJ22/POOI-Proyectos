package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Clinica clinica = new Clinica("Vida", "54d5dfd");
    Paciente paciente1 = new Paciente("Juan", "1005091618", "dsjfsdjf@gmail.com", "UniQuindio", "22/04/2003");
    Personal personal1 = new MedicoGeneral("Jose", "12151515", "dfsfdf", "215515", "Neurologo");
    Personal personal2 = new Especialista("Carlos", "43423432656", "dfsfdf", "656", 5);
    Personal personal3 = new Cirujano("Jaime", "656546", "gfgfg", "6767");
    Consulta consulta = new ConsultaMGeneral(paciente1, "121515", personal1, "22/04/2025", 5);
    Consulta consulta2 = new ConsultaQuirurgica(paciente1, "121515", personal3, "22/04/2025", 3);
    Consulta consulta3 = new ConsultaEspecialista(paciente1, "121515", personal2, "22/04/2025", Especialidad.NEUROLOGIA, 5);
    Double costo = consulta.calcularCostoTotal();
    Double costo2 = consulta2.calcularCostoTotal();
    Double costo3 = consulta3.calcularCostoTotal();
    System.out.println(costo);
    System.out.println(costo2);
    System.out.println(costo3);

        }
}
