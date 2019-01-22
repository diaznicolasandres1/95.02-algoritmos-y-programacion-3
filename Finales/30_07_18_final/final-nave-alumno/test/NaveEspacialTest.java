import camuflajes.*;
import nave.NaveEspacial;
import org.junit.Assert;
import org.junit.Test;
import propulsores.PropulsorInteligente;
import propulsores.PropulsorNormal;

public class NaveEspacialTest {

    @Test
    public void test01naveEspacialConCamuflajeEmpiezaCon100DeVida() {
        NaveEspacial nave = new NaveEspacial(new ConCamuflaje(), new PropulsorNormal());

        Assert.assertEquals(100, nave.getVida());
    }

    @Test
    public void test02naveEspacialSinCamuflajeEmpiezaCon100DeVida() {
        NaveEspacial nave = new NaveEspacial(new SinCamuflaje(), new PropulsorNormal());

        Assert.assertEquals(100, nave.getVida());
    }

    @Test
    public void test03naveEspacialAtacaOtraNaveEspacialSinCamuflajeProduciria25DeDanio() {

        NaveEspacial nave = new NaveEspacial(new SinCamuflaje(), new PropulsorNormal());
        NaveEspacial naveEnemiga = new NaveEspacial(new SinCamuflaje(), new PropulsorNormal());

        nave.atacar(naveEnemiga);

        Assert.assertEquals(75, naveEnemiga.getVida());
    }

    @Test
    public void test04naveEspacialAtacaOtraNaveEspacialConCamuflajeInactivoProduciria25DeDanio() {

        NaveEspacial nave = new NaveEspacial(new SinCamuflaje(), new PropulsorNormal());
        NaveEspacial naveEnemiga = new NaveEspacial(new ConCamuflaje(), new PropulsorNormal());

        nave.atacar(naveEnemiga);

        Assert.assertEquals(75, naveEnemiga.getVida());
    }

    @Test
    public void test05naveEspacialAtacaOtraNaveEspacialConCamuflajeActivoNoProduciriaDanio() {

        NaveEspacial nave = new NaveEspacial(new SinCamuflaje(), new PropulsorNormal());
        NaveEspacial naveEnemiga = new NaveEspacial(new ConCamuflaje(), new PropulsorNormal());

        naveEnemiga.activarCamuflaje();
        nave.atacar(naveEnemiga);

        Assert.assertEquals(100, naveEnemiga.getVida());
    }

    @Test
    public void test06naveEspacialSeDesplaza10UnidadesPorTurno() {

        NaveEspacial nave = new NaveEspacial(new SinCamuflaje(), new PropulsorNormal());

        Assert.assertEquals(10, nave.moverse());
    }

    @Test
    public void test07naveEspacialAlDesplazarseUnTurnoGastaria10UnidadesDeCombustible() {

        NaveEspacial nave = new NaveEspacial(new SinCamuflaje(), new PropulsorNormal());

        nave.moverse();

        Assert.assertEquals(90, nave.getCombustible());
    }

    @Test(expected = CamuflajeYaSeEncuentraActivadoException.class)
    public void test08naveEspacialActivaDosVecesCamuflajeLanzaExcepcion() {

        NaveEspacial nave = new NaveEspacial(new ConCamuflaje(), new PropulsorNormal());

        nave.activarCamuflaje();

        nave.activarCamuflaje();
    }

    @Test(expected = AtacableNoPoseeCamuflajeException.class)
    public void test09naveEspacialIntentaActivarCamuflajeSinTenerCamuflajeLanzaExcepcion() {

        NaveEspacial nave = new NaveEspacial(new SinCamuflaje(), new PropulsorNormal());

        nave.activarCamuflaje();
    }

    @Test(expected = AtacableNoPoseeCamuflajeException.class)
    public void test10naveEspacialIntentaDesactivarCamuflajeSinTenerCamuflajeLanzaExcepcion() {

        NaveEspacial nave = new NaveEspacial(new SinCamuflaje(), new PropulsorNormal());

        nave.desactivarCamuflaje();
    }

