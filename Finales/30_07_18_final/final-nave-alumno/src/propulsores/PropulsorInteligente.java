package propulsores;

public class PropulsorInteligente extends Propulsor {

    public PropulsorInteligente() {
        super();
    }

    @Override
    public int desplazarNave() {

        if (this.combustible > 50) {
            this.coeficienteDeDesplazamiento = 10;
        } else if (this.combustible <= 50 && this.combustible > 0){
            this.coeficienteDeDesplazamiento = 5;
        } else {
            return 0;
        }
        this.reducirCombustible(this.coeficienteDeDesplazamiento);
        return coeficienteDeDesplazamiento;
    }
}
