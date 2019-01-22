package telepase;

import transporte.Auto;
import transporte.Camion;
import transporte.Moto;
import transporte.Transporte;

public interface EstadoTelepase {

    int calcularPeaje(Transporte transporte, int precioPorRueda, int cantidadDeRuedas);

    int calcularPeaje(Auto auto, int precioPorRueda, int cantidadDeRuedas);

    int calcularPeaje(Camion camion, int precioPorRueda, int cantidadDeRuedas);

    int calcularPeaje(Moto moto, int precioPorRueda, int cantidadDeRuedas);
}
