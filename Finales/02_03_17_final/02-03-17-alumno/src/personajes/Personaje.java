package personajes;

public abstract class Personaje implements Atacable, Atacante {

	protected int vida;
	
	public Personaje(){
		this.vida = 100;
	}

	@Override
	public void reducirVida(int vida) {
		this.vida -= vida;
	}

	public int getVida() {
		return this.vida;
	}
}
