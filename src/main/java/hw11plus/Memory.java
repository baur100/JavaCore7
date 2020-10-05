package hw11plus;

public class Memory {
    private String brand;
    private String type;
    private int size;
    private int frequency;

    public Memory(String brand, String type, int size, int frequency) {
        this.brand = brand;
        this.type = type;
        this.size = size;
        this.frequency = frequency;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public int getFrequency() {
        return frequency;
    }
}
