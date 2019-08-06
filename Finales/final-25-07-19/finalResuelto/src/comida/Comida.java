package comida;

import comensales.ComensalCeliaco;
import comensales.ComensalComun;
import comensales.ComensalHipertenso;

public  abstract class Comida {
    double calorias;

    public Comida(double calorias){
        this.calorias = calorias;
    }

    public abstract double serComidoPor(ComensalCeliaco comensal);
    public abstract double serComidoPor(ComensalHipertenso comensal);
    public abstract double serComidoPor(ComensalComun comensal);
}

