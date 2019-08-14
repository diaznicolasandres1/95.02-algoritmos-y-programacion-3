import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;
import materiales.Madera;
import materiales.Metal;
import materiales.Plastico;
import musicos.RicardoMollo;
import musicos.RobertoPettinato;
import org.junit.Assert;
import org.junit.Test;

public class RicardoMolloTests {
    @Test
    public void  test001RicardoMolloTocaPiano0Decibeles(){
        RicardoMollo ricardoMollo = new RicardoMollo();
        Piano piano = new Piano(new Madera());
        Assert.assertEquals(ricardoMollo.tocarInstrumento(piano), 0);
    }

    @Test
    public void test002RicardoMolloTocaGuitarra20Decibeles(){
        RicardoMollo     ricardoMollo = new RicardoMollo();
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla(new Madera());
        Assert.assertEquals(ricardoMollo.tocarInstrumento(guitarraCriolla),20);

    }

    @Test
    public void test003FPTocaCharango0Decibeles(){
        RicardoMollo     ricardoMollo = new RicardoMollo();
        Charango charango = new Charango(new Madera());
        Assert.assertEquals(ricardoMollo.tocarInstrumento(charango),0);
    }

    @Test
    public void  test004RicardoMolloTocaPianoPlastico0Decibeles(){
        RicardoMollo ricardoMollo = new RicardoMollo();
        Piano piano = new Piano(new Plastico());
        Assert.assertEquals(ricardoMollo.tocarInstrumento(piano), 0);
    }

    @Test
    public void test005RicardoMolloTocaGuitarraPlastico17Decibeles(){
        RicardoMollo     ricardoMollo = new RicardoMollo();
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla(new Plastico());
        Assert.assertEquals(ricardoMollo.tocarInstrumento(guitarraCriolla),17);

    }

    @Test
    public void test006FPTocaCharangoplastico0Decibeles(){
        RicardoMollo     ricardoMollo = new RicardoMollo();
        Charango charango = new Charango(new Plastico());
        Assert.assertEquals(ricardoMollo.tocarInstrumento(charango),0);
    }


    @Test
    public void test007RicardoMolloTocasaxoMadera30Decibeles(){
        RicardoMollo ricardoMollo = new RicardoMollo();
        Saxo saxo = new Saxo(new Madera());
        Assert.assertEquals(ricardoMollo.tocarInstrumento(saxo),0);

    }
    @Test
    public void test008RicardoMolloTocasaxoMetal90Decibeles(){
        RicardoMollo     ricardoMollo = new RicardoMollo();
        Saxo saxo = new Saxo(new Metal());
        Assert.assertEquals(ricardoMollo.tocarInstrumento(saxo),0);

    }
}
