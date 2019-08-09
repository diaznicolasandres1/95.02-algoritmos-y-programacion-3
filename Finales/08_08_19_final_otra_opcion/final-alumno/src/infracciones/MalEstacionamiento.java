package infracciones;

import vehiculos.Conductor;
import vehiculos.Vehiculo;

public class MalEstacionamiento implements Infraccion {

    @Override
    public void penalizar(Conductor conductor, Vehiculo vehiculo) {
        vehiculo.penalizar(conductor, this);
    }

    @Override
    public void despenalizar(Conductor conductor, Vehiculo vehiculo) {
        vehiculo.despenalizar(conductor, this);
    }
}
