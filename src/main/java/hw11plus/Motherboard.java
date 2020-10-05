package hw11plus;

public class Motherboard {
    private String brand;
    private String cpuSocket;

    public Motherboard(String brand, String cpuSocket) {
        this.brand = brand;
        this.cpuSocket = cpuSocket;
    }

    public String getBrand() {
        return brand;
    }

    public String getCpuSocket() {
        return cpuSocket;
    }
}
