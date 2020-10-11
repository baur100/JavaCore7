package homework11plus;

public class Powersupply {
    private String brand;
    private String model;
    private int watts;

    public Powersupply(String brand, String model, int watts) {
        this.brand = brand;
        this.model = model;
        this.watts = watts;
    }

    public Powersupply(){

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

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    public String pullPowersupplyInfo(){
        return "Power supply: " + brand + " " + model + " " + watts + "W\r\n";
    }
}
