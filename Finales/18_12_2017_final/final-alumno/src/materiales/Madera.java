package materiales;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;

public class Madera extends Material {

    private static final int FACTOR_CHARANGO = 2;
    private static final int FACTOR_PIANO = 3;

    @Override
    public int calcularDecibeles(Charango charango, int decibeles) {
        return decibeles * FACTOR_CHARANGO;
    }

    @Override
    public int calcularDecibeles(GuitarraCriolla guitarraCriolla, int decibeles) {
        return decibeles;
    }

    @Override
    public int calcularDecibeles(Piano piano, int decibeles) {
        return decibeles * FACTOR_PIANO;
    }

    @Override
    public int calcularDecibeles(Saxo saxo, int decibeles) {
        return decibeles;
    }
}
