package hw11plus;

public class Cpu extends SystemBlock{
    private String cpModel;
    private String cpBrand;
    private int cpMemory;

    public Cpu(String cpModel, String cpBrand, int cpMemory) {
        this.cpModel = cpModel;
        this.cpBrand = cpBrand;
        this.cpMemory = cpMemory;
    }

    public Cpu(Motherboard motherboard, Disk disk, Cpu processor) {
        super(motherboard, disk, processor);
    }

    public String getCpModel() {
        return cpModel;
    }

    public void setCpModel(String cpModel) {
        this.cpModel = cpModel;
    }

    public String getCpBrand() {
        return cpBrand;
    }

    public void setCpBrand(String cpBrand) {
        this.cpBrand = cpBrand;
    }

    public int getCpMemory() {
        return cpMemory;
    }

    public void setCpMemory(int cpMemory) {
        this.cpMemory = cpMemory;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "cpModel='" + cpModel + '\'' +
                ", cpBrand='" + cpBrand + '\'' +
                ", cpMemory=" + cpMemory +
                '}';
    }

}
