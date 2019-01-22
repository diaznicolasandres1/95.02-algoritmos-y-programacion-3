import cupon.Cupon;
import envio.Envio;

import java.util.ArrayList;

public class Pedido {

    private double precio;
    private ArrayList<String> productos;
    private Envio envio;

    public Pedido() {
        this.precio = 0;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(String nombreDelProducto, double precio) {
        this.precio += precio;
        this.productos.add(nombreDelProducto);
    }

    public void agregarCupon(Cupon cupon) {
        this.precio = cupon.realizarDescuento(this.precio, this.envio);
    }

    public void agregarEnvio(Envio envio) {
        this.envio = envio;
        this.precio = envio.realizarRecargo(this.precio);
    }

    public double cobrarA(TiendaOnline tienda) {
        return tienda.cobrarMonto(this.precio);
    }
}
