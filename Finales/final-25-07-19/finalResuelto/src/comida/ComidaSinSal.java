package comida;

import comensales.Comensal;
import comensales.ComensalCeliaco;
import comensales.ComensalComun;
import comensales.ComensalHipertenso;

public class ComidaSinSal extends Comida {

    public ComidaSinSal(double calorias){
        super(calorias);
    }

    @Override
    public double serComidoPor(ComensalCeliaco comensal) {
        return 0;
    }

    @Override
    public double serComidoPor(ComensalHipertenso comensal) {
        return this.calorias;
    }

    @Override
    public double serComidoPor(ComensalComun comensal) {
        return this.calorias;
    }
}
