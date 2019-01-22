package artesanos;

import elaborables.Elaborable;

public abstract class Artesano {

	private String nombre;
	
	public Artesano(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract String realizarTrabajo(Elaborable elaborable, int cantidad);

//		if(this.especialidad == "Zapatero"){
//			if(materiaPrima == "Goma"){
//				return cantidad / 5 + " ojodas de Goma talle 35.";
//			}
//			if(materiaPrima == "Cuero"){
//				return (cantidad / 2 + 1) + " zapatos de Cuero talle 40.";
//			}
//			if(materiaPrima == "Tela"){
//				return (cantidad) + " zapatillas de tela talle 42.";
//			}
//		}
//
//		if(this.especialidad == "Modista"){
//			if(materiaPrima == "Goma"){
//				return cantidad * 2  + " pulseras para hombre.";
//			}
//			if(materiaPrima == "Cuero"){
//				return (cantidad / 10 ) + " camperas de cuero para hombre.";
//			}
//			if(materiaPrima == "Tela"){
//				return (cantidad / 2 ) + " camisas para hombre.";
//			}
//		}

	public String getNombre() {
		return this.nombre;
	}
	
}
