package test;

import org.junit.Assert;
import org.junit.Test;

import modelo.NaveEspacial;

public class NaveEspacialTest {
	
	@Test
	public void naveEspacialEmpiezaCon100DeVida() {
		
		// 1. A
		boolean conCamuflaje = false;
		NaveEspacial nave = new NaveEspacial(conCamuflaje);

		// 2. A
		int vida = nave.vida;
		
		// 3. A
		Assert.assertEquals(100, vida);
	}
	

	@Test
	public void naveEspacialAtacaOtraNaveEspacialSinCamuflajeProduciria25DeDanio() {
		
		// 1. A
		boolean conCamuflaje = false;
		NaveEspacial nave = new NaveEspacial(conCamuflaje);
		NaveEspacial naveEnemiga = new NaveEspacial(conCamuflaje);

		// 2. A
		nave.atacar(naveEnemiga);
		
		
		// 3. A
		Assert.assertEquals(75, naveEnemiga.vida);
	}
	
	@Test
	public void naveEspacialAtacaOtraNaveEspacialConCamuflajeInactivoProduciria25DeDanio() {
		
		// 1. A
		boolean camuflaje = false;
		NaveEspacial nave = new NaveEspacial(camuflaje);
		boolean conCamuflaje = true;
		NaveEspacial naveEnemiga = new NaveEspacial(conCamuflaje);

		// 2. A
		nave.atacar(naveEnemiga);
		
		
		// 3. A
		Assert.assertEquals(75, naveEnemiga.vida);
	}
	
	
	@Test
	public void naveEspacialAtacaOtraNaveEspacialConCamuflajeActivoNoProduciriaDanio() {
		
		// 1. A
		boolean camuflaje = false;
		NaveEspacial nave = new NaveEspacial(camuflaje);
		boolean conCamuflaje = true;
		NaveEspacial naveEnemiga = new NaveEspacial(conCamuflaje);
		naveEnemiga.activarCamuflaje();
		
		// 2. A
		nave.atacar(naveEnemiga);
		
		
		// 3. A
		Assert.assertEquals(100, naveEnemiga.vida);
	}
	
	@Test
	public void naveEspacialSeDesplaza10UnidadesPorTurno() {
		
		// 1. A
		boolean camuflaje = false;
		NaveEspacial nave = new NaveEspacial(camuflaje);

		
		// 2. A
		int unidadesDesplazadas = nave.moverse();
		
		
		// 3. A
		Assert.assertEquals(10, unidadesDesplazadas);
	}
	
	@Test
	public void naveEspacialAlDesplazarseUnTurnoGastaria10UnidadesDeCombustible() {
		
		// 1. A
		boolean camuflaje = false;
		NaveEspacial nave = new NaveEspacial(camuflaje);

		
		// 2. A
		nave.moverse();
		
		
		// 3. A
		Assert.assertEquals(90, nave.getPropulsor().getNivelDeCombustible());
	}

}
