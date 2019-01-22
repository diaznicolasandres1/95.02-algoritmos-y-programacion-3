package camuflajes;

import nave.Atacable;

public class EstadoCamuflajeInactivo implements EstadoCamuflaje {

    @Override
    public void recibirDanio(Atacable atacable, int danio) {
        atacable.reducirVida(danio);
    }

    @Override
    public void activar(Camuflajeable camuflajeable) {
        camuflajeable.setCamuflajeActivo();
    }

    @Override
    public void desactivar(Camuflajeable camuflajeable) {
        throw new CamuflajeYaSeEncuentraDesactivadoException();
    }
}
