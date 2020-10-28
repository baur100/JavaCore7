package hwk20;

public abstract class Carnivores implements Mammals{
    String nameCarnivores;

    public Carnivores(String nameCarnivores) {
        this.nameCarnivores = nameCarnivores;
    }

    public void carnivores(){
        System.out.println("I eat meat");
    }
}
