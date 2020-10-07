package aehwlesson12;

public class App {
    public static void main(String[] args) {
        Triangle t = new Triangle(3,4,5);
        Rectangle r = new Rectangle(6,8);

        Perimeter p1 = new Triangle(5,6,10);
        Perimeter p2 = new Rectangle(11, 5);

        int perimeterT = t.perimeter();
        System.out.println(perimeterT);

        int perimeterR = r.perimeter();
        System.out.println(perimeterR);

        int perimeterP1 = p1.perimeter();
        System.out.println(perimeterP1);

        int perimeterP2 =p2.perimeter();
        System.out.println(perimeterP2);
    }
}
