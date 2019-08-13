package elementoDeSeguridad;

public class ElementoPuesto implements ElementoDeSeguridad {

    @Override
    public boolean estaPuesto() {
        return true;
    }

    @Override
    public ElementoDeSeguridad ponerse() {
        return new ElementoPuesto();
    }
}