package cupon;

import envio.Envio;
import envio.EnvioInternacional;
import envio.EnvioLocal;

public class CuponGratisLocal extends Cupon {

    private static final double DESCUENTO_LOCAL = 0;
    private static final double DESCUENTO_INTERNACIONAL = 1;

    @Override
    public double realizarDescuento(double precioDelPedido, Envio envio) {
        return envio.resolverDescuento(precioDelPedido, this);
    }

    @Override
    public double realizarDescuento(double precioDelPedido, EnvioLocal envio) {
        return precioDelPedido * DESCUENTO_LOCAL;
    }

    @Override
    public double realizarDescuento(double precioDelPedido, EnvioInternacional envio) {
        return precioDelPedido * DESCUENTO_INTERNACIONAL;
    }
}
