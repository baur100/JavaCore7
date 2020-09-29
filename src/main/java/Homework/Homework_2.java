package Homework;

    //Create a new function `sum2` - it takes in 2 params (int, int) and returns their sum.
    //Invoke it 3 times with different params. Save a result in a variable. print out variavle (hint - returning type - int)

public class Homework_2 {
    public static void main(String[] args) {

        System.out.println(sum2(7,8));
        System.out.println(sum2(5,6) + sum2(4,8));

        sum2(5, 7);
        sum2(4, 8);
        sum2(2, 6);
    }

       public static int sum2(int a, int b) {
        int c = a+b;
        return c;

    }
}
