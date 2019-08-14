package materiales;

import instrumentos.*;

public interface Material {


    public int calcularDecibeles(GuitarraCriolla guitarra);
    public int calcularDecibeles(Charango charango);
    public int calcularDecibeles(Piano piano);
    public int calcularDecibeles(Saxo saxo);
}
