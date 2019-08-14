package musicos;

import instrumentos.*;

public interface Musico {
    static int NO_SABE_TOCARLO = 0;
    public int tocarInstrumento(GuitarraCriolla guitarra);
    public int tocarInstrumento(Charango charango);
    public int tocarInstrumento(Piano piano);
    public int tocarInstrumento(Saxo saxo);
}
