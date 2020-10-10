package aehwlesson13;

public class Vehicle {
    private CarBrand brand;
    private CarColor color;
    private CarType type;

    public Vehicle(CarBrand brand, CarColor color, CarType type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public CarColor getColor() {
        return color;
    }

    public CarType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Vehicle: " +
                "brand = " + brand +
                ", color = " + color +
                ", type = " + type;
    }
}
