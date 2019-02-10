package test.inversionistas;

import inversiones.Bitcoin;
import inversiones.LeBac;
import inversiones.PlazoFijo;
import inversionistas.BitcoinNoEstaDisponibleParaInversionistaConservadorException;
import inversionistas.InversionistaConservador;
import org.junit.Assert;
import org.junit.Test;

public class InversionistaConservadorTest {

    @Test
    public void test01InversionistaConservadorCalculaInversionEnPlazoFijoDe100Devuelve200() {

        InversionistaConservador inversionistaConservador = new InversionistaConservador();
        PlazoFijo plazoFijo = new PlazoFijo();

        Assert.assertEquals(200, inversionistaConservador.calcularInversion(100, plazoFijo));
    }

    @Test
    public void test02InversionistaConservadorCalculaInversionEnLeBacDe100Devuelve100() {

        InversionistaConservador inversionistaConservador = new InversionistaConservador();
        LeBac leBac = new LeBac();

        Assert.assertEquals(100, inversionistaConservador.calcularInversion(100, leBac));
    }

    @Test(expected = BitcoinNoEstaDisponibleParaInversionistaConservadorException.class)
    public void test03InversionistaConservadorCalculaInversionEnBitcoinLanzaExcepcion() {

        InversionistaConservador inversionistaConservador = new InversionistaConservador();
        Bitcoin bitcoin = new Bitcoin();

        inversionistaConservador.calcularInversion(100, bitcoin);
    }

}
