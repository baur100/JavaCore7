package main.java.HW;

public class Lesson7 {
    public static void main(String[] args) {
        sum(23, 23);
        System.out.println(sum2(12, 12));
        System.out.println(sum2(11, 342));
        System.out.println(sum2(1, 2));

        System.out.println(isEven(34));
        System.out.println(isEven(25));
        System.out.println(isEven(543));


    }

    //    1. Create a new function `sum` - it takes in 2 params (int, int) and print out result of their sum (hint - this is void function - it not returns anything - just print on screen) - invoke it 3 times with different params
    public static void sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }

//2. Create a new function `sum2` - it takes in 2 params (int, int) and returns their sum.
    //    Invoke it 3 times with different params. Save a result in a variable. print out variavle (hint - returning type - int)

    public static int sum2(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    //3. Create function `isEven` - int takes an int as an argument and return true if it is even or false if it is odd
//    invoke it with 4 different params - print out results
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
