import auto.Auto;
import auto.AutoFragil;
import auto.AutoResistente;
import choque.Choque;
import choque.ChoqueFuerte;
import choque.ChoqueSuave;

import java.util.ArrayList;
import java.util.Iterator;

public class Chocando {

    public static void main(String args[]){
        System.out.println("Probando Double Dispatch de choques");

        AutoFragil autoFragil = new AutoFragil();
        AutoResistente autoResistente = new AutoResistente();
        ArrayList autos = new ArrayList<Auto>();
        autos.add(autoFragil);
        autos.add(autoResistente);

        ChoqueFuerte choqueFuerte1 = new ChoqueFuerte();
        ChoqueFuerte choqueFuerte2 = new ChoqueFuerte();
        ChoqueSuave choqueSuave1 = new ChoqueSuave();


        ArrayList choques = new ArrayList<Choque>();
        choques.add(choqueFuerte1);
        choques.add(choqueFuerte2);
        choques.add(choqueSuave1);

        Iterator<Auto> autosIter = autos.iterator();

        Auto autoActual;
        Choque choqueActual;
        while(autosIter.hasNext()){
            autoActual = autosIter.next();
            Iterator<Choque> choquesIter = choques.iterator();
            while(choquesIter.hasNext()){
                choqueActual = choquesIter.next();
                autoActual.recibirChoque(choqueActual);
            }
        }
    }
}
