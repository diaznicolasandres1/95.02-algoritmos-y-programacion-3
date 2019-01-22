package transporte;

public class Camion extends Transporte {

    private static final int CANT_RUEDAS = 18;

    public Camion() {
        super(CANT_RUEDAS);
    }

    @Override
    public int calcularPeaje(int precioPorRueda) {
        return this.telepase.calcularPeaje(this, precioPorRueda, this.ruedas);
    }
}
