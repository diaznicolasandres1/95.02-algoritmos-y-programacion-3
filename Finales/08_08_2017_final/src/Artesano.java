public class Artesano {

	private String nombre;
	private String especialidad;
	
	public Artesano(String nombre, String especialidad){
		this.nombre = nombre;
		this.especialidad = especialidad;
	}
	
	public String realizarTrabajo(String materiaPrima, int cantidad){
		if(this.especialidad == "Zapatero"){
			if(materiaPrima == "Goma"){
				return cantidad / 5 + " ojodas de Goma talle 35.";
			}
			if(materiaPrima == "Cuero"){
				return (cantidad / 2 + 1) + " zapatos de Cuero talle 40.";
			}
			if(materiaPrima == "Tela"){
				return (cantidad) + " zapatillas de tela talle 42.";
			}
		}
		
		if(this.especialidad == "Modista"){
			if(materiaPrima == "Goma"){
				return cantidad * 2  + " pulseras para hombre.";
			}
			if(materiaPrima == "Cuero"){
				return (cantidad / 10 ) + " camperas de cuero para hombre.";
			}
			if(materiaPrima == "Tela"){
				return (cantidad / 2 ) + " camisas para hombre.";
			}
		}
		return "Artesano " + this.nombre + " no trabaja con " + materiaPrima;
	}
	
}
