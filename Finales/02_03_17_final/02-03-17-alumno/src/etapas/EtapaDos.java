package etapas;

import personajes.Atacable;
import personajes.Freezer;

public class EtapaDos implements Etapa {

    private static final int DANIO = 20;

    @Override
    public void atacar(Freezer freezer, Atacable atacable) {
        atacable.recibirDanio(freezer, DANIO);
    }
}
