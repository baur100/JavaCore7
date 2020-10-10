package lesson11;

public class Wolf extends Animal{
    private String wolfSound;

    public Wolf(String animalName, String animalColor, int legCount, String wolfSound) {
        super(animalName, animalColor, legCount);
        this.wolfSound = wolfSound;
    }

    public String getWolfSound() {
        return wolfSound;
    }
}
