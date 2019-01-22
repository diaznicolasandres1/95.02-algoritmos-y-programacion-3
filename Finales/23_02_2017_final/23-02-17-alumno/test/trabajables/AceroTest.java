package trabajables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import trabajantes.*;

import java.util.ArrayList;

public class AceroTest {

    @Test
    public void test01AceroEsElaboradoPorTrabajadorDevuelveProductoConColorGrisAceroOscuro() {

        Acero acero = new Acero();

        Producto producto = acero.elaborarPor(new Trabajador("asd", 50));

        Assertions.assertEquals("GRIS ACERO OSCURO", producto.getColor());
    }

    @Test
    public void test02AceroEsElaboradoPorTrabajadorDevuelveProductoConTamanio1() {

        Acero acero = new Acero();

        Producto producto = acero.elaborarPor(new Trabajador("asd", 50));

        Assertions.assertEquals(1, producto.getTamanio());
    }

    @Test
    public void test03AceroEsElaboradoPorSuperTrabajadorDevuelveProductoConColorGrisAceroOscuro() {

        Acero acero = new Acero();

        Producto producto = acero.elaborarPor(new SuperTrabajador("asd", 50));

        Assertions.assertEquals("GRIS ACERO OSCURO", producto.getColor());
    }

    @Test
    public void test04AceroEsElaboradoPorSuperTrabajadorDevuelveProductoConTamanio2() {

        Acero acero = new Acero();

        Producto producto = acero.elaborarPor(new SuperTrabajador("asd", 50));

        Assertions.assertEquals(2, producto.getTamanio());
    }

    @Test
    public void test05AceroEsElaboradoPorRobotDevuelveProductoConColorGrisAceroOscuro() {

        Acero acero = new Acero();

        Producto producto = acero.elaborarPor(new Robot("asd", 50));

        Assertions.assertEquals("GRIS ACERO OSCURO", producto.getColor());
    }

    @Test
    public void test06AceroEsElaboradoPorRobotDevuelveProductoConTamanio3() {

        Acero acero = new Acero();

        Producto producto = acero.elaborarPor(new Robot("asd", 50));

        Assertions.assertEquals(3, producto.getTamanio());
    }

    @Test
    public void test07AceroEsElaboradoPorTrabajantesYDevuelveSumaTotalDeTamanio7() {

        Acero acero = new Acero();
        ArrayList<Trabajante> trabajantes = new ArrayList<>();
        trabajantes.add(new Trabajador("asd", 50));
        trabajantes.add(new SuperTrabajador("asdd", 50));
        trabajantes.add(new Robot("asddd", 50));
        int sumaTamanio = 0;

        for (Trabajante trabajante : trabajantes) {
            Producto producto = acero.elaborarPor(trabajante);
            sumaTamanio += producto.getTamanio();
        }

        Assertions.assertEquals(6, sumaTamanio);
    }
}
