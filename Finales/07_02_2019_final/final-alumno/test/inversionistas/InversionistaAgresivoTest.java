package test.inversionistas;

import inversiones.Bitcoin;
import inversiones.LeBac;
import inversiones.PlazoFijo;
import inversionistas.InversionistaAgresivo;
import org.junit.Assert;
import org.junit.Test;

public class InversionistaAgresivoTest {

    @Test
    public void test01InversionistaAgresivoCalculaInversionEnPlazoFijoDe100Devuelve100() {

        InversionistaAgresivo inversionistaAgresivo = new InversionistaAgresivo();
        PlazoFijo plazoFijo = new PlazoFijo();

        Assert.assertEquals(100, inversionistaAgresivo.calcularInversion(100, plazoFijo));
    }

    @Test
    public void test02InversionistaAgresivoCalculaInversionEnLeBacDe100Devuelve100() {

        InversionistaAgresivo inversionistaAgresivo = new InversionistaAgresivo();
        LeBac leBac = new LeBac();

        Assert.assertEquals(100, inversionistaAgresivo.calcularInversion(100, leBac));
    }

    @Test
    public void test03InversionistaAgresivoCalculaInversionEnBitcoinDe100Devuelve400() {

        InversionistaAgresivo inversionistaAgresivo = new InversionistaAgresivo();
        Bitcoin bitcoin = new Bitcoin();

        Assert.assertEquals(400, inversionistaAgresivo.calcularInversion(100, bitcoin));
    }
}
