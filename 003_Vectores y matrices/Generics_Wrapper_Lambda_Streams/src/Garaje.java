import java.util.ArrayList;

public class Garaje {
    private Integer id;
    private ArrayList<Vehiculo> vehiculos;

    public Garaje(){}

    public Garaje(Integer id){
        this.id=id;
        this.vehiculos= new ArrayList<>();
    }

    //getters y setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void addVehiculo(Vehiculo vehiculo){
        this.vehiculos.add(vehiculo);
    }




    public String toString(){
        vehiculos.stream().forEach(System.out::println);
        return "Garaje {Id= "+this.id+" }";
    }
}
