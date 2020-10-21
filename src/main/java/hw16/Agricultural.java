package hw16;

public class Agricultural {
    private String nameOfCulture;
    private int fieldsNumber;

    public Agricultural(String nameOfCulture, int fieldsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;
    }

    public String getNameOfCulture() { return nameOfCulture; }
    public int getFieldsNumber() { return fieldsNumber; }

    @Override
    public String toString() {
        return nameOfCulture + " " + fieldsNumber + "ac.";
    }
}
