package hw11plus;

public class Motherboard extends SystemBlock{
    private String mbModel;
    private String mbBrand;

    public Motherboard(String mbModel, String mbBrand) {
        this.mbModel = mbModel;
        this.mbBrand = mbBrand;
    }

    public Motherboard(Motherboard motherboard, Disk disk, Cpu processor) {
        super(motherboard, disk, processor);
    }

    public String getMbmodel() {
        return mbModel;
    }

    public void setMbmodel(String mbModel) {
        this.mbModel = mbModel;
    }

    public String getMbbrand() {
        return mbBrand;
    }

    public void setMbbrand(String mbBrand) {
        this.mbBrand = mbBrand;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "mbModel='" + mbModel + '\'' +
                ", mbBrand='" + mbBrand + '\'' +
                '}';
    }
}

