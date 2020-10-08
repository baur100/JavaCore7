package MyHomeworkQA.hw11plus;

public class SystemBlock {


    private String brand;
    private String chipset;
    private int numberOfCores;

    public SystemBlock(String brand, String chipset, int numCores){
        this.brand = brand;
        this.chipset = chipset;
        this.numberOfCores = numCores;
    }

    public String showInfo(){
        return "Processor - Brand: "+brand+", Chipset: "+chipset+", Cores: "+numberOfCores;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }
}
