package artesanos;

import elaborables.Cuero;
import elaborables.Goma;
import elaborables.Tela;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZapateroTest {

    @Test
    public void test01ZapateroTrabajaConCueroDevuelveMensajeCorrecto() {

        Zapatero zapatero = new Zapatero("RR");

        Assertions.assertEquals("6 zapatos de Cuero talle 40.", zapatero.realizarTrabajo(new Cuero(), 10));
    }

    @Test
    public void test02ZapateroTrabajaConGomaDevuelveMensajeCorrecto() {

        Zapatero zapatero = new Zapatero("RR");

        Assertions.assertEquals("2 ojotas de goma talle 35.", zapatero.realizarTrabajo(new Goma(), 10));
    }

    @Test
    public void test03ZapateroTrabajaConTelaDevuelveMensajeCorrecto() {

        Zapatero zapatero = new Zapatero("RR");

        Assertions.assertEquals("10 zapatillas de tela talle 42.", zapatero.realizarTrabajo(new Tela(), 10));
    }
}
