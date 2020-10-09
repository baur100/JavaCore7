package homework11plus;

public class Keyboard {
    private String brand;
    private String model;
    private String type;

    public Keyboard(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }
    public String getDescription() {
         return "Keyboard " + brand + " " + model + " " + type;
    }
}
