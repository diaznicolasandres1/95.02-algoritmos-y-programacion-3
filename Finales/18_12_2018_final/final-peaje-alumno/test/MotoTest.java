import org.junit.Assert;
import org.junit.Test;
import telepase.NoSePuedeCalcularPeajeAMotoConTelepaseException;
import transporte.Moto;
import transporte.NoSePuedeInstalarTelepaseAMotoException;

public class MotoTest {

    @Test(expected = NoSePuedeInstalarTelepaseAMotoException.class)
    public void test01MotoInstalarTelepaseLanzaExcepcion() {
        Moto moto = new Moto();

        moto.instalarTelepase();
    }

    @Test
    public void test02MotoCalculaPeajeDevuelve8() {
        Moto moto = new Moto();

        Assert.assertEquals(4, moto.calcularPeaje(2));
    }
}
