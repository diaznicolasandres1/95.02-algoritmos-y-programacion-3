package trabajables;

import trabajantes.*;

public class Cobre implements Trabajable {

    private static final String COLOR = "ROJIZO";
    private static final int TAMANIO_TRABAJADOR = 1;
    private static final int TAMANIO_SUPER_TRABAJADOR = 2;
    private static final int TAMANIO_ROBOT = 3;

    @Override
    public Producto elaborarPor(Trabajante trabajante) {
        return trabajante.trabajar(this);
    }

    @Override
    public Producto elaborarPor(Trabajador trabajador) {
        return new Producto(COLOR, TAMANIO_TRABAJADOR);
    }

    @Override
    public Producto elaborarPor(SuperTrabajador superTrabajador) {
        return new Producto(COLOR, TAMANIO_SUPER_TRABAJADOR);
    }

    @Override
    public Producto elaborarPor(Robot robot) {
        return new Producto(COLOR, TAMANIO_ROBOT);
    }
}
