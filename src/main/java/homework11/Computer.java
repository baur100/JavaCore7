package homework11;

public class Computer {
    private int memory;
    private String Motherboard;
    private String brand;

    public Computer(int memory, String motherboard, String brand) {
        this.memory = memory;
        Motherboard = motherboard;
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public String getMotherboard() {
        return Motherboard;
    }

    public String getBrand() {
        return brand;
    }

    public void printComputer(){
        System.out.println("Computer:\n memory: "+memory+"\n motherboard: "+getMotherboard()+"\n brand: "+brand);
    }
}
