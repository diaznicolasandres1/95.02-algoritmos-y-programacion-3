package personajes;

import niveles.Nivel;
import niveles.NivelSaiyajin;
import niveles.NivelSuperSaiyajin;

public class Goku extends Personaje {

	private Nivel nivel;

	public Goku() {
		super();
		this.nivel = new NivelSaiyajin();
	}

	public void evolucionar() {
		this.nivel = new NivelSuperSaiyajin();
	}

	@Override
	public void atacar(Atacable objetivo) {
		this.nivel.atacar(this, objetivo);
	}

	@Override
	public void recibirDanio(Atacante atacante) {
		atacante.atacar(this);
	}

	@Override
	public void recibirDanio(Goku atacante, int danio) {
		// Goku no le puede hacer danio a Goku
	}

	@Override
	public void recibirDanio(Freezer atacante, int danio) {
		this.reducirVida(danio);
	}
}
