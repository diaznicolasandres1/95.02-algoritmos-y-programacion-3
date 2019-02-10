package inversiones;

import inversionistas.Inversionista;

public class Bitcoin implements Inversion {

    @Override
    public int calcularMonto(int monto, Inversionista inversionista) {
        return inversionista.calcularInversion(monto, this);
    }
}
