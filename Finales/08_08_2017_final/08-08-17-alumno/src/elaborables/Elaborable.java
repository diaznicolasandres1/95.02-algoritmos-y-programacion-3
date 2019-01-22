package elaborables;

import artesanos.Artesano;
import artesanos.Joyero;
import artesanos.Modista;
import artesanos.Zapatero;

public interface Elaborable {

    String elaborarPor(Artesano artesano, int cantidad);

    String elaborarPor(Modista modista, int cantidad);

    String elaborarPor(Zapatero zapatero, int cantidad);

    String elaborarPor(Joyero joyero, int cantidad);
}
