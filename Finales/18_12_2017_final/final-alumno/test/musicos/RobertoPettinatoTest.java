package musicos;

import instrumentos.Charango;
import instrumentos.GuitarraCriolla;
import instrumentos.Piano;
import instrumentos.Saxo;
import materiales.Madera;
import materiales.Metal;
import materiales.Plastico;
import musicos.RobertoPettinato;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobertoPettinatoTest {

    @Test
    public void test01RobertoTocaCharangoDeMaderaDevuelve0DeSonido() {
        RobertoPettinato robertoPettinato = new RobertoPettinato();

        assertEquals(robertoPettinato.tocar(new Charango()), 0);
    }

    @Test
    public void test02RobertoTocaGuitarraCriollaDeMaderaDevuelve0DeSonido() {
        RobertoPettinato robertoPettinato = new RobertoPettinato();

        assertEquals(robertoPettinato.tocar(new GuitarraCriolla()), 0);
    }

    @Test
    public void test03RobertoTocaPianoDeMaderaDevuelve0DeSonido() {
        RobertoPettinato robertoPettinato = new RobertoPettinato();

        assertEquals(robertoPettinato.tocar(new Piano()), 0);
    }

    @Test
    public void test04RobertoTocaSaxoDeMetalDevuelve0DeSonido() {
        RobertoPettinato robertoPettinato = new RobertoPettinato();

        assertEquals(robertoPettinato.tocar(new Saxo()), 90);
    }

    @Test
    public void test05RobertoTocaCharangoDePlasticoDevuelve0DeSonido() {
        RobertoPettinato robertoPettinato = new RobertoPettinato();
        Charango charangoDePlastico = new Charango();

        charangoDePlastico.setMaterial(new Plastico());

        assertEquals(robertoPettinato.tocar(charangoDePlastico), 0);
    }

    @Test
    public void test06RobertoTocaGuitarraCriollaDePlasticoDevuelve0DeSonido() {
        RobertoPettinato robertoPettinato = new RobertoPettinato();
        GuitarraCriolla guitarraCriollaDePlastico = new GuitarraCriolla();

        guitarraCriollaDePlastico.setMaterial(new Plastico());

        assertEquals(robertoPettinato.tocar(guitarraCriollaDePlastico), 0);
    }

    @Test
    public void test07RobertoTocaPianoDePlasticoDevuelve0DeSonido() {
        RobertoPettinato robertoPettinato = new RobertoPettinato();
        Piano pianoDePlastico = new Piano();

        pianoDePlastico.setMaterial(new Plastico());

        assertEquals(robertoPettinato.tocar(pianoDePlastico), 0);
    }

    @Test
    public void test08RobertoTocaSaxoDePlasticoDevuelve30DeSonido() {
        RobertoPettinato robertoPettinato = new RobertoPettinato();
        Saxo saxoDePlastico = new Saxo();

        saxoDePlastico.setMaterial(new Plastico());

        assertEquals(robertoPettinato.tocar(saxoDePlastico), 30);
    }

    @Test
    public void test09RobertoTocaCharangoDeMetalDevuelve0DeSonido() {
        RobertoPettinato robertoPettinato = new RobertoPettinato();
        Charango charangoDeMetal = new Charango();

        charangoDeMetal.setMaterial(new Metal());

        assertEquals(robertoPettinato.tocar(charangoDeMetal), 0);
    }

    @Test
    public void test10RobertoTocaGuitarraCriollaDeMetalDevuelve0DeSonido() {
        RobertoPettinato robertoPettinato = new RobertoPettinato();
        GuitarraCriolla guitarraDeMetal = new GuitarraCriolla();

        guitarraDeMetal.setMaterial(new Metal());

        assertEquals(robertoPettinato.tocar(guitarraDeMetal), 0);
    }

    @Test
    public void test11RobertoTocaPianoDeMetalDevuelve0DeSonido() {
        RobertoPettinato robertoPettinato = new RobertoPettinato();
        Piano pianoDeMetal = new Piano();

        pianoDeMetal.setMaterial(new Metal());

        assertEquals(robertoPettinato.tocar(pianoDeMetal), 0);
    }

    @Test
    public void test12RobertoTocaSaxoDeMaderaDevuelve30DeSonido() {
        RobertoPettinato robertoPettinato = new RobertoPettinato();
        Saxo saxoDeMadera = new Saxo();

        saxoDeMadera.setMaterial(new Madera());

        assertEquals(robertoPettinato.tocar(saxoDeMadera), 30);
    }
}
