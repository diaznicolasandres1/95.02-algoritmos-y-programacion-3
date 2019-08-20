import org.junit.Assert;
import org.junit.Test;
import partidos.PartidoPor;

public class PartidoPorTests {

    @Test
    public void test001PartidoPorSeCreaCon0Votos(){
        PartidoPor partidoPor = new PartidoPor();
        Assert.assertEquals(partidoPor.getCantidadDeVotos(), 0);
    }

    @Test
    public void test002PartidoFiubaSumaVotos(){
        PartidoPor partidoPor = new PartidoPor();
        partidoPor.agregarVotos(30);
        Assert.assertEquals(partidoPor.getCantidadDeVotos(),30);
    }
}
