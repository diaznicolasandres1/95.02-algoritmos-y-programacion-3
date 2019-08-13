package vehiculos;

import vehiculos.Vehiculo;

public class Moto extends Vehiculo {
    @Override
    public boolean puedeManejarse() {
        return false;
    }
}
