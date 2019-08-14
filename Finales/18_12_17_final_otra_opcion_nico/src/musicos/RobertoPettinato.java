package musicos;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;

public class RobertoPettinato implements Musico {
    @Override
    public int tocarInstrumento(GuitarraCriolla guitarra) {
        return 0;
    }

    @Override
    public int tocarInstrumento(Charango charango) {
        return 0;
    }

    @Override
    public int tocarInstrumento(Piano piano) {
        return 0;
    }

    @Override
    public int tocarInstrumento(Saxo saxo) {
        return saxo.serTocado();
    }
}
