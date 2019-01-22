package camuflajes;

import nave.Atacable;

public interface Camuflajeable {

    void recibirDanio(Atacable atacable, int danio);

    void activar();

    void desactivar();

    void setCamuflajeInactivo();

    void setCamuflajeActivo();
}
