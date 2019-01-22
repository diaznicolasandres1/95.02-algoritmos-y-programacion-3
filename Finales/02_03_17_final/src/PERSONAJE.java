package examen;

public abstract class PERSONAJE {
	int vida;
	
	public PERSONAJE (){
		this.vida = 100;
	}

	public abstract void recibDan(Danio danio);

}
