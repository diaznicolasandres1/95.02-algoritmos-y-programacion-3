package telepase;

import transporte.Auto;
import transporte.Camion;
import transporte.Moto;
import transporte.Transporte;

public class EstadoTelepaseNoInstalado implements EstadoTelepase {

    @Override
    public int calcularPeaje(Transporte transporte, int precioPorRueda, int cantidadDeRuedas) {
        return precioPorRueda * cantidadDeRuedas;
    }

    @Override
    public int calcularPeaje(Auto auto, int precioPorRueda, int cantidadDeRuedas) {
        return precioPorRueda * cantidadDeRuedas;
    }

    @Override
    public int calcularPeaje(Camion camion, int precioPorRueda, int cantidadDeRuedas) {
        return precioPorRueda * cantidadDeRuedas;
    }

    @Override
    public int calcularPeaje(Moto moto, int precioPorRueda, int cantidadDeRuedas) {
        return precioPorRueda * cantidadDeRuedas;
    }

}
