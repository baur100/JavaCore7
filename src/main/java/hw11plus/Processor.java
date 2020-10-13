package hw11plus;

public class Processor {
    private String cpModel;
    private String cpBrand;
    private int cpMemory;

    public Processor(String cpModel, String cpBrand, int cpMemory) {
        this.cpModel = cpModel;
        this.cpBrand = cpBrand;
        this.cpMemory = cpMemory;
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
