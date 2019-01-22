package examen;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class ProyectoTest {

    @Test
    public void fabricar() {

        String color = "GRIS ACERO OSCURO";

        ArrayList<Producto> productos = new ArrayList<Producto>();

        Trabajador t = new Trabajador("Jorge", 85);
        SuperTrabajador st = new SuperTrabajador("Rambo", 100);

        productos.add(t.trabajar(Material.ACERO));
        productos.add(t.trabajar(Material.ALUMINIO));
        productos.add(t.trabajar(Material.ALUMINIO));

        productos.add(st.trabajar(Material.ACERO));
        productos.add(st.trabajar(Material.COBRE));
        productos.add(st.trabajar(Material.ALUMINIO));

        Iterator<Producto> it = productos.iterator();

        int grises = 0;

        while (it.hasNext()) {
            Producto p = it.next();
            if (p.color == color) {
                grises++;
            }
        }

        assertEquals(2, grises);
    }

}
