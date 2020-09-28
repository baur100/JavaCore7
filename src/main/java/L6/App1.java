package L6;

public class App1 {
    public static void main(String[] args) {
        int xx = summOfTwoNumbers(2, 4);
        System.out.println(xx);
        int xx1 = summOfTwoNumbers(22, 44);
        System.out.println(xx1);
    }

    public static int summOfTwoNumbers(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}
