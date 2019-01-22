package personajes;

import org.junit.Assert;
import org.junit.Test;
import personajes.Atacante;
import personajes.Freezer;
import personajes.Goku;

import java.util.ArrayList;

public class FreezerTest {

    @Test
    public void test01FreezerEtapaUnoAtacaAGokuYLeQuita10DeVida() {

        Freezer freezer = new Freezer();
        Goku goku = new Goku();

        freezer.atacar(goku);

        Assert.assertEquals(90, goku.getVida());
    }

    @Test
    public void test02FreezerEtapaDosAtacaAGokuYLeQuita20DeVida() {

        Freezer freezer = new Freezer();
        Goku goku = new Goku();

        freezer.evolucionar();
        freezer.atacar(goku);

        Assert.assertEquals(80, goku.getVida());
    }

    @Test
    public void test03FreezerEtapaUnoAtacaAFreezerYLeQuita0DeVida() {

        Freezer unFreezer = new Freezer();
        Freezer otroFreezer = new Freezer();

        unFreezer.atacar(otroFreezer);

        Assert.assertEquals(100, otroFreezer.getVida());
    }

    @Test
    public void test04FreezerEtapaDosAtacaAFreezerYNoLeQuitaVida() {

        Freezer unFreezer = new Freezer();
        Freezer otroFreezer = new Freezer();

        unFreezer.evolucionar();
        unFreezer.atacar(otroFreezer);

        Assert.assertEquals(100, otroFreezer.getVida());
    }

    @Test
    public void test05FreezerEtapaUnoAtacaAFreezerEtapaDosYNoLeQuitaVida() {

        Freezer unFreezer = new Freezer();
        Freezer otroFreezer = new Freezer();

        otroFreezer.evolucionar();
        unFreezer.atacar(otroFreezer);

        Assert.assertEquals(100, otroFreezer.getVida());
    }

    @Test
    public void test06FreezerRecibeDanio15DeDanioDeGoku() {

        Freezer freezer = new Freezer();

        freezer.recibirDanio(new Goku(), 15);

        Assert.assertEquals(85, freezer.getVida());
    }

    @Test
    public void test07FreezerNoRecibeDanioDeDanioDeFreezer() {

        Freezer freezer = new Freezer();

        freezer.recibirDanio(new Freezer(), 100);

        Assert.assertEquals(100, freezer.getVida());
    }

    @Test
    public void test08FreezerRecibe30DeDanioDeDosAtacantes() {

        Freezer freezer = new Freezer();
        ArrayList<Atacante> atacantes = new ArrayList<>();
        atacantes.add(new Goku());
        atacantes.add(new Goku());
        atacantes.add(new Freezer());

        for (Atacante atacante : atacantes) {
            freezer.recibirDanio(atacante);
        }

        Assert.assertEquals(70, freezer.getVida());
    }

    @Test
    public void test09FreezerEsAtacadoHastaEvolucionarAEtapaDosYAtacaAGokuYLeQuita20DeVida() {

        Freezer freezer = new Freezer();
        Goku goku = new Goku();

        goku.atacar(freezer);
        goku.atacar(freezer);
        goku.atacar(freezer);
        goku.atacar(freezer);

        freezer.atacar(goku);

        Assert.assertEquals(80, goku.getVida());
    }
}
