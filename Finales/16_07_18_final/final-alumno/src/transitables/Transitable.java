package transitables;

import vehiculos.*;

public interface Transitable {

    int calcularVelocidadDe(Vehiculo vehiculo);

    int calcularVelocidadDe(Moto moto);

    int calcularVelocidadDe(Auto auto);

    int calcularVelocidadDe(AutoCuatroPorCuatro autoCuatroPorCuatro);

    int calcularVelocidadDe(Caballo caballo);
}
