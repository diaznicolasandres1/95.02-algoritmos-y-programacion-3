import org.junit.Assert;
import org.junit.Test;
import transporte.Triciclo;

public class TricicloTest {

    @Test
    public void test01TricicloInstalaTelepaseDosVecesLanzaExcepcion() {
        Triciclo triciclo = new Triciclo();

        triciclo.instalarTelepase();
        triciclo.instalarTelepase();

        Assert.assertNotNull(triciclo);
    }

    @Test
    public void test02TricicloCalculaPeajeConTelepaseDevuelve10() {
        Triciclo triciclo = new Triciclo();

        triciclo.instalarTelepase();

        Assert.assertEquals(10, triciclo.calcularPeaje(2));
    }

    @Test
    public void test03TricicloCalculaPeajeSinTelepaseDevuelve6() {
        Triciclo triciclo = new Triciclo();

        Assert.assertEquals(6, triciclo.calcularPeaje(2));
    }


}
