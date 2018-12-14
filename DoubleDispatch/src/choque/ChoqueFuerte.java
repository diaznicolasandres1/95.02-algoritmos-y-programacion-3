package choque;

import auto.Auto;

public class ChoqueFuerte implements Choque{
    @Override
    public void chocar(Auto auto) {
        auto.recibirChoque(this);
    }
}
