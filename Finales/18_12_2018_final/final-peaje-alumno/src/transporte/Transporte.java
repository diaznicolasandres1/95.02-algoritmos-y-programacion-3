package transporte;

import telepase.EstadoTelepase;
import telepase.EstadoTelepaseInstalado;
import telepase.EstadoTelepaseNoInstalado;

public abstract class Transporte {
	
	protected int ruedas;
	protected EstadoTelepase telepase;

	public Transporte(int ruedas) {
		this.ruedas = ruedas;
		this.telepase = new EstadoTelepaseNoInstalado();
	}

	public void instalarTelepase() {
		this.telepase = new EstadoTelepaseInstalado();
	}

	public abstract int calcularPeaje(int precioPorRueda);
}