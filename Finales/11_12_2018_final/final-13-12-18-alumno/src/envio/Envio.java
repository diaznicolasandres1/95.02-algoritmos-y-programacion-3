package envio;

import cupon.Cupon;

public abstract class Envio {

    public abstract double resolverDescuento(double precioDelPedido, Cupon cupon);
    public abstract double realizarRecargo(double precioDelPedido);
}