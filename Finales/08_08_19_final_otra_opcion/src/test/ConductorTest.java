package test;

import org.junit.Assert;
import org.junit.Test;

import main.Conductor;
import main.Vehiculo;

public class ConductorTest {

	
	/****************************************************************************************
	 * MOTO TEST
	 ****************************************************************************************/
	
	@Test
	public void testManejoUnaMotoSinCascoNoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(Vehiculo.MOTO);
		Assert.assertFalse(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnaMotoConCascoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(Vehiculo.MOTO);
		conductor.ponerseElCasco();
		Assert.assertTrue(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnaMotoConCascoYMultasNoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(Vehiculo.MOTO);
		conductor.ponerseElCasco();
		conductor.agregarInfraccion(100);
		Assert.assertFalse(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnaMotoConCascoAgregoUnaMultaLuegoLaPagoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(Vehiculo.MOTO);
		conductor.ponerseElCasco();
		conductor.agregarInfraccion(100);
		conductor.pagarInfraccion(100);
		Assert.assertTrue(conductor.puedoCircular());
	}
	
	
	
	/****************************************************************************************
	 * AUTO TEST
	 ****************************************************************************************/
	
	@Test
	public void testManejoUnAutoSinCinturonAbrochadoNoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(Vehiculo.AUTO);
		Assert.assertFalse(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnAutoConCinturonAbrochadoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(Vehiculo.AUTO);
		// Abrochate a la vida !!!
		conductor.abrocharseElCinturon();
		Assert.assertTrue(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnAutoConCinturonAbrochadoYMultasNoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(Vehiculo.AUTO);
		conductor.abrocharseElCinturon();
		conductor.agregarInfraccion(100);
		Assert.assertFalse(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnAutoConCinturonAbrochadAgregoUnaMultaLuegoLaPagoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(Vehiculo.AUTO);
		conductor.abrocharseElCinturon();
		conductor.agregarInfraccion(250);
		conductor.pagarInfraccion(250);
		Assert.assertTrue(conductor.puedoCircular());
	}
}
