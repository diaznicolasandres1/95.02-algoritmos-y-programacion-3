package telepase;

import transporte.Auto;
import transporte.Camion;
import transporte.Moto;
import transporte.Transporte;

public class EstadoTelepaseInstalado implements EstadoTelepase {

    private static final int FACTOR_AUTO = 2;
    private static final int FACTOR_CAMION = 4;
    private static final int PRECIO = 10;

    @Override
    public int calcularPeaje(Transporte transporte, int precioPorRueda, int cantidadDeRuedas) {
        return PRECIO;
    }

    @Override
    public int calcularPeaje(Auto auto, int precioPorRueda, int cantidadDeRuedas) {
        return (precioPorRueda * cantidadDeRuedas) / FACTOR_AUTO;
    }

    @Override
    public int calcularPeaje(Camion camion, int precioPorRueda, int cantidadDeRuedas) {
        return (precioPorRueda * cantidadDeRuedas) / FACTOR_CAMION;
    }

    @Override
    public int calcularPeaje(Moto moto, int precioPorRueda, int cantidadDeRuedas) {
        throw new NoSePuedeCalcularPeajeAMotoConTelepaseException();
    }

}
