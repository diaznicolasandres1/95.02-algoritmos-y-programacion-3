package transporte;

public class Moto extends Transporte {

    private static final int CANT_RUEDAS = 2;

    public Moto() {
        super(CANT_RUEDAS);
    }

    @Override
    public void instalarTelepase() {
        throw new NoSePuedeInstalarTelepaseAMotoException();
    }

    @Override
    public int calcularPeaje(int precioPorRueda) {
        return this.telepase.calcularPeaje(this, precioPorRueda, this.ruedas);
    }
}
