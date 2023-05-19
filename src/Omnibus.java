import java.util.ArrayList;
public class Omnibus {
    private String nombreEmpresa;
    private ArrayList<Viaje> itinerario; //los viajes que tiene que hacer el omnibus
    private ArrayList<Asiento> asientos;
    private int limiteAsientos=50; //mirar

    public Omnibus(String nombre){
        this.nombreEmpresa=nombre;
        itinerario= new ArrayList<Viaje>();
        asientos= new ArrayList<Asiento>();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public ArrayList<Viaje> getItinerario(){
        ArrayList<Viaje> copia=new ArrayList<Viaje>();
        copia.addAll(this.itinerario);
        return copia;
    }
    public ArrayList<Asiento> getAsientos(){
        ArrayList<Asiento> copia=new ArrayList<Asiento>();
        copia.addAll(this.asientos);
        return copia;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    public void agregarItinerario(Viaje viaje){
        this.itinerario.add(viaje);
    }
    public void agregarAsiento(Asiento asiento){
        this.asientos.add(asiento);
    }
}
