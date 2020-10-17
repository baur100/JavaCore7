package lesson12c;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return radius*radius*Math.PI;
    }
}
