package infracciones;

import conductores.Conductor;
import conductores.ConductorAuto;
import conductores.ConductorMoto;

public class CruzarSemaforoRojo implements InfraccionHoras {
    @Override
    public int calcularCostoInfraccion(Conductor conductor) {
        throw new ConductorNoConocidoException();
    }


    //HORAS DE TRABAJO
    @Override
    public int calcularCostoInfraccion(ConductorAuto conductor) {
        return 20;
    }

    @Override
    public int calcularCostoInfraccion(ConductorMoto conductor) {
        return 15;
    }
}
