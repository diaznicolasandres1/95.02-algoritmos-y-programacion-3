package materiales;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;

public class Plastico extends Material {

    private static final int FACTOR_GUITARRA_CRIOLLA = 3;
    private static final int FACTOR_PIANO = 5;

    @Override
    public int calcularDecibeles(Charango charango, int decibeles) {
        return decibeles;
    }

    @Override
    public int calcularDecibeles(GuitarraCriolla guitarraCriolla, int decibeles) {
        return decibeles - FACTOR_GUITARRA_CRIOLLA;
    }

    @Override
    public int calcularDecibeles(Piano piano, int decibeles) {
        return decibeles - FACTOR_PIANO;
    }

    @Override
    public int calcularDecibeles(Saxo saxo, int decibeles) {
        return decibeles;
    }
}
