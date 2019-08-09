package seguridad;

import seguridad.EstadoSeguridad;
import seguridad.EstadoSeguridadActivado;
import seguridad.EstadoSeguridadDesactivado;

public class Seguridad {

    private EstadoSeguridad estado;

    public Seguridad() {
        this.estado = new EstadoSeguridadDesactivado();
    }

    public void poner() {
        this.estado = new EstadoSeguridadActivado();
    }

    public void sacar() {
        this.estado = new EstadoSeguridadDesactivado();
    }

    public boolean puedeCircular() {
        return this.estado.puedeCircular();
    }
}
