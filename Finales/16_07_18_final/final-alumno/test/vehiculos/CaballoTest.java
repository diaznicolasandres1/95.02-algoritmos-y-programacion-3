package vehiculos;

import org.junit.Assert;
import org.junit.Test;
import transitables.AsfaltoConLomaDeBurro;
import transitables.AsfaltoConPerrosFuriosos;
import transitables.AsfaltoLiso;
import transitables.CalleEmbarrada;

public class CaballoTest {

    @Test
    public void test01CaballoCalculaVelocidadEnCalleEmbarradaDevuelve20() {
        Caballo caballo = new Caballo();

        Assert.assertEquals(20, caballo.calcularVelocidadEn(new CalleEmbarrada()));
    }

    @Test
    public void test02CaballoCalculaVelocidadEnAsfaltoConLomaDeBurroDevuelve20() {
        Caballo caballo = new Caballo();

        Assert.assertEquals(20, caballo.calcularVelocidadEn(new AsfaltoConLomaDeBurro()));
    }

    @Test
    public void test03CaballoCalculaVelocidadEnAsfaltoConPerrosFuriososDevuelve20() {
        Caballo caballo = new Caballo();

        Assert.assertEquals(20, caballo.calcularVelocidadEn(new AsfaltoConPerrosFuriosos()));
    }

    @Test
    public void test04CaballoCalculaVelocidadEnAsfaltoLisoDevuelve20() {
        Caballo caballo = new Caballo();

        Assert.assertEquals(20, caballo.calcularVelocidadEn(new AsfaltoLiso()));
    }
}