package transitables;

import vehiculos.*;

public class CalleEmbarrada implements Transitable {

    private static final int VELOCIDAD_MOTO = 0;
    private static final int VELOCIDAD_AUTO = 0;
    private static final int VELOCIDAD_AUTO_CUATRO_POR_CUATRO = 10;
    private static final int VELOCIDAD_CABALLO = 20;

    @Override
    public int calcularVelocidadDe(Vehiculo vehiculo) {
        return vehiculo.calcularVelocidadEn(this);
    }

    @Override
    public int calcularVelocidadDe(Moto moto) {
        return VELOCIDAD_MOTO;
    }

    @Override
    public int calcularVelocidadDe(Auto auto) {
        return VELOCIDAD_AUTO;
    }

    @Override
    public int calcularVelocidadDe(AutoCuatroPorCuatro autoCuatroPorCuatro) {
        return VELOCIDAD_AUTO_CUATRO_POR_CUATRO;
    }

    @Override
    public int calcularVelocidadDe(Caballo caballo) {
        return VELOCIDAD_CABALLO;
    }
}
