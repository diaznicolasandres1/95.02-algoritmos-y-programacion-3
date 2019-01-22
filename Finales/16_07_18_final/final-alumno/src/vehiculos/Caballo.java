package vehiculos;

import transitables.Transitable;

public class Caballo extends Vehiculo {

    @Override
    public int calcularVelocidadEn(Transitable transitable) {
        return transitable.calcularVelocidadDe(this);
    }
}
