package trabajantes;

import alimentos.Alimento;
import alimentos.EstadoLight;
import alimentos.EstadoNoLight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import trabajables.Acero;
import trabajables.Aluminio;
import trabajables.Cobre;
import trabajantes.Producto;
import trabajantes.Trabajador;

public class TrabajadorTest {

    @Test
    public void test01TrabajadorTrabajaAceroYDevuelveProductoConColorGrisAceroOscuro() {

        Trabajador trabajador = new Trabajador("asd", 100);

        Producto producto = trabajador.trabajar(new Acero());

        Assertions.assertEquals("GRIS ACERO OSCURO", producto.getColor());
    }

    @Test
    public void test02TrabajadorTrabajaAceroYDevuelveProductoConTamanio1() {

        Trabajador trabajador = new Trabajador("asd", 100);

        Producto producto = trabajador.trabajar(new Acero());

        Assertions.assertEquals(1, producto.getTamanio());
    }

    @Test
    public void test03TrabajadorTrabajaAluminioYDevuelveProductoConColorGrisClarito() {

        Trabajador trabajador = new Trabajador("asd", 100);

        Producto producto = trabajador.trabajar(new Aluminio());

        Assertions.assertEquals("GRIS CLARITO", producto.getColor());
    }

    @Test
    public void test04TrabajadorTrabajaAluminioYDevuelveProductoConTamanio1() {

        Trabajador trabajador = new Trabajador("asd", 100);

        Producto producto = trabajador.trabajar(new Aluminio());

        Assertions.assertEquals(1, producto.getTamanio());
    }

    @Test
    public void test05TrabajadorTrabajaConCobreYDevuelveProductoConColorRojizo() {

        Trabajador trabajador = new Trabajador("asd", 100);

        Producto producto = trabajador.trabajar(new Cobre());

        Assertions.assertEquals("ROJIZO", producto.getColor());
    }

    @Test
    public void test06TrabajadorTrabajaConCobreYDevuelveProductoConTamanio1() {

        Trabajador trabajador = new Trabajador("asd", 100);

        Producto producto = trabajador.trabajar(new Cobre());

        Assertions.assertEquals(1, producto.getTamanio());
    }

    @Test
    public void test07TrabajadorComeAlimentoNoLightYAumenta20DePeso() {

        Trabajador trabajador = new Trabajador("asd", 100);
        Alimento alimento = new Alimento("Hamburguesa", new EstadoNoLight());

        trabajador.comer(alimento);

        Assertions.assertEquals(120, trabajador.getPesoCorporal());
    }

    @Test
    public void test08TrabajadorComeAlimentoLightYAumenta10DePeso() {

        Trabajador trabajador = new Trabajador("asd", 100);
        Alimento alimento = new Alimento("Lechuga", new EstadoLight());

        trabajador.comer(alimento);

        Assertions.assertEquals(110, trabajador.getPesoCorporal());
    }

}
