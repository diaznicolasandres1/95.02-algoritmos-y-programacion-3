package infracciones;

import conductores.Conductor;
import conductores.ConductorAuto;
import conductores.ConductorMoto;

public class MalEstacionado implements InfraccionDinero {
    @Override
    public int calcularCostoInfraccion(Conductor conductor) {
        throw new ConductorNoConocidoException();
    }

    @Override
    public int calcularCostoInfraccion(ConductorAuto conductor) {
        return  2500;
    }

    @Override
    public int calcularCostoInfraccion(ConductorMoto conductor) {
        return 2500;
    }
}
