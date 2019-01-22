package camuflajes;

import nave.Atacable;

public class ConCamuflaje implements Camuflajeable {

    private EstadoCamuflaje estado;

    public ConCamuflaje() {
        this.estado = new EstadoCamuflajeInactivo();
    }

    @Override
    public void recibirDanio(Atacable atacable, int danio) {
        this.estado.recibirDanio(atacable, danio);
    }

    @Override
    public void activar() {
        this.estado.activar(this);
    }

    @Override
    public void desactivar() {
        this.estado.desactivar(this);
    }

    @Override
    public void setCamuflajeInactivo() {
        this.estado = new EstadoCamuflajeInactivo();
    }

    @Override
    public void setCamuflajeActivo() {
        this.estado = new EstadoCamuflajeActivo();
    }
}
