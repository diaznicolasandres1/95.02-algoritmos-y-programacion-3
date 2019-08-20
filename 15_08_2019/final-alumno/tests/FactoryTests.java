import main.ar.edu.fiuba.algoiii.FoolMatic;
import org.junit.Assert;
import org.junit.Test;
import partidos.FactoryPartidos;
import partidos.Partido;

import static junit.framework.TestCase.assertEquals;

public class FactoryTests {

    @Test
    public void test001CreaPArtidoPorYSumarUnVoto(){
        FactoryPartidos factoryPartidos = new FactoryPartidos();
        Partido por = factoryPartidos.instanciaPartido("PoR");

        por.agregarVotos(1);
        int cantidadVotos = por.getCantidadDeVotos();
        Assert.assertEquals(cantidadVotos,1);
    }

    @Test
    public void test002CrearPArtidoTordosYSumaUnVoto(){
        FactoryPartidos factoryPartidos = new FactoryPartidos();
        Partido por = factoryPartidos.instanciaPartido("Tordos");

        por.agregarVotos(1);
        int cantidadVotos = por.getCantidadDeVotos();
        Assert.assertEquals(cantidadVotos,1);
    }

    @Test
    public void test003CreaPArtidoFiubaYSuma1Voto(){
        FactoryPartidos factoryPartidos = new FactoryPartidos();
        Partido fiuba = factoryPartidos.instanciaPartido("Fiuba");

        fiuba.agregarVotos(1);
        int cantidadVotos = fiuba.getCantidadDeVotos();
        Assert.assertEquals(cantidadVotos,1);
    }

    @Test
    public void test004Sumar1000VotosTordosConPor1DebeSumar10Por(){
        FoolMatic f = new FoolMatic();

        f.votar("PoR", 5);
        f.votar("Tordos", 1000);

        int votosParaPoR = 15;
        int votosParaTordos = 1000;

        assertEquals(votosParaTordos, f.escrutinio("Tordos"));
        assertEquals(votosParaPoR, f.escrutinio("PoR"));
    }




}
