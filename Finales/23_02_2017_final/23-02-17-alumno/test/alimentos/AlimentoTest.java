package alimentos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import trabajantes.Alimentable;
import trabajantes.SuperTrabajador;
import trabajantes.Trabajador;

import java.util.ArrayList;

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

    @Test
    public void test05AlimentoNoLightAlimentaAAlimentablesYAumentanPesoCorrecto() {

        ArrayList<Alimentable> alimentables = new ArrayList<>();
        SuperTrabajador superTrabajador = new SuperTrabajador("asd", 50);
        Trabajador trabajador = new Trabajador("asd2", 60);
        Alimento alimento = new Alimento("Pure", new EstadoNoLight());
        alimentables.add(superTrabajador);
        alimentables.add(trabajador);

        for (Alimentable alimentable : alimentables) {
            alimento.alimentar(alimentable);
        }

        Assertions.assertEquals(80, trabajador.getPesoCorporal());
        Assertions.assertEquals(70, superTrabajador.getPesoCorporal());
    }

    @Test
    public void test06AlimentoLightAlimentaAAlimentablesYLanzaExcepcion() {

        ArrayList<Alimentable> alimentables = new ArrayList<>();
        SuperTrabajador superTrabajador = new SuperTrabajador("asd", 50);
        Alimento alimento = new Alimento("Lechuga", new EstadoLight());
        alimentables.add(superTrabajador);

        for (Alimentable alimentable : alimentables) {
            Assertions.assertThrows(SuperTrabajadorNoComeAlimentosLightException.class, () -> alimento.alimentar(alimentable));
        }
    }

    @Test
    public void test07AlimentoLightAlimentaAAlimentablesAumentaPesoCorrecto() {

        ArrayList<Alimentable> alimentables = new ArrayList<>();
        Trabajador trabajador = new Trabajador("asd", 50);
        Alimento alimento = new Alimento("AAAAA", new EstadoLight());
        alimentables.add(trabajador);

        for (Alimentable alimentable : alimentables) {
            alimento.alimentar(alimentable);
        }

        Assertions.assertEquals(60, trabajador.getPesoCorporal());
    }
}
