package Lesson_11_Homework;

public class Laptop extends Headset {

    private String[] laptopBinary;

    public Laptop(String name, String make, String model, String[] laptopBinary) {
        super(name, make, model);
        this.laptopBinary = laptopBinary;
    }

    public Laptop() {

    }

    public String[] getLaptopBinary() {
        return laptopBinary;
    }

    public void setLaptopBinary(String[] laptopBinary) {
        this.laptopBinary = laptopBinary;
    }

    public void printLaptop() {
        System.out.println("Laptop" + "\nName:" + name +
                "\nMake:" + make +
                "\nModel:" + model + "\n==============");
    }
}

