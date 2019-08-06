package cocineros;
import comida.ComidaComun;

public class CocineroComun extends Cocinero {

    public CocineroComun(double calorias){
        super(calorias);
    }

    @Override
    public ComidaComun cocinar() {
        return new ComidaComun(calorias);
    }
}
