package lesson12c;

public class Rectangle implements Shape{
    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getSquare() {
        return length*height;
    }
}
