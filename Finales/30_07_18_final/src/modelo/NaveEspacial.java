package modelo;

public class NaveEspacial {
	
	private boolean camuflajeDisponible;
	private boolean camuflajeEstaActivo;
	public int vida;
	Canion canion;
	Propulsor propulsor;

	public NaveEspacial(boolean conCamuflaje){
		
		this.camuflajeDisponible = conCamuflaje;
		this.camuflajeEstaActivo = false;
		
		this.vida = 100;
		this.canion = new Canion();
		this.propulsor = new Propulsor();
	}
	
	public void activarCamuflaje(){
		if(camuflajeDisponible){
			camuflajeEstaActivo = true;
		}
	}
	
	public void desactivarCamuflaje(){
		camuflajeEstaActivo = false;
	}
	
	public Propulsor getPropulsor(){
		return this.propulsor;
	}
	
	public void atacar(NaveEspacial naveEnemiga){
		
		int danio_al_atacar = this.canion.danio;
		
		//OJO 
		//si la nave enemiga NO tiene camuflaje => la ataco
		if(!naveEnemiga.camuflajeDisponible){
			naveEnemiga.vida = naveEnemiga.vida - danio_al_atacar;
		}

		//si la nave enemiga SI tiene camuflaje PERO esta inactivo => la ataco
		if(naveEnemiga.camuflajeDisponible && !naveEnemiga.camuflajeEstaActivo){
			naveEnemiga.vida = naveEnemiga.vida - danio_al_atacar;
		}
		
		//Si la enemiga SI tiene camuflaje  y esta ACTIVO => no  hago nada
	}
	
	public int moverse(){
		
		if (this.propulsor.getNivelDeCombustible() > 0){
			
			int coeficiente_de_desplazamiento = this.propulsor.getCoeficienteDeDesplazamiento();
			
			//cada mover se mueve 1 unidad de distancia multiplicada por el coeficiente_de_desplazamiento
			int distancia = 1 * coeficiente_de_desplazamiento;
			
			//Este propulsor gasta tanto combustilbe como unidades desplazadas entregue
			this.propulsor.setNivelDeCombustible(this.propulsor.getNivelDeCombustible()- distancia);
			
			return distancia;
			
		}else{
			//no hay combustible => no me muevo nada
			return 0;
		}
	}
}
