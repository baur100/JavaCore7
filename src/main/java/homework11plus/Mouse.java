package homework11plus;

public class Mouse {
    private String brand;
    private String model;
    private String connectionType;

    public Mouse(String brand, String model, String connectionType) {
        this.brand = brand;
        this.model = model;
        this.connectionType = connectionType;
    }

    public Mouse(){

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

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public String pullMouseInfo(){
        return "Mouse: " + brand + " " + model + " " + connectionType + "\r\n";
    }
}
