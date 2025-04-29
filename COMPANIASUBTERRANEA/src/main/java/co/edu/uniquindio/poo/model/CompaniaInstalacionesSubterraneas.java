package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class CompaniaInstalacionesSubterraneas {
    private String nombre;
    private String id;
    private List<Estructura> listEstructuras;
    private List<TecnicoEsp> listTecnicos;
    private List<Inspeccion> listInspecciones;

    public CompaniaInstalacionesSubterraneas(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.listEstructuras = new ArrayList<Estructura>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public void registrarInspeccion(Inspeccion inspeccion) {
        listInspecciones.add(inspeccion);
    }
    public void registrarTecnico(TecnicoEsp tecnico) {
        listTecnicos.add(tecnico);
    }
    public void registrarEstructura(Estructura estructura) {
        listEstructuras.add(estructura);
    }
    public String obtenerResumenPorEstructura(String id) {
        String resumenEstructura = "Estructura no encontrada";
        for (Estructura estructura : listEstructuras) {
            if (estructura.getId().equals(id)) {
               resumenEstructura = estructura.toString();
               break;
            }
        }return resumenEstructura;
    }
    public List<Inspeccion> listarInspeccionesPorResultado(Resultado resultado) {
        List<Inspeccion> listInspeccionesPorResultado = new ArrayList<>();
        for (Inspeccion inspeccion : listInspecciones) {
            if (inspeccion.getResultado().equals(resultado)) {
                listInspeccionesPorResultado.add(inspeccion);
            }
        }
        return listInspeccionesPorResultado;
    }
}
