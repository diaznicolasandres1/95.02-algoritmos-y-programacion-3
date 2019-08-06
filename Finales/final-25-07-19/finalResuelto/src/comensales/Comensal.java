package comensales;

import comida.Comida;
import comida.ComidaComun;
import comida.ComidaSinGluten;
import comida.ComidaSinSal;

public abstract class Comensal {
    public int calorias;

        public Comensal() {
            this.calorias = 0;
        }

     public double getCalorias(){
            return this.calorias;
     }

    abstract void comer(Comida comida);


}
