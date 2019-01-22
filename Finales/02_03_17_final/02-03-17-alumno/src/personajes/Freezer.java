package personajes;

import etapas.Etapa;
import etapas.EtapaDos;
import etapas.EtapaUno;

public class Freezer extends Personaje {

	private static final int MIN_VIDA_PARA_EVOLUCIONAR = 40;
	private Etapa etapa;
	
	public Freezer() {
		super();
		this.etapa = new EtapaUno();
	}
	
	public void atacar(Atacable objetivo) {
		this.etapa.atacar(this, objetivo);
	}

	public void evolucionar() {
		this.etapa = new EtapaDos();
	}

	@Override
	public void recibirDanio(Atacante atacante) {
		atacante.atacar(this);
	}

	@Override
	public void recibirDanio(Goku atacante, int danio) {
		this.reducirVida(danio);
		this.verificarEvolucion();
	}

	@Override
	public void recibirDanio(Freezer atacante, int danio) {
		// Freezer no le puede hacer danio a Freezer
	}

	private void verificarEvolucion() {

		if (this.tieneVidaParaEvolucionar()) {
			this.evolucionar();
		}
	}

	private boolean tieneVidaParaEvolucionar() {
		return this.vida <= MIN_VIDA_PARA_EVOLUCIONAR;
	}
}
