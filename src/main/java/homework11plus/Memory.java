package homework11plus;

public class Memory {
    private String brand;
    private int size;
    private int speed;


    public Memory(String brand, int size, int speed) {
        this.brand = brand;
        this.size = size;
        this.speed = speed;
    }

    public Memory(){

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String pullMemoryInfo(){
        return "Memory: " + brand + " " + size + "GB " + speed + "MHz\r\n";
    }
}

