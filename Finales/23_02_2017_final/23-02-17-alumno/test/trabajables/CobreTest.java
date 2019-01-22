package trabajables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import trabajantes.*;

import java.util.ArrayList;

public class CobreTest {

    @Test
    public void test01CobreEsElaboradoPorTrabajadorDevuelveProductoConColorRojizo() {

        Cobre cobre = new Cobre();

        Producto producto = cobre.elaborarPor(new Trabajador("asd", 50));

        Assertions.assertEquals("ROJIZO", producto.getColor());
    }

    @Test
    public void test02CobreEsElaboradoPorTrabajadorDevuelveProductoConTamanio1() {

        Cobre cobre = new Cobre();

        Producto producto = cobre.elaborarPor(new Trabajador("asd", 50));

        Assertions.assertEquals(1, producto.getTamanio());
    }

    @Test
    public void test03CobreEsElaboradoPorSuperTrabajadorDevuelveProductoConColorRojizo() {

        Cobre cobre = new Cobre();

        Producto producto = cobre.elaborarPor(new SuperTrabajador("asd", 50));

        Assertions.assertEquals("ROJIZO", producto.getColor());
    }

    @Test
    public void test04CobreEsElaboradoPorSuperTrabajadorDevuelveProductoConTamanio2() {

        Cobre cobre = new Cobre();

        Producto producto = cobre.elaborarPor(new SuperTrabajador("asd", 50));

        Assertions.assertEquals(2, producto.getTamanio());
    }

    @Test
    public void test05CobreEsElaboradoPorRobotDevuelveProductoConColorRojizo() {

        Cobre cobre = new Cobre();

        Producto producto = cobre.elaborarPor(new Robot("asd", 50));

        Assertions.assertEquals("ROJIZO", producto.getColor());
    }

    @Test
    public void test06CobreEsElaboradoPorRobotDevuelveProductoConTamanio3() {

        Cobre cobre = new Cobre();

        Producto producto = cobre.elaborarPor(new Robot("asd", 50));

        Assertions.assertEquals(3, producto.getTamanio());
    }

    @Test
    public void test07CobreEsElaboradoPorTrabajantesYDevuelveSumaTotalDeTamanio7() {

        Cobre cobre = new Cobre();
        ArrayList<Trabajante> trabajantes = new ArrayList<>();
        trabajantes.add(new Trabajador("asd", 50));
        trabajantes.add(new SuperTrabajador("asdd", 50));
        trabajantes.add(new Robot("asddd", 50));
        int sumaTamanio = 0;

        for (Trabajante trabajante : trabajantes) {
            Producto producto = cobre.elaborarPor(trabajante);
            sumaTamanio += producto.getTamanio();
        }

        Assertions.assertEquals(6, sumaTamanio);
    }
}
