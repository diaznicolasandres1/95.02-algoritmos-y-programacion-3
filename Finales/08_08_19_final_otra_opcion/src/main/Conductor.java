package main;

public class Conductor {

	private boolean cascoPuesto;
	private boolean cinturonAbrochado;
	private int multasImpagas;
	private Vehiculo loQueEstoyManejando;
	
	public Conductor(Vehiculo vehiculo) {
		this.cascoPuesto = false;
		this.cascoPuesto = false;
		this.multasImpagas = 0;
		this.loQueEstoyManejando = vehiculo;
	}
	
	public void abrocharseElCinturon() {
		this.cinturonAbrochado = true;
	}
	
	public void ponerseElCasco() {
		this.cascoPuesto = true;
	}
	
	public void agregarInfraccion(int monto) {
		this.multasImpagas = this.multasImpagas + monto;
	}
	
	public void pagarInfraccion(int monto) {
		this.multasImpagas = this.multasImpagas - monto;
	}
	
	public boolean puedoCircular() {
		
		if (this.loQueEstoyManejando == Vehiculo.AUTO) {
			return this.cinturonAbrochado && this.multasImpagas <= 0;
		}
		
		if (this.loQueEstoyManejando == Vehiculo.MOTO) {
			return this.cascoPuesto && this.multasImpagas <= 0;
		}
		
		//por default no puedo, porque otra cosa no sé manejar
		return false;
	}
	
}
