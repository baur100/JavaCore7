package lesson11;

public class Zebra extends Animal {
    private boolean zebraSkin;

    public Zebra(String animalName, String animalColor, int legCount, boolean zebraSkin) {
        super(animalName, animalColor, legCount);
        this.zebraSkin = zebraSkin;
    }

    public boolean getZebraSkin() {
        return zebraSkin;
    }
}
