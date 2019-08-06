package cocineros;
import comida.Comida;

public abstract class  Cocinero {
    protected double calorias;

    public Cocinero(double calorias){
        this.calorias = calorias;
    }

    public abstract Comida cocinar();
}
