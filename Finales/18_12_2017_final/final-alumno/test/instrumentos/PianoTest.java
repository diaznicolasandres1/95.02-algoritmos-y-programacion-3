package instrumentos;

import materiales.Metal;
import materiales.Plastico;
import musicos.FitoPaez;
import musicos.LucianoPereyra;
import musicos.RicardoMollo;
import musicos.RobertoPettinato;
import org.junit.Assert;
import org.junit.Test;

public class PianoTest {

    @Test
    public void test01PianoDeMaderaEsTocadoPorRobertoDevuelve0DeSonido() {
        Piano piano = new Piano();

        Assert.assertEquals(0, piano.emitirSonido(new RobertoPettinato()));
    }

    @Test
    public void test02PianoDeMaderaEsTocadoPorLucianoDevuelve0DeSonido() {
        Piano piano = new Piano();

        Assert.assertEquals(0, piano.emitirSonido(new LucianoPereyra()));
    }

    @Test
    public void test03PianoDeMaderaEsTocadoPorFitoDevuelve150DeSonido() {
        Piano piano = new Piano();

        Assert.assertEquals(150, piano.emitirSonido(new FitoPaez()));
    }

    @Test
    public void test04PianoDeMaderaEsTocadoPorRicardoDevuelve0DeSonido() {
        Piano piano = new Piano();

        Assert.assertEquals(0, piano.emitirSonido(new RicardoMollo()));
    }

    @Test
    public void test05PianoDeMetalEsTocadoPorRobertoDevuelve0DeSonido() {
        Piano piano = new Piano();

        piano.setMaterial(new Metal());

        Assert.assertEquals(0, piano.emitirSonido(new RobertoPettinato()));
    }

    @Test
    public void test06PianoDeMetalEsTocadoPorLucianoDevuelve0DeSonido() {
        Piano piano = new Piano();

        piano.setMaterial(new Metal());

        Assert.assertEquals(0, piano.emitirSonido(new LucianoPereyra()));
    }

    @Test
    public void test07PianoDeMetalEsTocadoPorFitoDevuelve50DeSonido() {
        Piano piano = new Piano();

        piano.setMaterial(new Metal());

        Assert.assertEquals(50, piano.emitirSonido(new FitoPaez()));
    }

    @Test
    public void test08PianoDeMetalEsTocadoPorRicardoDevuelve0DeSonido() {
        Piano piano = new Piano();

        piano.setMaterial(new Metal());

        Assert.assertEquals(0, piano.emitirSonido(new RicardoMollo()));
    }

    @Test
    public void test09PianoDePlasticoEsTocadoPorRobertoDevuelve0DeSonido() {
        Piano piano = new Piano();

        piano.setMaterial(new Plastico());

        Assert.assertEquals(0, piano.emitirSonido(new RobertoPettinato()));
    }

    @Test
    public void test10PianoDePlasticoEsTocadoPorLucianoDevuelve0DeSonido() {
        Piano piano = new Piano();

        piano.setMaterial(new Plastico());

        Assert.assertEquals(0, piano.emitirSonido(new LucianoPereyra()));
    }

    @Test
    public void test11PianoDePlasticoEsTocadoPorFitoDevuelve47DeSonido() {
        Piano piano = new Piano();

        piano.setMaterial(new Plastico());

        Assert.assertEquals(45, piano.emitirSonido(new FitoPaez()));
    }

    @Test
    public void test12PianoDePlasticoEsTocadoPorRicardoDevuelve0DeSonido() {
        Piano piano = new Piano();

        piano.setMaterial(new Plastico());

        Assert.assertEquals(0, piano.emitirSonido(new RicardoMollo()));
    }
}
