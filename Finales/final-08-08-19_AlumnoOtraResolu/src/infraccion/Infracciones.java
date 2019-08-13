package infraccion;

public class Infracciones {
    private int infraccionesPendientesPorSemaforoEnRojo;
    private int infraccionesPendientesPorMalEstacionamiento;

    private int horasInfraccionSemaforoEnRojo;
    private int precioInfraccionMalEstacionamiento;

    private int saldoPago;
    private int horasCumplidas;

    public Infracciones(int precioRojo, int precioEstacionamiento){
        horasInfraccionSemaforoEnRojo = precioRojo;
        precioInfraccionMalEstacionamiento = precioEstacionamiento;
        infraccionesPendientesPorMalEstacionamiento = 0;
        infraccionesPendientesPorSemaforoEnRojo = 0;
        saldoPago = 0;
        horasCumplidas = 0;
    }

    public void agregarInfraccionPorSemaforoEnRojo(){
        infraccionesPendientesPorSemaforoEnRojo += 1;
    }


    public void agregarInfraccionPorMalEstacionamiento(){
        infraccionesPendientesPorMalEstacionamiento += 1;
    }

    public void pagarInfraccionSemaforoEnRojo(int monto){
        saldoPago += monto;

    }

    public void pagarInfraccionPorMalEstacionamiento(){
        infraccionesPendientesPorMalEstacionamiento -= 1;
    }

    public boolean todasPagas(){
        return saldoPago >= infraccionesPendientesPorMalEstacionamiento * precioInfraccionMalEstacionamiento && horasCumplidas >= infraccionesPendientesPorSemaforoEnRojo * horasInfraccionSemaforoEnRojo;
    }
}




