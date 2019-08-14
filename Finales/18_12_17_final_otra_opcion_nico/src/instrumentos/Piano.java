package instrumentos;

import materiales.Material;
import musicos.Musico;

public class Piano extends Instrumento{
	


	public Piano(Material material) {
		super(material);
	}

	@Override
	public int serTocado() {
		return materialInstrumento.calcularDecibeles(this);
	}
}