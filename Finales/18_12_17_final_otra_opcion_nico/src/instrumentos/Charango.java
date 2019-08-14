package instrumentos;

import materiales.Madera;
import materiales.Material;
import musicos.Musico;

public class Charango  extends Instrumento{


	public Charango(Material material) {
		super(material);
	}

	@Override
	public int serTocado() {
			return materialInstrumento.calcularDecibeles(this);
	}
}