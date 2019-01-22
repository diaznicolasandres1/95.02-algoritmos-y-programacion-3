package personajes;

import org.junit.Assert;
import org.junit.Test;
import personajes.Atacante;
import personajes.Goku;
import personajes.Freezer;

import java.util.ArrayList;

public class GokuTest {

    @Test
    public void test01GokuSaiyajinAtacaAFreezerYLeQuita15DeVida() {

        Goku goku = new Goku();
        Freezer freezer = new Freezer();

        goku.atacar(freezer);

        Assert.assertEquals(85, freezer.getVida());
    }

    @Test
    public void test02GokuSaiyajinAtacaAGokuYNoLeQuitaVida() {

        Goku unGoku = new Goku();
        Goku otroGoku = new Goku();

        unGoku.atacar(otroGoku);

        Assert.assertEquals(100, otroGoku.getVida());
    }

    @Test
    public void test03GokuSuperSaiyajintacaAGokuYNoLeQuitaVida() {

        Goku unGoku = new Goku();
        Goku otroGoku = new Goku();

        unGoku.evolucionar();
        unGoku.atacar(otroGoku);

        Assert.assertEquals(100, otroGoku.getVida());
    }

    @Test
    public void test04GokuSuperSaiyajinAtacaAFreezerYLeQuita30DeVida() {

        Goku unGoku = new Goku();
        Freezer freezer = new Freezer();

        unGoku.evolucionar();
        unGoku.atacar(freezer);

        Assert.assertEquals(70, freezer.getVida());
    }

    @Test
    public void test05GokuSaiyajinAtacaAGokuSuperSaiyajinYNoLeQuitaVida() {

        Goku unGoku = new Goku();
        Goku otroGoku = new Goku();

        otroGoku.evolucionar();
        unGoku.atacar(otroGoku);

        Assert.assertEquals(100, otroGoku.getVida());
    }

    @Test
    public void test06GokuRecibeDanio10DeDanioDeFreezer() {

        Goku goku = new Goku();

        goku.recibirDanio(new Freezer(), 10);

        Assert.assertEquals(90, goku.getVida());
    }

    @Test
    public void test07GokuNoRecibeDanioDeDanioDeGoku() {

        Goku goku = new Goku();

        goku.recibirDanio(new Goku(), 100);

        Assert.assertEquals(100, goku.getVida());
    }

    @Test
    public void test08GokuRecibe20DeDanioDeDosAtacantes() {

        Goku goku = new Goku();
        ArrayList<Atacante> atacantes = new ArrayList<>();
        atacantes.add(new Freezer());
        atacantes.add(new Freezer());
        atacantes.add(new Goku());

        for (Atacante atacante : atacantes) {
            goku.recibirDanio(atacante);
        }

        Assert.assertEquals(80, goku.getVida());
    }
}
