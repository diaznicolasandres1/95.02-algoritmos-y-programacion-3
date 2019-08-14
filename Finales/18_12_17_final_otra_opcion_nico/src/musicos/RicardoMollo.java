package musicos;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;

public class RicardoMollo implements Musico {
	@Override
	public int tocarInstrumento(GuitarraCriolla guitarra) {
		return guitarra.serTocado();
	}

	@Override
	public int tocarInstrumento(Charango charango) {
		return NO_SABE_TOCARLO;
	}

	@Override
	public int tocarInstrumento(Piano piano) {
		return NO_SABE_TOCARLO;
	}

	@Override
	public int tocarInstrumento(Saxo saxo) {
		return NO_SABE_TOCARLO;
	}
/*
	public int tocar(Object i){
		try {
			GuitarraCriolla g = (GuitarraCriolla) i;
			
			if (g.material == "Madera"){
				return g.decibeles;
			}
		
			if (g.material == "Plastico"){
				return g.decibeles  - 3;
			}
			
		}catch(ClassCastException e2){
			System.out.println("No se tocar eso...");
		}			
		
		return 0;
	}

 */

}