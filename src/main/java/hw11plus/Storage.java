package hw11plus;

public class Storage {
    private String brand;
    private String type;
    private int size;

    public Storage(String brand, String type, int size) {
        this.brand = brand;
        this.type = type;
        this.size = size;
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
}
