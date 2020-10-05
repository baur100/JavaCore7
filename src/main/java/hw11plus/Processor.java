package hw11plus;

public class Processor {
    private String brand;
    private String model;
    private int cores;
    private double frequency;

    public Processor(String brand, String model, int cores, double frequency) {
        this.brand = brand;
        this.model = model;
        this.cores = cores;
        this.frequency = frequency;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getCores() {
        return cores;
    }

    public double getFrequency() {
        return frequency;
    }
}
