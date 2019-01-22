import cupon.CuponBlackFriday;
import cupon.CuponCyberMonday;
import cupon.CuponGratisLocal;
import cupon.CuponMerryChristmas;
import envio.EnvioInternacional;
import org.junit.Assert;
import org.junit.Test;

public class EnvioInternacionalTest {

    private static final double DELTA = 1e-15;

    @Test
    public void test01EnvioInternacionalRealizaRecargoAPrecio10YDevuelve12() {
        EnvioInternacional envio = new EnvioInternacional();

        Assert.assertEquals(12, envio.realizarRecargo(10), DELTA);
    }

    @Test
    public void test02EnvioInternacionalRealizaDescuentoAPrecio10ConCuponBlackFriday() {
        EnvioInternacional envio = new EnvioInternacional();

        Assert.assertEquals(1.5, envio.resolverDescuento(10, new CuponBlackFriday()), DELTA);
    }

    @Test
    public void test03EnvioInternacionalRealizaDescuentoAPrecio10ConCuponMerryChristmas() {
        EnvioInternacional envio = new EnvioInternacional();

        Assert.assertEquals(7.5, envio.resolverDescuento(10, new CuponMerryChristmas()), DELTA);
    }

    @Test
    public void test04EnvioInternacionalRealizaDescuentoAPrecio10ConCuponCyberMonday() {
        EnvioInternacional envio = new EnvioInternacional();

        Assert.assertEquals(5, envio.resolverDescuento(10, new CuponCyberMonday()), DELTA);
    }

    @Test
    public void test05EnvioInternacionalRealizaDescuentoAPrecio10ConCuponGratisInternacional() {
        EnvioInternacional envio = new EnvioInternacional();

        Assert.assertEquals(10, envio.resolverDescuento(10, new CuponGratisLocal()), DELTA);
    }

}
