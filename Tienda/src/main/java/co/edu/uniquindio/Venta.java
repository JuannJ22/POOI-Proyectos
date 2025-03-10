package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String fecha;
    private double subTotal;
    private List<DetalleVenta> listDetalleVenta;
    private Cliente cliente;

    public Venta(String fecha, double subTotal, List<DetalleVenta> listDetalleVenta, Cliente cliente) {
        this.fecha = fecha;
        this.subTotal = subTotal;
        this.listDetalleVenta = new ArrayList<>();
        this.cliente = cliente;
    }

}
