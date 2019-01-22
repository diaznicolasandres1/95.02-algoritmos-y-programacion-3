package elaborables;

import artesanos.Artesano;
import artesanos.Joyero;
import artesanos.Modista;
import artesanos.Zapatero;

public class Tela implements Elaborable {

    private static final int FACTOR_MODISTA = 2;

    @Override
    public String elaborarPor(Artesano artesano, int cantidad) {
        return artesano.realizarTrabajo(this, cantidad);
    }

    @Override
    public String elaborarPor(Modista modista, int cantidad) {
        return (cantidad / 2 ) + " camisas para hombre.";
    }

    @Override
    public String elaborarPor(Zapatero zapatero, int cantidad) {
        return (cantidad) + " zapatillas de tela talle 42.";
    }

    @Override
    public String elaborarPor(Joyero joyero, int cantidad) {
        return "Artesano " + joyero.getNombre() + " no trabaja con " + this.getClass().getSimpleName();
    }
}
