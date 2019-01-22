import cupon.CuponBlackFriday;
import cupon.CuponCyberMonday;
import cupon.CuponGratisLocal;
import cupon.CuponMerryChristmas;
import envio.EnvioLocal;
import org.junit.Assert;
import org.junit.Test;

public class EnvioLocalTest {

    private static final double DELTA = 1e-15;

    @Test
    public void test01EnvioLocalRealizaRecargoAPrecio10YDevuelve11() {
        EnvioLocal envio = new EnvioLocal();

        Assert.assertEquals(11, envio.realizarRecargo(10), DELTA);
    }

    @Test
    public void test02EnvioLocalRealizaDescuentoAPrecio10ConCuponBlackFriday() {
        EnvioLocal envio = new EnvioLocal();

        Assert.assertEquals(1.5, envio.resolverDescuento(10, new CuponBlackFriday()), DELTA);
    }

    @Test
    public void test03EnvioLocalRealizaDescuentoAPrecio10ConCuponMerryChristmas() {
        EnvioLocal envio = new EnvioLocal();

        Assert.assertEquals(7.5, envio.resolverDescuento(10, new CuponMerryChristmas()), DELTA);
    }

    @Test
    public void test04EnvioLocalRealizaDescuentoAPrecio10ConCuponCyberMonday() {
        EnvioLocal envio = new EnvioLocal();

        Assert.assertEquals(5, envio.resolverDescuento(10, new CuponCyberMonday()), DELTA);
    }

    @Test
    public void test05EnvioLocalRealizaDescuentoAPrecio10ConCuponGratisLocal() {
        EnvioLocal envio = new EnvioLocal();

        Assert.assertEquals(0, envio.resolverDescuento(10, new CuponGratisLocal()), DELTA);
    }

}
