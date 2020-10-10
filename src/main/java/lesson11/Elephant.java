package lesson11;

public class Elephant extends Animal {
    private int trunkLength;

    public Elephant(String animalName, String animalColor, int legCount, int trunkLength) {
        super(animalName, animalColor, legCount);
        this.trunkLength = trunkLength;

    }
    public int getTrunkLength() {
        return trunkLength;
    }
}
