package lesson13a;

public class App {
    public static void main(String[] args) {
        Shape s1 = new Circle(10);
        Shape s2 = new Rectangle(10,5);
        Shape s3 = new Square(10);


        s3.draw();
        s2.draw();
        s1.draw();
    }
}
