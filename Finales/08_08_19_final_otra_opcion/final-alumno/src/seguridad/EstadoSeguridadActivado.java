package seguridad;

public class EstadoSeguridadActivado implements EstadoSeguridad {

    @Override
    public boolean puedeCircular() {
        return true;
    }
}
