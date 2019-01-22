import cupon.CuponMerryChristmas;
import envio.EnvioInternacional;
import envio.EnvioLocal;
import org.junit.Assert;
import org.junit.Test;

public class CuponMerryChristmasTest {

    private static final double DELTA = 1e-15;

    @Test
    public void test01MerryChristmasRealizaDescuentoA10ConEnvioLocal() {
        CuponMerryChristmas cupon = new CuponMerryChristmas();

        Assert.assertEquals(7.5, cupon.realizarDescuento(10, new EnvioLocal()), DELTA);
    }

    @Test
    public void test02MerryChristmasRealizaDescuentoA10ConEnvioInternacional() {
        CuponMerryChristmas cupon = new CuponMerryChristmas();

        Assert.assertEquals(7.5, cupon.realizarDescuento(10, new EnvioInternacional()), DELTA);
    }
}
