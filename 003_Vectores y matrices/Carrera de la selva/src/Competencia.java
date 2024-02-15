
import java.util.ArrayList;

public class Competencia {
    private String nombre;
    private ArrayList<Inscripcion> inscripciones;

    public Competencia(){
    }

    public Competencia(String nombre){
        this.nombre=nombre;
        this.inscripciones= new ArrayList<>();
    }

    //getters y setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String toString(){
        return "Competencia { Nombre ="+this.nombre+"}";
    }

    public void addInscripcion(Inscripcion i){
        this.inscripciones.add(i);
    }

    public void removerInscripcion(Inscripcion i){
        this.inscripciones.remove(i);
    }

    public void mostrarInscripciones(){
        for (Inscripcion i: this.inscripciones) {
            System.out.println(i.toString());
        }
    }

    public ArrayList<Inscripcion> inscripcionesXCategoria(String categoria){
        ArrayList listInscripciones= new ArrayList<>();
        for (Inscripcion insc: this.inscripciones) {
            if(insc.getCategoria().getNombre().equals(categoria)){
                listInscripciones.add(insc);
            }
        }
        return listInscripciones;
    }

    public Double calcularMontoXCategoria(String categoria){
        Double total=0.0;
        for (Inscripcion insc: inscripcionesXCategoria(categoria)) {
            total+= insc.calcularMonto();
        }
        return total;
    }

    public Double calcularMontoTotalCompetencia(){
        Double total=0.0;
        for (Inscripcion insc: this.inscripciones) {
            total+= insc.calcularMonto();
        }
        return total;
    }
}
