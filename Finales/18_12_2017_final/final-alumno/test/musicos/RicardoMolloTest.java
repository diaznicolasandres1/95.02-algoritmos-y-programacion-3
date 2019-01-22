package musicos;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;
import materiales.Madera;
import materiales.Metal;
import materiales.Plastico;
import musicos.RicardoMollo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RicardoMolloTest {

    @Test
    public void test01RicardoTocaCharangoDeMaderaDevuelve0DeSonido() {
        RicardoMollo ricardoMollo = new RicardoMollo();

        assertEquals(ricardoMollo.tocar(new Charango()), 0);
    }

    @Test
    public void test02RicardoTocaGuitarraCriollaDeMaderaDevuelve20DeSonido() {
        RicardoMollo ricardoMollo = new RicardoMollo();

        assertEquals(ricardoMollo.tocar(new GuitarraCriolla()), 20);
    }

    @Test
    public void test03RicardoTocaPianoDeMaderaDevuelve0DeSonido() {
        RicardoMollo ricardoMollo = new RicardoMollo();

        assertEquals(ricardoMollo.tocar(new Piano()), 0);
    }

    @Test
    public void test04RicardoTocaSaxoDeMetalDevuelve0DeSonido() {
        RicardoMollo ricardoMollo = new RicardoMollo();

        assertEquals(ricardoMollo.tocar(new Saxo()), 0);
    }

    @Test
    public void test05RicardoTocaCharangoDePlasticoDevuelve0DeSonido() {
        RicardoMollo ricardoMollo = new RicardoMollo();
        Charango charangoDePlastico = new Charango();

        charangoDePlastico.setMaterial(new Plastico());

        assertEquals(ricardoMollo.tocar(charangoDePlastico), 0);
    }

    @Test
    public void test06RicardoTocaGuitarraCriollaDePlasticoDevuelve17DeSonido() {
        RicardoMollo ricardoMollo = new RicardoMollo();
        GuitarraCriolla guitarraCriollaDePlastico = new GuitarraCriolla();

        guitarraCriollaDePlastico.setMaterial(new Plastico());

        assertEquals(ricardoMollo.tocar(guitarraCriollaDePlastico), 17);
    }

    @Test
    public void test07RicardoTocaPianoDePlasticoDevuelve0DeSonido() {
        RicardoMollo ricardoMollo = new RicardoMollo();
        Piano pianoDePlastico = new Piano();

        pianoDePlastico.setMaterial(new Plastico());

        assertEquals(ricardoMollo.tocar(pianoDePlastico), 0);
    }

    @Test
    public void test08RicardoTocaSaxoDePlasticoDevuelve0DeSonido() {
        RicardoMollo ricardoMollo = new RicardoMollo();
        Saxo saxoDePlastico = new Saxo();

        saxoDePlastico.setMaterial(new Plastico());

        assertEquals(ricardoMollo.tocar(saxoDePlastico), 0);
    }

    @Test
    public void test09RicardoTocaCharangoDeMetalDevuelve0DeSonido() {
        RicardoMollo ricardoMollo = new RicardoMollo();
        Charango charangoDeMetal = new Charango();

        charangoDeMetal.setMaterial(new Metal());

        assertEquals(ricardoMollo.tocar(charangoDeMetal), 0);
    }

    @Test
    public void test10RicardoTocaGuitarraCriollaDeMetalDevuelve20DeSonido() {
        RicardoMollo ricardoMollo = new RicardoMollo();
        GuitarraCriolla guitarraDeMetal = new GuitarraCriolla();

        guitarraDeMetal.setMaterial(new Metal());

        assertEquals(ricardoMollo.tocar(guitarraDeMetal), 20);
    }

    @Test
    public void test11RicardoTocaPianoDeMetalDevuelve0DeSonido() {
        RicardoMollo ricardoMollo = new RicardoMollo();
        Piano pianoDeMetal = new Piano();

        pianoDeMetal.setMaterial(new Metal());

        assertEquals(ricardoMollo.tocar(pianoDeMetal), 0);
    }

    @Test
    public void test12RicardoTocaSaxoDeMaderaDevuelve0DeSonido() {
        RicardoMollo ricardoMollo = new RicardoMollo();
        Saxo saxoDeMadera = new Saxo();

        saxoDeMadera.setMaterial(new Madera());

        assertEquals(ricardoMollo.tocar(saxoDeMadera), 0);
    }
}
