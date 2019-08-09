package infracciones;

import vehiculos.Conductor;
import vehiculos.Vehiculo;

public interface Infraccion {

    void penalizar(Conductor conductor, Vehiculo vehiculo);
    void despenalizar(Conductor conductor, Vehiculo vehiculo);
}
