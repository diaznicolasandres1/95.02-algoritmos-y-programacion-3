package vehiculos;

import infracciones.MalEstacionamiento;
import infracciones.SemaforoEnRojo;

public class Moto extends Vehiculo {

    private static final int HORAS_TRABAJO_SOCIAL_POR_SEMAFORO_EN_ROJO = 15;
    private static final int MONTO_POR_MAL_ESTACIONAMIENTO = 2500;

    @Override
    public void penalizar(Conductor conductor, MalEstacionamiento malEstacionamiento) {
        conductor.incrementarMontoDeMultas(MONTO_POR_MAL_ESTACIONAMIENTO);
    }

    @Override
    public void penalizar(Conductor conductor, SemaforoEnRojo semaforoEnRojo) {
        conductor.incrementarHorasDeTrabajoSocial(HORAS_TRABAJO_SOCIAL_POR_SEMAFORO_EN_ROJO);
    }

    @Override
    public void despenalizar(Conductor conductor, SemaforoEnRojo semaforoEnRojo) {
        conductor.reducirHorasDeTrabajoSocial(HORAS_TRABAJO_SOCIAL_POR_SEMAFORO_EN_ROJO);
    }

    @Override
    public void despenalizar(Conductor conductor, MalEstacionamiento malEstacionamiento) {
        conductor.reducirMontoDeMultas(MONTO_POR_MAL_ESTACIONAMIENTO);
    }
}
