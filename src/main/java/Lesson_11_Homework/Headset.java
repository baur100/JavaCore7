package Lesson_11_Homework;

public class Headset {
    protected String name;
    protected String make;
    protected String model;

    public Headset(String name, String make, String model, String binary) {
        this.name = name;
        this.make = make;
        this.model = model;
    }

    public Headset() {
    }

    public Headset(String name, String make, String model) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
