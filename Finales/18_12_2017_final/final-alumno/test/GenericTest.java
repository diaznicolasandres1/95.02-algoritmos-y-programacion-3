import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;
import musicos.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

// Este test no iría en el examen, solo es para probar si efectivamente funciona el Double Dispatch (aun que a ojo parece que si)
public class GenericTest {

    @Test
    public void test01DoubleDispatchDevuelveValorCorrecto() {
        ArrayList<Musico> musicos = new ArrayList<>();
        Saxo saxo = new Saxo();
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla();
        musicos.add(new LucianoPereyra());
        musicos.add(new RobertoPettinato());
        musicos.add(new RicardoMollo());
        musicos.add(new FitoPaez());
        int resultado = 0;

        for (Musico musico : musicos) {
            resultado += saxo.emitirSonido(musico);
        }

        Assert.assertEquals(90, resultado);
    }

    @Test
    public void test02DoubleDispatchDevuelveValorCorrecto() {
        ArrayList<Musico> musicos = new ArrayList<>();
        GuitarraCriolla guitarraCriolla = new GuitarraCriolla();
        musicos.add(new LucianoPereyra());
        musicos.add(new RobertoPettinato());
        musicos.add(new RicardoMollo());
        musicos.add(new FitoPaez());
        int resultado = 0;

        for (Musico musico : musicos) {
            resultado += guitarraCriolla.emitirSonido(musico);
        }

        Assert.assertEquals(20, resultado);
    }

    @Test
    public void test03DoubleDispatchDevuelveValorCorrecto() {
        ArrayList<Musico> musicos = new ArrayList<>();
        Piano piano = new Piano();
        musicos.add(new LucianoPereyra());
        musicos.add(new RobertoPettinato());
        musicos.add(new RicardoMollo());
        musicos.add(new FitoPaez());
        int resultado = 0;

        for (Musico musico : musicos) {
            resultado += piano.emitirSonido(musico);
        }

        Assert.assertEquals(150, resultado);
    }

    @Test
    public void test04DoubleDispatchDevuelveValorCorrecto() {
        ArrayList<Musico> musicos = new ArrayList<>();
        Charango charango = new Charango();
        musicos.add(new LucianoPereyra());
        musicos.add(new RobertoPettinato());
        musicos.add(new RicardoMollo());
        musicos.add(new FitoPaez());
        int resultado = 0;

        for (Musico musico : musicos) {
            resultado += charango.emitirSonido(musico);
        }

        Assert.assertEquals(20, resultado);
    }
}
