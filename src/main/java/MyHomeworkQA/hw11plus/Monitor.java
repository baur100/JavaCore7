package MyHomeworkQA.hw11plus;

public class Monitor {


    private String model;
    private String brand;
    public boolean isWireless;

    public Monitor(String model, String brand, boolean wireless){
        this.model = model;
        this.brand = brand;
        this.isWireless = wireless;
    }

    public String showInfo(){
        return "Monitor - Model: "+model+", Brand: "+brand+", Wireless: "+isWireless;
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
}
