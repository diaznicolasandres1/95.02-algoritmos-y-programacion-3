import transitables.Transitable;
import vehiculos.Vehiculo;

public class Persona {

	private static final int VELOCIDAD = 5;

	private Vehiculo vehiculo;

	public void subirseA(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public int calcularVelocidadEn(Transitable transitable) {

		if (!this.estaEnVehiculo()) {
			return VELOCIDAD;
		}

		return this.vehiculo.calcularVelocidadEn(transitable);
	}

	private boolean estaEnVehiculo() {
		return this.vehiculo != null;
	}
}
