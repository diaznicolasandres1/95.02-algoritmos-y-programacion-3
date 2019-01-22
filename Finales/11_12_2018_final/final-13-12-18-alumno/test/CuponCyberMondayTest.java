import cupon.CuponCyberMonday;
import envio.EnvioInternacional;
import envio.EnvioLocal;
import org.junit.Assert;
import org.junit.Test;

public class CuponCyberMondayTest {

    private static final double DELTA = 1e-15;

    @Test
    public void test01CyberMondayRealizaDescuentoA10ConEnvioLocal() {
        CuponCyberMonday cupon = new CuponCyberMonday();

        Assert.assertEquals(5, cupon.realizarDescuento(10, new EnvioLocal()), DELTA);
    }

    @Test
    public void test02CyberMondayRealizaDescuentoA10ConEnvioInternacional() {
        CuponCyberMonday cupon = new CuponCyberMonday();

        Assert.assertEquals(5, cupon.realizarDescuento(10, new EnvioInternacional()), DELTA);
    }
}
