package test.inversiones;

import inversiones.Bitcoin;
import inversionistas.*;
import org.junit.Assert;
import org.junit.Test;

public class BitcoinTest {

    @Test
    public void test01BitcoinCalculaMontoDe100InvertidoPorInversionistaAgresivoDevuelve400() {

        Bitcoin bitcoin = new Bitcoin();
        InversionistaAgresivo inversionistaAgresivo = new InversionistaAgresivo();

        Assert.assertEquals(400, bitcoin.calcularMonto(100, inversionistaAgresivo));
    }

    @Test(expected = BitcoinNoEstaDisponibleParaInversionistaConservadorException.class)
    public void test02BitcoinCalculaMontoInvertidoPorInversionistaConservadorLanzaExcepcion() {

        Bitcoin bitcoin = new Bitcoin();
        InversionistaConservador inversionistaConservador = new InversionistaConservador();

        bitcoin.calcularMonto(100, inversionistaConservador);
    }

    @Test(expected = BitcoinNoEstaDisponibleParaInversionistaArriesgadoException.class)
    public void test03BitcoinCalculaMontoInvertidoPorInversionistaArriesgadoLanzaExcepcion() {

        Bitcoin bitcoin = new Bitcoin();
        InversionistaArriesgado inversionistaArriesgado = new InversionistaArriesgado();

        bitcoin.calcularMonto(100, inversionistaArriesgado);
    }
}
