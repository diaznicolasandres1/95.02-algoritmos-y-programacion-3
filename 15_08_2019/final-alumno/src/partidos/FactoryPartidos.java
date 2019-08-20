package partidos;

import partidos.Partido;
import partidos.PartidoPor;
import partidos.PartidoTordos;

 public  final class  FactoryPartidos {


     public PartidoPor partidoPor;
     public PartidoTordos partidoTordos;
     public PartidoFiuba partidoFiuba;
     public FactoryPartidos(){
          partidoPor = new PartidoPor();
          partidoTordos = new PartidoTordos();
          this.partidoFiuba = new PartidoFiuba();
     }



    public  Partido instanciaPartido(String nombrePartido){

        if(nombrePartido.equals("PoR") || nombrePartido.equals("POR")||nombrePartido.equals("pOr") || nombrePartido.equals("PxR") || nombrePartido.equals("Por")){
            return  partidoPor;

        }
        if(nombrePartido.equals("Tordos")){
            return  partidoTordos;
        }
        if(nombrePartido.equals("Fiuba")){
            return  partidoFiuba;
        }
        return null;
    }
}
