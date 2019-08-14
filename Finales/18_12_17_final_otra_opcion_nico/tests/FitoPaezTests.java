import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;
import materiales.Madera;
import materiales.Metal;
import materiales.Plastico;
import musicos.FitoPaez;
import musicos.FitoPaez;
import org.junit.Assert;
import org.junit.Test;

public class FitoPaezTests {

    @Test
    public void  test001FitoPaezTocaPiano150Decibeles(){
        FitoPaez fitoPaez = new FitoPaez();
        Piano piano = new Piano(new Madera());
        Assert.assertEquals(fitoPaez.tocarInstrumento(piano), 150);
    }

    @Test
    public void test002FitoPaezTocaGuitarra0Decibeles(){
        FitoPaez     fitoPaez = new FitoPaez();
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla(new Madera());
        Assert.assertEquals(fitoPaez.tocarInstrumento(guitarraCriolla),0);

    }

    @Test
    public void test003FPTocaCharango0Decibeles(){
        FitoPaez     fitoPaez = new FitoPaez();
        Charango charango = new Charango(new Madera());
        Assert.assertEquals(fitoPaez.tocarInstrumento(charango),0);
    }

    @Test
    public void  test004FitoPaezTocaPianoPlastico45Decibeles(){
        FitoPaez fitoPaez = new FitoPaez();
        Piano piano = new Piano(new Plastico());
        Assert.assertEquals(fitoPaez.tocarInstrumento(piano), 45);
    }

    @Test
    public void test005FitoPaezTocaGuitarraPlastico0Decibeles(){
        FitoPaez     fitoPaez = new FitoPaez();
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla(new Plastico());
        Assert.assertEquals(fitoPaez.tocarInstrumento(guitarraCriolla),0);

    }

    @Test
    public void test006FPTocaCharangoplastico0Decibeles(){
        FitoPaez     fitoPaez = new FitoPaez();
        Charango charango = new Charango(new Plastico());
        Assert.assertEquals(fitoPaez.tocarInstrumento(charango),0);
    }

    @Test
    public void test007FPTocasaxoMadera0Decibeles(){
        FitoPaez fitoPaez = new FitoPaez();
        Saxo saxo = new Saxo(new Madera());
        Assert.assertEquals(fitoPaez.tocarInstrumento(saxo),0);

    }
    @Test
    public void test008FPTocasaxoMetal0Decibeles(){
        FitoPaez     fitoPaez = new FitoPaez();
        Saxo saxo = new Saxo(new Metal());
        Assert.assertEquals(fitoPaez.tocarInstrumento(saxo),0);

    }

}
