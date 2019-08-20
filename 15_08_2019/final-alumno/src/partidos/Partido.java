package partidos;

import main.ar.edu.fiuba.algoiii.ManejadorDeVotos;

public  abstract class Partido {

    int cantidadDeVotos;

    public Partido(){
        this.cantidadDeVotos = 0;
    }

    public abstract void agregarVotos(int cantidad);

    public  abstract void agregarVotos(ManejadorDeVotos manejadorDeVotos,int cantidad);


    public int getCantidadDeVotos(){
        return this.cantidadDeVotos;
    }
}
