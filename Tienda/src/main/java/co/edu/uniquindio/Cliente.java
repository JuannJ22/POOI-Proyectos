package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String identificacion;
    private String direccion;
    private int telefono;
    private List<Venta> clienteListVentas;

    public Cliente(String nombre, String identificacion, String direccion, int telefono) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clienteListVentas = new ArrayList<>();
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Venta> getClienteListVentas() {
        return clienteListVentas;
    }

    public void setClienteListVentas(List<Venta> clienteListVentas) {
        this.clienteListVentas = clienteListVentas;
    }
}
