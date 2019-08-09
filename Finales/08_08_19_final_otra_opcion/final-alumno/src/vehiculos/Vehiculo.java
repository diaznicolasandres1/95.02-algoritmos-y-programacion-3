package vehiculos;

import infracciones.MalEstacionamiento;
import infracciones.SemaforoEnRojo;
import seguridad.Seguridad;

public abstract class Vehiculo {

    private static final int MINIMO_MONTO_PARA_PODER_CONDUCIR = 0;
    private static final int MINIMO_HORAS_NO_TRABAJADAS_PARA_PODER_CONDUCIR = 0;

    public abstract void penalizar(Conductor conductor, MalEstacionamiento malEstacionamiento);

    public abstract void penalizar(Conductor conductor, SemaforoEnRojo semaforoEnRojo);

    public abstract void despenalizar(Conductor conductor, SemaforoEnRojo semaforoEnRojo);

    public abstract void despenalizar(Conductor conductor, MalEstacionamiento malEstacionamiento);

    public boolean puedeCircular(Seguridad seguridad, int montoDeMultas, int horasNoTrabajadas) {
        return seguridad.puedeCircular() && montoDeMultas <= MINIMO_MONTO_PARA_PODER_CONDUCIR && horasNoTrabajadas <= MINIMO_HORAS_NO_TRABAJADAS_PARA_PODER_CONDUCIR;
    }
}
