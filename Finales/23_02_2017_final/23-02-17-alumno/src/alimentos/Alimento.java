package alimentos;

import trabajantes.Alimentable;
import trabajantes.SuperTrabajador;
import trabajantes.Trabajador;

public class Alimento {

    private String nombre;
    private EstadoAlimento estado;

    public Alimento(String nombre, EstadoAlimento estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public void alimentar(Alimentable alimentable) {
        alimentable.comer(this);
    }

    public void alimentar(Trabajador trabajador) {
        this.estado.alimentar(trabajador);
    }

    public void alimentar(SuperTrabajador superTrabajador) {
        this.estado.alimentar(superTrabajador);
    }
}
