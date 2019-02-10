package inversionistas;

import inversiones.Bitcoin;
import inversiones.Inversion;
import inversiones.LeBac;
import inversiones.PlazoFijo;

public class InversionistaArriesgado implements Inversionista {

    private static final int FACTOR_PLAZO_FIJO = 2;
    private static final int FACTOR_LEBAC = 3;

    @Override
    public int calcularInversion(int monto, Inversion inversion) {
        return inversion.calcularMonto(monto, this);
    }

    @Override
    public int calcularInversion(int monto, PlazoFijo plazoFijo) {
        return monto * FACTOR_PLAZO_FIJO;
    }

    @Override
    public int calcularInversion(int monto, LeBac leBac) {
        return monto * FACTOR_LEBAC;
    }

    @Override
    public int calcularInversion(int monto, Bitcoin bitcoin) {
        throw new BitcoinNoEstaDisponibleParaInversionistaArriesgadoException();
    }
}