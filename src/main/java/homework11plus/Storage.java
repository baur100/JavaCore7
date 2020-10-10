package homework11plus;

public class Storage {
    private String brand;
    private String model;
    private int size;
    private String diskType;

    public Storage(String brand, String model, int size, String diskType) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.diskType = diskType;
    }

    public Storage(){

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

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }
}
