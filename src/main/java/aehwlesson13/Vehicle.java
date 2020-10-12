package aehwlesson13;

import java.util.Arrays;

public class Vehicle {
    private CarBrand brand;
    private CarColor[] color;
    private CarType type;

    public Vehicle(CarBrand brand, CarColor[] color, CarType type) {
        this.brand = brand;
        this.color = color;
        this.type = type;
    }

    public CarBrand getBrand() {
        return brand;
    }

    public CarColor[] getColor() {
        return color;
    }

    public CarType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Vehicle: " +
                "\nbrand = " + brand +
                "\ncolor = " + Arrays.toString(color) +
                "\ntype = " + type;
    }
}
