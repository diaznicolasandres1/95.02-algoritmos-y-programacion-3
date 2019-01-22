package instrumentos;

import materiales.Metal;
import materiales.Plastico;
import musicos.FitoPaez;
import musicos.LucianoPereyra;
import musicos.RicardoMollo;
import musicos.RobertoPettinato;
import org.junit.Assert;
import org.junit.Test;

public class GuitarraCriollaTest {

    @Test
    public void test01GuitarraCriollaDeMaderaEsTocadoPorRobertoDevuelve0DeSonido() {
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla();

        Assert.assertEquals(0, guitarraCriolla.emitirSonido(new RobertoPettinato()));
    }

    @Test
    public void test02GuitarraCriollaDeMaderaEsTocadoPorLucianoDevuelve0DeSonido() {
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla();

        Assert.assertEquals(0, guitarraCriolla.emitirSonido(new LucianoPereyra()));
    }

    @Test
    public void test03GuitarraCriollaDeMaderaEsTocadoPorFitoDevuelve0DeSonido() {
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla();

        Assert.assertEquals(0, guitarraCriolla.emitirSonido(new FitoPaez()));
    }

    @Test
    public void test04GuitarraCriollaDeMaderaEsTocadoPorRicardoDevuelve20DeSonido() {
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla();

        Assert.assertEquals(20, guitarraCriolla.emitirSonido(new RicardoMollo()));
    }

    @Test
    public void test05GuitarraCriollaDeMetalEsTocadoPorRobertoDevuelve0DeSonido() {
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla();

        guitarraCriolla.setMaterial(new Metal());

        Assert.assertEquals(0, guitarraCriolla.emitirSonido(new RobertoPettinato()));
    }

    @Test
    public void test06GuitarraCriollaDeMetalEsTocadoPorLucianoDevuelve0DeSonido() {
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla();

        guitarraCriolla.setMaterial(new Metal());

        Assert.assertEquals(0, guitarraCriolla.emitirSonido(new LucianoPereyra()));
    }

    @Test
    public void test07GuitarraCriollaDeMetalEsTocadoPorFitoDevuelve0DeSonido() {
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla();

        guitarraCriolla.setMaterial(new Metal());

        Assert.assertEquals(0, guitarraCriolla.emitirSonido(new FitoPaez()));
    }

    @Test
    public void test08GuitarraCriollaDeMetalEsTocadoPorRicardoDevuelve20DeSonido() {
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla();

        guitarraCriolla.setMaterial(new Metal());

        Assert.assertEquals(20, guitarraCriolla.emitirSonido(new RicardoMollo()));
    }

    @Test
    public void test09GuitarraCriollaDePlasticoEsTocadoPorRobertoDevuelve0DeSonido() {
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla();

        guitarraCriolla.setMaterial(new Plastico());

        Assert.assertEquals(0, guitarraCriolla.emitirSonido(new RobertoPettinato()));
    }

    @Test
    public void test10GuitarraCriollaDePlasticoEsTocadoPorLucianoDevuelve00DeSonido() {
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla();

        guitarraCriolla.setMaterial(new Plastico());

        Assert.assertEquals(0, guitarraCriolla.emitirSonido(new LucianoPereyra()));
    }

    @Test
    public void test11GuitarraCriollaDePlasticoEsTocadoPorFitoDevuelve0DeSonido() {
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla();

        guitarraCriolla.setMaterial(new Plastico());

        Assert.assertEquals(0, guitarraCriolla.emitirSonido(new FitoPaez()));
    }

    @Test
    public void test12GuitarraCriollaDePlasticoEsTocadoPorRicardoDevuelve17DeSonido() {
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla();

        guitarraCriolla.setMaterial(new Plastico());

        Assert.assertEquals(17, guitarraCriolla.emitirSonido(new RicardoMollo()));
    }
}
