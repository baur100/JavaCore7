package lesson12;

public class DesktopLight implements BulbE27, AmericanElectricPlug {
    private String brand;
    private String model;
    private int price;

    public DesktopLight(String brand, String model, int price) {
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

    public void keepingSizeAndStandard() {
        System.out.println("I use American size electrical plug");
    }

    public void keepingE27Size() {
        System.out.println("I use E27 bulb size");

    }
}
