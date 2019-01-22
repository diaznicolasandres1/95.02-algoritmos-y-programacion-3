package trabajables;

import trabajantes.*;

public interface Trabajable {

    Producto elaborarPor(Trabajante trabajante);

    Producto elaborarPor(Trabajador trabajador);

    Producto elaborarPor(SuperTrabajador superTrabajador);

    Producto elaborarPor(Robot robot);
}
