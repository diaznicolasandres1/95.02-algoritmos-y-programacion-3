package cocineros;
import comida.ComidaSinSal;

public class CocineroHipertenso extends Cocinero{

    public CocineroHipertenso(double calorias){
        super(calorias);
    }

    @Override
    public ComidaSinSal cocinar() {
        return new ComidaSinSal(calorias);
    }
}
