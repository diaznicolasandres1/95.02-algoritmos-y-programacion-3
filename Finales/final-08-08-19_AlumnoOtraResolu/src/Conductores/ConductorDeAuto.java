package Conductores;


import elementoDeSeguridad.ElementoDeSeguridad;
import elementoDeSeguridad.ElementoNoPuesto;
import infraccion.Infracciones;

public class ConductorDeAuto extends Conductor {

    private ElementoDeSeguridad cinturon = new ElementoNoPuesto();

    public ConductorDeAuto(){
        super(new Infracciones(20,2000));
    }

    public void abrocharCinturon(){
        this.cinturon = cinturon.ponerse();
    }

    @Override
    public boolean puedeConducir() {
        return this.cinturon.estaPuesto() && this.infraccion.todasPagas();
    }
}
