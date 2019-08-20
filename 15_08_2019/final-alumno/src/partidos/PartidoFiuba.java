package partidos;

import main.ar.edu.fiuba.algoiii.ManejadorDeVotos;

public class PartidoFiuba extends Partido {
    @Override
    public void agregarVotos(int cantidad) {
        this.cantidadDeVotos += cantidad;
    }

    @Override
    public void agregarVotos(ManejadorDeVotos manejadorDeVotos, int cantidad) {
        manejadorDeVotos.agregarVotos(this, cantidad);
    }
}
