package homework11plus;

public class Motherboard {
    private String brand;
    private String model;
    private String socket;

    public Motherboard(String brand, String model, String socket) {
        this.brand = brand;
        this.model = model;
        this.socket = socket;
    }

    public Motherboard(){

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

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
}
