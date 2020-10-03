package lesson12c;


public class App {
    public static void main(String[] args) {
        Circle c1 = new Circle(12);
        Rectangle r1 = new Rectangle(4,6);

        Shape s1 = new Circle(15);
        Shape s2 = new Rectangle(15,12);

//        System.out.println(c1.getSquare());
//        System.out.println(r1.getSquare());

        System.out.println(s1.getSquare());
        System.out.println(s2.getSquare());

    }
}
