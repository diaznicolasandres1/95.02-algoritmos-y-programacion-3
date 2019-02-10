package test.inversiones;

import inversiones.PlazoFijo;
import inversionistas.InversionistaAgresivo;
import inversionistas.InversionistaArriesgado;
import inversionistas.InversionistaConservador;
import org.junit.Assert;
import org.junit.Test;

public class PlazoFijoTest {

    @Test
    public void test01PlazoFijoEsInvertidoPorInversionistaAgresivoUnMontoDe100Devuelve100() {

        PlazoFijo plazoFijo = new PlazoFijo();
        InversionistaAgresivo inversionistaAgresivo = new InversionistaAgresivo();

        Assert.assertEquals(100, plazoFijo.calcularMonto(100, inversionistaAgresivo));
    }

    @Test
    public void test02PlazoFijoEsInvertidoPorInversionistaConservadorUnMontoDe100Devuelve200() {

        PlazoFijo plazoFijo = new PlazoFijo();
        InversionistaConservador inversionistaConservador = new InversionistaConservador();

        Assert.assertEquals(200, plazoFijo.calcularMonto(100, inversionistaConservador));
    }

    @Test
    public void test03PlazoFijoEsInvertidoPorInversionistaArriesgadoUnMontoDe100Devuelve200() {

        PlazoFijo plazoFijo = new PlazoFijo();
        InversionistaArriesgado inversionistaArriesgado = new InversionistaArriesgado();

        Assert.assertEquals(200, plazoFijo.calcularMonto(100, inversionistaArriesgado));
    }




}
