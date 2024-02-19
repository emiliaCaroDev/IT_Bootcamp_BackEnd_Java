public class Gato extends Animal implements ICarnivoro{
    @Override
    public String emitirSonido() {
        return "miau";
    }

    @Override
    public void comeCarne() {
        System.out.println("el gato come carne");
    }
}
