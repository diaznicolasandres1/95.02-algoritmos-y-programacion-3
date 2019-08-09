package infracciones;

import conductores.Conductor;
import conductores.ConductorAuto;
import conductores.ConductorMoto;

public interface InfraccionDinero {

    public abstract int calcularCostoInfraccion(Conductor conductor);
    public abstract int calcularCostoInfraccion(ConductorAuto conductor);
    public abstract int calcularCostoInfraccion(ConductorMoto conductor);

}
