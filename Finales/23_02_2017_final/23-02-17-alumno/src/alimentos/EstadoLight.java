package alimentos;

import trabajantes.SuperTrabajador;
import trabajantes.Trabajador;

public class EstadoLight implements EstadoAlimento {

    private static final int AUMENTO_PESO = 10;

    @Override
    public void alimentar(Trabajador trabajador) {
        trabajador.incrementarPeso(AUMENTO_PESO);
    }

    @Override
    public void alimentar(SuperTrabajador superTrabajador) {
        throw new SuperTrabajadorNoComeAlimentosLightException();
    }
}
