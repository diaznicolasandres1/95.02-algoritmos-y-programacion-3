package etapas;

import personajes.Atacable;
import personajes.Freezer;

public interface Etapa {

    void atacar(Freezer freezer, Atacable atacable);
}
