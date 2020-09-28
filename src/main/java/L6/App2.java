package L6;

public class App2 {
    public static void main(String[] args) {
        double rad = 5.3;
        System.out.println(lengthOfCircle(rad));
        double len = lengthOfCircle(rad);
        System.out.println(len);
    }

    public static double lengthOfCircle(double radius) {
        double lenght = 2 * radius * Math.PI;
        return lenght;
    }
}
