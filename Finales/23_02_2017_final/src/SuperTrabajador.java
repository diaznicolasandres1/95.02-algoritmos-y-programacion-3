package examen;

public class SuperTrabajador extends Trabajador {

    public SuperTrabajador(String nombre, int peso) {
        super(nombre, peso);
    }

    public Producto trabajar(Material material) {
        if (material == Material.ACERO) {
            return new Producto("gris acero oscuro", 2);

        } else if (material == Material.ALUMINIO) {
            return new Producto("gris clarito", 2);
        } else {
            // NO QUEDA OTRA QUE SEA COBRE
            return new Producto("ROJIZO", 2);
        }
    }

    public void comer(Alimento alimento) throws Exception {
        if (alimento.light) {
            throw new Exception("SuperTrabajador no come cosas light");
        } else {
            pesoCorporal += 20;
        }
    }

}
