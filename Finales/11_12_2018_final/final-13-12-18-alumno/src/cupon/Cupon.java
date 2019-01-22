package cupon;

import envio.Envio;
import envio.EnvioInternacional;
import envio.EnvioLocal;

public abstract class Cupon {

    public abstract double realizarDescuento(double precioDelPedido, Envio envio);
    public abstract double realizarDescuento(double precioDelPedido, EnvioLocal envio);
    public abstract double realizarDescuento(double precioDelPedido, EnvioInternacional envio);

}