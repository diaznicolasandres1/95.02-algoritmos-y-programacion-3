package instrumentos;

import materiales.Material;
import musicos.*;

public abstract class Instrumento {

    protected Material material;
    protected int decibeles;

    public abstract int emitirSonido(Musico musico);

    public abstract int emitirSonido(RicardoMollo ricardoMollo);

    public abstract int emitirSonido(LucianoPereyra lucianoPereyra);

    public abstract int emitirSonido(FitoPaez fitoPaez);

    public abstract int emitirSonido(RobertoPettinato robertoPettinato);

    public void setMaterial(Material material) {
        this.material = material;
    }
}
