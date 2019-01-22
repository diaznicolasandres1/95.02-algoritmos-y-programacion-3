package transitables;


import org.junit.Assert;
import org.junit.Test;
import vehiculos.Auto;
import vehiculos.AutoCuatroPorCuatro;
import vehiculos.Caballo;
import vehiculos.Moto;

public class AsfaltoConLomaDeBurroTest {

    @Test
    public void test01AsfaltoConLomaDeBurroCalculaVelocidadAMotoDevuelve20() {
        AsfaltoConLomaDeBurro asfalto = new AsfaltoConLomaDeBurro();

        Assert.assertEquals(20, asfalto.calcularVelocidadDe(new Moto()));
    }

    @Test
    public void test02AsfaltoConLomaDeBurroCalculaVelocidadAAutoDevuelve20() {
        AsfaltoConLomaDeBurro asfalto = new AsfaltoConLomaDeBurro();

        Assert.assertEquals(20, asfalto.calcularVelocidadDe(new Auto()));
    }

    @Test
    public void test03AsfaltoConLomaDeBurroCalculaVelocidadAAutoCuatroPorCuatroDevuelve20() {
        AsfaltoConLomaDeBurro asfalto = new AsfaltoConLomaDeBurro();

        Assert.assertEquals(20, asfalto.calcularVelocidadDe(new AutoCuatroPorCuatro()));
    }

    @Test
    public void test04AsfaltoConLomaDeBurroCalculaVelocidadACaballoDevuelve20() {
        AsfaltoConLomaDeBurro asfalto = new AsfaltoConLomaDeBurro();

        Assert.assertEquals(20, asfalto.calcularVelocidadDe(new Caballo()));
    }
}