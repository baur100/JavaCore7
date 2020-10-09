package homework11plus;

public class Monitor {
    private String brand;
    private String model;
    private int size;

    public Monitor(String brand, String model, int size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }
    public String getDescription() {
        return "Monitor " + brand + " " + size;
    }
}
