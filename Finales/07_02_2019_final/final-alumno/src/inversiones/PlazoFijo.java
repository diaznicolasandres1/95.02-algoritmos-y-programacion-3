package inversiones;

import inversionistas.Inversionista;

public class PlazoFijo implements Inversion {

    @Override
    public int calcularMonto(int monto, Inversionista inversionista) {
        return inversionista.calcularInversion(monto, this);
    }
}
