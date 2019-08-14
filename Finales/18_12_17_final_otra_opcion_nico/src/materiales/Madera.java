package materiales;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;

public class Madera implements Material {

    private static int DECIBELES_GUITARRA = 20;
    private static int DECIBELES_PIANO = 150;
    private static int DECIBELES_CHARANGO = 20;
    private static int DECIBELES_SAXO = 30;
    @Override
    public int calcularDecibeles(GuitarraCriolla guitarra) {
        return DECIBELES_GUITARRA;
    }

    @Override
    public int calcularDecibeles(Charango charango) {
        return DECIBELES_CHARANGO;
    }

    @Override
    public int calcularDecibeles(Piano piano) {
        return DECIBELES_PIANO;
    }

    @Override
    public int calcularDecibeles(Saxo saxo) {
        return DECIBELES_SAXO;
    }
}
