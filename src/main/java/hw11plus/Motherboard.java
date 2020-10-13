package hw11plus;

public class Motherboard {
    private String mbModel;
    private String mbBrand;

    public Motherboard(String mbModel, String mbBrand) {
        this.mbModel = mbModel;
        this.mbBrand = mbBrand;
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

