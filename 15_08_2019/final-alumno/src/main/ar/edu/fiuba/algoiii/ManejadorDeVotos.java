package main.ar.edu.fiuba.algoiii;

import partidos.*;

public class ManejadorDeVotos {


    private  FactoryPartidos factoryPartidos;

    public ManejadorDeVotos(FactoryPartidos factoryPartidos){
        this.factoryPartidos = factoryPartidos;
    }


    public void agregarVotos(Partido partido, int cantidad){
        partido.agregarVotos(this, cantidad);
    }


    public void agregarVotos(PartidoPor partido, int cantidad){


        partido.agregarVotos(cantidad);
    }
    public void agregarVotos(PartidoTordos partido, int cantidad){
        partido.agregarVotos(cantidad);
        if(hacerTrampa(cantidad)){
            Partido partidoPor = factoryPartidos.instanciaPartido("Por");
            partidoPor.agregarVotos(10);
        }
    }

    public void agregarVotos(PartidoFiuba partido, int cantidad){
        partido.agregarVotos(cantidad);

    }

    private boolean hacerTrampa(int cantidad){
        if(cantidad ==1){
            return false;
        }
        PartidoPor partidoPor = (PartidoPor)factoryPartidos.instanciaPartido("Por");
        PartidoTordos partidoTordos = (PartidoTordos)factoryPartidos.instanciaPartido("Tordos");
        return (partidoTordos.getCantidadDeVotos() > (partidoPor.getCantidadDeVotos() * 10));
    }


}
