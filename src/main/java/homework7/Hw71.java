package homework7;

public class Hw71 {
    public static void sum (int num1, int num2) {
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    public static void main(String[] arguments) {
        sum(3, 8);
        sum(4, 45);
        sum(20, -100);
    }
}
