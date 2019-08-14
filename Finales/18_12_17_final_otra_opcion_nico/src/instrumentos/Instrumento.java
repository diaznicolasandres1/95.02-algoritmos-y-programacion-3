package instrumentos;

import materiales.Material;
import musicos.Musico;

public abstract class Instrumento {
    protected Material materialInstrumento;

    public Instrumento(Material material){
        this.materialInstrumento = material;
    }
    public abstract int serTocado();
}
