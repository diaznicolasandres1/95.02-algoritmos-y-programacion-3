package conductores;

public class EstadoSeguro implements EstadoSeguridadConductor {

    //TIENE PUESTO EL CASCO O CINTURON.
    @Override
    public boolean puedeConducir(Conductor conductor) {
        return conductor.conductorTieneMultasPagas()  && conductor.conductorTieneHorasTrabajadas();
    }
}
