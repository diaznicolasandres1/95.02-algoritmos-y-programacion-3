import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;
import materiales.Madera;
import materiales.Metal;
import materiales.Plastico;
import musicos.RobertoPettinato;
import org.junit.Assert;
import org.junit.Test;

public class RobertoPettinanoTests {


    @Test
    public void  test001RobertoPettinatoTocaPiano0Decibeles(){
        RobertoPettinato robertoPettinato = new RobertoPettinato();
        Piano piano = new Piano(new Madera());
        Assert.assertEquals(robertoPettinato.tocarInstrumento(piano), 0);
    }

    @Test
    public void test002RobertoPettinatoTocaGuitarra0Decibeles(){
        RobertoPettinato     robertoPettinato = new RobertoPettinato();
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla(new Madera());
        Assert.assertEquals(robertoPettinato.tocarInstrumento(guitarraCriolla),0);

    }

    @Test
    public void test003FPTocaCharango0Decibeles(){
        RobertoPettinato     robertoPettinato = new RobertoPettinato();
        Charango charango = new Charango(new Madera());
        Assert.assertEquals(robertoPettinato.tocarInstrumento(charango),0);
    }

    @Test
    public void  test004RobertoPettinatoTocaPianoPlastico0Decibeles(){
        RobertoPettinato robertoPettinato = new RobertoPettinato();
        Piano piano = new Piano(new Plastico());
        Assert.assertEquals(robertoPettinato.tocarInstrumento(piano), 0);
    }

    @Test
    public void test005RobertoPettinatoTocaGuitarraPlastico0Decibeles(){
        RobertoPettinato     robertoPettinato = new RobertoPettinato();
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla(new Plastico());
        Assert.assertEquals(robertoPettinato.tocarInstrumento(guitarraCriolla),0);

    }

    @Test
    public void test006FPTocaCharangoplastico0Decibeles(){
        RobertoPettinato     robertoPettinato = new RobertoPettinato();
        Charango charango = new Charango(new Plastico());
        Assert.assertEquals(robertoPettinato.tocarInstrumento(charango),0);
    }
    @Test
    public void test007RobertoPEtinanoTocasaxoMadera30Decibeles(){
        RobertoPettinato     robertoPettinato = new RobertoPettinato();
        Saxo saxo = new Saxo(new Madera());
        Assert.assertEquals(robertoPettinato.tocarInstrumento(saxo),30);

    }
    @Test
    public void test008RobertoPEtinanoTocasaxoMetal90Decibeles(){
        RobertoPettinato     robertoPettinato = new RobertoPettinato();
        Saxo saxo = new Saxo(new Metal());
        Assert.assertEquals(robertoPettinato.tocarInstrumento(saxo),90);

    }

}
