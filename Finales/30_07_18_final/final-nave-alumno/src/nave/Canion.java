package nave;

public class Canion {

	private static final int DANIO = 25;

	public void disparar(Atacable objetivo) {
		objetivo.recibirDanio(DANIO);
	}
}
