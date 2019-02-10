package test.inversiones;

import inversiones.LeBac;
import inversionistas.InversionistaAgresivo;
import inversionistas.InversionistaArriesgado;
import inversionistas.InversionistaConservador;
import org.junit.Assert;
import org.junit.Test;

public class LeBacTest {

    @Test
    public void test01LeBacEsInvertidoPorInversionistaAgresivoUnMontoDe100Devuelve100() {

        LeBac leBac = new LeBac();
        InversionistaAgresivo inversionista = new InversionistaAgresivo();

        Assert.assertEquals(100, leBac.calcularMonto(100, inversionista));
    }

    @Test
    public void test02LeBacEsInvertidoPorInversionistaConservadorUnMontoDe100Devuelve100() {

        LeBac leBac = new LeBac();
        InversionistaConservador inversionista = new InversionistaConservador();

        Assert.assertEquals(100, leBac.calcularMonto(100, inversionista));
    }

    @Test
    public void test03LeBacEsInvertidoPorInversionistaArriesgadoUnMontoDe100Devuelve300() {

        LeBac leBac = new LeBac();
        InversionistaArriesgado inversionista = new InversionistaArriesgado();

        Assert.assertEquals(300, leBac.calcularMonto(100, inversionista));
    }
}
