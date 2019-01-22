package envio;

import cupon.Cupon;

public class EnvioInternacional extends Envio {

    private static final double RECARGO = 1.2;

    @Override
    public double realizarRecargo(double precioDelPedido) {
        return precioDelPedido * RECARGO;
    }

    @Override
    public double resolverDescuento(double precioDelPedido, Cupon cupon) {
        return cupon.realizarDescuento(precioDelPedido, this);
    }
}