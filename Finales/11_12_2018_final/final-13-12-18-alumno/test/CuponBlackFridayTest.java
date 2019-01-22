import cupon.CuponBlackFriday;
import envio.EnvioInternacional;
import envio.EnvioLocal;
import org.junit.Assert;
import org.junit.Test;

public class CuponBlackFridayTest {

    private static final double DELTA = 1e-15;

    @Test
    public void test01BlackFridayRealizaDescuentoA10ConEnvioLocal() {
        CuponBlackFriday cupon = new CuponBlackFriday();

        Assert.assertEquals(1.5, cupon.realizarDescuento(10, new EnvioLocal()), DELTA);
    }

    @Test
    public void test02BlackFridayRealizaDescuentoA10ConEnvioInternacional() {
        CuponBlackFriday cupon = new CuponBlackFriday();

        Assert.assertEquals(1.5, cupon.realizarDescuento(10, new EnvioInternacional()), DELTA);
    }
}
