import main.ar.edu.fiuba.algoiii.FoolMatic;
import main.ar.edu.fiuba.algoiii.ManejadorDeVotos;
import org.junit.Assert;
import org.junit.Test;
import partidos.FactoryPartidos;
import partidos.Partido;

import static junit.framework.TestCase.assertEquals;

public class ManejadorDeVotosTest {


    @Test
    public void test001Sumar10VotosAPor(){
        FactoryPartidos fac = new FactoryPartidos();
        ManejadorDeVotos manejadorDeVotos = new ManejadorDeVotos(fac);

        manejadorDeVotos.agregarVotos(fac.instanciaPartido("Por"),10);
        Partido partidoPor =fac.instanciaPartido("Por");
        Assert.assertEquals(10,partidoPor.getCantidadDeVotos());
    }

    @Test
    public void test002Sumar10VotosTordos(){
        FactoryPartidos fac = new FactoryPartidos();
        ManejadorDeVotos manejadorDeVotos = new ManejadorDeVotos(fac);

        manejadorDeVotos.agregarVotos(fac.instanciaPartido("Tordos"),10);
        Partido partidoTordos =fac.instanciaPartido("Tordos");
        Assert.assertEquals(10,partidoTordos.getCantidadDeVotos());
    }

    @Test
    public void test003Agrega10VotosAFiubaPartido(){
        FactoryPartidos fac = new FactoryPartidos();
        ManejadorDeVotos manejadorDeVotos = new ManejadorDeVotos(fac);

        manejadorDeVotos.agregarVotos(fac.instanciaPartido("Fiuba"),10);
        Partido partido =fac.instanciaPartido("Fiuba");
        Assert.assertEquals(10,partido.getCantidadDeVotos());
    }
    @Test
    public void test002Agregar1000VotosaTordosSiHayDiferenciaDe10VecesMasVotosAPorPorSuma10(){
        FactoryPartidos fac = new FactoryPartidos();
        ManejadorDeVotos manejadorDeVotos = new ManejadorDeVotos(fac);

        manejadorDeVotos.agregarVotos(fac.instanciaPartido("Por"),0);
        manejadorDeVotos.agregarVotos(fac.instanciaPartido("Tordos"),1000);


        Partido partidoPor =fac.instanciaPartido("Por");
        Assert.assertEquals(10,partidoPor.getCantidadDeVotos());
    }

    @Test
    public void testSiSumoDea1VotoNoSeAplicaHacerTramp() {
        FoolMatic f = new FoolMatic();

        f.votar("Tordos");

        int votosParaPoR = 0;
        int votosParaTordos = 1;

        assertEquals(votosParaTordos, f.escrutinio("Tordos"));
        assertEquals(votosParaPoR, f.escrutinio("PoR"));
    }



}
