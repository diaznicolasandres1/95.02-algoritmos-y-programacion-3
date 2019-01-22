package alimentos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import trabajantes.SuperTrabajador;
import trabajantes.Trabajador;

public class AlimentoTest {

    @Test
    public void test01AlimentoNoLightAlimentaATrabajadorYAumenta20DePeso() {

        Alimento alimento = new Alimento("hamburguesa", new EstadoNoLight());
        Trabajador trabajador = new Trabajador("asd",50);

        alimento.alimentar(trabajador);

        Assertions.assertEquals(70, trabajador.getPesoCorporal());
    }

    @Test
    public void test02AlimentoNoLightAlimentaASuperTrabajadorYAumenta20DePeso() {

        Alimento alimento = new Alimento("hamburguesa", new EstadoNoLight());
        SuperTrabajador superTrabajador = new SuperTrabajador("asd",50);

        alimento.alimentar(superTrabajador);

        Assertions.assertEquals(70, superTrabajador.getPesoCorporal());
    }

    @Test
    public void test03AlimentoLightAlimentaATrabajadorYAumenta10DePeso() {

        Alimento alimento = new Alimento("hamburguesa", new EstadoLight());
        Trabajador trabajador = new Trabajador("asd",50);

        alimento.alimentar(trabajador);

        Assertions.assertEquals(60, trabajador.getPesoCorporal());
    }

    @Test
    public void test04AlimentoLightAlimentaASuperTrabajadorYLanzaExcepcion() {

        Alimento alimento = new Alimento("hamburguesa", new EstadoLight());
        SuperTrabajador superTrabajador = new SuperTrabajador("asd",50);

        Assertions.assertThrows(SuperTrabajadorNoComeAlimentosLightException.class, () -> alimento.alimentar(superTrabajador));
    }
}
