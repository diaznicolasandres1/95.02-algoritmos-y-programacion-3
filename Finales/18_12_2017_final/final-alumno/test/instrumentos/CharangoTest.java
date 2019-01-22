package instrumentos;

import materiales.Metal;
import materiales.Plastico;
import musicos.FitoPaez;
import musicos.LucianoPereyra;
import musicos.RicardoMollo;
import musicos.RobertoPettinato;
import org.junit.Assert;
import org.junit.Test;

public class CharangoTest {

    @Test
    public void test01CharangoDeMaderaEsTocadoPorRobertoDevuelve0DeSonido() {
        Charango charango = new Charango();

        Assert.assertEquals(0, charango.emitirSonido(new RobertoPettinato()));
    }

    @Test
    public void test02CharangoDeMaderaEsTocadoPorLucianoDevuelve20DeSonido() {
        Charango charango = new Charango();

        Assert.assertEquals(20, charango.emitirSonido(new LucianoPereyra()));
    }

    @Test
    public void test03CharangoDeMaderaEsTocadoPorFitoDevuelve0DeSonido() {
        Charango charango = new Charango();

        Assert.assertEquals(0, charango.emitirSonido(new FitoPaez()));
    }

    @Test
    public void test04CharangoDeMaderaEsTocadoPorRicardoDevuelve0DeSonido() {
        Charango charango = new Charango();

        Assert.assertEquals(0, charango.emitirSonido(new RicardoMollo()));
    }

    @Test
    public void test05CharangoDeMetalEsTocadoPorRobertoDevuelve0DeSonido() {
        Charango charango = new Charango();

        charango.setMaterial(new Metal());

        Assert.assertEquals(0, charango.emitirSonido(new RobertoPettinato()));
    }

    @Test
    public void test06CharangoDeMetalEsTocadoPorLucianoDevuelve10DeSonido() {
        Charango charango = new Charango();

        charango.setMaterial(new Metal());

        Assert.assertEquals(10, charango.emitirSonido(new LucianoPereyra()));
    }

    @Test
    public void test07CharangoDeMetalEsTocadoPorFitoDevuelve0DeSonido() {
        Charango charango = new Charango();

        charango.setMaterial(new Metal());

        Assert.assertEquals(0, charango.emitirSonido(new FitoPaez()));
    }

    @Test
    public void test08CharangoDeMetalEsTocadoPorRicardoDevuelve0DeSonido() {
        Charango charango = new Charango();

        charango.setMaterial(new Metal());

        Assert.assertEquals(0, charango.emitirSonido(new RicardoMollo()));
    }

    @Test
    public void test09CharangoDePlasticoEsTocadoPorRobertoDevuelve0DeSonido() {
        Charango charango = new Charango();

        charango.setMaterial(new Plastico());

        Assert.assertEquals(0, charango.emitirSonido(new RobertoPettinato()));
    }

    @Test
    public void test10CharangoDePlasticoEsTocadoPorLucianoDevuelve10DeSonido() {
        Charango charango = new Charango();

        charango.setMaterial(new Plastico());

        Assert.assertEquals(10, charango.emitirSonido(new LucianoPereyra()));
    }

    @Test
    public void test11CharangoDePlasticoEsTocadoPorFitoDevuelve0DeSonido() {
        Charango charango = new Charango();

        charango.setMaterial(new Plastico());

        Assert.assertEquals(0, charango.emitirSonido(new FitoPaez()));
    }

    @Test
    public void test12CharangoDePlasticoEsTocadoPorRicardoDevuelve0DeSonido() {
        Charango charango = new Charango();

        charango.setMaterial(new Plastico());

        Assert.assertEquals(0, charango.emitirSonido(new RicardoMollo()));
    }
}
