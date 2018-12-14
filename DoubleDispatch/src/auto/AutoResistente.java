package auto;

import choque.Choque;
import choque.ChoqueFuerte;
import choque.ChoqueSuave;

public class AutoResistente extends Auto {
    @Override
    public void recibirChoque(Choque choque) {
     System.out.println("AUTORESISTENTE: Recibio un Choque generico, se aplica double dispatch");
     choque.chocar(this);
    }

    @Override
    public void recibirChoque(ChoqueFuerte choque){
        System.out.println("AUTORESISTENTE: Recibio un Choque fuerte");
        this.reducirUtilidad(50);
    }

    @Override
    public void recibirChoque(ChoqueSuave choque) {
        System.out.println("AUTORESISTENTE: Recibio un Choque suave");
        this.reducirUtilidad(10);
    }
}
