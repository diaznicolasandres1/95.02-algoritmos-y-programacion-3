package trabajantes;

import alimentos.Alimento;
import alimentos.EstadoLight;
import alimentos.EstadoNoLight;
import alimentos.SuperTrabajadorNoComeAlimentosLightException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import trabajables.Acero;
import trabajables.Aluminio;
import trabajables.Cobre;
import trabajantes.Producto;
import trabajantes.SuperTrabajador;

public class SuperTrabajadorTest {

    @Test
    public void test01SuperTrabajadorTrabajaAceroYDevuelveProductoConColorGrisAceroOscuro() {

        SuperTrabajador superTrabajador = new SuperTrabajador("asd", 100);

        Producto producto = superTrabajador.trabajar(new Acero());

        Assertions.assertEquals("GRIS ACERO OSCURO", producto.getColor());
    }

    @Test
    public void test02SuperTrabajadorTrabajaAceroYDevuelveProductoConTamanio2() {

        SuperTrabajador trabajador = new SuperTrabajador("asd", 100);

        Producto producto = trabajador.trabajar(new Acero());

        Assertions.assertEquals(2, producto.getTamanio());
    }

    @Test
    public void test03SuperTrabajadorTrabajaAluminioYDevuelveProductoConColorGrisClarito() {

        SuperTrabajador trabajador = new SuperTrabajador("asd", 100);

        Producto producto = trabajador.trabajar(new Aluminio());

        Assertions.assertEquals("GRIS CLARITO", producto.getColor());
    }

    @Test
    public void test04SuperTrabajadorTrabajaAluminioYDevuelveProductoConTamanio2() {

        SuperTrabajador trabajador = new SuperTrabajador("asd", 100);

        Producto producto = trabajador.trabajar(new Aluminio());

        Assertions.assertEquals(2, producto.getTamanio());
    }

    @Test
    public void test05SuperTrabajadorTrabajaConCobreYDevuelveProductoConColorRojizo() {

        SuperTrabajador trabajador = new SuperTrabajador("asd", 100);

        Producto producto = trabajador.trabajar(new Cobre());

        Assertions.assertEquals("ROJIZO", producto.getColor());
    }

    @Test
    public void test06SuperTrabajadorTrabajaConCobreYDevuelveProductoConTamanio2() {

        SuperTrabajador trabajador = new SuperTrabajador("asd", 100);

        Producto producto = trabajador.trabajar(new Cobre());

        Assertions.assertEquals(2, producto.getTamanio());
    }

    @Test
    public void test07SuperTrabajadorComeAlimentoNoLightYAumenta20DePeso() {

        SuperTrabajador trabajador = new SuperTrabajador("asd", 100);
        Alimento alimento = new Alimento("Hamburguesa", new EstadoNoLight());

        trabajador.comer(alimento);

        Assertions.assertEquals(120, trabajador.getPesoCorporal());
    }

    @Test
    public void test08SuperTrabajadorComeAlimentoLightYLanzaExcepcion() {

        SuperTrabajador trabajador = new SuperTrabajador("asd", 100);
        Alimento alimento = new Alimento("Lechuga", new EstadoLight());

        Assertions.assertThrows(SuperTrabajadorNoComeAlimentosLightException.class, () -> trabajador.comer(alimento));
    }
}
