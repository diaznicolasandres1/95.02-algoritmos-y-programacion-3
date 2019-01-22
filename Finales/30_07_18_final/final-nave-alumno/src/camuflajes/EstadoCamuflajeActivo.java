package camuflajes;

import nave.Atacable;

public class EstadoCamuflajeActivo implements EstadoCamuflaje {

    @Override
    public void recibirDanio(Atacable atacable, int danio) {
        // No se hace nada por enunciado, no recibe danio. Tal vez se podria recibir danio 0.
    }

    @Override
    public void activar(Camuflajeable camuflajeable) {
        throw new CamuflajeYaSeEncuentraActivadoException();
    }

    @Override
    public void desactivar(Camuflajeable camuflajeable) {
        camuflajeable.setCamuflajeInactivo();
    }
}
