package etapas;

import personajes.Atacable;
import personajes.Freezer;

public class EtapaUno implements Etapa {

    private static final int DANIO = 10;

    @Override
    public void atacar(Freezer freezer, Atacable atacable) {
        atacable.recibirDanio(freezer, DANIO);
    }
}
