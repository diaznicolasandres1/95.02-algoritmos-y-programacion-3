package inversionistas;

import inversiones.Bitcoin;
import inversiones.Inversion;
import inversiones.LeBac;
import inversiones.PlazoFijo;

public class InversionistaAgresivo implements Inversionista {

    private static final int FACTOR_BITCOIN = 4;

    @Override
    public int calcularInversion(int monto, Inversion inversion) {
        return inversion.calcularMonto(monto, this);
    }

    @Override
    public int calcularInversion(int monto, PlazoFijo plazoFijo) {
        return monto;
    }

    @Override
    public int calcularInversion(int monto, LeBac leBac) {
        return monto;
    }

    @Override
    public int calcularInversion(int monto, Bitcoin bitcoin) {
        return monto * FACTOR_BITCOIN;
    }
}
