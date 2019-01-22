package elaborables;

import artesanos.Artesano;
import artesanos.Joyero;
import artesanos.Modista;
import artesanos.Zapatero;

public class Goma implements Elaborable {

    private static final int FACTOR_ZAPATERO = 5;
    private static final int FACTOR_MODISTA = 2;

    @Override
    public String elaborarPor(Artesano artesano, int cantidad) {
        return artesano.realizarTrabajo(this, cantidad);
    }

    @Override
    public String elaborarPor(Modista modista, int cantidad) {
        return cantidad * FACTOR_MODISTA  + " pulseras para hombre.";
    }

    @Override
    public String elaborarPor(Zapatero zapatero, int cantidad) {
        return cantidad / FACTOR_ZAPATERO + " ojotas de goma talle 35.";
    }

    @Override
    public String elaborarPor(Joyero joyero, int cantidad) {
        return "Artesano " + joyero.getNombre() + " no trabaja con " + this.getClass().getSimpleName();
    }
}
