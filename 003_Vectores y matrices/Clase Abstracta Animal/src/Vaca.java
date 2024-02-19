public class Vaca extends Animal implements IHerbivoro{
    @Override
    public String emitirSonido() {
        return "muuu";
    }

    @Override
    public void comeHierba() {
        System.out.println("la vaca come hierba");
    }
}
