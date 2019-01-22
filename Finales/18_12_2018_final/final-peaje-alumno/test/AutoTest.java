import org.junit.Assert;
import org.junit.Test;
import transporte.Auto;

public class AutoTest {

    @Test
    public void test01AutoInstalaTelepaseDosVecesNoLanzaExcepcion() {
        Auto auto = new Auto();

        auto.instalarTelepase();
        auto.instalarTelepase();

        Assert.assertNotNull(auto);
    }

    @Test
    public void test02AutoCalculaPeajeConTelepaseDevuelve4() {
        Auto auto = new Auto();

        auto.instalarTelepase();

        Assert.assertEquals(4, auto.calcularPeaje(2));
    }

    @Test
    public void test03AutoCalculaPeajeSinTelepaseDevuelve8() {
        Auto auto = new Auto();

        Assert.assertEquals(8, auto.calcularPeaje(2));
    }
}
