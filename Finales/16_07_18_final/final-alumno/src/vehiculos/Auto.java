package vehiculos;

import transitables.Transitable;

public class Auto extends Vehiculo {

    @Override
    public int calcularVelocidadEn(Transitable transitable) {
        return transitable.calcularVelocidadDe(this);
    }
}
