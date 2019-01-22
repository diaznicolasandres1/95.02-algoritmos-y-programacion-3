package artesanos;

import elaborables.Cuero;
import elaborables.Goma;
import elaborables.Tela;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoyeroTest {

    @Test
    public void test01JoyeroRealizaTrabajoConCueroDevuelveMensajeQueNoPuedeRealizarlo() {

        Joyero joyero = new Joyero("RR");

        Assertions.assertEquals("Artesano " + joyero.getNombre() + " no trabaja con Cuero", joyero.realizarTrabajo(new Cuero(), 5));
    }

    @Test
    public void test02JoyeroRealizaTrabajoConGomaDevuelveMensajeQueNoPuedeRealizarlo() {

        Joyero joyero = new Joyero("RR");

        Assertions.assertEquals("Artesano " + joyero.getNombre() + " no trabaja con Goma", joyero.realizarTrabajo(new Goma(), 5));
    }

    @Test
    public void test03JoyeroRealizaTrabajoConTelaDevuelveMensajeQueNoPuedeRealizarlo() {

        Joyero joyero = new Joyero("RR");

        Assertions.assertEquals("Artesano " + joyero.getNombre() + " no trabaja con Tela", joyero.realizarTrabajo(new Tela(), 5));
    }
}
