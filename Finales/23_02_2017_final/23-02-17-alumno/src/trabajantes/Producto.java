package trabajantes;

public class Producto {

    private String color;
    private int tamanio;

    public Producto(String color, int tamanio) {
        this.color = color;
        this.tamanio = tamanio;
    }

    public int getTamanio() {
        return tamanio;
    }

    public String getColor() {
        return color;
    }
}
