package alimentos;

import trabajantes.SuperTrabajador;
import trabajantes.Trabajador;

public class EstadoNoLight implements EstadoAlimento {

    private static final int AUMENTO_PESO = 20;

    @Override
    public void alimentar(Trabajador trabajador) {
        trabajador.incrementarPeso(AUMENTO_PESO);
    }

    @Override
    public void alimentar(SuperTrabajador superTrabajador) {
        superTrabajador.incrementarPeso(AUMENTO_PESO);
    }
}
