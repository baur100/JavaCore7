package h11plus;

public class Mouse {
    private String model;
    private String brand;
    private boolean isWireless;

    public Mouse(String model, String brand, boolean isWireless) {
        this.model = model;
        this.brand = brand;
        this.isWireless = isWireless;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isWireless() {
        return isWireless; }

    @Override
    public String toString() {
        return "\n************" +
                "\nMouse: " +
                "\nmodel= " + model +
                "\nbrand= " + brand  +
                "\nisWireless= " + isWireless;
    }
}