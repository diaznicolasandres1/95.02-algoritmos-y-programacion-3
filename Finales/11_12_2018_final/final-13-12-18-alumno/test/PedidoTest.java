import cupon.CuponBlackFriday;
import cupon.CuponCyberMonday;
import cupon.CuponGratisLocal;
import cupon.CuponMerryChristmas;
import envio.EnvioInternacional;
import envio.EnvioLocal;
import org.junit.Assert;
import org.junit.Test;

public class PedidoTest {

    private static final double DELTA = 1e-15;

    @Test
    public void test01PedidoAgregaProductoDe10YVerificaPrecio() {
        Pedido pedido = new Pedido();

        pedido.agregarProducto("Aasd", 10);

        Assert.assertEquals(10, pedido.cobrarA(new TiendaOnline()), DELTA);
    }

    @Test
    public void test02PedidoAgregaProductoDe10ConEnvioLocalYVerificaPrecio() {
        Pedido pedido = new Pedido();

        pedido.agregarProducto("Aasd", 10);
        pedido.agregarEnvio(new EnvioLocal());

        Assert.assertEquals(11, pedido.cobrarA(new TiendaOnline()), DELTA);
    }

    @Test
    public void test03PedidoAgregaProductoDe10ConEnvioInternacionalYVerificaPrecio() {
        Pedido pedido = new Pedido();

        pedido.agregarProducto("Aasd", 10);
        pedido.agregarEnvio(new EnvioInternacional());

        Assert.assertEquals(12, pedido.cobrarA(new TiendaOnline()), DELTA);
    }

    @Test
    public void test04PedidoAgregaProductoDe10ConEnvioLocalYCuponBlackFridayYVerificaPrecio() {
        Pedido pedido = new Pedido();

        pedido.agregarProducto("Aasd", 10);
        pedido.agregarEnvio(new EnvioLocal());
        pedido.agregarCupon(new CuponBlackFriday());

        Assert.assertEquals(1.65, pedido.cobrarA(new TiendaOnline()), DELTA);
    }

    @Test
    public void test05PedidoAgregaProductoDe10ConEnvioLocalYCuponMerryChristmasYVerificaPrecio() {
        Pedido pedido = new Pedido();

        pedido.agregarProducto("Aasd", 10);
        pedido.agregarEnvio(new EnvioLocal());
        pedido.agregarCupon(new CuponMerryChristmas());

        Assert.assertEquals(8.25, pedido.cobrarA(new TiendaOnline()), DELTA);
    }

    @Test
    public void test06PedidoAgregaProductoDe10ConEnvioLocalYCuponCyberMondayYVerificaPrecio() {
        Pedido pedido = new Pedido();

        pedido.agregarProducto("Aasd", 10);
        pedido.agregarEnvio(new EnvioLocal());
        pedido.agregarCupon(new CuponCyberMonday());

        Assert.assertEquals(5.50, pedido.cobrarA(new TiendaOnline()), DELTA);
    }

    @Test
    public void test07PedidoAgregaProductoDe10ConEnvioLocalYCuponDeEnvioLocalGratisYVerificaPrecio() {
        Pedido pedido = new Pedido();

        pedido.agregarProducto("Aasd", 10);
        pedido.agregarEnvio(new EnvioLocal());
        pedido.agregarCupon(new CuponGratisLocal());

        Assert.assertEquals(10, pedido.cobrarA(new TiendaOnline()), DELTA);
    }

    @Test
    public void test08PedidoAgregaProductoDe10ConEnvioInternacionalYCuponDeEnvioLocalGratisYVerificaPrecio() {
        Pedido pedido = new Pedido();

        pedido.agregarProducto("Aasd", 10);
        pedido.agregarEnvio(new EnvioInternacional());
        pedido.agregarCupon(new CuponGratisLocal());

        Assert.assertEquals(12, pedido.cobrarA(new TiendaOnline()), DELTA);
    }

    @Test
    public void test09PedidoAgregaProductoDe10ConEnvioInternacionalYCuponCyberMondayYVerificaPrecio() {
        Pedido pedido = new Pedido();

        pedido.agregarProducto("Aasd", 10);
        pedido.agregarEnvio(new EnvioInternacional());
        pedido.agregarCupon(new CuponCyberMonday());

        Assert.assertEquals(6, pedido.cobrarA(new TiendaOnline()), DELTA);
    }

    @Test
    public void test10PedidoAgregaProductoDe10ConEnvioInternacionalYCuponBlackFridayYVerificaPrecio() {
        Pedido pedido = new Pedido();

        pedido.agregarProducto("Aasd", 10);
        pedido.agregarEnvio(new EnvioInternacional());
        pedido.agregarCupon(new CuponBlackFriday());

        Assert.assertEquals(1.8, pedido.cobrarA(new TiendaOnline()), DELTA);
    }

    @Test
    public void test11PedidoAgregaProductoDe10ConEnvioInternacionalYCuponMerryChristmasYVerificaPrecio() {
        Pedido pedido = new Pedido();

        pedido.agregarProducto("Aasd", 10);
        pedido.agregarEnvio(new EnvioInternacional());
        pedido.agregarCupon(new CuponMerryChristmas());

        Assert.assertEquals(9, pedido.cobrarA(new TiendaOnline()), DELTA);
    }
}
