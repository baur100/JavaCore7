package hw11plus;

public class Disk  {
    private String dkModel;
    private String dkBrand;
    private int dkMemory;

    public Disk(String dkModel, String dkBrand, int dkMemory) {
        this.dkModel = dkModel;
        this.dkBrand = dkBrand;
        this.dkMemory = dkMemory;
    }

    public String getDkModel() {
        return dkModel;
    }

    public void setDkModel(String dkModel) {
        this.dkModel = dkModel;
    }

    public String getDkBrand() {
        return dkBrand;
    }

    public void setDkBrand(String dkBrand) {
        this.dkBrand = dkBrand;
    }

    public int getDkMemory() {
        return dkMemory;
    }

    public void setDkMemory(int dkMemory) {
        this.dkMemory = dkMemory;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "dkModel='" + dkModel + '\'' +
                ", dkBrand='" + dkBrand + '\'' +
                ", dkMemory=" + dkMemory +
                '}';
    }
}
