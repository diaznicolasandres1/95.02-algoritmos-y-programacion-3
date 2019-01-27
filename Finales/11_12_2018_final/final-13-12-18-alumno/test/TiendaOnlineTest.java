import cupon.CuponBlackFriday;
import cupon.CuponCyberMonday;
import cupon.CuponGratisLocal;
import cupon.CuponMerryChristmas;
import envio.EnvioInternacional;
import envio.EnvioLocal;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TiendaOnlineTest {

    private static final double DELTA = 1e-15;

    @Test
    public void test01CreaTiendaYVerificaNombre() {
        TiendaOnline tienda = new TiendaOnline();

        tienda.setNombre("Lo de Carlos");

        assertEquals("Lo de Carlos", tienda.getNombre());
    }

    @Test
    public void test02TiendaCobraPedidoConEnvioLocalSinCuponYDa11000() {

        TiendaOnline tienda = new TiendaOnline();
        Pedido pedido = new Pedido();
        Map<String, Double> preciosProductos = new HashMap<String, Double>();
        preciosProductos.put("Raspberry Pi 3", 3500.00);
        preciosProductos.put("Arduino kit", 2000.00);
        preciosProductos.put("Arduino super kit", 4000.00);
        Map<String, Integer> stockProductos = new HashMap<String, Integer>();
        stockProductos.put("Raspberry Pi 3", 5);
        stockProductos.put("Arduino kit", 6);
        stockProductos.put("Arduino super kit", 2);

        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);
        tienda.agregarProductoAlPedido(pedido, "Arduino kit", 3);
        tienda.agregarProductoAlPedido(pedido, "Arduino super kit", 1);
        tienda.agregarEnvio(pedido, new EnvioLocal());

        assertEquals(11000, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void test03TiendaCobraPedidoConEnvioInternacionalSinCuponYDa12000() {

        TiendaOnline tienda = new TiendaOnline();
        Pedido pedido = new Pedido();
        Map<String, Double> preciosProductos = new HashMap<>();
        preciosProductos.put("Raspberry Pi 3", 3500.00);
        preciosProductos.put("Arduino kit", 2000.00);
        preciosProductos.put("Arduino super kit", 4000.00);
        Map<String, Integer> stockProductos = new HashMap<>();
        stockProductos.put("Raspberry Pi 3", 5);
        stockProductos.put("Arduino kit", 6);
        stockProductos.put("Arduino super kit", 2);

        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);
        tienda.agregarProductoAlPedido(pedido, "Arduino kit", 3);
        tienda.agregarProductoAlPedido(pedido, "Arduino super kit", 1);
        tienda.agregarEnvio(pedido, new EnvioInternacional());

        assertEquals(12000, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void test04TiendaCobraPedidoConEnvioLocalYConCuponBlackFridayDa1650() {

        TiendaOnline tienda = new TiendaOnline();
        Pedido pedido = new Pedido();
        Map<String, Double> preciosProductos = new HashMap<String, Double>();
        preciosProductos.put("Raspberry Pi 3", 3500.00);
        preciosProductos.put("Arduino kit", 2000.00);
        preciosProductos.put("Arduino super kit", 4000.00);
        Map<String, Integer> stockProductos = new HashMap<String, Integer>();
        stockProductos.put("Raspberry Pi 3", 5);
        stockProductos.put("Arduino kit", 6);
        stockProductos.put("Arduino super kit", 2);

        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);
        tienda.agregarProductoAlPedido(pedido, "Arduino kit", 3);
        tienda.agregarProductoAlPedido(pedido, "Arduino super kit", 1);

        tienda.agregarEnvio(pedido, new EnvioLocal());
        tienda.agregarCuponDeDescuento(pedido, new CuponBlackFriday());

        assertEquals(1650, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void test05TiendaCobraPedidoConEnvioLocalYConCuponMerryChristmasDa8250() {

        TiendaOnline tienda = new TiendaOnline();
        Pedido pedido = new Pedido();
        Map<String, Double> preciosProductos = new HashMap<String, Double>();
        preciosProductos.put("Raspberry Pi 3", 3500.00);
        preciosProductos.put("Arduino kit", 2000.00);
        preciosProductos.put("Arduino super kit", 4000.00);
        Map<String, Integer> stockProductos = new HashMap<String, Integer>();
        stockProductos.put("Raspberry Pi 3", 5);
        stockProductos.put("Arduino kit", 6);
        stockProductos.put("Arduino super kit", 2);

        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);
        tienda.agregarProductoAlPedido(pedido, "Arduino kit", 3);
        tienda.agregarProductoAlPedido(pedido, "Arduino super kit", 1);

        tienda.agregarEnvio(pedido, new EnvioLocal());
        tienda.agregarCuponDeDescuento(pedido, new CuponMerryChristmas());

        assertEquals(8250, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void test06TiendaCobraPedidoConEnvioLocalYConCuponCyberMondayDa5500() {

        TiendaOnline tienda = new TiendaOnline();
        Pedido pedido = new Pedido();
        Map<String, Double> preciosProductos = new HashMap<String, Double>();
        preciosProductos.put("Raspberry Pi 3", 3500.00);
        preciosProductos.put("Arduino kit", 2000.00);
        preciosProductos.put("Arduino super kit", 4000.00);
        Map<String, Integer> stockProductos = new HashMap<String, Integer>();
        stockProductos.put("Raspberry Pi 3", 5);
        stockProductos.put("Arduino kit", 6);
        stockProductos.put("Arduino super kit", 2);

        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);
        tienda.agregarProductoAlPedido(pedido, "Arduino kit", 3);
        tienda.agregarProductoAlPedido(pedido, "Arduino super kit", 1);

        tienda.agregarEnvio(pedido, new EnvioLocal());
        tienda.agregarCuponDeDescuento(pedido, new CuponCyberMonday());

        assertEquals(5500, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void test07TiendaCobraPedidoConEnvioLocalYConCuponDeEnvioLocalGratisDevuelve10000() {

        TiendaOnline tienda = new TiendaOnline();
        Pedido pedido = new Pedido();
        Map<String, Double> preciosProductos = new HashMap<String, Double>();
        preciosProductos.put("Raspberry Pi 3", 3500.00);
        preciosProductos.put("Arduino kit", 2000.00);
        preciosProductos.put("Arduino super kit", 4000.00);
        Map<String, Integer> stockProductos = new HashMap<String, Integer>();
        stockProductos.put("Raspberry Pi 3", 5);
        stockProductos.put("Arduino kit", 6);
        stockProductos.put("Arduino super kit", 2);

        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);
        tienda.agregarProductoAlPedido(pedido, "Arduino kit", 3);
        tienda.agregarProductoAlPedido(pedido, "Arduino super kit", 1);

        tienda.agregarEnvio(pedido, new EnvioLocal());
        tienda.agregarCuponDeDescuento(pedido, new CuponGratisLocal());

        assertEquals(10000, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void test08TiendaCobraPedidoConEnvioInternacionalYConCuponDeEnvioLocalGratisDa12000() {

        TiendaOnline tienda = new TiendaOnline();
        Pedido pedido = new Pedido();
        Map<String, Double> preciosProductos = new HashMap<String, Double>();
        preciosProductos.put("Raspberry Pi 3", 3500.00);
        preciosProductos.put("Arduino kit", 2000.00);
        preciosProductos.put("Arduino super kit", 4000.00);
        Map<String, Integer> stockProductos = new HashMap<String, Integer>();
        stockProductos.put("Raspberry Pi 3", 5);
        stockProductos.put("Arduino kit", 6);
        stockProductos.put("Arduino super kit", 2);

        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);
        tienda.agregarProductoAlPedido(pedido, "Arduino kit", 3);
        tienda.agregarProductoAlPedido(pedido, "Arduino super kit", 1);

        tienda.agregarEnvio(pedido, new EnvioInternacional());
        tienda.agregarCuponDeDescuento(pedido, new CuponGratisLocal());

        assertEquals(12000, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void test09TiendaCobraPedidoConEnvioInternacionalYConCuponDeBlackFridayDa1800() {

        TiendaOnline tienda = new TiendaOnline();
        Pedido pedido = new Pedido();
        Map<String, Double> preciosProductos = new HashMap<String, Double>();
        preciosProductos.put("Raspberry Pi 3", 3500.00);
        preciosProductos.put("Arduino kit", 2000.00);
        preciosProductos.put("Arduino super kit", 4000.00);
        Map<String, Integer> stockProductos = new HashMap<String, Integer>();
        stockProductos.put("Raspberry Pi 3", 5);
        stockProductos.put("Arduino kit", 6);
        stockProductos.put("Arduino super kit", 2);

        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);
        tienda.agregarProductoAlPedido(pedido, "Arduino kit", 3);
        tienda.agregarProductoAlPedido(pedido, "Arduino super kit", 1);

        tienda.agregarEnvio(pedido, new EnvioInternacional());
        tienda.agregarCuponDeDescuento(pedido, new CuponBlackFriday());

        assertEquals(1800, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void test10TiendaCobraPedidoConEnvioInternacionalYConCuponDeMerryChristmasDa9000() {

        TiendaOnline tienda = new TiendaOnline();
        Pedido pedido = new Pedido();
        Map<String, Double> preciosProductos = new HashMap<String, Double>();
        preciosProductos.put("Raspberry Pi 3", 3500.00);
        preciosProductos.put("Arduino kit", 2000.00);
        preciosProductos.put("Arduino super kit", 4000.00);
        Map<String, Integer> stockProductos = new HashMap<String, Integer>();
        stockProductos.put("Raspberry Pi 3", 5);
        stockProductos.put("Arduino kit", 6);
        stockProductos.put("Arduino super kit", 2);

        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);
        tienda.agregarProductoAlPedido(pedido, "Arduino kit", 3);
        tienda.agregarProductoAlPedido(pedido, "Arduino super kit", 1);

        tienda.agregarEnvio(pedido, new EnvioInternacional());
        tienda.agregarCuponDeDescuento(pedido, new CuponMerryChristmas());

        assertEquals(9000, tienda.cobrarPedido(pedido), DELTA);
    }

    @Test
    public void test11TiendaCobraPedidoConEnvioInternacionalYConCuponDeCyberMondayDa6000() {

        TiendaOnline tienda = new TiendaOnline();
        Pedido pedido = new Pedido();
        Map<String, Double> preciosProductos = new HashMap<String, Double>();
        preciosProductos.put("Raspberry Pi 3", 3500.00);
        preciosProductos.put("Arduino kit", 2000.00);
        preciosProductos.put("Arduino super kit", 4000.00);
        Map<String, Integer> stockProductos = new HashMap<String, Integer>();
        stockProductos.put("Raspberry Pi 3", 5);
        stockProductos.put("Arduino kit", 6);
        stockProductos.put("Arduino super kit", 2);

        tienda.setPreciosProductos(preciosProductos);
        tienda.setStockProductos(stockProductos);
        tienda.agregarProductoAlPedido(pedido, "Arduino kit", 3);
        tienda.agregarProductoAlPedido(pedido, "Arduino super kit", 1);

        tienda.agregarEnvio(pedido, new EnvioInternacional());
        tienda.agregarCuponDeDescuento(pedido, new CuponCyberMonday());

        assertEquals(6000, tienda.cobrarPedido(pedido), DELTA);
    }

}