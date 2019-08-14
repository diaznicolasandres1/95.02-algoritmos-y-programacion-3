package materiales;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;

public class Metal implements  Material {
    private static int DECIBELES_GUITARRA = 0;
    private static int DECIBELES_PIANO = 0;
    private static int DECIBELES_CHARANGO = 0;
    private static int DECIBELES_SAXO = 90;
    @Override
    public int calcularDecibeles(GuitarraCriolla guitarra) {
        return DECIBELES_GUITARRA;
    }

    @Override
    public int calcularDecibeles(Charango charango) {
        return DECIBELES_PIANO;
    }

    @Override
    public int calcularDecibeles(Piano piano) {
        return DECIBELES_CHARANGO;
    }

    @Override
    public int calcularDecibeles(Saxo saxo) {
        return DECIBELES_SAXO;
    }
}
