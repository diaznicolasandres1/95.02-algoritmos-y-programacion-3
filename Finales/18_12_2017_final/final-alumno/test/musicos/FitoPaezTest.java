package musicos;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;
import materiales.Madera;
import materiales.Metal;
import materiales.Plastico;
import musicos.FitoPaez;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FitoPaezTest {

    @Test
    public void test01FitoTocaCharangoDeMaderaDevuelve0DeSonido() {
        FitoPaez fitoPaez = new FitoPaez();

        assertEquals(fitoPaez.tocar(new Charango()), 0);
    }

    @Test
    public void test02FitoTocaGuitarraCriollaDeMaderaDevuelve0DeSonido() {
        FitoPaez fitoPaez = new FitoPaez();

        assertEquals(fitoPaez.tocar(new GuitarraCriolla()), 0);
    }

    @Test
    public void test03FitoTocaPianoDeMaderaDevuelve150DeSonido() {
        FitoPaez fitoPaez = new FitoPaez();

        assertEquals(fitoPaez.tocar(new Piano()), 150);
    }

    @Test
    public void test04FitoTocaSaxoDeMetalDevuelve0DeSonido() {
        FitoPaez fitoPaez = new FitoPaez();

        assertEquals(fitoPaez.tocar(new Saxo()), 0);
    }

    @Test
    public void test05FitoTocaCharangoDePlasticoDevuelve0DeSonido() {
        FitoPaez fitoPaez = new FitoPaez();
        Charango charangoDePlastico = new Charango();

        charangoDePlastico.setMaterial(new Plastico());

        assertEquals(fitoPaez.tocar(charangoDePlastico), 0);
    }

    @Test
    public void test06FitoTocaGuitarraCriollaDePlasticoDevuelve0DeSonido() {
        FitoPaez fitoPaez = new FitoPaez();
        GuitarraCriolla guitarraCriollaDePlastico = new GuitarraCriolla();

        guitarraCriollaDePlastico.setMaterial(new Plastico());

        assertEquals(fitoPaez.tocar(guitarraCriollaDePlastico), 0);
    }

    @Test
    public void test07FitoTocaPianoDePlasticoDevuelve45DeSonido() {
        FitoPaez fitoPaez = new FitoPaez();
        Piano pianoDePlastico = new Piano();

        pianoDePlastico.setMaterial(new Plastico());

        assertEquals(fitoPaez.tocar(pianoDePlastico), 45);
    }

    @Test
    public void test08FitoTocaSaxoDePlasticoDevuelve0DeSonido() {
        FitoPaez fitoPaez = new FitoPaez();
        Saxo saxoDePlastico = new Saxo();

        saxoDePlastico.setMaterial(new Plastico());

        assertEquals(fitoPaez.tocar(saxoDePlastico), 0);
    }

    @Test
    public void test09FitoTocaCharangoDeMetalDevuelve0DeSonido() {
        FitoPaez fitoPaez = new FitoPaez();
        Charango charangoDeMetal = new Charango();

        charangoDeMetal.setMaterial(new Metal());

        assertEquals(fitoPaez.tocar(charangoDeMetal), 0);
    }

    @Test
    public void test10FitoTocaGuitarraCriollaDeMetalDevuelve0DeSonido() {
        FitoPaez fitoPaez = new FitoPaez();
        GuitarraCriolla guitarraDeMetal = new GuitarraCriolla();

        guitarraDeMetal.setMaterial(new Metal());

        assertEquals(fitoPaez.tocar(guitarraDeMetal), 0);
    }

    @Test
    public void test11FitoTocaPianoDeMetalDevuelve0DeSonido() {
        FitoPaez fitoPaez = new FitoPaez();
        Piano pianoDeMetal = new Piano();

        pianoDeMetal.setMaterial(new Metal());

        assertEquals(fitoPaez.tocar(pianoDeMetal), 50);
    }

    @Test
    public void test12FitoTocaSaxoDeMaderaDevuelve0DeSonido() {
        FitoPaez fitoPaez = new FitoPaez();
        Saxo saxoDeMadera = new Saxo();

        saxoDeMadera.setMaterial(new Madera());

        assertEquals(fitoPaez.tocar(saxoDeMadera), 0);
    }
}
