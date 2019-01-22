package transporte;

public class Auto extends Transporte {

    private static final int CANT_RUEDAS = 4;

    public Auto() {
        super(CANT_RUEDAS);
    }

    @Override
    public int calcularPeaje(int precioPorRueda) {
        return this.telepase.calcularPeaje(this, precioPorRueda, this.ruedas);
    }
}
