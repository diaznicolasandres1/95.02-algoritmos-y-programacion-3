package conductores;

public class EstadoInseguro implements EstadoSeguridadConductor {

   //NO TIENE PUESTO EL CASCO O CINTURON.
    @Override
    public boolean puedeConducir(Conductor conductor) {
        return false;
    }
}
