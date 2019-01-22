package vehiculos;

import org.junit.Assert;
import org.junit.Test;
import transitables.AsfaltoConLomaDeBurro;
import transitables.AsfaltoConPerrosFuriosos;
import transitables.AsfaltoLiso;
import transitables.CalleEmbarrada;

public class AutoCuatroPorCuatroTest {

    @Test
    public void test01AutoCuatroPorCuatroCalculaVelocidadEnCalleEmbarradaDevuelve10() {
        AutoCuatroPorCuatro auto = new AutoCuatroPorCuatro();

        Assert.assertEquals(10, auto.calcularVelocidadEn(new CalleEmbarrada()));
    }

    @Test
    public void test02AutoCuatroPorCuatroCalculaVelocidadEnAsfaltoConLomaDeBurroDevuelve20() {
        AutoCuatroPorCuatro auto = new AutoCuatroPorCuatro();

        Assert.assertEquals(20, auto.calcularVelocidadEn(new AsfaltoConLomaDeBurro()));
    }

    @Test
    public void test03AutoCuatroPorCuatroCalculaVelocidadEnAsfaltoConPerrosFuriososDevuelve40() {
        AutoCuatroPorCuatro auto = new AutoCuatroPorCuatro();

        Assert.assertEquals(40, auto.calcularVelocidadEn(new AsfaltoConPerrosFuriosos()));
    }

    @Test
    public void test04AutoCuatroPorCuatroCalculaVelocidadEnAsfaltoLisoDevuelve40() {
        AutoCuatroPorCuatro auto = new AutoCuatroPorCuatro();

        Assert.assertEquals(40, auto.calcularVelocidadEn(new AsfaltoLiso()));
    }
}