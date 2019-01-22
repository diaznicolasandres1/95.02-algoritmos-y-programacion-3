package alimentos;

import trabajantes.SuperTrabajador;
import trabajantes.Trabajador;

public interface EstadoAlimento {

    void alimentar(Trabajador trabajador);

    void alimentar(SuperTrabajador superTrabajador);
}
