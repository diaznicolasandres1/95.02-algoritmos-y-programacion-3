package test;

import Conductores.ConductorDeAuto;
import Conductores.ConductorDeMotos;
import org.junit.Test;

import Conductores.Conductor;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;


public class ConductorTest {

	
	/****************************************************************************************
	 * MOTO TEST
	 ****************************************************************************************/
	
	@Test
	public void testManejoUnaMotoSinCascoNoDeberiaPoderCircular() {
		Conductor conductorMoto = new ConductorDeMotos();
		assertFalse(conductorMoto.puedeConducir());
	}


	@Test
	public void testManejoUnaMotoConCascoDeberiaPoderCircular() {
		ConductorDeMotos conductorMoto = new ConductorDeMotos();
		conductorMoto.ponerCasco();
		assertTrue(conductorMoto.puedeConducir());
	}

	
	@Test
	public void testManejoUnaMotoConCascoYMultasNoDeberiaPoderCircular() {
		ConductorDeMotos conductorMoto = new ConductorDeMotos();
		conductorMoto.ponerCasco();
		conductorMoto.agregarInfraccionPorMalEstacionamiento();
		assertFalse(conductorMoto.puedeConducir());
	}
	
	@Test
	public void testManejoUnaMotoConCascoAgregoUnaMultaLuegoLaPagoDeberiaPoderCircular() {
		ConductorDeMotos conductorMoto = new ConductorDeMotos();
		conductorMoto.ponerCasco();
		conductorMoto.agregarInfraccionPorMalEstacionamiento();
		conductorMoto.pagarInfraccionPorMalEstacionamiento();
		assertTrue(conductorMoto.puedeConducir());
	}
	
	
	
	/****************************************************************************************
	 * AUTO TEST
	 ****************************************************************************************/
	
	@Test
	public void testManejoUnAutoSinCinturonAbrochadoNoDeberiaPoderCircular() {
		ConductorDeAuto conductor = new ConductorDeAuto();
		assertFalse(conductor.puedeConducir());
	}
	
	@Test
	public void testManejoUnAutoConCinturonAbrochadoDeberiaPoderCircular() {
		ConductorDeAuto conductor = new ConductorDeAuto();
		conductor.abrocharCinturon();
		assertTrue(conductor.puedeConducir());
	}

		@Test
	public void testManejoUnAutoConCinturonAbrochadoYMultasNoDeberiaPoderCircular() {
		ConductorDeAuto conductor = new ConductorDeAuto();
		conductor.abrocharCinturon();
		conductor.agregarInfraccionPorMalEstacionamiento();
		assertFalse(conductor.puedeConducir());
	}
	
	@Test
	public void testManejoUnAutoConCinturonAbrochadAgregoUnaMultaLuegoLaPagoDeberiaPoderCircular() {
		ConductorDeAuto conductor = new ConductorDeAuto();
		conductor.abrocharCinturon();
		conductor.agregarInfraccionPorMalEstacionamiento();
		conductor.pagarInfraccionPorMalEstacionamiento();
		assertTrue(conductor.puedeConducir());
	}

}
