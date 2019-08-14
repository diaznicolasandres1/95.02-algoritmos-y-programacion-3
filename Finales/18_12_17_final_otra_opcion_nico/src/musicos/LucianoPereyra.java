package musicos;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;

public class LucianoPereyra implements  Musico {

	@Override
	public int tocarInstrumento(GuitarraCriolla guitarra) {
		return NO_SABE_TOCARLO;
	}

	@Override
	public int tocarInstrumento(Charango charango) {
		return charango.serTocado();
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
			Charango c = (Charango) i;
			
			if (c.material == "Madera"){
				return c.decibeles * 2;
			}
		
			if (c.material == "Plastico"){
				return c.decibeles;
			}
			
		}catch(ClassCastException e2){
			System.out.println("No se tocar eso...");
		}			
		
		return 0;
	}

 */

}