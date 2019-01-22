package musicos;

import instrumentos.Instrumento;

public class RobertoPettinato extends Musico {

    @Override
    public int tocar(Instrumento instrumento) {
        return instrumento.emitirSonido(this);
    }
}
