package co.edu.uniquindio;
import java.util.ArrayList;
import java.util.List;

public class DetalleVenta {
    private int cantidad;
    private double subtotal;
    private double total;
    private List<Producto> detalleVentaListProductos;

    public DetalleVenta(int cantidad, double subtotal, double total, List<Producto> detalleVentaListProductos) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.total = total;
        this.detalleVentaListProductos = new ArrayList<>();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public List<Producto> getDetalleVentaListProductos() {
        return detalleVentaListProductos;
    }

    public void setDetalleVentaListProductos(List<Producto> detalleVentaListProductos) {
        this.detalleVentaListProductos = detalleVentaListProductos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public int calcularSubTotal(List <Producto> detalleVentaListProductos, int cantidad){
        int subTotal = 0;
        for (Producto producto:detalleVentaListProductos){
            subTotal = subTotal + producto.getValor() * cantidad;
        }
        return subTotal;



    }
}
