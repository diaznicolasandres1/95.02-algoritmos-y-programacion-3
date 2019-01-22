package examen;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SuperTest {

	@Test
	public void superUltratest() {
		
		Goku goku1 = new Goku();
		Goku goku2 = new Goku();
		
		Freezer freezer1 = new Freezer();
		Freezer freezer2 = new Freezer();
		
		//Pruebo que goku no le puede hacer danio a goku
		int vidaInicial = goku2.vida;
		goku1.atacar(goku2);
		assertTrue(vidaInicial==goku2.vida);
		
		//-----------------------------------------------------------------------
		
		//Pruebo que freezer no le puede hacer danio a freezer
		int vidaInicial2 = freezer2.vida;
		freezer1.atacar(freezer2);
		assertTrue(vidaInicial2==freezer2.vida);
		
		//-----------------------------------------------------------------------
		
		//Pruebo que goku dania a freezer
		int vidaInicialFreezer1 = freezer1.vida;
		goku1.atacar(freezer1);
		assertTrue(vidaInicialFreezer1 > freezer1.vida);
		
		//-----------------------------------------------------------------------
		
		//Pruebo que freezer dania a goku
		int vidaInicialGoku1 = goku1.vida;
		freezer1.atacar(goku1);
		assertTrue(vidaInicialGoku1 > goku1.vida);
		
		//-----------------------------------------------------------------------
		
		//OH NO !!!!! Freezer mata a krilin goku se enoja mucho
		goku1.nivel = "superyayayin";
		
		//goku ataca mas fuerte !
		int ataquePrevioGoku = vidaInicialFreezer1 - freezer1.vida;
		goku1.atacar(freezer2);
		int ataqueSuperYayayin = vidaInicial2 - freezer2.vida;
		assertTrue(ataqueSuperYayayin > ataquePrevioGoku);
		
		//-----------------------------------------------------------------------
		
		// Freezer resiste danios un tiempo y decide cambiar su etapa para tener m�s poder
		
		int vidaGoku = goku1.vida;
		
		freezer2.atacar(goku1);
		
		int vidaGokuDespuesAtaque = goku1.vida;
		int ataqueFreezerEtapaInicial = vidaGoku - vidaGokuDespuesAtaque;
		
		goku1.atacar(freezer2);
		
		//Freezer cambio su etapa !! ataca mas fuerte ahora !!!!
		freezer2.atacar(goku1);
		
		int vidaGokuDespuesAtaqueEtapa2 = goku1.vida;
		int ataqueFreezerEtapa2 = vidaGokuDespuesAtaque - vidaGokuDespuesAtaqueEtapa2;

		assertTrue(ataqueFreezerEtapa2 > ataqueFreezerEtapaInicial);
	}

}
