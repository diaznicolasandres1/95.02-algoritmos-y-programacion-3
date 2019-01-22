package artesanos;

import elaborables.Elaborable;

public class Zapatero extends Artesano {

    public Zapatero(String nombre) {
        super(nombre);
    }

    @Override
    public String realizarTrabajo(Elaborable elaborable, int cantidad) {
        return elaborable.elaborarPor(this, cantidad);
    }
}
