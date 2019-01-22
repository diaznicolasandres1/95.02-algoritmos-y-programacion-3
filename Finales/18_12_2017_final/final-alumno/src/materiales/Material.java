package materiales;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;

public abstract class Material {

    public abstract int calcularDecibeles(Charango charango, int decibeles);

    public abstract int calcularDecibeles(GuitarraCriolla guitarraCriolla, int decibeles);

    public abstract int calcularDecibeles(Piano piano, int decibeles);

    public abstract int calcularDecibeles(Saxo saxo, int decibeles);
}
