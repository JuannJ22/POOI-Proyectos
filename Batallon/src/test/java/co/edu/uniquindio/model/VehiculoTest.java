package co.edu.uniquindio.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiculoTest {


    @Test
    public void determinarCantidadMisionesTest() {
        Vehiculo vehiculo = new VehiculoTransporteTropa("1", "2002", 2001, 12000, 60, EstadoOperativo.DISPONIBLE);
        assertEquals(60, vehiculo.getMisionesCompletadas());
    }

    @Test
    public void incrementarKilometrajeNegativoTest(){
        Vehiculo vehiculo1 = new VehiculoTransporteTropa("1", "2002", 2001, 12000, 60, EstadoOperativo.DISPONIBLE);
        assertThrows(IllegalArgumentException.class, () -> vehiculo1.incrementarKilometraje(-10));

    }

    @Test
    public void verificarEstadoMision(){
        Vehiculo vehiculo2 = new VehiculoTransporteTropa("1", "2002", 2001, 12000, 60, EstadoOperativo.EN_MISION);
        assertTrue(vehiculo2.getEstadoOperativo() == EstadoOperativo.EN_MISION);
    }

    @Test
    public void verificarCantidadMisionesCompletadasTest(){
        Vehiculo vehiculo1 = new VehiculoTransporteTropa("1", "2002", 2001, 12000, 60, EstadoOperativo.EN_MISION);
        Vehiculo vehiculo2 = new VehiculoTransporteTropa("2", "2002", 2001, 12000, 10, EstadoOperativo.EN_MISION);
        Vehiculo vehiculo3 = new VehiculoTransporteTropa("3", "2002", 2001, 12000, 15, EstadoOperativo.EN_MISION);
        Vehiculo vehiculo4 = new VehiculoTransporteTropa("4", "2002", 2001, 12000, 56, EstadoOperativo.EN_MISION);
        Batallon batallon = new Batallon("dimil", "2");

    }

}