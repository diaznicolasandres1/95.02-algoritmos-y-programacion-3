package transitables;

import org.junit.Assert;
import org.junit.Test;
import vehiculos.Auto;
import vehiculos.AutoCuatroPorCuatro;
import vehiculos.Caballo;
import vehiculos.Moto;

public class CalleEmbarradaTest {

    @Test
    public void test01CalleEmbarradaCalculaVelocidadAMotoDevuelve0() {
        CalleEmbarrada calleEmbarrada = new CalleEmbarrada();

        Assert.assertEquals(0, calleEmbarrada.calcularVelocidadDe(new Moto()));
    }

    @Test
    public void test02CalleEmbarradaCalculaVelocidadAAutoDevuelve0() {
        CalleEmbarrada calleEmbarrada = new CalleEmbarrada();

        Assert.assertEquals(0, calleEmbarrada.calcularVelocidadDe(new Auto()));
    }

    @Test
    public void test03CalleEmbarradaCalculaVelocidadAAutoCuatroPorCuatroDevuelve10() {
        CalleEmbarrada calleEmbarrada = new CalleEmbarrada();

        Assert.assertEquals(10, calleEmbarrada.calcularVelocidadDe(new AutoCuatroPorCuatro()));
    }

    @Test
    public void test04CalleEmbarradaCalculaVelocidadACaballoDevuelve20() {
        CalleEmbarrada calleEmbarrada = new CalleEmbarrada();

        Assert.assertEquals(20, calleEmbarrada.calcularVelocidadDe(new Caballo()));
    }
}