    @Test(expected = CamuflajeYaSeEncuentraDesactivadoException.class)
    public void test11naveEspacialConCamuflajeActivadoIntentaDesactivarCamuflaje2VecesLanzaExcepcion() {

        NaveEspacial nave = new NaveEspacial(new ConCamuflaje(), new PropulsorNormal());

        nave.activarCamuflaje();
        nave.desactivarCamuflaje();

        nave.desactivarCamuflaje();
    }

    @Test
    public void test12naveEspacialCargaCombustibleANaveConCombustibleMaximoDevuelve100DeCombustible() {

        NaveEspacial nave = new NaveEspacial(new ConCamuflaje(), new PropulsorNormal());

        nave.cargarCombustible(1000);

        Assert.assertEquals(100, nave.getCombustible());
    }

    @Test
    public void test13naveEspacialCarga20DeCombustibleANaveCon20DeCombustibleDevuelve40DeCombustible() {

        NaveEspacial nave = new NaveEspacial(new ConCamuflaje(), new PropulsorNormal());

        for (int i = 0; i < 8; i++) {
            nave.moverse();
        }

        nave.cargarCombustible(20);

        Assert.assertEquals(40, nave.getCombustible());
    }

    @Test
    public void test14naveEspacialRecibe30DeDanioConCamuflajeActivadoDevuelve100DeVida() {

        NaveEspacial nave = new NaveEspacial(new ConCamuflaje(), new PropulsorNormal());

        nave.activarCamuflaje();
        nave.recibirDanio(30);

        Assert.assertEquals(100, nave.getVida());
    }

    @Test
    public void test15naveEspacialRecibe30DeDanioConCamuflajeDesactivadoDevuelve70DeVida() {

        NaveEspacial nave = new NaveEspacial(new ConCamuflaje(), new PropulsorNormal());

        nave.recibirDanio(30);

        Assert.assertEquals(70, nave.getVida());
    }

    @Test
    public void test16naveEspacialRecibe30DeDanioSinCamuflajeDevuelve70DeVida() {

        NaveEspacial nave = new NaveEspacial(new SinCamuflaje(), new PropulsorNormal());

        nave.recibirDanio(30);

        Assert.assertEquals(70, nave.getVida());
    }

    @Test
    public void test17naveEspacialConPropulsorInteligenteCon60DeCombustibleSeDesplaza10Unidades() {

        NaveEspacial nave = new NaveEspacial(new SinCamuflaje(), new PropulsorInteligente());

        for (int i = 0; i < 3; i++) {
            nave.moverse();
        }

        Assert.assertEquals(10, nave.moverse());
    }

    @Test
    public void test18naveEspacialConPropulsorInteligenteCon50DeCombustibleSeDesplaza5Unidades() {

        NaveEspacial nave = new NaveEspacial(new SinCamuflaje(), new PropulsorInteligente());

        for (int i = 0; i < 5; i++) {
            nave.moverse();
        }

        Assert.assertEquals(5, nave.moverse());
    }

    @Test
    public void test19naveEspacialConPropulsorInteligenteCon50DeCombustibleSeLeCarga10DeCombustibleSeDesplaza10Unidades() {

        NaveEspacial nave = new NaveEspacial(new SinCamuflaje(), new PropulsorInteligente());

        for (int i = 0; i < 5; i++) {
            nave.moverse();
        }
        nave.cargarCombustible(10);

        Assert.assertEquals(10, nave.moverse());
    }

    @Test
    public void test20naveEspacialConPropulsorNormalSinCombustibleSeDesplaza0Unidades() {

        NaveEspacial nave = new NaveEspacial(new SinCamuflaje(), new PropulsorNormal());

        for (int i = 0; i < 10; i++) {
            nave.moverse();
        }

        Assert.assertEquals(0, nave.moverse());
    }

    @Test
    public void test21naveEspacialConPropulsorInteligenteSinCombustibleSeDesplaza0Unidades() {

        NaveEspacial nave = new NaveEspacial(new SinCamuflaje(), new PropulsorInteligente());

        for (int i = 0; i < 5; i++) {
            nave.moverse();
        }

        for (int i = 0; i < 10; i++) {
            nave.moverse();
        }

        Assert.assertEquals(0, nave.moverse());
    }
}
