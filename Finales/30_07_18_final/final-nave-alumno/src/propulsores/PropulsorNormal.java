package propulsores;

public class PropulsorNormal extends Propulsor {

    private static final int FACTOR_DESPLAZAMIENTO = 1;

    public PropulsorNormal() {
        super();
        this.coeficienteDeDesplazamiento = 10;
    }

    @Override
    public int desplazarNave() {

        if (this.combustible <= 0) {
            return 0;
        }

        int distancia = FACTOR_DESPLAZAMIENTO * this.coeficienteDeDesplazamiento;
        this.reducirCombustible(distancia);

        return distancia;
    }
}
