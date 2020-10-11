package homework11plus;

public class Monitor {
    private String brand;
    private String model;
    private double size;
    private int refreshRate;

    public Monitor(String brand, String model, double size, int refreshRate) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.refreshRate = refreshRate;
    }

    public Monitor(){

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

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public String pullMonitorInfo(){
        return "Monitor: " + brand + " " + model
                + " " + size + "\" " + refreshRate + "Hz";
    }
}
