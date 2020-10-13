package classwork12;

public class DesktopLight1 implements BulbE27, ElectricPlug1 {
    private String brand;
    private String model;
    private int price;

    public DesktopLight1(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void keepE27Size() {
        System.out.println("I use E27 bulb size");

    }
    public void keepSizeAndStandard() {
        System.out.println("I use American size electrical plug");

    }
}
