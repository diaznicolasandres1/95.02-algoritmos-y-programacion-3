import org.junit.Assert;
import org.junit.Test;
import partidos.PartidoTordos;

public class PartidoTordosTest {

    @Test
    public void test001PartidoTordosSeCreaCon0Votos(){
        PartidoTordos partidoTordos = new PartidoTordos();
        Assert.assertEquals(partidoTordos.getCantidadDeVotos(),0);
    }

    @Test
    public void test002PartidoTordosVotan30Hay30Votos(){
        PartidoTordos partidoTordos = new PartidoTordos();
        partidoTordos.agregarVotos(30);
        Assert.assertEquals(partidoTordos.getCantidadDeVotos(),30);

    }
}
