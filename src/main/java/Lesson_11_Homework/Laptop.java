package Lesson_11_Homework;

public class Laptop extends Headset{

    private String binary;

    public Laptop(String name, String make, String model, String binary) {
        super(name, make, model);
        this.binary = binary;
    }

    public Laptop() {
    }

    public Laptop(String laptop, String asus, String vivoBook, String[] laptopBinary) {
    }

    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }
}
