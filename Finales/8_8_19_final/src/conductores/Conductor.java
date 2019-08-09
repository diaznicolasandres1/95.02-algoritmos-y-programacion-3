package conductores;

import infracciones.InfraccionDinero;
import infracciones.InfraccionHoras;

public abstract class Conductor {


	protected int multasImpagas;
	protected int horasNoTrabajadas;
	protected EstadoSeguridadConductor estadoSeguridadConductor;

	public Conductor() {
		this.multasImpagas = 0;
		this.horasNoTrabajadas =0;
		this.estadoSeguridadConductor = new EstadoInseguro();
	}

	public abstract void  agregarInfraccion(InfraccionDinero infraccion);
	public abstract void agregarInfraccion(InfraccionHoras infraccionHoras);

	public  abstract boolean puedoCircular();
	
	public void pagarInfraccion(int monto) {
		this.multasImpagas = this.multasImpagas - monto;
	}

	public void trabajarHoras(int cantidadHoras){
		this.horasNoTrabajadas = this.horasNoTrabajadas-cantidadHoras;
	}

	public boolean conductorTieneMultasPagas(){
		return this.multasImpagas <= 0;
	}

	public boolean conductorTieneHorasTrabajadas(){
		return this.horasNoTrabajadas <=0;
	}



		/*
		
		if (this.loQueEstoyManejando == Vehiculo.AUTO) {
			return this.cinturonAbrochado && this.multasImpagas <= 0;
		}
		
		if (this.loQueEstoyManejando == Vehiculo.MOTO) {
			return this.cascoPuesto && this.multasImpagas <= 0;
		}
		
		//por default no puedo, porque otra cosa no sé manejar
		return false;
	}

		 */
	
}
