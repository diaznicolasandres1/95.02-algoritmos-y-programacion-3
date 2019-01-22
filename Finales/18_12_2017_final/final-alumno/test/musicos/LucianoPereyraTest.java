package musicos;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;
import materiales.Madera;
import materiales.Metal;
import materiales.Plastico;
import musicos.LucianoPereyra;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LucianoPereyraTest {

    @Test
    public void test01LucianoTocaCharangoDeMaderaDevuelve20DeSonido() {
        LucianoPereyra lucianoPereyra = new LucianoPereyra();

        assertEquals(lucianoPereyra.tocar(new Charango()), 20);
    }

    @Test
    public void test02LucianoTocaGuitarraCriollaDeMaderaDevuelve0DeSonido() {
        LucianoPereyra lucianoPereyra = new LucianoPereyra();

        assertEquals(lucianoPereyra.tocar(new GuitarraCriolla()), 0);
    }

    @Test
    public void test03LucianoTocaPianoDeMaderaDevuelve0DeSonido() {
        LucianoPereyra lucianoPereyra = new LucianoPereyra();

        assertEquals(lucianoPereyra.tocar(new Piano()), 0);
    }

    @Test
    public void test04LucianoTocaSaxoDeMetalDevuelve0DeSonido() {
        LucianoPereyra lucianoPereyra = new LucianoPereyra();

        assertEquals(lucianoPereyra.tocar(new Saxo()), 0);
    }

    @Test
    public void test05LucianoTocaCharangoDePlasticoDevuelve10DeSonido() {
        LucianoPereyra lucianoPereyra = new LucianoPereyra();
        Charango charangoDePlastico = new Charango();

        charangoDePlastico.setMaterial(new Plastico());

        assertEquals(lucianoPereyra.tocar(charangoDePlastico), 10);
    }

    @Test
    public void test06LucianoTocaGuitarraCriollaDePlasticoDevuelve0DeSonido() {
        LucianoPereyra lucianoPereyra = new LucianoPereyra();
        GuitarraCriolla guitarraCriollaDePlastico = new GuitarraCriolla();

        guitarraCriollaDePlastico.setMaterial(new Plastico());

        assertEquals(lucianoPereyra.tocar(guitarraCriollaDePlastico), 0);
    }

    @Test
    public void test07LucianoTocaPianoDePlasticoDevuelve0DeSonido() {
        LucianoPereyra lucianoPereyra = new LucianoPereyra();
        Piano pianoDePlastico = new Piano();

        pianoDePlastico.setMaterial(new Plastico());

        assertEquals(lucianoPereyra.tocar(pianoDePlastico), 0);
    }

    @Test
    public void test08LucianoTocaSaxoDePlasticoDevuelve0DeSonido() {
        LucianoPereyra lucianoPereyra = new LucianoPereyra();
        Saxo saxoDePlastico = new Saxo();

        saxoDePlastico.setMaterial(new Plastico());

        assertEquals(lucianoPereyra.tocar(saxoDePlastico), 0);
    }

    @Test
    public void test09LucianoTocaCharangoDeMetalDevuelve10DeSonido() {
        LucianoPereyra lucianoPereyra = new LucianoPereyra();
        Charango charangoDeMetal = new Charango();

        charangoDeMetal.setMaterial(new Metal());

        assertEquals(lucianoPereyra.tocar(charangoDeMetal), 10);
    }

    @Test
    public void test10LucianoTocaGuitarraCriollaDeMetalDevuelve0DeSonido() {
        LucianoPereyra lucianoPereyra = new LucianoPereyra();
        GuitarraCriolla guitarraDeMetal = new GuitarraCriolla();

        guitarraDeMetal.setMaterial(new Metal());

        assertEquals(lucianoPereyra.tocar(guitarraDeMetal), 0);
    }

    @Test
    public void test11LucianoTocaPianoDeMetalDevuelve0DeSonido() {
        LucianoPereyra lucianoPereyra = new LucianoPereyra();
        Piano pianoDeMetal = new Piano();

        pianoDeMetal.setMaterial(new Metal());

        assertEquals(lucianoPereyra.tocar(pianoDeMetal), 0);
    }

    @Test
    public void test12LucianoTocaSaxoDeMaderaDevuelve0DeSonido() {
        LucianoPereyra lucianoPereyra = new LucianoPereyra();
        Saxo saxoDeMadera = new Saxo();

        saxoDeMadera.setMaterial(new Madera());

        assertEquals(lucianoPereyra.tocar(saxoDeMadera), 0);
    }

}
