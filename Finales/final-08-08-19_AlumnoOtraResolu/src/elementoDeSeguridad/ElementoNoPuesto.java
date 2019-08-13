package elementoDeSeguridad;

public class ElementoNoPuesto implements ElementoDeSeguridad{


    @Override
    public boolean estaPuesto() {
        return false;
    }

    @Override
    public ElementoDeSeguridad ponerse() {
        return new ElementoPuesto();

    }
}
