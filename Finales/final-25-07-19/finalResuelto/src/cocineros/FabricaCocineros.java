package cocineros;

public class FabricaCocineros {
    CocineroComun crearPanadero(){
        return new CocineroComun(10.0);
    }

    CocineroComun crearEmpanadero(){
        return new CocineroComun(15.0);
    }

    CocineroCeliaco crearEmpanaderoCeliaco(){
        return new CocineroCeliaco(15.0);
    }

    CocineroCeliaco crearPanaderoCeliaco(){
        return new CocineroCeliaco(10.0);
    }

    CocineroHipertenso crearEmpanaderoHipertenso(){
        return new CocineroHipertenso(11.5);    }

    CocineroHipertenso crearPanaderoHipertenso(){
        return new CocineroHipertenso(9.0);
    }
}

