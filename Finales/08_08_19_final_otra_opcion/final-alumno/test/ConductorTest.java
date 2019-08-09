import infracciones.MalEstacionamiento;
import infracciones.SemaforoEnRojo;
import org.junit.Assert;
import org.junit.Test;
import vehiculos.Auto;
import vehiculos.Conductor;
import vehiculos.Moto;

public class ConductorTest {

	/****************************************************************************************
	 * MOTO TEST
	 ****************************************************************************************/
	
	@Test
	public void testManejoUnaMotoSinCascoNoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Moto());
		Assert.assertFalse(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnaMotoConCascoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Moto());
		conductor.ponerseSeguridad();
		Assert.assertTrue(conductor.puedoCircular());
	}

	@Test
	public void testManejoUnaMotoPongoYSacoCascoNoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Moto());
		conductor.ponerseSeguridad();
		conductor.sacarseSeguridad();
		Assert.assertFalse(conductor.puedoCircular());
	}

	@Test
	public void testManejoUnMotoConCascoPuestoYMultaDeSemaforoEnRojoNoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Moto());
		conductor.ponerseSeguridad();
		conductor.agregarInfraccion(new SemaforoEnRojo());
		Assert.assertFalse(conductor.puedoCircular());
	}

	@Test
	public void testManejoUnMotoConCascoPuestoYMultaDeSemaforoEnRojoYLuegoLaPagoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Moto());
		conductor.ponerseSeguridad();
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.pagarInfraccion(new SemaforoEnRojo());
		Assert.assertTrue(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnaMotoConCascoYMultaDeMalEstacionamientoNoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Moto());
		conductor.ponerseSeguridad();
		conductor.agregarInfraccion(new MalEstacionamiento());
		Assert.assertFalse(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnaMotoConCascoAgregoUnaMultaDeMalEstacionamientoLuegoLaPagoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Moto());
		conductor.ponerseSeguridad();
		conductor.agregarInfraccion(new MalEstacionamiento());
		conductor.pagarInfraccion(new MalEstacionamiento());
		Assert.assertTrue(conductor.puedoCircular());
	}

	@Test
	public void testManejoUnaMotoConCascoAgregoVariasMultasDeMalEstacionamientoLuegoLasPagoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Moto());
		conductor.ponerseSeguridad();
		conductor.agregarInfraccion(new MalEstacionamiento());
		conductor.agregarInfraccion(new MalEstacionamiento());
		conductor.agregarInfraccion(new MalEstacionamiento());
		conductor.agregarInfraccion(new MalEstacionamiento());
		conductor.pagarInfraccion(new MalEstacionamiento());
		conductor.pagarInfraccion(new MalEstacionamiento());
		conductor.pagarInfraccion(new MalEstacionamiento());
		conductor.pagarInfraccion(new MalEstacionamiento());
		Assert.assertTrue(conductor.puedoCircular());
	}

	@Test
	public void testManejoUnaMotoConCascoAgregoVariasMultasDeSemaforoEnRojoLuegoLasPagoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Moto());
		conductor.ponerseSeguridad();
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.pagarInfraccion(new SemaforoEnRojo());
		conductor.pagarInfraccion(new SemaforoEnRojo());
		conductor.pagarInfraccion(new SemaforoEnRojo());
		conductor.pagarInfraccion(new SemaforoEnRojo());
		Assert.assertTrue(conductor.puedoCircular());
	}

	@Test
	public void testManejoUnaMotoConCascoAgregoVariasMultasDiversasYNoPuedoCircular() {
		Conductor conductor = new Conductor(new Moto());
		conductor.ponerseSeguridad();
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new MalEstacionamiento());
		conductor.agregarInfraccion(new MalEstacionamiento());
		Assert.assertFalse(conductor.puedoCircular());
	}

	@Test
	public void testManejoUnaMotoConCascoAgregoVariasMultasDiversasYLasPagoPuedoCircular() {
		Conductor conductor = new Conductor(new Moto());
		conductor.ponerseSeguridad();
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new MalEstacionamiento());
		conductor.agregarInfraccion(new MalEstacionamiento());
		conductor.pagarInfraccion(new SemaforoEnRojo());
		conductor.pagarInfraccion(new SemaforoEnRojo());
		conductor.pagarInfraccion(new SemaforoEnRojo());
		conductor.pagarInfraccion(new MalEstacionamiento());
		conductor.pagarInfraccion(new MalEstacionamiento());
		Assert.assertTrue(conductor.puedoCircular());
	}
	
	/****************************************************************************************
	 * AUTO TEST
	 ****************************************************************************************/
	
	@Test
	public void testManejoUnAutoSinCinturonAbrochadoNoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Auto());
		Assert.assertFalse(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnAutoConCinturonAbrochadoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Auto());
		conductor.ponerseSeguridad();
		Assert.assertTrue(conductor.puedoCircular());
	}

	@Test
	public void testManejoUnAutoConCinturonAbrochadoLuegoMeLoSacoNoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Auto());
		conductor.ponerseSeguridad();
		conductor.sacarseSeguridad();
		Assert.assertFalse(conductor.puedoCircular());
	}

	@Test
	public void testManejoUnAutoConCinturonAbrochadoYMultaDeSemaforoEnRojoNoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Auto());
		conductor.ponerseSeguridad();
		conductor.agregarInfraccion(new SemaforoEnRojo());
		Assert.assertFalse(conductor.puedoCircular());
	}

	@Test
	public void testManejoUnAutoConCinturonAbrochadoYMultaDeSemaforoEnRojoYLuegoLaPagoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Auto());
		conductor.ponerseSeguridad();
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.pagarInfraccion(new SemaforoEnRojo());
		Assert.assertTrue(conductor.puedoCircular());
	}
	
	@Test
	public void testManejoUnAutoConCinturonAbrochadoYMultaDeMalEstacionamientoNoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Auto());
		conductor.ponerseSeguridad();
		conductor.agregarInfraccion(new MalEstacionamiento());
		Assert.assertFalse(conductor.puedoCircular());
	}

	@Test
	public void testManejoUnAutoConCinturonAbrochadAgregoUnaMultaDeMalEstacionamientoLuegoLaPagoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Auto());
		conductor.ponerseSeguridad();
		conductor.agregarInfraccion(new MalEstacionamiento());
		conductor.pagarInfraccion(new MalEstacionamiento());
		Assert.assertTrue(conductor.puedoCircular());
	}

	@Test
	public void testManejoUnAutoConCinturonAbrochadAgregoVariasMultasDeMalEstacionamientoLuegoLasPagoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Auto());
		conductor.ponerseSeguridad();
		conductor.agregarInfraccion(new MalEstacionamiento());
		conductor.agregarInfraccion(new MalEstacionamiento());
		conductor.agregarInfraccion(new MalEstacionamiento());
		conductor.pagarInfraccion(new MalEstacionamiento());
		conductor.pagarInfraccion(new MalEstacionamiento());
		conductor.pagarInfraccion(new MalEstacionamiento());
		Assert.assertTrue(conductor.puedoCircular());
	}

	@Test
	public void testManejoUnAutoConCinturonAbrochadAgregoVariasMultasDeSemaforoEnRojoLuegoLasPagoDeberiaPoderCircular() {
		Conductor conductor = new Conductor(new Auto());
		conductor.ponerseSeguridad();
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.pagarInfraccion(new SemaforoEnRojo());
		conductor.pagarInfraccion(new SemaforoEnRojo());
		conductor.pagarInfraccion(new SemaforoEnRojo());
		conductor.pagarInfraccion(new SemaforoEnRojo());
		Assert.assertTrue(conductor.puedoCircular());
	}

	@Test
	public void testManejoUnAutoConCinturonAgregoVariasMultasDiversasYNoPuedoCircular() {
		Conductor conductor = new Conductor(new Auto());
		conductor.ponerseSeguridad();
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new MalEstacionamiento());
		conductor.agregarInfraccion(new MalEstacionamiento());
		Assert.assertFalse(conductor.puedoCircular());
	}

	@Test
	public void testManejoUnAutoConCinturonAgregoVariasMultasDiversasYLasPagoPuedoCircular() {
		Conductor conductor = new Conductor(new Auto());
		conductor.ponerseSeguridad();
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new SemaforoEnRojo());
		conductor.agregarInfraccion(new MalEstacionamiento());
		conductor.agregarInfraccion(new MalEstacionamiento());
		conductor.pagarInfraccion(new SemaforoEnRojo());
		conductor.pagarInfraccion(new SemaforoEnRojo());
		conductor.pagarInfraccion(new SemaforoEnRojo());
		conductor.pagarInfraccion(new MalEstacionamiento());
		conductor.pagarInfraccion(new MalEstacionamiento());
		Assert.assertTrue(conductor.puedoCircular());
	}

}
