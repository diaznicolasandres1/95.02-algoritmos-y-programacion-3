package examen;

public class Trabajador {

    public int pesoCorporal;

    public String nombre;

    public Trabajador(String nombre, int peso) {
        this.nombre = nombre;
        this.pesoCorporal = peso;
    }

    public Producto trabajar(Material material) {

        if (material == Material.ACERO) {
            return new Producto("GRIS ACERO OSCURO", 1);
        } else if (material == Material.ALUMINIO) {
            return new Producto("GRIS CLARITO", 1);
        } else {
            // NO QUEDA OTRA QUE SEA COBRE
            return new Producto("ROJIZO", 1);
        }
    }
 
    
    public void comer(Alimento alimento) throws Exception {
        if (alimento.light) {
            pesoCorporal += 10;
        } else {
            pesoCorporal += 20;
        }
    }
}
