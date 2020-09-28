package homework6;

public class Hw6 {
    public static void main(String[] args) {
        int num1 =1, num2 = 2, num3 = 3, num4 = 4, num5 = 5, num6 = 6, sumOfTwo;

        System.out.println("Below is homework 6:");
        sum(num1, num2);
        sum(num3, num4);
        sum(num5, num6);

        sumOfTwo = sum2(num1, num4);
        System.out.println(num1 + " + " + num4 + " = " + sumOfTwo);
        sumOfTwo = sum2(num2, num5);
        System.out.println(num2 + " + " + num5 + " = " + sumOfTwo);
        sumOfTwo = sum2(num3, num6);
        System.out.println(num3 + " + " + num6 + " = " + sumOfTwo);

        System.out.println("Is " + num2 + " even? " + isEven(num2));
        System.out.println("Is " + num3 + " even? " + isEven(num3));
        System.out.println("Is " + num4 + " even? " + isEven(num4));
        System.out.println("Is " + num5 + " even? " + isEven(num5));
    }

    private static void sum(int firstNumber, int secondNumber){
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
    }

    private static int sum2(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    private static boolean isEven (int integer){
        return integer % 2 == 0;
    }
}