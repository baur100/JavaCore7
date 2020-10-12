package MyHomeworkQA.HwCollections;

public class Dog {

    private String dogName;
    private String dogBreed;
    private boolean hasMicrochip;
    private int chipId;

    public Dog(String name, String breed) {
        this.dogName = name;
        this.dogBreed = breed;
    }

    public Dog(String dogName, String dogBreed, boolean hasMicrochip, int chipId) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.hasMicrochip = hasMicrochip;
        this.chipId = chipId;
    }

    public String info() {
        return "This dog is named "+getDogName()+". It's a "+getDogBreed()+".";
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public boolean isHasMicrochip() {
        return hasMicrochip;
    }

    public void setHasMicrochip(boolean hasMicrochip) {
        this.hasMicrochip = hasMicrochip;
    }

    public int getChipId() {
        return chipId;
    }

    public void setChipId(int chipId) {
        this.chipId = chipId;
    }
}
