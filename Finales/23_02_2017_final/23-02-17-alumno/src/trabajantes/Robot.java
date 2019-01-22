package trabajantes;

import trabajables.Trabajable;

public class Robot implements Trabajante, Recargable {

    private int bateria;
    private String nombre;

    public Robot(String nombre, int bateria) {
        this.bateria = bateria;
        this.nombre = nombre;
    }

    @Override
    public Producto trabajar(Trabajable trabajable) {
        return trabajable.elaborarPor(this);
    }

    @Override
    public void recargarBateria(int bateria) {
        this.bateria += bateria;
    }

    @Override
    public int getBateria() {
        return this.bateria;
    }
}
