package homework11plus;

public class Monitor {
    private String brand;
    private String model;
    private int size;
    private String refreshRate;

    public Monitor(String brand, String model, int size, String refreshRate) {
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(String refreshRate) {
        this.refreshRate = refreshRate;
    }
}
