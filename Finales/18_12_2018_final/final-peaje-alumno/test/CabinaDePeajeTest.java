import org.junit.Assert;
import org.junit.Test;
import transporte.Auto;
import transporte.Camion;
import transporte.Moto;
import transporte.Triciclo;

public class CabinaDePeajeTest {

    @Test
    public void test01CabinaCobraPeajeAAutoConTelepaseDevuelve4() {
        Auto auto = new Auto();
        CabinaDePeaje cabina = new CabinaDePeaje();

        auto.instalarTelepase();

        Assert.assertEquals(4, cabina.cobrarPeaje(auto));
    }

    @Test
    public void test02CabinaCobraPeajeAAutoSinTelepaseDevuelve8() {
        Auto auto = new Auto();
        CabinaDePeaje cabina = new CabinaDePeaje();


        Assert.assertEquals(8, cabina.cobrarPeaje(auto));
    }

    @Test
    public void test03CabinaCobraPeajeACamionConTelepaseDevuelve9() {
        Camion camion = new Camion();
        CabinaDePeaje cabina = new CabinaDePeaje();

        camion.instalarTelepase();

        Assert.assertEquals(9, cabina.cobrarPeaje(camion));
    }

    @Test
    public void test04CabinaCobraPeajeACamionSinTelepaseDevuelve36() {
        Camion camion = new Camion();
        CabinaDePeaje cabina = new CabinaDePeaje();

        Assert.assertEquals(36, cabina.cobrarPeaje(camion));
    }

    @Test
    public void test05CabinaCobraPeajeAMotoDevuelve4() {
        Moto moto = new Moto();
        CabinaDePeaje cabina = new CabinaDePeaje();

        Assert.assertEquals(4, cabina.cobrarPeaje(moto));
    }

    @Test
    public void test06CabinaCobraPeajeATricicloSinTelepaseDevuelve6() {
        Triciclo triciclo = new Triciclo();
        CabinaDePeaje cabina = new CabinaDePeaje();

        Assert.assertEquals(6, cabina.cobrarPeaje(triciclo));
    }

    @Test
    public void test07CabinaCobraPeajeATricicloConTelepaseDevuelve10() {
        Triciclo triciclo = new Triciclo();
        CabinaDePeaje cabina = new CabinaDePeaje();

        triciclo.instalarTelepase();

        Assert.assertEquals(10, cabina.cobrarPeaje(triciclo));
    }

}
