import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;
import materiales.Madera;
import materiales.Metal;
import materiales.Plastico;
import musicos.LucianoPereyra;
import musicos.LucianoPereyra;
import org.junit.Assert;
import org.junit.Test;

public class LucianoPereyraTests {
    @Test
    public void  test001LucianoPereyraTocaPiano0Decibeles(){
        LucianoPereyra lucianoPereyra = new LucianoPereyra();
        Piano piano = new Piano(new Madera());
        Assert.assertEquals(lucianoPereyra.tocarInstrumento(piano), 0);
    }

    @Test
    public void test002LucianoPereyraTocaGuitarra0Decibeles(){
        LucianoPereyra     lucianoPereyra = new LucianoPereyra();
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla(new Madera());
        Assert.assertEquals(lucianoPereyra.tocarInstrumento(guitarraCriolla),0);

    }

    @Test
    public void test003FPTocaCharangoDecibeles(){
        LucianoPereyra     lucianoPereyra = new LucianoPereyra();
        Charango charango = new Charango(new Madera());
        Assert.assertEquals(lucianoPereyra.tocarInstrumento(charango),20);
    }

    @Test
    public void  test004LucianoPereyraTocaPianoPlastico0Decibeles(){
        LucianoPereyra lucianoPereyra = new LucianoPereyra();
        Piano piano = new Piano(new Plastico());
        Assert.assertEquals(lucianoPereyra.tocarInstrumento(piano), 0);
    }

    @Test
    public void test005LucianoPereyraTocaGuitarraPlastico0Decibeles(){
        LucianoPereyra     lucianoPereyra = new LucianoPereyra();
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla(new Plastico());
        Assert.assertEquals(lucianoPereyra.tocarInstrumento(guitarraCriolla),0);

    }

    @Test
    public void test006FPTocaCharangoplastico10Decibeles(){
        LucianoPereyra     lucianoPereyra = new LucianoPereyra();
        Charango charango = new Charango(new Plastico());
        Assert.assertEquals(lucianoPereyra.tocarInstrumento(charango),10);
    }

    @Test
    public void test007LPTocasaxoMadera0Decibeles(){
        LucianoPereyra lucianoPereyra = new LucianoPereyra();
        Saxo saxo = new Saxo(new Madera());
        Assert.assertEquals(lucianoPereyra.tocarInstrumento(saxo),0);

    }
    @Test
    public void test008LPTocasaxoMetal0Decibeles(){
        LucianoPereyra     lucianoPereyra = new LucianoPereyra();
        Saxo saxo = new Saxo(new Metal());
        Assert.assertEquals(lucianoPereyra.tocarInstrumento(saxo),0);

    }
}
