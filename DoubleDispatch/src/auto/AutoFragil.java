package auto;

import choque.Choque;
import choque.ChoqueFuerte;
import choque.ChoqueSuave;

public class AutoFragil extends Auto{
    @Override
    public void recibirChoque(Choque choque) {
        System.out.println("AUTOFRAGIL: Recibe choque generico, se aplica double dispatch!");
        choque.chocar(this);
    }

    @Override
    public void recibirChoque(ChoqueFuerte choque){
        System.out.println("AUTOFRAGIL: Recibio un Choque fuerte");
        this.reducirUtilidad(90);
    }

    @Override
    public void recibirChoque(ChoqueSuave choque) {
        System.out.println("AUTOFRAGIL: Recibio un Choque suave");
        this.reducirUtilidad(50);
    }
}
