package examen;

public class Freezer extends PERSONAJE{
	
	String etapa;
	
	public Freezer(){
		super();
		etapa = "etapa1";
	}
	
	public void atacar(PERSONAJE p){
		
		if (etapa == "etapa1"){
			p.recibDan(new Danio("Cosegan",10));
		}else if (etapa == "etapa2")
		{
			p.recibDan(new Danio("SuperNova",20));
		}
	}

	@Override
	public void recibDan(Danio danio) {
		
		if (danio.n != "Cosegan" && danio.n != "SuperNova"){
			this.vida = this.vida - danio.danio;
		}

		if (this.vida <= 40){
			this.etapa = "etapa2";
		}
	}
	
	
}
