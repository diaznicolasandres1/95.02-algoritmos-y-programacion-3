package camuflajes;

import nave.Atacable;

public interface EstadoCamuflaje {

    void recibirDanio(Atacable atacable, int danio);

    void activar(Camuflajeable camuflajeable);

    void desactivar(Camuflajeable camuflajeable);
}
