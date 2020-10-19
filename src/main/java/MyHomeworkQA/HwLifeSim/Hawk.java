package MyHomeworkQA.HwLifeSim;

public class Hawk extends Flight {

    public Hawk() {}

    public boolean fly() {
        return Flight.canFly;
    }

    public void eat() {
        Life.Animals.Vertebrates.Birds.eat();
    }
}
