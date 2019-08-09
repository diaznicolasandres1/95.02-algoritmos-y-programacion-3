import conductores.ConductorMoto;
import infracciones.CruzarSemaforoRojo;
import infracciones.MalEstacionado;
import org.junit.Assert;
import org.junit.Test;

public class ConductorMotoTest {
    @Test
    public void test001ConductorMotoNoUsaCascoNoPuedeCirculas(){
        ConductorMoto conductorMoto = new ConductorMoto();
        boolean maneja= conductorMoto.puedoCircular();
        Assert.assertEquals(maneja, false);
    }

    @Test
    public void test002ConductorMotoUsaCInturonPuedeManejar(){
        ConductorMoto conductorMoto = new ConductorMoto();
        conductorMoto.ponerseCasco();
        boolean maneja= conductorMoto.puedoCircular();
        Assert.assertEquals(maneja, true);
    }

    @Test
    public void test003ConductorMotoTieneCascoPeroTIeneMultaDineroNoPuedeMAnejar(){
        ConductorMoto conductorMoto = new ConductorMoto();
        conductorMoto.ponerseCasco();
        conductorMoto.agregarInfraccion(new MalEstacionado());
        boolean maneja= conductorMoto.puedoCircular();
        Assert.assertEquals(maneja, false);
    }

    @Test
    public void test004ConductorAutoPagaMultaYPuedeManejar(){
        ConductorMoto conductorMoto = new ConductorMoto();
        conductorMoto.ponerseCasco();
        conductorMoto.agregarInfraccion(new MalEstacionado());
        conductorMoto.pagarInfraccion(2500);
        boolean maneja= conductorMoto.puedoCircular();

        Assert.assertEquals(maneja, true);
    }

    @Test
    public void test005ConductorAutoMultaCOnHorasYNoPuedeManejar(){
        ConductorMoto conductorMoto = new ConductorMoto();
        conductorMoto.ponerseCasco();
        conductorMoto.agregarInfraccion(new CruzarSemaforoRojo());
        boolean maneja= conductorMoto.puedoCircular();
        Assert.assertEquals(maneja, false);
    }

    @Test
    public void test006COnductorAutoTrabajaHorasDeMultaYPuedeManejar(){
        ConductorMoto conductorMoto = new ConductorMoto();
        conductorMoto.ponerseCasco();
        conductorMoto.agregarInfraccion(new CruzarSemaforoRojo());
        conductorMoto.trabajarHoras(15);
        boolean maneja= conductorMoto.puedoCircular();
        Assert.assertEquals(maneja, true);
    }
}
