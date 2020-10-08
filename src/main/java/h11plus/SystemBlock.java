package h11plus;

public class SystemBlock {
    private String brand;
    private String model;
    private String arch;
    private String busCapacity;

    public SystemBlock(String brand, String model, String arch, String busCapacity) {
        this.brand = brand;
        this.model = model;
        this.arch = arch;
        this.busCapacity = busCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getArch() {
        return arch;
    }

    public String getBusCapacity() {
        return busCapacity;
    }
    public String getDescription(){
        return "System Block "+brand+" "+model+" "+arch+" "+busCapacity;
    }
}
