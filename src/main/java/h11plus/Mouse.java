package h11plus;

public class Mouse {
    private String model;
    private String brand;
    public boolean isWireless;

    public Mouse(String model, String brand, boolean isWireless) {
        this.model = model;
        this.brand = brand;
        this.isWireless = isWireless;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", isWireless=" + isWireless +
                '}';
    }
}
