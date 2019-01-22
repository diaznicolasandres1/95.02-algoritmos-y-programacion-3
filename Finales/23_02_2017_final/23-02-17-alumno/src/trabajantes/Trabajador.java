package trabajantes;

import alimentos.Alimento;
import trabajables.Trabajable;

public class Trabajador extends PersonaTrabajadora {

    public Trabajador(String nombre, int peso) {
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
