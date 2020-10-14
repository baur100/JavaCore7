package Homework17;

public class AgraCulture {


    @Override
    public String toString() {
        return "AgraCulture{" +
                "nameOfCulture='" + nameOfCulture + '\'' +
                ", fieldsNumber=" + fieldsNumber +
                '}';
    }

    private String nameOfCulture;
    private int fieldsNumber;


    public AgraCulture(String nameOfCulture, int fieldsNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldsNumber = fieldsNumber;


    }
}
