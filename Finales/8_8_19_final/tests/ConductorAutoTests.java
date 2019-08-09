package test;

import conductores.ConductorAuto;
import infracciones.CruzarSemaforoRojo;
import infracciones.MalEstacionado;
import org.junit.Assert;
import org.junit.Test;


public class ConductorAutoTests {

    @Test
    public void test001ConductorAutoNoUsaCinturonNoPuedeCirculas(){
        ConductorAuto conductorAuto = new ConductorAuto();
        boolean maneja= conductorAuto.puedoCircular();
        Assert.assertEquals(maneja, false);
    }

    @Test
    public void test002ConductorAutoUsaCInturonPuedeManejar(){
        ConductorAuto conductorAuto = new ConductorAuto();
        conductorAuto.ponerseCinturon();
        boolean maneja= conductorAuto.puedoCircular();
        Assert.assertEquals(maneja, true);
    }

    @Test
    public void test003ConductorAutoTieneCinturonPeroTIeneMultaDineroNoPuedeMAnejar(){
        ConductorAuto conductorAuto = new ConductorAuto();
        conductorAuto.ponerseCinturon();
        conductorAuto.agregarInfraccion(new MalEstacionado());
        boolean maneja= conductorAuto.puedoCircular();
        Assert.assertEquals(maneja, false);
    }

    @Test
    public void test004ConductorAutoPagaMultaYPuedeManejar(){
        ConductorAuto conductorAuto = new ConductorAuto();
        conductorAuto.ponerseCinturon();
        conductorAuto.agregarInfraccion(new MalEstacionado());
        conductorAuto.pagarInfraccion(2500);
        boolean maneja= conductorAuto.puedoCircular();
        Assert.assertEquals(maneja, true);
    }

    @Test
    public void test005ConductorAutoMultaCOnHorasYNoPuedeManejar(){
        ConductorAuto conductorAuto = new ConductorAuto();
        conductorAuto.ponerseCinturon();
        conductorAuto.agregarInfraccion(new CruzarSemaforoRojo());
        boolean maneja= conductorAuto.puedoCircular();
        Assert.assertEquals(maneja, false);
    }

    @Test
    public void test006COnductorAutoTrabajaHorasDeMultaYPuedeManejar(){

            ConductorAuto conductorAuto = new ConductorAuto();
            conductorAuto.ponerseCinturon();
            conductorAuto.agregarInfraccion(new CruzarSemaforoRojo());
            conductorAuto.trabajarHoras(20);
            boolean maneja= conductorAuto.puedoCircular();
            Assert.assertEquals(maneja, true);

    }

}
