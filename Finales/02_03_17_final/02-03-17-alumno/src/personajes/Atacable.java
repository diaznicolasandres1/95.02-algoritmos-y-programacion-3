package personajes;

public interface Atacable {

    void recibirDanio(Atacante atacante);

    void recibirDanio(Goku atacante, int danio);

    void recibirDanio(Freezer atacante, int danio);

    void reducirVida(int vida);
}
