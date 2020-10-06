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
    public void printMonitor(){
        System.out.println(size+brand+model+year);
}}