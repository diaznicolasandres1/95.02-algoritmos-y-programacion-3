package musicos;

import instrumentos.Instrumento;

public class LucianoPereyra extends Musico {

    @Override
    public int tocar(Instrumento instrumento) {
        return instrumento.emitirSonido(this);
    }
}