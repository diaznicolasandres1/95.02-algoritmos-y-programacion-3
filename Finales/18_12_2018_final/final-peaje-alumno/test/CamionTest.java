import org.junit.Assert;
import org.junit.Test;
import transporte.Camion;

public class CamionTest {

    @Test
    public void test01CamionInstalaTelepaseDosVecesLanzaExcepcion() {
        Camion camion = new Camion();

        camion.instalarTelepase();
        camion.instalarTelepase();

        Assert.assertNotNull(camion);
    }

    @Test
    public void test02CamionCalculaPeajeConTelepaseDevuelve4() {
        Camion camion = new Camion();

        camion.instalarTelepase();

        Assert.assertEquals(9, camion.calcularPeaje(2));
    }

    @Test
    public void test03CamionCalculaPeajeSinTelepaseDevuelve8() {
        Camion camion = new Camion();

        Assert.assertEquals(36, camion.calcularPeaje(2));
    }
}
