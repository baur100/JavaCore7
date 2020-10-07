package Lesson_12_Homework;

public class Tires {
    private String name;
    private String make;
    private String model;
    private String owner;
    private int size;

    public Tires(String name, String make, String model, String owner, int size) {
        this.name = name;
        this.make = make;
        this.model = model;
        this.owner = owner;
        this.size = size;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
