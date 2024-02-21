import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Garaje garaje= new Garaje(1);
        garaje.addVehiculo(new Vehiculo("Fiesta","Ford",1000.0));
        garaje.addVehiculo(new Vehiculo("Focus","Ford",1200.0));
        garaje.addVehiculo(new Vehiculo("Explorer","Ford",2500.0));
        garaje.addVehiculo(new Vehiculo("Uno","Fiat",500.0));
        garaje.addVehiculo(new Vehiculo("Cronos","Fiat",1000.0));
        garaje.addVehiculo(new Vehiculo("Torino","Fiat",1250.0));
        garaje.addVehiculo(new Vehiculo("Aveo","Chevrolet",1250.0));
        garaje.addVehiculo(new Vehiculo("Spin","Chevrolet",2500.0));
        garaje.addVehiculo(new Vehiculo("Corola","Toyota",1200.0));
        garaje.addVehiculo(new Vehiculo("Fortuner","Toyota",3000.0));
        garaje.addVehiculo(new Vehiculo("Logan","Renault",950.0));

        //System.out.println(garaje.toString());

        Comparator<Vehiculo> comparatorVehiculo = (v1, v2)->v1.getCosto().compareTo(v2.getCosto());


        /*Ejercicio 3*/
        //System.out.println("Lista de vehículos ordenados por precio de menor a mayor");
        //garaje.getVehiculos().stream().sorted(comparatorVehiculo).forEach(System.out::println);
        //garaje.getVehiculos().stream().sorted(Comparator.comparing(Vehiculo::getCosto)).forEach(System.out::println);

        /*Ejercicio 4*/
        System.out.println("\n\nLista de vehículos  lista ordenada por marca y a su vez por precio");
        garaje.getVehiculos().stream().sorted(Comparator.comparing(Vehiculo::getMarca).thenComparing(Vehiculo::getCosto)).forEach(System.out::println);

        /*Ejercicio 5*/
        System.out.println("\n\nLista de vehículos con precio menor a  $1000");
        garaje.getVehiculos().stream().filter(x-> x.getCosto()<1000.0).forEach(System.out::println);

        System.out.println("\n\nLista de vehículos con precio mayor a  $1000");
        garaje.getVehiculos().stream().filter(x-> x.getCosto()>=1000.0).forEach(System.out::println);

        System.out.println("\n\nPromedio total de precios: $ ");
        System.out.println(garaje.getVehiculos().stream().map(item -> item.getCosto()).reduce((double) 0, (a, b) -> a + b)/garaje.getVehiculos().size());


    }
}