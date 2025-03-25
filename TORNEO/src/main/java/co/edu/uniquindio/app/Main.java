package co.edu.uniquindio.app;

import co.edu.uniquindio.model.*;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        //Crear jugadores
        Jugador jugador1 = new Jugador("Raul", "CR7", Rol.ATACANTE);
        Jugador jugador2 = new Jugador("lionel", "La pulga", Rol.LIDER);
        Jugador jugador3 = new Jugador("Cristiano", "El bicho", Rol.ATACANTE);
        Jugador jugador4 = new Jugador("Yamal", "El niño", Rol.LIDER);
        Jugador jugador5 = new Jugador("Pele", "El rey", Rol.ATACANTE);
        Jugador jugador6 = new Jugador("Maldini", "Capitan", Rol.LIDER);
        Jugador jugador7 = new Jugador("Zidane", "Zizou", Rol.ATACANTE);
        Jugador jugador8 = new Jugador("Beckenbauer", "Kaiser", Rol.SOPORTE);
        Jugador jugador9 = new Jugador("Yashin", "Araña", Rol.SOPORTE);

        //Crear equipos
        Equipo brasil = new Equipo("Brasil", List.of(jugador5, jugador3, jugador1));
        Equipo colombia = new Equipo("Colombia", List.of(jugador2, jugador4, jugador6));
        Equipo argentina = new Equipo("Argentina", List.of(jugador7, jugador8, jugador9));

        brasil.mostrarEquipo();
        colombia.mostrarEquipo();
        argentina.mostrarEquipo();

        //Crear tabla de posiciones y linea por equipoa
        TablaPosiciones tablaPosiciones = new TablaPosiciones();
        EstadisticaEquipo equipo1 = new EstadisticaEquipo("Argentina");
        EstadisticaEquipo equipo2 = new EstadisticaEquipo("Brasil");
        EstadisticaEquipo equipo3 = new EstadisticaEquipo("Colombia");
        tablaPosiciones.agregarEquipo(equipo1);
        tablaPosiciones.agregarEquipo(equipo2);
        tablaPosiciones.agregarEquipo(equipo3);

        //Crear una partida y jugarla
        Partida partida = new Partida("1", "7:45 pm", "20/03/2025", brasil, colombia);
        partida.jugarPartido(1,2);
        equipo2.registrarEstadisticaPartido(1,2);
        equipo3.registrarEstadisticaPartido(2,1);
        Partida partida2 = new Partida("2", "7:30 pm", "21/03/2025", argentina, colombia);
        partida2.jugarPartido(1,3);
        equipo1.registrarEstadisticaPartido(1,3);
        equipo3.registrarEstadisticaPartido(3,1);
        Partida partida3 = new Partida("3", "8:00 pm", "22/03/2025", argentina, brasil);
        partida3.jugarPartido(1,0);
        equipo1.registrarEstadisticaPartido(1,1);
        equipo2.registrarEstadisticaPartido(1,1);

        System.out.println("Resultados de los partidos:");
        System.out.println(partida.getResultado());
        System.out.println(partida2.getResultado());
        System.out.println(partida3.getResultado());



        tablaPosiciones.ordenarTabla();
        tablaPosiciones.mostrarTabla();
    }
}