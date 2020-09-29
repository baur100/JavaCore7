package HW6;

public class App1 {
    public static void main(String[] args) {
        int ss1 = sum(10, 10);
        System.out.println(ss1);
        int ss2 = sum(20, 20);
        System.out.println(ss2);
        int ss3 = sum(30, 30);
        System.out.println(ss3);
    }

    public static int sum(int number1, int number2) {
        int result = number1 + number2;
        return result;

    }
}
