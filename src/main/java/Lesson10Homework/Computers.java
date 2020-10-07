package Lesson10Homework;

public class Computers {
    private String brand;
    private String type;
    private String memory;
    private int price;
    private int processor;

    //Below is the *full constructor*
    public Computers(String brand,String type,String memory, int price, int processor){
        this.brand = brand;
        this.type = type;
        this.memory = memory;
        this.price = price;
        this.processor = processor;
    }
    public Computers() // Default (empty) constructor, we always need this.
    {

    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
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
    public int getProcessor() {
        return processor;
    }
    public void setProcessor(int processor) {
        this.processor = processor;
    }
    public void printComputers() {
            System.out.println(" Brand is: "+ brand + "\n type is: " + type + "\n Memory is " + memory + "\n Price is only $ " + price + "\n With " + processor + " GHZ Speed");
        }
    }

