package examen;

public class Goku extends PERSONAJE{
	
	String nivel = "yayayin";
	
	public void atacar(PERSONAJE p){
			
			if (nivel == "yayayin"){
				p.recibDan(new Danio("HAME-HAME-HA",15));
			}else if (nivel == "superyayayin")
			{
				p.recibDan(new Danio("HENKI-DAMA",30));
			}
	}
	
	public void recibDan(Danio danio) {
		
		if (danio.n != "HAME-HAME-HA" && danio.n != "HENKI-DAMA"){
			this.vida = this.vida - danio.danio;
		}
	}
}
