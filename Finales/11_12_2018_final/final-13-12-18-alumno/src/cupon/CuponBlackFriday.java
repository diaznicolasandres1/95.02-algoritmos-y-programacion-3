package cupon;

import envio.Envio;
import envio.EnvioInternacional;
import envio.EnvioLocal;

public class CuponBlackFriday extends Cupon {

    private static final double DESCUENTO = 0.15;

    @Override
    public double realizarDescuento(double precioDelPedido, Envio envio) {
        return envio.resolverDescuento(precioDelPedido, this);
    }

    @Override
    public double realizarDescuento(double precioDelPedido, EnvioLocal envio) {
        return precioDelPedido * DESCUENTO;
    }

    @Override
    public double realizarDescuento(double precioDelPedido, EnvioInternacional envio) {
        return precioDelPedido * DESCUENTO;
    }

}
