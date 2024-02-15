import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Categoria cat1= new Categoria(1,"chico","2K Selva y arroyo");
        Categoria cat2= new Categoria(2,"medio","5K Selva, arroyos y barro");
        Categoria cat3= new Categoria(3,"avanzado","10Km por selva, arroyos, barro y escalada en piedra");

        Participante p1= new Participante(1,"34567","Pedro","Paramo",21,"+543586554","+44845158","A+");
        Participante p2= new Participante(5,"3498545","Maria","Diaz",24,"+543569875","+54329822","0");
        Participante p3= new Participante(3,"54652365","Juan","Perez",18,"+546955484","+54322674","B-");
        Participante p4= new Participante(4,"9899656","Santiago","Del Moro",17,"+5142354","+549615","B-");

        Inscripcion insc1= new Inscripcion(2,cat1,p1);
        Inscripcion insc2= new Inscripcion(9,cat2,p2);
        Inscripcion insc3= new Inscripcion(6,cat3,p3);
        Inscripcion insc4= new Inscripcion(7,cat1,p4);

        Competencia competencia= new Competencia("Carrera de Selva");
        competencia.addInscripcion(insc1);
        competencia.addInscripcion(insc2);
        competencia.addInscripcion(insc3);
        competencia.addInscripcion(insc4);

        //System.out.println(competencia.toString());
        //System.out.println(p1.toString());
        //System.out.println(cat1.toString());
        //System.out.println(insc1.toString());
        System.out.println("El monto a pagar es: Inscripcion 1, $ "+insc1.calcularMonto());
        System.out.println("El monto a pagar es: Inscripcion 4, $ "+insc4.calcularMonto());
        System.out.println("El monto a pagar es: Inscripcion 2, $ "+insc2.calcularMonto());
        System.out.println("El monto a pagar es: Inscripcion 3, $ "+insc3.calcularMonto());

        //competencia.mostrarInscripciones();

        System.out.println("Inscripciones por Categoria: "+competencia.inscripcionesXCategoria("chico"));
        //competencia.removerInscripcion(insc4);
        //System.out.println("Inscripciones por Categoria dsp de eliminar un participante: "+competencia.inscripcionesXCategoria("chico"));
        System.out.println("Monto total recuadado por categoria chico: $ "+competencia.calcularMontoXCategoria("chico"));
        System.out.println("Monto total de toda la competencia es : $ "+competencia.calcularMontoTotalCompetencia());

    }
}