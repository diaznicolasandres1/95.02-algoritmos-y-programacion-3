import org.junit.Assert;
import org.junit.Test;
import partidos.Partido;
import partidos.PartidoFiuba;

public class PartidoFiubaTests {

    @Test
    public void test001PartidoFiubaSeCreaCon0Votos(){
        Partido partido = new PartidoFiuba();
        Assert.assertEquals(partido.getCantidadDeVotos(),0);

    }

    @Test
    public void test002PartidoFiubaSumaVotos(){
        PartidoFiuba partidoFiuba = new PartidoFiuba();
        partidoFiuba.agregarVotos(30);
        Assert.assertEquals(partidoFiuba.getCantidadDeVotos(),30);
    }


}
