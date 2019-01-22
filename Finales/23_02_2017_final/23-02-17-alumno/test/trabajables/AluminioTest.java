package trabajables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import trabajantes.*;

import java.util.ArrayList;

public class AluminioTest {

    @Test
    public void test01AluminioEsElaboradoPorTrabajadorDevuelveProductoConColorGrisClarito() {

        Aluminio aluminio = new Aluminio();

        Producto producto = aluminio.elaborarPor(new Trabajador("asd", 50));

        Assertions.assertEquals("GRIS CLARITO", producto.getColor());
    }

    @Test
    public void test02AluminioEsElaboradoPorTrabajadorDevuelveProductoConTamanio1() {

        Aluminio aluminio = new Aluminio();

        Producto producto = aluminio.elaborarPor(new Trabajador("asd", 50));

        Assertions.assertEquals(1, producto.getTamanio());
    }

    @Test
    public void test03AluminioEsElaboradoPorSuperTrabajadorDevuelveProductoConColorGrisClarito() {

        Aluminio aluminio = new Aluminio();

        Producto producto = aluminio.elaborarPor(new SuperTrabajador("asd", 50));

        Assertions.assertEquals("GRIS CLARITO", producto.getColor());
    }

    @Test
    public void test04AluminioEsElaboradoPorSuperTrabajadorDevuelveProductoConTamanio2() {

        Aluminio aluminio = new Aluminio();

        Producto producto = aluminio.elaborarPor(new SuperTrabajador("asd", 50));

        Assertions.assertEquals(2, producto.getTamanio());
    }

    @Test
    public void test05AluminioEsElaboradoPorRobotDevuelveProductoConColorGrisClarito() {

        Aluminio aluminio = new Aluminio();

        Producto producto = aluminio.elaborarPor(new Robot("asd", 50));

        Assertions.assertEquals("GRIS CLARITO", producto.getColor());
    }

    @Test
    public void test06AluminioEsElaboradoPorRobotDevuelveProductoConTamanio3() {

        Aluminio aluminio = new Aluminio();

        Producto producto = aluminio.elaborarPor(new Robot("asd", 50));

        Assertions.assertEquals(3, producto.getTamanio());
    }

    @Test
    public void test07AluminioEsElaboradoPorTrabajantesYDevuelveSumaTotalDeTamanio7() {

        Aluminio aluminio = new Aluminio();
        ArrayList<Trabajante> trabajantes = new ArrayList<>();
        trabajantes.add(new Trabajador("asd", 50));
        trabajantes.add(new SuperTrabajador("asdd", 50));
        trabajantes.add(new Robot("asddd", 50));
        int sumaTamanio = 0;

        for (Trabajante trabajante : trabajantes) {
            Producto producto = aluminio.elaborarPor(trabajante);
            sumaTamanio += producto.getTamanio();
        }

        Assertions.assertEquals(6, sumaTamanio);
    }
}
