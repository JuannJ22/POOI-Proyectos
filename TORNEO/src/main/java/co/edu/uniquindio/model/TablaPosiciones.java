package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TablaPosiciones {
    private List<EstadisticaEquipo> tablaListEquipos;

    public TablaPosiciones() {
        tablaListEquipos = new ArrayList<>();
    }

    public void agregarEquipo(EstadisticaEquipo equipo) {
        tablaListEquipos.add(equipo);
    }

    public void ordenarTabla() {
        tablaListEquipos.sort(Comparator.comparingInt(EstadisticaEquipo::getPuntos).reversed()
                .thenComparingInt(EstadisticaEquipo::getDiferenciaGoles).reversed()
                .thenComparingInt(EstadisticaEquipo::getGolesFavor).reversed());
    }

    public void mostrarTabla() {
        ordenarTabla();
        System.out.println("Tabla de Posiciones Eliminatorias mundial 2026:");
        for (EstadisticaEquipo equipo : tablaListEquipos) {
            System.out.println(equipo);
        }
    }
}
