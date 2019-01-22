package camuflajes;

import nave.Atacable;

public class SinCamuflaje implements Camuflajeable {

    @Override
    public void recibirDanio(Atacable atacable, int danio) {
        atacable.reducirVida(danio);
    }

    @Override
    public void activar() {
        throw new AtacableNoPoseeCamuflajeException();
    }

    @Override
    public void desactivar() {
        throw new AtacableNoPoseeCamuflajeException();
    }

    @Override
    public void setCamuflajeInactivo() {
        throw new AtacableNoPoseeCamuflajeException();
    }

    @Override
    public void setCamuflajeActivo() {
        throw new AtacableNoPoseeCamuflajeException();
    }
}
