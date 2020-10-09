package homework11plus;

public class Mouse {
    private String model;
    private String brand;
    private String type;

    public Mouse(String model, String brand, String type) {
        this.model = model;
        this.brand = brand;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }
    public String getDescription() {
        return "Mouse " + brand + " " + model + " " + type;
    }
}
