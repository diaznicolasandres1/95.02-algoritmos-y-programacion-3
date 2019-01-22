package elaborables;

import artesanos.Joyero;
import artesanos.Modista;
import artesanos.Zapatero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GomaTest {

    @Test
    public void test01GomaEsElaboradaPorJoyeroDevuelveMensajeCorrecto() {

        Joyero joyero = new Joyero("RR");
        Goma goma = new Goma();

        Assertions.assertEquals("Artesano " + joyero.getNombre() + " no trabaja con Goma", goma.elaborarPor(joyero, 5));
    }

    @Test
    public void test02GomaEsElaboradaPorModistaDevuelveMensajeCorrecto() {

        Modista modista = new Modista("RR");
        Goma goma = new Goma();

        Assertions.assertEquals("20 pulseras para hombre.", goma.elaborarPor(modista, 10));
    }

    @Test
    public void test03GomaEsElaboradaPorZapateroDevuelveMensajeCorrecto() {

        Zapatero zapatero = new Zapatero("RR");
        Goma goma = new Goma();

        Assertions.assertEquals("2 ojotas de goma talle 35.", goma.elaborarPor(zapatero, 10));
    }
}
