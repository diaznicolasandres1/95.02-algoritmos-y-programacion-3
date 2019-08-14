package instrumentos;

import materiales.Material;

public class Saxo extends Instrumento {
    public Saxo(Material material) {
        super(material);
    }

    @Override
    public int serTocado() {
        return materialInstrumento.calcularDecibeles(this);
    }
}
