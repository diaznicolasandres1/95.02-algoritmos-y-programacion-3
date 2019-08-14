package instrumentos;

import materiales.Material;
import musicos.Musico;

public class GuitarraCriolla  extends Instrumento{


	public GuitarraCriolla(Material material) {
		super(material);
	}

	@Override
	public int serTocado() {
		return materialInstrumento.calcularDecibeles(this);
	}
}