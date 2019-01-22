package niveles;

import personajes.Atacable;
import personajes.Goku;

public class NivelSaiyajin implements Nivel {

    private static final int DANIO = 15;

    @Override
    public void atacar(Goku atacante, Atacable atacable) {
        atacable.recibirDanio(atacante, DANIO);
    }
}
