package inversionistas;

import inversiones.Bitcoin;
import inversiones.Inversion;
import inversiones.LeBac;
import inversiones.PlazoFijo;

public interface Inversionista {

    int calcularInversion(int monto, Inversion inversion);

    int calcularInversion(int monto, PlazoFijo plazoFijo);

    int calcularInversion(int monto, LeBac leBac);

    int calcularInversion(int monto, Bitcoin bitcoin);
}