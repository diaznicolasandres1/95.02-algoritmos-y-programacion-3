package vehiculos;

import org.junit.Assert;
import org.junit.Test;
import transitables.AsfaltoConLomaDeBurro;
import transitables.AsfaltoConPerrosFuriosos;
import transitables.AsfaltoLiso;
import transitables.CalleEmbarrada;
import vehiculos.Auto;

public class AutoTest {

    @Test
    public void test01AutoCalculaVelocidadEnCalleEmbarradaDevuelve0() {
        Auto auto = new Auto();

        Assert.assertEquals(0, auto.calcularVelocidadEn(new CalleEmbarrada()));
    }

    @Test
    public void test02AutoCalculaVelocidadEnAsfaltoConLomaDeBurroDevuelve20() {
        Auto auto = new Auto();

        Assert.assertEquals(20, auto.calcularVelocidadEn(new AsfaltoConLomaDeBurro()));
    }

    @Test
    public void test03AutoCalculaVelocidadEnAsfaltoConPerrosFuriososDevuelve40() {
        Auto auto = new Auto();

        Assert.assertEquals(40, auto.calcularVelocidadEn(new AsfaltoConPerrosFuriosos()));
    }

    @Test
    public void test04AutoCalculaVelocidadEnAsfaltoLisoDevuelve40() {
        Auto auto = new Auto();

        Assert.assertEquals(40, auto.calcularVelocidadEn(new AsfaltoLiso()));
    }

}
