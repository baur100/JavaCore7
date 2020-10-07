package Lesson10Homework;

public class HandheldDevices {
    private String brand;
    private String generation;
    private int model;
    private int price;
    private String memory;

    //Below is the *full constructor*
    public HandheldDevices(String brand,String generation,String memory, int price, int model){
        this.brand = brand;
        this.generation = generation;
        this.model = model;
        this.price = price;
        this.memory = memory;
    }
    public HandheldDevices () // Default (empty) constructor, we always need this.
    {

    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getGeneration() {
        return generation;
    }
    public void setGeneration(String generation) {
        this.generation = generation;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getMemory() {
        return memory;
    }
    public void setMemory(String memory) {
        this.memory = memory;
    }
    public int getModel() {
        return model;
    }
    public void setModel(int model) {
        this.model = model;
    }
    public void printHandheldDevices() {
        System.out.println(" Brand is: "+ brand + "\n type is  " + generation + "\n Generation " + model + "\n price is $ " + price +  memory + " Ram ");

    }
}
