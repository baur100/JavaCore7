package aehwlesson11;

public class HardwareBrand {
    protected String brand;

    public HardwareBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "HardwareBrand:" +
                "brand= " + brand;
    }
}
