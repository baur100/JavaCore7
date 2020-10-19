package h11plus;

public class Disk extends Object{
    private String model;
    private String brand;
    private String type;
    private int size;

    public Disk(String model, String brand, String type, int size) {
        this.model = model;
        this.brand = brand;
        this.type = type;
        this.size = size;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}
