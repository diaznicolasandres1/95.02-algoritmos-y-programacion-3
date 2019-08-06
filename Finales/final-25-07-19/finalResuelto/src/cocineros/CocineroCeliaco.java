package cocineros;
import comida.ComidaSinGluten;

public class CocineroCeliaco extends Cocinero {

        public CocineroCeliaco(double calorias){
            super(calorias);
        }

    @Override
    public ComidaSinGluten cocinar() {
        return new ComidaSinGluten(calorias);
    }
}
