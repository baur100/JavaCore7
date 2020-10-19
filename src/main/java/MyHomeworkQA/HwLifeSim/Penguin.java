package MyHomeworkQA.HwLifeSim;

public class Penguin extends Flightless {

    public Penguin() {}

    public boolean fly() {
        return Flightless.canFly;
    }

    public void eat() {
        Life.Animals.Vertebrates.Birds.eat();
    }

}
