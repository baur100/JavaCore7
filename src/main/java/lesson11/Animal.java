package lesson11;

public class Animal {
    protected String animalName;
    protected String animalColor;
    protected int legCount;

    public Animal(String animalName, String animalColor, int legCount) {
        this.animalName = animalName;
        this.animalColor = animalColor;
        this.legCount = legCount;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }
}
