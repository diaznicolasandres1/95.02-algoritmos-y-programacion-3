package auto;

import choque.Choque;
import choque.ChoqueFuerte;
import choque.ChoqueSuave;

public  abstract class Auto implements Chocable{

    int utilidad;

    public Auto(){
        this.utilidad = 1000;
    }

    public void reducirUtilidad(int i ){
        if(this.utilidad == 0){
            System.out.println("El auto esta roto");

        }else{
            this.utilidad = utilidad - i;
            if(this.utilidad<0){
                System.out.println("Se rompio el auto!");
            }
        }
    }

    public abstract void recibirChoque(Choque choque);
    public abstract void recibirChoque(ChoqueFuerte choque);
    public abstract void recibirChoque(ChoqueSuave choque);

}
