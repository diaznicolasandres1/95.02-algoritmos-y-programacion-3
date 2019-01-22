package transporte;

public class Triciclo extends Transporte {

    private static final int CANT_RUEDAS = 3;

    public Triciclo() {
        super(CANT_RUEDAS);
    }

    @Override
    public int calcularPeaje(int precioPorRueda) {
        return this.telepase.calcularPeaje(this, precioPorRueda, this.ruedas);
    }
}
