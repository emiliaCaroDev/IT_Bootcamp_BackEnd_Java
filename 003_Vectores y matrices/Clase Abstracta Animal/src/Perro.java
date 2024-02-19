
public class Perro extends Animal  implements ICarnivoro{


    public String emitirSonido(){
        return "guau";
    }

    public void comeCarne(){
        System.out.println("el perro come carne");
    }
}
