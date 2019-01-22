package artesanos;

import elaborables.Elaborable;

public class Modista extends Artesano {

    public Modista(String nombre) {
        super(nombre);
    }

    @Override
    public String realizarTrabajo(Elaborable elaborable, int cantidad) {
        return elaborable.elaborarPor(this, cantidad);
    }
}
