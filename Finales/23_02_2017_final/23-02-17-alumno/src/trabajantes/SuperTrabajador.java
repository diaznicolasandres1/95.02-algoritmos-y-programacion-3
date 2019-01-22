package trabajantes;

import alimentos.Alimento;
import trabajables.Trabajable;

public class SuperTrabajador extends PersonaTrabajadora {

    public SuperTrabajador(String nombre, int peso) {
        super(nombre, peso);
    }

    @Override
    public Producto trabajar(Trabajable trabajable) {
        return trabajable.elaborarPor(this);
    }

    @Override
    public void comer(Alimento alimento) {
        alimento.alimentar(this);
    }
}
