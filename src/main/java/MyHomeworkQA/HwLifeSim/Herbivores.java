package MyHomeworkQA.HwLifeSim;


public abstract class Herbivores implements Life.Animals.Vertebrates.Mammals {

    abstract void iWork();

    public void eat() {
        System.out.println("I eat plants, grass and other vegetation.");
    }
}
