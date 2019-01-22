package trabajantes;

public abstract class PersonaTrabajadora implements Trabajante, Alimentable {

    protected String nombre;
    protected int pesoCorporal;

    public PersonaTrabajadora(String nombre, int pesoCorporal) {
        this.nombre = nombre;
        this.pesoCorporal = pesoCorporal;
    }

    @Override
    public void incrementarPeso(int peso) {
        this.pesoCorporal += peso;
    }

    @Override
    public int getPesoCorporal() {
        return this.pesoCorporal;
    }

}
