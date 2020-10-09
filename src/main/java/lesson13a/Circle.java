package lesson13a;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void draw(){
        System.out.println("I draw a circle with the radius = " +this.radius);
    }
    public double length(){
        return Math.PI*radius*2;
    }
}
