package modelo;

public class Propulsor {

	private int nivelDeCombustible;
	private int coeficienteDeDesplazamiento;
	
	public Propulsor(){
		setNivelDeCombustible(100); //Al maximo
		coeficienteDeDesplazamiento = 10;
	}

	public int getNivelDeCombustible() {
		return nivelDeCombustible;
	}

	public void setNivelDeCombustible(int nivelDeCombustible) {
		this.nivelDeCombustible = nivelDeCombustible;
	}

	public int getCoeficienteDeDesplazamiento() {
		return coeficienteDeDesplazamiento;
	}
}
