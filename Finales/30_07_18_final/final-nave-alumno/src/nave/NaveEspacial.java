package nave;

import camuflajes.Camuflajeable;
import camuflajes.EstadoCamuflaje;
import camuflajes.EstadoCamuflajeActivo;
import camuflajes.EstadoCamuflajeInactivo;
import propulsores.Propulsor;
import propulsores.PropulsorNormal;

public class NaveEspacial implements Atacable, Atacante {

	private Camuflajeable camuflaje;
	private int vida;
	private Canion canion;
	private Propulsor propulsor;

	public NaveEspacial(Camuflajeable camuflaje, Propulsor propulsor) {
		this.camuflaje = camuflaje;
		this.vida = 100;
		this.canion = new Canion();
		this.propulsor = propulsor;
	}

	@Override
	public void recibirDanio(int danio) {
		this.camuflaje.recibirDanio(this, danio);
	}

	@Override
	public void reducirVida(int vida) {
		this.vida -= vida;
	}

	@Override
	public void activarCamuflaje() {
		this.camuflaje.activar();
	}

	@Override
	public void desactivarCamuflaje() {
		this.camuflaje.desactivar();
	}

	@Override
	public void atacar(Atacable objetivo) {
		this.canion.disparar(objetivo);
	}
	
	public int moverse() {
		return this.propulsor.desplazarNave();
	}

	public void cargarCombustible(int combustible) {
		this.propulsor.incrementarCombustible(combustible);
	}

	public int getVida() {
		return this.vida;
	}

	public int getCombustible() {
		return this.propulsor.getCombustible();
	}
}
