package seguridad;

public class EstadoSeguridadDesactivado implements EstadoSeguridad {

    @Override
    public boolean puedeCircular() {
        return false;
    }
}
