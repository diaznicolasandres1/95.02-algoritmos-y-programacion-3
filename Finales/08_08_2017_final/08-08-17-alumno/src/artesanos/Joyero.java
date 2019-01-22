package artesanos;

import elaborables.Elaborable;

public class Joyero extends Artesano {

    public Joyero(String nombre) {
        super(nombre);
    }

    @Override
    public String realizarTrabajo(Elaborable elaborable, int cantidad) {
        return elaborable.elaborarPor(this, cantidad);
    }
}
