package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private String nit;
    private List<Producto> listProductos;
    private List<Cliente> listClientes;
    private List<Venta> listVentas;

    public Tienda(String nombre, String nit, List<Producto> listProductos, List<Cliente> listClientes, List<Venta> listVentas) {
        this.nombre = nombre;
        this.nit = nit;
        this.listProductos = new ArrayList<>();
        this.listClientes = new ArrayList<>();
        this.listVentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public List<Producto> getListProductos() {
        return listProductos;
    }

    public void setListProductos(List<Producto> listProductos) {
        this.listProductos = listProductos;
    }

    public List<Cliente> getListClientes() {
        return listClientes;
    }

    public void setListClientes(List<Cliente> listClientes) {
        this.listClientes = listClientes;
    }
    public void registrarCliente(Cliente cliente){
        this.listClientes.add(cliente);
    }
    public void registrarProducto(Producto producto){
        this.listProductos.add(producto);
    }
    public void registrarVenta(Venta venta){
        this.listVentas.add(venta);
    }
    public void calcularTotalDeVentas(Tienda listVentas){
    }
}
