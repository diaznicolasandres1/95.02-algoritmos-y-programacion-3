package transitables;

import org.junit.Assert;
import org.junit.Test;
import vehiculos.Auto;
import vehiculos.AutoCuatroPorCuatro;
import vehiculos.Caballo;
import vehiculos.Moto;

public class AsfaltoConPerrosFuriososTest {

    @Test
    public void test01AsfaltoConPerrosFuriososCalculaVelocidadAMotoDevuelve20() {
        AsfaltoConPerrosFuriosos asfalto = new AsfaltoConPerrosFuriosos();

        Assert.assertEquals(20, asfalto.calcularVelocidadDe(new Moto()));
    }

    @Test
    public void test02AsfaltoConPerrosFuriososCalculaVelocidadAAutoDevuelve40() {
        AsfaltoConPerrosFuriosos asfalto = new AsfaltoConPerrosFuriosos();

        Assert.assertEquals(40, asfalto.calcularVelocidadDe(new Auto()));
    }

    @Test
    public void test03AsfaltoConPerrosFuriososCalculaVelocidadAAutoCuatroPorCuatroDevuelve40() {
        AsfaltoConPerrosFuriosos asfalto = new AsfaltoConPerrosFuriosos();

        Assert.assertEquals(40, asfalto.calcularVelocidadDe(new AutoCuatroPorCuatro()));
    }

    @Test
    public void test04AsfaltoConPerrosFuriososCalculaVelocidadACaballoDevuelve20() {
        AsfaltoConPerrosFuriosos asfalto = new AsfaltoConPerrosFuriosos();

        Assert.assertEquals(20, asfalto.calcularVelocidadDe(new Caballo()));
    }
}
