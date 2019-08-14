package musicos;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;

public class FitoPaez  implements  Musico{


	/*
	public int tocar(Object i){
		try {
			Piano p = (Piano) i;
			
			if (p.material == "Madera"){
				return p.decibeles  * 3;
			}
		
			if (p.material == "Plastico"){
				return p.decibeles  - 5;
			}
			
		}catch(ClassCastException e2){
			System.out.println("No se tocar eso...");
		}			
		
		return 0;
	}
*/
	@Override
	public int tocarInstrumento(GuitarraCriolla guitarra) {
		return NO_SABE_TOCARLO;
	}

	@Override
	public int tocarInstrumento(Charango charango) {
		return NO_SABE_TOCARLO;
	}

	@Override
	public int tocarInstrumento(Piano piano) {
		return piano.serTocado();
	}

	@Override
	public int tocarInstrumento(Saxo saxo) {
		return NO_SABE_TOCARLO;
	}
}