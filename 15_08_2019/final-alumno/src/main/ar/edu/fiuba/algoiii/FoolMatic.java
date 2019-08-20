package main.ar.edu.fiuba.algoiii;

import partidos.FactoryPartidos;
import partidos.Partido;

public class FoolMatic {

    public FactoryPartidos factoryPartidos;
    public ManejadorDeVotos manejadorDeVotos;

    public FoolMatic(){
        this.factoryPartidos = new FactoryPartidos();
       this.manejadorDeVotos = new ManejadorDeVotos(factoryPartidos);
    }
    /*
      if (leyendaPartido.equals("Tordos")) {
          votosPartidoTordos = votosPartidoTordos + 1;
      }
      if (leyendaPartido.equals("PoR")) {
          votosPartidoPoR = votosPartidoPoR + 1;
      }

       */
    public void votar(String nombre) {
        Partido partido = factoryPartidos.instanciaPartido(nombre);
        manejadorDeVotos.agregarVotos(partido,1);
    }

    public int escrutinio(String leyendaPartido) {
        Partido partido = factoryPartidos.instanciaPartido(leyendaPartido);
         return partido.getCantidadDeVotos();
    }


    public void votar(String leyendaPartido, int numeroVotos) {
        Partido partido = factoryPartidos.instanciaPartido(leyendaPartido);
        manejadorDeVotos.agregarVotos(partido, numeroVotos);

        /*

        if (leyendaPartido.equals("Tordos")) {
            votosPartidoTordos = votosPartidoTordos + numeroVotos;
        }
        if (leyendaPartido.equals("PoR")) {
            votosPartidoPoR = votosPartidoPoR + numeroVotos;
        }

        if ( esLaDiferenciaTordosDiezVecesMayoraPoR(votosPartidoTordos, votosPartidoPoR)) {
            votosPartidoPoR += 10;
        }*/
    }

/*
    private boolean esLaDiferenciaTordosDiezVecesMayoraPoR(int votosPartidoTordos, int votosPartidoPoR) {
        return ( votosPartidoTordos > votosPartidoPoR * 10);
    }
    */

}
