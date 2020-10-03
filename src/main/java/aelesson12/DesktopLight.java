package aelesson12;

public class DesktopLight implements BulbE27, AmericanElectricPlug{

    // In class you must define body for the used interfaces (implemented interfaces)

    // In automation test we use interface only in one place - "Driver is interface"

    private String brand;
    private String model;
    private int price;

    public DesktopLight(String brand,String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void keepingSizeAndStandard() {
        System.out.println("I use American size electrical plug");
    }

    @Override
    public void keepingE27Size() {
        System.out.println("I use E27 bulb size");

    }
}
