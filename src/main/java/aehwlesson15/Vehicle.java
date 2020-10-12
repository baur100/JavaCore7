package aehwlesson15;

public class Vehicle {
    private Brand carBrand;
    private Color carColor;

    public Vehicle(Brand carBrand, Color carColor) {
        this.carBrand = carBrand;
        this.carColor = carColor;
    }

    public Brand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(Brand carBrand) {
        this.carBrand = carBrand;
    }

    public Color getCarColor() {
        return carColor;
    }

    public void setCarColor(Color carColor) {
        this.carColor = carColor;
    }

    @Override
    public String toString() {
        return "My Car: " +
                "brand " + carBrand +
                ", color " + carColor + " ";
    }
}
