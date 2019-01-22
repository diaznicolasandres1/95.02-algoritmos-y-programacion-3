package niveles;

import personajes.Atacable;
import personajes.Goku;

public class NivelSuperSaiyajin implements Nivel {

    private static final int DANIO = 30;

    @Override
    public void atacar(Goku atacante, Atacable atacable) {
        atacable.recibirDanio(atacante, DANIO);
    }
}
