package elaborables;

import artesanos.Joyero;
import artesanos.Modista;
import artesanos.Zapatero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TelaTest {

    @Test
    public void test01TelaEsElaboradaPorJoyeroDevuelveMensajeCorrecto() {

        Joyero joyero = new Joyero("RR");
        Tela tela = new Tela();

        Assertions.assertEquals("Artesano " + joyero.getNombre() + " no trabaja con Tela", tela.elaborarPor(joyero, 5));
    }

    @Test
    public void test02TelaEsElaboradaPorModistaDevuelveMensajeCorrecto() {

        Modista modista = new Modista("RR");
        Tela tela = new Tela();

        Assertions.assertEquals("5 camisas para hombre.", tela.elaborarPor(modista, 10));
    }

    @Test
    public void test03TelaEsElaboradaPorZapateroDevuelveMensajeCorrecto() {

        Zapatero zapatero = new Zapatero("RR");
        Tela tela = new Tela();

        Assertions.assertEquals("10 zapatillas de tela talle 42.", tela.elaborarPor(zapatero, 10));
    }
}
