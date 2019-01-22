package vehiculos;

import org.junit.Assert;
import org.junit.Test;
import transitables.AsfaltoConLomaDeBurro;
import transitables.AsfaltoConPerrosFuriosos;
import transitables.AsfaltoLiso;
import transitables.CalleEmbarrada;


public class MotoTest {

    @Test
    public void test01MotoCalculaVelocidadEnCalleEmbarradaDevuelve0() {
        Moto moto = new Moto();

        Assert.assertEquals(0, moto.calcularVelocidadEn(new CalleEmbarrada()));
    }

    @Test
    public void test02MotoCalculaVelocidadEnAsfaltoConLomaDeBurroDevuelve20() {
        Moto moto = new Moto();

        Assert.assertEquals(20, moto.calcularVelocidadEn(new AsfaltoConLomaDeBurro()));
    }

    @Test
    public void test03MotoCalculaVelocidadEnAsfaltoConPerrosFuriososDevuelve20() {
        Moto moto = new Moto();

        Assert.assertEquals(20, moto.calcularVelocidadEn(new AsfaltoConPerrosFuriosos()));
    }

    @Test
    public void test04MotoCalculaVelocidadEnAsfaltoLisoDevuelve40() {
        Moto moto = new Moto();

        Assert.assertEquals(40, moto.calcularVelocidadEn(new AsfaltoLiso()));
    }
}