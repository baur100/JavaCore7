package h11plus;

public class Monitor {
    private String model;
    private String brand;
    private int diagonal;

    public Monitor(String model, String brand, int diagonal) {
        this.model = model;
        this.brand = brand;
        this.diagonal = diagonal;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", diagonal=" + diagonal +
                '}';
    }
}
