package choque;

import auto.Auto;

public class ChoqueSuave implements Choque{
    @Override
    public void chocar(Auto auto) {
        auto.recibirChoque(this);
    }
}
