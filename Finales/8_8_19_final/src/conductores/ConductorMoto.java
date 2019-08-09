package conductores;

import infracciones.InfraccionDinero;
import infracciones.InfraccionHoras;

public class ConductorMoto extends Conductor {
    @Override
    public void agregarInfraccion(InfraccionDinero infraccion) {
        this.multasImpagas += infraccion.calcularCostoInfraccion(this);
    }

    @Override
    public void agregarInfraccion(InfraccionHoras infraccionHoras) {
        this.horasNoTrabajadas += infraccionHoras.calcularCostoInfraccion(this);
    }

    public void ponerseCasco(){
        this.estadoSeguridadConductor = new EstadoSeguro();
    }

    @Override
    public boolean puedoCircular() {
        return this.estadoSeguridadConductor.puedeConducir(this);
    }
}
