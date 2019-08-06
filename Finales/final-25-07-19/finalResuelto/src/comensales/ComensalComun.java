package comensales;

import comida.Comida;

public class ComensalComun extends Comensal {

    @Override
    public void comer(Comida comida) {
        this.calorias += comida.serComidoPor(this);
    }
}


