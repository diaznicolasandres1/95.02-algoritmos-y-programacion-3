package test.inversionistas;

import inversiones.Bitcoin;
import inversiones.LeBac;
import inversiones.PlazoFijo;
import inversionistas.BitcoinNoEstaDisponibleParaInversionistaArriesgadoException;
import inversionistas.InversionistaArriesgado;
import org.junit.Assert;
import org.junit.Test;

public class InversionistaArriesgadoTest {

    @Test
    public void test01InversionistaArriesgadoCalculaInversionEnPlazoFijoDe100Devuelve200() {

        InversionistaArriesgado inversionistaArriesgado = new InversionistaArriesgado();
        PlazoFijo plazoFijo = new PlazoFijo();

        Assert.assertEquals(200, inversionistaArriesgado.calcularInversion(100, plazoFijo));
    }

    @Test
    public void test02InversionistaArriesgadoCalculaInversionEnLeBacDe100Devuelve300() {

        InversionistaArriesgado inversionistaArriesgado = new InversionistaArriesgado();
        LeBac leBac = new LeBac();

        Assert.assertEquals(300, inversionistaArriesgado.calcularInversion(100, leBac));
    }

    @Test(expected = BitcoinNoEstaDisponibleParaInversionistaArriesgadoException.class)
    public void test03InversionistaArriesgadoCalculaInversionEnBitcoinLanzaExcepcion() {

        InversionistaArriesgado inversionistaArriesgado = new InversionistaArriesgado();
        Bitcoin bitcoin = new Bitcoin();

        inversionistaArriesgado.calcularInversion(100, bitcoin);
    }
}
