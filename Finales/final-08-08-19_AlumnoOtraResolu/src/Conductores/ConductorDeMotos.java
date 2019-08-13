package Conductores;

import elementoDeSeguridad.ElementoDeSeguridad;
import elementoDeSeguridad.ElementoNoPuesto;
import infraccion.Infracciones;

public class ConductorDeMotos extends Conductor {

    ElementoDeSeguridad casco = new ElementoNoPuesto();

    public ConductorDeMotos(){
        super(new Infracciones(15,2000));

    }

    public void ponerCasco(){
        this.casco = casco.ponerse();
    }

    @Override
    public boolean puedeConducir() {
        return this.casco.estaPuesto() && this.infraccion.todasPagas();
    }
}
