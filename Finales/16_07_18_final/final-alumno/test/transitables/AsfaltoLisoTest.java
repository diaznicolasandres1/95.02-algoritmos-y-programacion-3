package transitables;

import org.junit.Assert;
import org.junit.Test;
import vehiculos.Auto;
import vehiculos.AutoCuatroPorCuatro;
import vehiculos.Caballo;
import vehiculos.Moto;

public class AsfaltoLisoTest {

    @Test
    public void test01AsfaltoLisoCalculaVelocidadAMotoDevuelve40() {
        AsfaltoLiso asfalto = new AsfaltoLiso();

        Assert.assertEquals(40, asfalto.calcularVelocidadDe(new Moto()));
    }

    @Test
    public void test02AsfaltoLisoCalculaVelocidadAAutoDevuelve40() {
        AsfaltoLiso asfalto = new AsfaltoLiso();

        Assert.assertEquals(40, asfalto.calcularVelocidadDe(new Auto()));
    }

    @Test
    public void test03AsfaltoLisoCalculaVelocidadAAutoCuatroPorCuatroDevuelve40() {
        AsfaltoLiso asfalto = new AsfaltoLiso();

        Assert.assertEquals(40, asfalto.calcularVelocidadDe(new AutoCuatroPorCuatro()));
    }

    @Test
    public void test04AsfaltoLisoCalculaVelocidadACaballoDevuelve20() {
        AsfaltoLiso asfalto = new AsfaltoLiso();

        Assert.assertEquals(20, asfalto.calcularVelocidadDe(new Caballo()));
    }
}
