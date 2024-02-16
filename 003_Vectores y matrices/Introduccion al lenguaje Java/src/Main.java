public class Main {

    public static void main(String[] args) {

        /* Ejercicio 1 */
        Persona p1= new Persona("Juan",24,"3587102",62.0,1.75);
        Persona p2= new Persona("Maria",16,"448455");
        Persona p3= new Persona("Pedro",15,"5484155",78.0,1.92);
        Persona p4= new Persona("Beto",50,"3587102",100.0,1.70);

        //System.out.println(p1.toString());
        //System.out.println(p2.toString());
        //System.out.println("IMC de la persona "+p1.calcularIMC());
        //System.out.println("IMC de la persona "+p3.calcularIMC());
        //System.out.println("IMC de la persona "+p4.calcularIMC());

        //System.out.println("Es mayor de edad: "+p1.esMayorDeEdad());
        //System.out.println("Es mayor de edad: "+p2.esMayorDeEdad());
        p1.mostrarMsj();
        p3.mostrarMsj();
        p4.mostrarMsj();

    }
}