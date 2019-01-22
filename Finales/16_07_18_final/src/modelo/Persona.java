package modelo;

public class Persona {
	Auto auto;
	Moto moto;
	
	public void subirseA(Auto auto) {
		this.auto = auto;
		this.moto = null;
	}
	public void subirseA(Moto moto) {
		this.auto = null;
		this.moto = moto;
	}

	public int getVelocidadDeVehiculo(Superficie superficie) {
		
		if( this.auto != null) {
			
			if(superficie == Superficie.ASFALTO_LISO) {
				return 40;
			}
			if(superficie == Superficie.ASFALTO_CON_PERROS_FURIOSOS) {
				return 40;
			}
			if(superficie == Superficie.ASFALTO_CON_LOMA_DE_BURRO) {
				return 20;
			}
			if(superficie == Superficie.CALLE_EMBARRADA) {
				
				if(auto.auto4x4 == true ) {
					return 10;
				}
				else  return 0;
			}
			
		}
		if( this.moto != null) {
			
			if(superficie == Superficie.ASFALTO_LISO) {
				return 40;
			}
			if(superficie == Superficie.ASFALTO_CON_PERROS_FURIOSOS) {
				return 20;
			}
			if(superficie == Superficie.ASFALTO_CON_LOMA_DE_BURRO) {
				return 20;
			}
			if(superficie == Superficie.CALLE_EMBARRADA) {
				  return 0;
			}
			
		}
		return 5;
	}
}
