import cupon.Cupon;
import envio.Envio;

import java.util.HashMap;
import java.util.Map;

public class TiendaOnline {

    private String nombre;
    private Map<String, Double> preciosProductos;
    private Map<String, Integer> stockProductos;

    public TiendaOnline() {
        this.preciosProductos = new HashMap<>();
        this.stockProductos = new HashMap<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPreciosProductos(Map<String, Double> preciosProductos) {
        this.preciosProductos = preciosProductos;
    }

    public void setStockProductos(Map<String, Integer> stockProductos) {
        this.stockProductos = stockProductos;
    }

    public Map<String, Double> getPreciosProductos() {
        return this.preciosProductos;
    }

    public Map<String, Integer> getStockProductos() {
        return this.stockProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProductoAlPedido(Pedido pedido, String nombreDelProducto, int cantidad) {
        double importe = cantidad * (preciosProductos.get(nombreDelProducto));
        pedido.agregarProducto(nombreDelProducto, importe);
        int stock = stockProductos.get(nombreDelProducto) - cantidad; // decremento el stock
        stockProductos.put(nombreDelProducto, stock); // actualizo el stock
    }

    public void agregarCuponDeDescuento(Pedido pedido, Cupon cupon) {
        pedido.agregarCupon(cupon);
    }

    public void agregarEnvio(Pedido pedido, Envio envio) {
        pedido.agregarEnvio(envio);
    }

    public double cobrarPedido(Pedido pedido) {
        return pedido.cobrarA(this);
    }

    public double cobrarMonto(double precio) {
        return precio;
    }
}