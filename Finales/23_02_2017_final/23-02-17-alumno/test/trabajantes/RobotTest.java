package trabajantes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import trabajables.Acero;
import trabajables.Aluminio;
import trabajables.Cobre;
import trabajantes.Producto;
import trabajantes.Robot;

public class RobotTest {

    @Test
    public void test01RobotTrabajaAceroYDevuelveProductoConColorGrisAceroOscuro() {

        Robot robot = new Robot("asd", 100);

        Producto producto = robot.trabajar(new Acero());

        Assertions.assertEquals("GRIS ACERO OSCURO", producto.getColor());
    }

    @Test
    public void test02RobotTrabajaAceroYDevuelveProductoConTamanio3() {

        Robot robot = new Robot("asd", 100);

        Producto producto = robot.trabajar(new Acero());

        Assertions.assertEquals(3, producto.getTamanio());
    }

    @Test
    public void test03RobotTrabajaAluminioYDevuelveProductoConColorGrisClarito() {

        Robot robot = new Robot("asd", 100);

        Producto producto = robot.trabajar(new Aluminio());

        Assertions.assertEquals("GRIS CLARITO", producto.getColor());
    }

    @Test
    public void test04RobotTrabajaAluminioYDevuelveProductoConTamanio3() {

        Robot robot = new Robot("asd", 100);

        Producto producto = robot.trabajar(new Aluminio());

        Assertions.assertEquals(3, producto.getTamanio());
    }

    @Test
    public void test05RobotTrabajaConCobreYDevuelveProductoConColorRojizo() {

        Robot robot = new Robot("asd", 100);

        Producto producto = robot.trabajar(new Cobre());

        Assertions.assertEquals("ROJIZO", producto.getColor());
    }

    @Test
    public void test06RobotTrabajaConCobreYDevuelveProductoConTamanio3() {

        Robot robot = new Robot("asd", 100);

        Producto producto = robot.trabajar(new Cobre());

        Assertions.assertEquals(3, producto.getTamanio());
    }

    @Test
    public void test07RobotRecarga50DeBateriaYTiene150DeBateria() {

        Robot robot = new Robot("asd", 100);

        robot.recargarBateria(50);

        Assertions.assertEquals(150, robot.getBateria());
    }

}
