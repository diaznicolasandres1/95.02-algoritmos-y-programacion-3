import main.ar.edu.fiuba.algoiii.FoolMatic;
import org.junit.Assert;
import org.junit.Test;

public class FoolMaticTests {


    @Test
    public void test001CrearYVotarTordosTodosSumaPuntos(){
        FoolMatic foolMatic = new FoolMatic();
        foolMatic.votar("Tordos");
        int cantidadVotos= foolMatic.escrutinio("Tordos");
        Assert.assertEquals(cantidadVotos,1);
    }

    @Test
    public void test002CrearYVotarPporSumaVotos(){

    }









}
