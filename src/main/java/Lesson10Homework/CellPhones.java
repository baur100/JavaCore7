package Lesson10Homework;
//first to create the fields, ffields and instances are the same thing
public class CellPhones {
    private String brand;
    private String generation;
    private int model;
    private int price;
    private String memory;

    //Below is the *full constructor*
    public CellPhones(String brand,String generation,String memory, int model, int price){
        this.brand = brand;
        this.generation = generation;
        this.model = model;
        this.price = price;
        this.memory = memory;
    }
    public CellPhones() // Default (empty) constructor, we always need this. Object is an intance of a class
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
    public int getModel() {
        return model;
    }
    public void setModel(int model) {
        this.model = model;
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
    public void printCellPhones() {
        System.out.println(" Brand is: "+ brand + "\n Type is  " + generation + "\n Model "+ model + "\n price is $ " + price + "\n With " + memory + " GB ");
    }

}
