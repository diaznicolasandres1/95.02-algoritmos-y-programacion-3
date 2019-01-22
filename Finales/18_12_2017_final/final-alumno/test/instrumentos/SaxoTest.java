package instrumentos;

import materiales.Madera;
import materiales.Plastico;
import musicos.FitoPaez;
import musicos.LucianoPereyra;
import musicos.RicardoMollo;
import musicos.RobertoPettinato;
import org.junit.Assert;
import org.junit.Test;

public class SaxoTest {

    @Test
    public void test01SaxoDeMetalEsTocadoPorRobertoDevuelve90DeSonido() {
        Saxo saxo = new Saxo();

        Assert.assertEquals(90, saxo.emitirSonido(new RobertoPettinato()));
    }

    @Test
    public void test02SaxoDeMetalEsTocadoPorLucianoDevuelve0DeSonido() {
        Saxo saxo = new Saxo();

        Assert.assertEquals(0, saxo.emitirSonido(new LucianoPereyra()));
    }

    @Test
    public void test03SaxoDeMetalEsTocadoPorFitoDevuelve0DeSonido() {
        Saxo saxo = new Saxo();

        Assert.assertEquals(0, saxo.emitirSonido(new FitoPaez()));
    }

    @Test
    public void test04SaxoDeMetalEsTocadoPorRicardoDevuelve0DeSonido() {
        Saxo saxo = new Saxo();

        Assert.assertEquals(0, saxo.emitirSonido(new RicardoMollo()));
    }

    @Test
    public void test05SaxoDeMaderaEsTocadoPorRobertoDevuelve30DeSonido() {
        Saxo saxo = new Saxo();

        saxo.setMaterial(new Madera());

        Assert.assertEquals(30, saxo.emitirSonido(new RobertoPettinato()));
    }

    @Test
    public void test06SaxoDeMaderaEsTocadoPorLucianoDevuelve0DeSonido() {
        Saxo saxo = new Saxo();

        saxo.setMaterial(new Madera());

        Assert.assertEquals(0, saxo.emitirSonido(new LucianoPereyra()));
    }

    @Test
    public void test07SaxoDeMaderaEsTocadoPorFitoDevuelve0DeSonido() {
        Saxo saxo = new Saxo();

        saxo.setMaterial(new Madera());

        Assert.assertEquals(0, saxo.emitirSonido(new FitoPaez()));
    }

    @Test
    public void test08SaxoDeMaderaEsTocadoPorRicardoDevuelve0DeSonido() {
        Saxo saxo = new Saxo();

        saxo.setMaterial(new Madera());

        Assert.assertEquals(0, saxo.emitirSonido(new RicardoMollo()));
    }

    @Test
    public void test09SaxoDePlasticoEsTocadoPorRobertoDevuelve30DeSonido() {
        Saxo saxo = new Saxo();

        saxo.setMaterial(new Plastico());

        Assert.assertEquals(30, saxo.emitirSonido(new RobertoPettinato()));
    }

    @Test
    public void test10SaxoDePlasticoEsTocadoPorLucianoDevuelve0DeSonido() {
        Saxo saxo = new Saxo();

        saxo.setMaterial(new Plastico());

        Assert.assertEquals(0, saxo.emitirSonido(new LucianoPereyra()));
    }

    @Test
    public void test11SaxoDePlasticoEsTocadoPorFitoDevuelve0DeSonido() {
        Saxo saxo = new Saxo();

        saxo.setMaterial(new Plastico());

        Assert.assertEquals(0, saxo.emitirSonido(new FitoPaez()));
    }

    @Test
    public void test12SaxoDePlasticoEsTocadoPorRicardoDevuelve0DeSonido() {
        Saxo saxo = new Saxo();

        saxo.setMaterial(new Plastico());

        Assert.assertEquals(0, saxo.emitirSonido(new RicardoMollo()));
    }

}
