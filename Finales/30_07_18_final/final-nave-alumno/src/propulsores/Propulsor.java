package propulsores;

public abstract class Propulsor {

	private static final int MAX_COMBUSTIBLE = 100;
	protected int combustible;
	protected int coeficienteDeDesplazamiento;

	public Propulsor() {
		this.combustible = MAX_COMBUSTIBLE;
	}

	public abstract int desplazarNave();

	protected void reducirCombustible(int combustible) {
		this.combustible -= combustible;
	}

	public void incrementarCombustible(int combustible) {
		if (this.combustible + combustible > MAX_COMBUSTIBLE) {
			this.combustible = 100;
		} else {
			this.combustible += combustible;
		}
	}

	public int getCombustible() {
		return this.combustible;
	}
}
