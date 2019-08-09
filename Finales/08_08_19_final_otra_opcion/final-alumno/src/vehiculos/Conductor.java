package vehiculos;

import infracciones.Infraccion;
import seguridad.Seguridad;
import vehiculos.Vehiculo;

public class Conductor {

	private Seguridad seguridad;
	private Vehiculo vehiculo;
	private int montoDeMultas;
	private int horasNoTrabajadas;
	
	public Conductor(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
		this.seguridad = new Seguridad();
		this.montoDeMultas = 0;
		this.horasNoTrabajadas = 0;
	}

	public void ponerseSeguridad() {
		this.seguridad.poner();
	}

	public void sacarseSeguridad() {
		this.seguridad.sacar();
	}

	public void agregarInfraccion(Infraccion infraccion) {
		infraccion.penalizar(this, this.vehiculo);
	}
	
	public void pagarInfraccion(Infraccion infraccion) {
		infraccion.despenalizar(this, this.vehiculo);
	}

	public void incrementarHorasDeTrabajoSocial(int horas) {
		this.horasNoTrabajadas += horas;
	}

	public void incrementarMontoDeMultas(int monto) {
		this.montoDeMultas += monto;
	}

	public void reducirHorasDeTrabajoSocial(int horas) {
		this.horasNoTrabajadas -= horas;
	}

	public void reducirMontoDeMultas(int monto) {
		this.montoDeMultas -= monto;
	}
	
	public boolean puedoCircular() {

		return this.vehiculo.puedeCircular(this.seguridad, this.montoDeMultas, this.horasNoTrabajadas);
		/*
		if (this.vehiculo == Vehiculo.AUTO) {
			return this.cinturonAbrochado && this.multasImpagas <= 0;
		}
		
		if (this.vehiculo == Vehiculo.MOTO) {
			return this.cascoPuesto && this.multasImpagas <= 0;
		}
		
		//por default no puedo, porque otra cosa no sé manejar
		return false;
		*/
	}
}
