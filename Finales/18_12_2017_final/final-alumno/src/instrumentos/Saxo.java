package instrumentos;

import materiales.Metal;
import musicos.*;

public class Saxo extends Instrumento {

    public Saxo() {
        this.material = new Metal();
        this.decibeles = 30;
    }

    @Override
    public int emitirSonido(Musico musico) {
        return musico.tocar(this);
    }

    @Override
    public int emitirSonido(RicardoMollo ricardoMollo) {
        return 0;
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
        return material.calcularDecibeles(this, this.decibeles);
    }
}
