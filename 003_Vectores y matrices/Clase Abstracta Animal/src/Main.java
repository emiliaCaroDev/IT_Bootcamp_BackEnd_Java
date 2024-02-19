public class Main {
    public static void main(String[] args) {
        Animal perro1= new Perro();
        Animal gato1= new Gato();
        Animal vaca1= new Vaca();

        System.out.println(perro1.emitirSonido());
        System.out.println(gato1.emitirSonido());
        System.out.println(vaca1.emitirSonido());

        ((Perro) perro1).comeCarne();
        ((Gato) gato1).comeCarne();
        ((Vaca) vaca1).comeHierba();
    }
}