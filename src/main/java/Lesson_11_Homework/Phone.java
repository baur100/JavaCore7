package Lesson_11_Homework;

public class Phone extends Headset{
    private String binary;

    public Phone(String name, String make, String model, String binary) {
        super(name, make, model);
        this.binary = binary;
    }

    public Phone(String iPhone, String apple, String x, String[] phoneBinary) {
    }

    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }
}
