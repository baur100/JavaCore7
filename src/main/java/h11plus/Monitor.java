package h11plus;

public class Monitor {
    private int size;
    private String brand;
    private String model;
    private int year;

    public Monitor(int size, String brand, String model, int year) {
        this.size = size;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "\n************" +
                "\nMonitor: " +
                "\nsize= " + size+
                "\nbrand= " + brand+
                "\nmodel= " + model+
                "\nyear= " + year;
    }
}