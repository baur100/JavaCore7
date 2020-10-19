package MyHomeworkQA.HwLifeSim;


public class Frog extends LandWater {

    boolean alive = true;

    public Frog() {}

    public void eat() {
        System.out.println("I eat insects.");
    }

    public void die() {
        alive = false;
        System.out.println("The frog is dead.");
    }
}
