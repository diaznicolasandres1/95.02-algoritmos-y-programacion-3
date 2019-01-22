import org.junit.Assert;
import org.junit.Test;
import transitables.AsfaltoConLomaDeBurro;
import transitables.AsfaltoConPerrosFuriosos;
import transitables.AsfaltoLiso;
import transitables.CalleEmbarrada;
import vehiculos.Auto;
import vehiculos.AutoCuatroPorCuatro;
import vehiculos.Caballo;
import vehiculos.Moto;

public class PersonaTest {

    @Test
    public void test01PersonaCalculaVelocidadSinVehiculoEnAsfaltoLisoDevuelve5() {
        Persona persona = new Persona();

        Assert.assertEquals(5, persona.calcularVelocidadEn(new AsfaltoLiso()));
    }

    @Test
    public void test02PersonaCalculaVelocidadSinVehiculoEnAsfaltoConPerrosFuriososDevuelve5() {
        Persona persona = new Persona();

        Assert.assertEquals(5, persona.calcularVelocidadEn(new AsfaltoConPerrosFuriosos()));
    }

    @Test
    public void test03PersonaCalculaVelocidadSinVehiculoEnAsfaltoConLomaDeBurroDevuelve5() {
        Persona persona = new Persona();

        Assert.assertEquals(5, persona.calcularVelocidadEn(new AsfaltoConLomaDeBurro()));
    }

    @Test
    public void test04PersonaCalculaVelocidadSinVehiculoEnCalleEmbarradaDevuelve5() {
        Persona persona = new Persona();

        Assert.assertEquals(5, persona.calcularVelocidadEn(new CalleEmbarrada()));
    }

    @Test
    public void test05PersonaCalculaVelocidadSubidoAMotoEnAsfaltoLisoDevuelve40() {
        Persona persona = new Persona();

        persona.subirseA(new Moto());

        Assert.assertEquals(40, persona.calcularVelocidadEn(new AsfaltoLiso()));
    }

    @Test
    public void test06PersonaCalculaVelocidadSubidoAMotoEnAsfaltoConPerrosFuriososDevuelve20() {
        Persona persona = new Persona();

        persona.subirseA(new Moto());

        Assert.assertEquals(20, persona.calcularVelocidadEn(new AsfaltoConPerrosFuriosos()));
    }

    @Test
    public void test07PersonaCalculaVelocidadSubidoAMotoEnAsfaltoConLomasDeBurroDevuelve20() {
        Persona persona = new Persona();

        persona.subirseA(new Moto());

        Assert.assertEquals(20, persona.calcularVelocidadEn(new AsfaltoConLomaDeBurro()));
    }

    @Test
    public void test08PersonaCalculaVelocidadSubidoAAutoEnAsfaltoLisoDevuelve40() {
        Persona persona = new Persona();

        persona.subirseA(new Auto());

        Assert.assertEquals(40, persona.calcularVelocidadEn(new AsfaltoLiso()));
    }

    @Test
    public void test09PersonaCalculaVelocidadSubidoAAutoEnAsfaltoConPerrosFuriososDevuelve40() {
        Persona persona = new Persona();

        persona.subirseA(new Auto());

        Assert.assertEquals(40, persona.calcularVelocidadEn(new AsfaltoConPerrosFuriosos()));
    }

    @Test
    public void test10PersonaCalculaVelocidadSubidoAAutoEnAsfaltoConLomaDeBurroDevuelve20() {
        Persona persona = new Persona();

        persona.subirseA(new Auto());

        Assert.assertEquals(20, persona.calcularVelocidadEn(new AsfaltoConLomaDeBurro()));
    }

    @Test
    public void test11PersonaCalculaVelocidadSubidoAAutoEnCalleEmbarradaDevuelve0() {
        Persona persona = new Persona();

        persona.subirseA(new Auto());

        Assert.assertEquals(0, persona.calcularVelocidadEn(new CalleEmbarrada()));
    }

    @Test
    public void test12PersonaCalculaVelocidadSubidoAAutoCuatroPorCuatroEnAsfaltoLisoDevuelve40() {
        Persona persona = new Persona();

        persona.subirseA(new AutoCuatroPorCuatro());

        Assert.assertEquals(40, persona.calcularVelocidadEn(new AsfaltoLiso()));
    }

    @Test
    public void test13PersonaCalculaVelocidadSubidoAAutoCuatroPorCuatroEnAsfaltoConLomaDeBurroDevuelve20() {
        Persona persona = new Persona();

        persona.subirseA(new AutoCuatroPorCuatro());

        Assert.assertEquals(20, persona.calcularVelocidadEn(new AsfaltoConLomaDeBurro()));
    }

    @Test
    public void test14PersonaCalculaVelocidadSubidoAAutoCuatroPorCuatroEnAsfaltoConPerrosFuriososDevuelve40() {
        Persona persona = new Persona();

        persona.subirseA(new AutoCuatroPorCuatro());

        Assert.assertEquals(40, persona.calcularVelocidadEn(new AsfaltoConPerrosFuriosos()));
    }

    @Test
    public void test15PersonaCalculaVelocidadSubidoAAutoCuatroPorCuatroEnCalleEmbarradaDevuelve10() {
        Persona persona = new Persona();

        persona.subirseA(new AutoCuatroPorCuatro());

        Assert.assertEquals(10, persona.calcularVelocidadEn(new CalleEmbarrada()));
    }

    @Test
    public void test16PersonaCalculaVelocidadSubidoACaballoEnAsfaltoLisoDevuelve20() {
        Persona persona = new Persona();

        persona.subirseA(new Caballo());

        Assert.assertEquals(20, persona.calcularVelocidadEn(new AsfaltoLiso()));
    }

    @Test
    public void test17PersonaCalculaVelocidadSubidoACaballoEnAsfaltoConLomaDeBurroDevuelve20() {
        Persona persona = new Persona();

        persona.subirseA(new Caballo());

        Assert.assertEquals(20, persona.calcularVelocidadEn(new AsfaltoConLomaDeBurro()));
    }

    @Test
    public void test18PersonaCalculaVelocidadSubidoACaballoEnAsfaltoConPerrosFuriososDevuelve20() {
        Persona persona = new Persona();

        persona.subirseA(new Caballo());

        Assert.assertEquals(20, persona.calcularVelocidadEn(new AsfaltoConPerrosFuriosos()));
    }

    @Test
    public void test19PersonaCalculaVelocidadSubidoACaballoEnCalleEmbarradaDevuelve20() {
        Persona persona = new Persona();

        persona.subirseA(new Caballo());

        Assert.assertEquals(20, persona.calcularVelocidadEn(new CalleEmbarrada()));
    }

}
