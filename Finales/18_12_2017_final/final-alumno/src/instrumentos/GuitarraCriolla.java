package instrumentos;

import materiales.Madera;
import musicos.*;

public class GuitarraCriolla extends Instrumento {

    public GuitarraCriolla() {
        this.material = new Madera();
        this.decibeles = 20;
    }

    @Override
    public int emitirSonido(Musico musico) {
        return musico.tocar(this);
    }

    @Override
    public int emitirSonido(RicardoMollo ricardoMollo) {
        return this.material.calcularDecibeles(this, this.decibeles);
    }

    @Override
    public int emitirSonido(LucianoPereyra lucianoPereyra) {
        return 0;
    }

    @Override
    public int emitirSonido(FitoPaez fitoPaez) {
        return 0;
    }

    @Override
    public int emitirSonido(RobertoPettinato robertoPettinato) {
        return 0;
    }
}