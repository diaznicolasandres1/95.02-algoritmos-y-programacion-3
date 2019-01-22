package trabajantes;

import alimentos.Alimento;

public interface Alimentable {

    void comer(Alimento alimento);

    void incrementarPeso(int peso);

    int getPesoCorporal();
}
