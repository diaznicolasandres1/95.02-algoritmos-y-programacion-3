package artesanos;

import elaborables.Cuero;
import elaborables.Goma;
import elaborables.Tela;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModistaTest {

    @Test
    public void test01ModistaTrabajaConCueroDevuelveMensajeCorrecto() {

        Modista modista = new Modista("RR");

        Assertions.assertEquals("1 camperas de cuero para hombre.", modista.realizarTrabajo(new Cuero(), 10));
    }

    @Test
    public void test02ModistaTrabajaConGomaDevuelveMensajeCorrecto() {

        Modista modista = new Modista("RR");

        Assertions.assertEquals("20 pulseras para hombre.", modista.realizarTrabajo(new Goma(), 10));
    }

    @Test
    public void test03ModistaTrabajaConTelaDevuelveMensajeCorrecto() {

        Modista modista = new Modista("RR");

        Assertions.assertEquals("5 camisas para hombre.", modista.realizarTrabajo(new Tela(), 10));
    }

}
