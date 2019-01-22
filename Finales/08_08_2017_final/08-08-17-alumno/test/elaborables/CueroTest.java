package elaborables;

import artesanos.Joyero;
import artesanos.Modista;
import artesanos.Zapatero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CueroTest {

    @Test
    public void test01CueroEsElaboradoPorJoyeroDevuelveMensajeCorrecto() {

        Joyero joyero = new Joyero("RR");
        Cuero cuero = new Cuero();

        Assertions.assertEquals("Artesano " + joyero.getNombre() + " no trabaja con Cuero", cuero.elaborarPor(joyero, 10));
    }

    @Test
    public void test02CueroEsElaboradoPorModistaDevuelveMensajeCorrecto() {

        Modista modista = new Modista("RR");
        Cuero cuero = new Cuero();

        Assertions.assertEquals("1 camperas de cuero para hombre.", cuero.elaborarPor(modista, 10));
    }

    @Test
    public void test03CueroEsElaboradoPorZapateroDevuelveMensajeCorrecto() {

        Zapatero zapatero = new Zapatero("RR");
        Cuero cuero = new Cuero();

        Assertions.assertEquals("6 zapatos de Cuero talle 40.", cuero.elaborarPor(zapatero, 10));
    }
}
