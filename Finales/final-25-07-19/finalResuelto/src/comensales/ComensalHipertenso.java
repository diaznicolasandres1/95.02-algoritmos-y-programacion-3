package comensales;

import comida.Comida;

public class ComensalHipertenso extends Comensal {

    @Override
    void comer(Comida comida) {
        this.calorias += comida.serComidoPor(this);
    }
}
